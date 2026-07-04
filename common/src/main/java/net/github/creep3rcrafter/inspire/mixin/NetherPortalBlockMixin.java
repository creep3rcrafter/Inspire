package net.github.creep3rcrafter.inspire.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NetherPortalBlock.class)
@SuppressWarnings("depreciation")
public abstract class NetherPortalBlockMixin extends Block implements Waterloggable { //Makes Nether Portals Water loggable
    private NetherPortalBlockMixin() {
        super(null);
    }

    @WrapMethod(method = "appendProperties")
    protected void wrapAppendProperties(StateManager.Builder<Block, BlockState> builder, Operation<Void> original) {
        builder.add(Properties.WATERLOGGED);
        original.call(builder);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void injectInit(Settings settings, CallbackInfo ci) {
        this.setDefaultState(this.getDefaultState().with(Properties.WATERLOGGED, Boolean.FALSE));
    }

    @WrapMethod(method = "getStateForNeighborUpdate")
    private BlockState wrapGetStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos, Operation<BlockState> original) {
        if (state.get(Properties.WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return original.call(state, direction, neighborState, world, pos, neighborPos);
    }

    @Inject(method = "randomDisplayTick", at = @At("TAIL"))
    private void injectRandomDisplayTick(BlockState state, World world, BlockPos pos, Random random, CallbackInfo ci) {
        if (state.get(Properties.WATERLOGGED)) {
            if (random.nextInt(100) >= 90) {
                world.playSound((double) pos.getX() + (double) 0.5F, (double) pos.getY() + (double) 0.5F, (double) pos.getZ() + (double) 0.5F, SoundEvents.BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT, SoundCategory.BLOCKS, 0.5F, random.nextFloat() * 0.4F + 0.8F, false);
            }
            for (int i = 0; i < 4; ++i) {
                double d = (double) pos.getX() + random.nextDouble();
                double e = (double) pos.getY() + random.nextDouble();
                double f = (double) pos.getZ() + random.nextDouble();
                double g = ((double) random.nextFloat() - (double) 0.5F) * (double) 0.5F;
                double h = ((double) random.nextFloat() - (double) 0.5F) * (double) 0.5F;
                double j = ((double) random.nextFloat() - (double) 0.5F) * (double) 0.5F;
                int k = random.nextInt(2) * 2 - 1;
                if (!world.getBlockState(pos.west()).isOf(this) && !world.getBlockState(pos.east()).isOf(this)) {
                    d = (double) pos.getX() + (double) 0.5F + (double) 0.25F * (double) k;
                    g = (double) (random.nextFloat() * 2.0F * (float) k);
                } else {
                    f = (double) pos.getZ() + (double) 0.5F + (double) 0.25F * (double) k;
                    j = (double) (random.nextFloat() * 2.0F * (float) k);
                }
                world.addParticle(ParticleTypes.BUBBLE, d, e, f, g, h, j);
            }
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(Properties.WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        var fluidstate = ctx.getWorld().getFluidState(ctx.getBlockPos());
        var flag = fluidstate.getFluid() == Fluids.WATER;
        return super.getPlacementState(ctx).with(Properties.WATERLOGGED, flag);
    }
}
