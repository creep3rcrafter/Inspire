package net.github.creep3rcrafter.inspire.block;

import dev.architectury.core.block.ArchitecturyLiquidBlock;
import net.github.creep3rcrafter.inspire.block.entity.PotionLiquidBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@SuppressWarnings({"deprecation", "unused"})
public class PotionLiquidBlock extends ArchitecturyLiquidBlock implements EntityBlock {

    public PotionLiquidBlock(Supplier<? extends FlowingFluid> fluid, Properties properties) {
        super(fluid, properties);
    }

    /*
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{POTION_ID});
    }
     */

    @Override
    public void entityInside(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Entity entity) {
        super.entityInside(blockState, level, blockPos, entity);
        if (!level.isClientSide && entity instanceof LivingEntity) {
            PotionLiquidBlockEntity potionLiquidBlockEntity = (PotionLiquidBlockEntity) level.getBlockEntity(blockPos);
            Player player = entity instanceof Player ? (Player) entity : null;
            if (potionLiquidBlockEntity != null) {
                List<MobEffectInstance> list = potionLiquidBlockEntity.potion.getEffects();
                ServerLevel serverLevel = (ServerLevel) level;
                for (MobEffectInstance mobEffectInstance : list) {
                    if (mobEffectInstance.getEffect().isInstantenous()) {
                        Random random = new Random();
                        if (serverLevel.getServer().getTickCount() % (20 * 2) == 0 && random.nextInt(100) > 90) {
                            mobEffectInstance.getEffect().applyInstantenousEffect(player, player, (LivingEntity) entity, mobEffectInstance.getAmplifier(), 1.0D);
                        }
                    } else {
                        if (!((LivingEntity) entity).hasEffect(mobEffectInstance.getEffect())) {
                            ((LivingEntity) entity).addEffect(new MobEffectInstance(mobEffectInstance.getEffect(), Math.max((int) (mobEffectInstance.getDuration() * 0.75), 1), mobEffectInstance.getAmplifier(), mobEffectInstance.isAmbient(), mobEffectInstance.isVisible()));

                        } else {
                            if (level.getServer().getTickCount() % ((mobEffectInstance.getDuration() / 2) + 1) == 0) {
                                ((LivingEntity) entity).addEffect(new MobEffectInstance(mobEffectInstance.getEffect(), Math.max((int) (mobEffectInstance.getDuration() * 0.75), 1), mobEffectInstance.getAmplifier(), mobEffectInstance.isAmbient(), mobEffectInstance.isVisible()));

                            }
                        }
                    }
                }
            }
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        //PotionLiquidBlockEntity potionLiquidBlockEntity = new PotionLiquidBlockEntity(blockPos, blockState);
        //return potionLiquidBlockEntity;
        return null;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState blockState, @NotNull BlockEntityType<T> blockEntityType) {
        return null;
        // return blockEntityType == InspireBlockEntityTypes.POTION_LIQUID_BLOCK_ENTITY_TYPE.get() ? PotionLiquidBlockEntity::tick : null;
    }

}
