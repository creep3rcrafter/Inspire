package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Fallable;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableBlock extends Block implements Fallable {
    public UnstableBlock(BlockBehaviour.Properties settings) {
        super(settings);
    }

    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.is(BlockTags.FIRE) || state.liquid() || state.canBeReplaced();
    }

    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!canFallThrough(world.getBlockState(pos.below()))) {
            int offset = -1;
            for (int i = 0; world.getBlockState(pos.below(i)).is(InspireBlocks.UNSTABLE_COBBLESTONE.get()); ++i) {
                offset++;
            }
            if (canFallThrough(world.getBlockState(pos.below(offset + 1)))) {
                if (world.getBlockState(pos.below(offset)).is(InspireBlocks.UNSTABLE_COBBLESTONE.get())) {
                    world.scheduleTick(pos.below(offset), InspireBlocks.UNSTABLE_COBBLESTONE.get(), this.getFallDelay() / 4);
                }
            }
        } else if (canFallThrough(world.getBlockState(pos.below())) && pos.getY() >= world.getMinBuildHeight()) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.fall(world, pos, state);
            this.configureFallingBlockEntity(fallingBlockEntity);
        }
    }

    @Override
    public void fallOn(Level world, BlockState state, BlockPos pos, Entity entity, float distance) {
        super.fallOn(world, state, pos, entity, distance);
        if (world instanceof ServerLevel serverWorld) {
            serverWorld.scheduleTick(entity.blockPosition().below(), this, this.getFallDelay());
        }
    }

    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        super.stepOn(world, pos, state, entity);
        if (world instanceof ServerLevel serverWorld) {
            serverWorld.scheduleTick(pos, this, this.getFallDelay());
        }
    }

    @Override
    public void playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(world, pos, state, player);
        if (world instanceof ServerLevel serverWorld) {
            serverWorld.scheduleTick(pos, this, this.getFallDelay());
        }
    }

    protected void configureFallingBlockEntity(FallingBlockEntity fallingBlockEntity) {
    }

    protected int getFallDelay() {
        return 10;
    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (random.nextInt(16) == 0) {
            BlockPos blockPos = pos.below();
            if (canFallThrough(world.getBlockState(blockPos))) {
                double x = pos.getX() + random.nextDouble();
                double y = pos.getY() - 0.05D;
                double z = pos.getZ() + random.nextDouble();
                world.addParticle(new BlockParticleOption(ParticleTypes.FALLING_DUST, state), x, y, z, 0.0D, 0.0D, 0.0D);
            }
        }

    }
}
