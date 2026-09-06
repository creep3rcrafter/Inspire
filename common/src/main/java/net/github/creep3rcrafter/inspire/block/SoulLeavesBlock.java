package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.register.InspireBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Soul Leaf Block — uses oak leaves texture with a blue tint.
 * Glows brighter as living entities approach within 16 blocks.
 * At full range: nearly black. At touching: light blue.
 */
public class SoulLeavesBlock extends Block {
    public static final IntegerProperty SOUL_LEVEL = InspireBlockStateProperties.BRIGHTNESS;

    public SoulLeavesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(SOUL_LEVEL, 0));
    }

    @Override
    public void onPlace(BlockState blockState, Level level, BlockPos blockPos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(blockState, level, blockPos, oldState, movedByPiston);
        if (!level.isClientSide()) {
            level.scheduleTick(blockPos, this, 2);
        }
    }

    @Override
    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource random) {
        AABB searchBox = new AABB(blockPos).inflate(8);
        List<LivingEntity> entities = serverLevel.getEntitiesOfClass(LivingEntity.class, searchBox);

        int newLevel = 0;
        if (!entities.isEmpty()) {
            Vec3 center = Vec3.atCenterOf(blockPos);
            double minDistSq = Double.MAX_VALUE;
            for (LivingEntity entity : entities) {
                double distSq = entity.distanceToSqr(center);
                if (distSq < minDistSq) minDistSq = distSq;
            }
            double dist = Math.min(Math.sqrt(minDistSq), 8.0);
            newLevel = (int)(7.0 * (1.0 - dist / 8.0));
        }

        if (blockState.getValue(SOUL_LEVEL) != newLevel) {
            serverLevel.setBlock(blockPos, blockState.setValue(SOUL_LEVEL, newLevel), 3);
        }
        serverLevel.scheduleTick(blockPos, this, 2);
    }

    @Override
    protected @NotNull BlockState updateShape(BlockState blockState, Direction direction, BlockState neighborState, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos neighborPos) {
        levelAccessor.scheduleTick(blockPos, this, 2);
        return super.updateShape(blockState, direction, neighborState, levelAccessor, blockPos, neighborPos);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SOUL_LEVEL);
    }
}
