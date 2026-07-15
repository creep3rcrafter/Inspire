package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.Nullable;

public class ThinIceBlock extends SlabBlock {
    public ThinIceBlock(Properties settings) {
        super(settings);
    }

    public static BlockState getMeltedState() {
        return Blocks.WATER.defaultBlockState();
    }

    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        FluidState fluidState = world.getFluidState(pos);
        if (state.blocksMotion() || !fluidState.isEmpty()) {
            if (state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE || state.getValue(WATERLOGGED)) {
                world.destroyBlock(pos, false, null, 512);
                world.setBlock(pos, getMeltedState(), 3);
                world.updateNeighborsAt(pos, getMeltedState().getBlock());
            } else {
                world.destroyBlock(pos, false, null, 512);
            }
        }
    }

    @Override
    public void fallOn(Level world, BlockState state, BlockPos pos, Entity entity, float distance) {
        super.fallOn(world, state, pos, entity, distance);
        if (world instanceof ServerLevel serverLevel) {
            serverLevel.scheduleTick(pos.below(), this, this.getBreakDelay());
        }
    }

    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        super.stepOn(world, pos, state, entity);
        if (world instanceof ServerLevel serverLevel) {
            serverLevel.scheduleTick(pos, this, this.getBreakDelay());
        }
    }

    protected int getBreakDelay() {
        return 10;
    }


    @Override
    public void playerDestroy(Level world, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        super.playerDestroy(world, player, pos, state, blockEntity, tool);
        if (world instanceof ServerLevel serverLevel) {
            var silkTouch = serverLevel.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH);
            if (EnchantmentHelper.getItemEnchantmentLevel(silkTouch, tool) == 0) {
                if (world.dimensionType().ultraWarm()) {
                    world.removeBlock(pos, false);
                    return;
                }

                BlockState blockState = world.getBlockState(pos.below());
                FluidState fluidState = world.getFluidState(pos.below());
                if (blockState.blocksMotion() || !fluidState.isEmpty()) {
                    if (state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE || state.getValue(WATERLOGGED)) {
                        world.destroyBlock(pos, false, null, 512);
                        world.setBlock(pos, getMeltedState(), 3);
                        world.updateNeighborsAt(pos, getMeltedState().getBlock());
                    } else {
                        world.destroyBlock(pos, false, null, 512);
                    }
                }
            }
        }
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.getBrightness(LightLayer.BLOCK, pos) > 11 - state.getLightBlock(world, pos)) {
            this.melt(state, world, pos);
        }

    }

    protected void melt(BlockState state, Level world, BlockPos pos) {
        if (world.dimensionType().ultraWarm()) {
            world.removeBlock(pos, false);
        } else {
            if (state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE || state.getValue(WATERLOGGED)) {
                world.destroyBlock(pos, false, null, 512);
                world.setBlock(pos, getMeltedState(), 3);
                world.updateNeighborsAt(pos, getMeltedState().getBlock());
            } else {
                world.destroyBlock(pos, false, null, 512);
            }
        }
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState stateFrom, Direction direction) {
        if (stateFrom.is(this)) {
            if (state.getValue(SlabBlock.TYPE) == stateFrom.getValue(SlabBlock.TYPE)) {
                return true;
            } else if (stateFrom.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
                return true;
            }
            return super.skipRendering(state, stateFrom, direction);
        }
        return super.skipRendering(state, stateFrom, direction);
    }
}
