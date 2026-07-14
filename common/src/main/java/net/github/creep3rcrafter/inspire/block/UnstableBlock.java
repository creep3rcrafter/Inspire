package net.github.creep3rcrafter.inspire.block;

import com.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LandingBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class UnstableBlock extends Block implements LandingBlock {
    public UnstableBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.isIn(BlockTags.FIRE) || state.isLiquid() || state.isReplaceable();
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canFallThrough(world.getBlockState(pos.down()))) {
            int offset = -1;
            for (int i = 0; world.getBlockState(pos.down(i)).isOf(InspireBlocks.UNSTABLE_COBBLESTONE.get()); ++i) {
                offset++;
            }
            if (canFallThrough(world.getBlockState(pos.down(offset + 1)))) {
                if (world.getBlockState(pos.down(offset)).isOf(InspireBlocks.UNSTABLE_COBBLESTONE.get())) {
                    world.scheduleBlockTick(pos.down(offset), InspireBlocks.UNSTABLE_COBBLESTONE.get(), this.getFallDelay() / 4);
                }
            }
        } else if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
            this.configureFallingBlockEntity(fallingBlockEntity);
        }
    }

    @Override
    public void onEntityLand(BlockView world, Entity entity) {
        super.onEntityLand(world, entity);
        if (world instanceof ServerWorld serverWorld) {
            serverWorld.scheduleBlockTick(entity.getBlockPos().down(), this, this.getFallDelay());
        }
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);
        if (world instanceof ServerWorld serverWorld) {
            serverWorld.scheduleBlockTick(pos, this, this.getFallDelay());
        }
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        if (world instanceof ServerWorld serverWorld) {
            serverWorld.scheduleBlockTick(pos, this, this.getFallDelay());
        }
    }

    protected void configureFallingBlockEntity(FallingBlockEntity fallingBlockEntity) {
    }

    protected int getFallDelay() {
        return 10;
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(16) == 0) {
            BlockPos blockPos = pos.down();
            if (canFallThrough(world.getBlockState(blockPos))) {
                ParticleUtil.spawnParticle(world, pos, random, new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state));
            }
        }

    }
}
