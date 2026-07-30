package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class WetSandBlock extends Block {
    public static final IntegerProperty MOISTURE;

    static {
        MOISTURE = BlockStateProperties.MOISTURE;
    }

    public WetSandBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(MOISTURE, 7));
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos neighborPos, boolean movedByPiston) {
        if (!level.isClientSide
                && state.getValue(MOISTURE) == 0
                //&& !neighborPos.equals(pos.below())
                && FallingBlock.isFree(level.getBlockState(pos.below()))) {
            FallingBlockEntity.fall((ServerLevel) level, pos, Blocks.SAND.defaultBlockState());
        }

        super.neighborChanged(state, level, pos, block, neighborPos, movedByPiston);
    }
    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (state.getValue(MOISTURE) == 0 && FallingBlock.isFree(level.getBlockState(pos.below()))) {
            FallingBlockEntity.fall(level, pos, state);
        }
    }
    @Override
    public @NotNull BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        BlockState blockState = super.getStateForPlacement(blockPlaceContext);
        return blockState.setValue(MOISTURE, 7);
    }
    @Override
    protected void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        super.randomTick(blockState, serverLevel, blockPos, randomSource);
        int i = (Integer)blockState.getValue(MOISTURE);
        int nearbyMoisture = getNearbyMoisture(serverLevel, blockPos);
        boolean raining = serverLevel.isRainingAt(blockPos.above());
        if (!(nearbyMoisture > 0) && !raining) {
            if (i > 0) {
                serverLevel.setBlock(blockPos, blockState.setValue(MOISTURE, i - 1), Block.UPDATE_CLIENTS);
            }else{
                turnToSand(blockState, serverLevel,blockPos);
            }
        }else{
            serverLevel.setBlock(blockPos, blockState.setValue(MOISTURE, nearbyMoisture - 1), Block.UPDATE_CLIENTS);
        }
        if (i == 0){
            turnToSand(blockState, serverLevel, blockPos);
        }
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{MOISTURE});
    }
    /*
    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float f) {
        if (!level.isClientSide && level.random.nextFloat() < f - 0.5F && entity instanceof LivingEntity && (entity instanceof Player || level.getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) && entity.getBbWidth() * entity.getBbWidth() * entity.getBbHeight() > 0.512F) {
            turnToSand(blockState, level, blockPos);
        }
        super.fallOn(level, blockState, blockPos, entity, f);
    }
     */

    @Override
    public @NotNull List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        if (state.getValue(MOISTURE) == 0) {
            return List.of(new ItemStack(Blocks.SAND));
        }

        return super.getDrops(state, params);
    }
    @Override
    public @NotNull ItemStack getCloneItemStack(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(MOISTURE) == 0) {
            return new ItemStack(Blocks.SAND);
        }

        return new ItemStack(this);
    }
    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }
    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
        if (randomSource.nextInt(16) == 0) {
            if (blockState.getValue(MOISTURE) == 0) {
                BlockPos blockPos2 = blockPos.below();
                if (FallingBlock.isFree(level.getBlockState(blockPos2))) {
                    ParticleUtils.spawnParticleBelow(level, blockPos, randomSource, new BlockParticleOption(ParticleTypes.FALLING_DUST, blockState));
                }
            }else {
                BlockPos blockPos2 = blockPos.below();
                if (FallingBlock.isFree(level.getBlockState(blockPos2))) {
                    spawnDripParticle(level, blockPos, blockState);
                }
            }
        }

    }
    public static int getNearbyMoisture(LevelReader level, BlockPos pos) {
        int highestMoisture = 0;

        for (Direction direction : Direction.values()) {
            BlockPos neighbor = pos.relative(direction);
            if (level.getFluidState(neighbor).is(FluidTags.WATER)) {
                return 8;
            }
            BlockState state = level.getBlockState(neighbor);
            if (state.getBlock() instanceof WetSandBlock && state.hasProperty(WetSandBlock.MOISTURE)) {
                highestMoisture = Math.max(highestMoisture, state.getValue(WetSandBlock.MOISTURE));
            }
        }
        return highestMoisture;
    }
    public static void turnToSand(BlockState blockState, Level level, BlockPos blockPos) {
        if (FallingBlock.isFree(level.getBlockState(blockPos.below()))) {
            level.setBlock(blockPos, blockState.setValue(MOISTURE, 0), Block.UPDATE_CLIENTS);
        }else{
            level.setBlock(blockPos, Blocks.SAND.defaultBlockState(), Block.UPDATE_CLIENTS);
        }
    }
    private static void spawnDripParticle(Level level, BlockPos blockPos, BlockState blockState) {
        Vec3 vec3 = blockState.getOffset(level, blockPos);
        double e = (double)blockPos.getX() + (double)0.5F + vec3.x;
        double f = (double)((float)(blockPos.getY() + 1) - 0.6875F) - (double)0.0625F;
        double g = (double)blockPos.getZ() + (double)0.5F + vec3.z;
        ParticleOptions particleOptions = ParticleTypes.DRIPPING_DRIPSTONE_WATER;
        level.addParticle(particleOptions, e, f, g, (double)0.0F, (double)0.0F, (double)0.0F);
    }
}
