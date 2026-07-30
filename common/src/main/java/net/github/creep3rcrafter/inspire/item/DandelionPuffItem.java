package net.github.creep3rcrafter.inspire.item;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DandelionPuffItem extends BlockItem {
    public DandelionPuffItem(Properties properties) {
        super(Blocks.DANDELION, properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            stack.shrink(1);
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 60, 5));
            player.getCooldowns().addCooldown(this, 20);
        }
        Vec3 look = player.getLookAngle();
        Vec3 mouth = player.getEyePosition().add(look.scale(0.25)).add(0.0, -0.15, 0.0);
        for (int i = 0; i < 16; i++) {
            level.addParticle(
                    ParticleTypes.POOF,
                    mouth.x,
                    mouth.y,
                    mouth.z,
                    look.x * 0.25,
                    look.y * 0.25,
                    look.z * 0.25
            );
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public @NotNull InteractionResult place(BlockPlaceContext blockPlaceContext) {
        if (blockPlaceContext.getPlayer() != null){
            if (!blockPlaceContext.isSecondaryUseActive()){
                Player player = blockPlaceContext.getPlayer();
                if (!blockPlaceContext.getLevel().isClientSide) {
                    player.addEffect(new MobEffectInstance(MobEffects.LUCK, 40, 5));
                    player.getCooldowns().addCooldown(this, 20);
                }
                Vec3 look = player.getLookAngle();
                Vec3 mouth = player.getEyePosition().add(look.scale(0.25)).add(0.0, -0.15, 0.0);
                for (int i = 0; i < 16; i++) {
                    blockPlaceContext.getLevel().addParticle(
                            ParticleTypes.POOF,
                            mouth.x,
                            mouth.y,
                            mouth.z,
                            look.x * 0.25,
                            look.y * 0.25,
                            look.z * 0.25
                    );
                }
            }
        }
        return super.place(blockPlaceContext);
    }
    @Override
    protected @Nullable BlockState getPlacementState(BlockPlaceContext blockPlaceContext) {
        if (blockPlaceContext.isSecondaryUseActive()){
            return InspireBlocks.DANDELION_PUFF.get().defaultBlockState();
        }
        return super.getPlacementState(blockPlaceContext);
    }
}
