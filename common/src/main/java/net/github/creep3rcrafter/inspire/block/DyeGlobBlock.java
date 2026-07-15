package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import static net.github.creep3rcrafter.inspire.utils.ColorUtils.dyeBlocks;
import static net.github.creep3rcrafter.inspire.utils.ColorUtils.dyeEntity;

@SuppressWarnings("deprecation")
public class DyeGlobBlock extends Block {

    public DyeColor dyeColor;

    public DyeGlobBlock(DyeColor dyeColor, Properties properties) {
        super(properties);
        this.dyeColor = dyeColor;
    }

    @Override
    public void neighborChanged(BlockState blockState, Level level, BlockPos blockPos, Block block, BlockPos blockPos2, boolean bl) {
        super.neighborChanged(blockState, level, blockPos, block, blockPos2, bl);
        if (!level.isClientSide()) {
            BlockState blockState1 = level.getBlockState(blockPos.above());
            BlockState blockState2 = level.getBlockState(blockPos.below());
            BlockState blockState3 = level.getBlockState(blockPos.north());
            BlockState blockState4 = level.getBlockState(blockPos.south());
            BlockState blockState5 = level.getBlockState(blockPos.west());
            BlockState blockState6 = level.getBlockState(blockPos.east());
            dyeBlocks(level, blockPos.above(), dyeColor.getId(), blockState1);
            dyeBlocks(level, blockPos.below(), dyeColor.getId(), blockState2);
            dyeBlocks(level, blockPos.north(), dyeColor.getId(), blockState3);
            dyeBlocks(level, blockPos.south(), dyeColor.getId(), blockState4);
            dyeBlocks(level, blockPos.west(), dyeColor.getId(), blockState5);
            dyeBlocks(level, blockPos.east(), dyeColor.getId(), blockState6);
        }
    }

    @Override
    public void updateIndirectNeighbourShapes(BlockState blockStateOrgin, LevelAccessor level, BlockPos blockPos, int i, int j) {
        super.updateIndirectNeighbourShapes(blockStateOrgin, level, blockPos, i, j);
        if (!level.isClientSide()) {
            BlockState blockState1 = level.getBlockState(blockPos.above());
            BlockState blockState2 = level.getBlockState(blockPos.below());
            BlockState blockState3 = level.getBlockState(blockPos.north());
            BlockState blockState4 = level.getBlockState(blockPos.south());
            BlockState blockState5 = level.getBlockState(blockPos.west());
            BlockState blockState6 = level.getBlockState(blockPos.east());
            dyeBlocks(level, blockPos.above(), dyeColor.getId(), blockState1);
            dyeBlocks(level, blockPos.below(), dyeColor.getId(), blockState2);
            dyeBlocks(level, blockPos.north(), dyeColor.getId(), blockState3);
            dyeBlocks(level, blockPos.south(), dyeColor.getId(), blockState4);
            dyeBlocks(level, blockPos.west(), dyeColor.getId(), blockState5);
            dyeBlocks(level, blockPos.east(), dyeColor.getId(), blockState6);
        }
    }

    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float f) {
        if (entity.isSuppressingBounce()) {
            super.fallOn(level, blockState, blockPos, entity, f);
        } else {
            entity.causeFallDamage(f, 0.0F, entity.damageSources().fall());
        }
        dyeEntity(entity, dyeColor.getId());
    }

    public void updateEntityAfterFallOn(BlockGetter blockGetter, Entity entity) {
        if (entity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(blockGetter, entity);
        } else {
            this.bounceUp(entity);
        }

    }

    private void bounceUp(Entity entity) {
        Vec3 vec3 = entity.getDeltaMovement();
        if (vec3.y < 0.0) {
            double d = entity instanceof LivingEntity ? 1.0 : 0.8;
            entity.setDeltaMovement(vec3.x, -vec3.y * d, vec3.z);
        }

    }

    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        double d = Math.abs(entity.getDeltaMovement().y);
        if (d < 0.1 && !entity.isSteppingCarefully()) {
            double e = 0.4 + d * 0.2;
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(e, 1.0, e));
        }

        super.stepOn(level, blockPos, blockState, entity);
    }
}
