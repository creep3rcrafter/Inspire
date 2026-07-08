package net.github.creep3rcrafter.inspire.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NetherPortalBlock.class)
@SuppressWarnings("depreciation")
public abstract class NetherPortalBlockMixin extends Block implements SimpleWaterloggedBlock { //Makes Nether Portals Water loggable
    private NetherPortalBlockMixin() {
        super(null);
    }

    @WrapMethod(method = "createBlockStateDefinition")
    protected void wrapcreateBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, Operation<Void> original) {
        builder.add(BlockStateProperties.WATERLOGGED);
        original.call(builder);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void injectInit(BlockBehaviour.Properties properties, CallbackInfo ci) {
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(BlockStateProperties.WATERLOGGED, Boolean.FALSE));
    }

    @WrapMethod(method = "updateShape")
    private BlockState wrapGetStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos, Operation<BlockState> original) {
        if (state.getValue(BlockStateProperties.WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return original.call(state, direction, neighborState, level, pos, neighborPos);
    }

    @Inject(method = "animateTick", at = @At("TAIL"))
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource, CallbackInfo ci) {
        if (randomSource.nextInt(100) == 0) {
            level.playLocalSound((double) blockPos.getX() + (double) 0.5F, (double) blockPos.getY() + (double) 0.5F, (double) blockPos.getZ() + (double) 0.5F, SoundEvents.BUBBLE_COLUMN_UPWARDS_AMBIENT, SoundSource.BLOCKS, 0.5F, randomSource.nextFloat() * 0.4F + 0.8F, false);
        }

        for(int i = 0; i < 4; ++i) {
            double d = (double)blockPos.getX() + randomSource.nextDouble();
            double e = (double)blockPos.getY() + randomSource.nextDouble();
            double f = (double)blockPos.getZ() + randomSource.nextDouble();
            double g = ((double)randomSource.nextFloat() - (double)0.5F) * (double)0.5F;
            double h = ((double)randomSource.nextFloat() - (double)0.5F) * (double)0.5F;
            double j = ((double)randomSource.nextFloat() - (double)0.5F) * (double)0.5F;
            int k = randomSource.nextInt(2) * 2 - 1;
            if (!level.getBlockState(blockPos.west()).is(this) && !level.getBlockState(blockPos.east()).is(this)) {
                d = (double)blockPos.getX() + (double)0.5F + (double)0.25F * (double)k;
                g = (double)(randomSource.nextFloat() * 2.0F * (float)k);
            } else {
                f = (double)blockPos.getZ() + (double)0.5F + (double)0.25F * (double)k;
                j = (double)(randomSource.nextFloat() * 2.0F * (float)k);
            }

            level.addParticle(ParticleTypes.BUBBLE, d, e, f, g, h, j);
        }

    }

    @Override
    public @NotNull FluidState getFluidState(BlockState state) {
        return (Boolean)state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        BlockPos blockPos = blockPlaceContext.getClickedPos();
        FluidState fluidState = blockPlaceContext.getLevel().getFluidState(blockPos);
        return super.getStateForPlacement(blockPlaceContext).setValue(BlockStateProperties.WATERLOGGED, fluidState.getType() == Fluids.WATER);
    }
}
