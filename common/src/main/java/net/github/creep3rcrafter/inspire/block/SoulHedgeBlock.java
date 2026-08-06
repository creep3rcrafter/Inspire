package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.register.InspireBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;

public class SoulHedgeBlock extends WallBlock {
    public static final IntegerProperty SOUL_LEVEL = InspireBlockStateProperties.BRIGHTNESS;
    public SoulHedgeBlock(Properties properties) {
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SOUL_LEVEL);
    }

    // WallBlock builds its shape maps in the constructor using stateDefinition.any(), which
    // has SOUL_LEVEL=0. States with any other SOUL_LEVEL value are not in the map and would
    // return null, causing a NullPointerException during block state cache initialization.
    // Normalize SOUL_LEVEL to 0 before delegating to the parent shape lookups.
    @Override
    protected VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return super.getShape(blockState.setValue(SOUL_LEVEL, 0), blockGetter, blockPos, collisionContext);
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return super.getCollisionShape(blockState.setValue(SOUL_LEVEL, 0), blockGetter, blockPos, collisionContext);
    }
}
