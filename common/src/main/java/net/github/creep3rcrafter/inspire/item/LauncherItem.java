package net.github.creep3rcrafter.inspire.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ChargedProjectiles;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import java.util.List;
import java.util.function.Predicate;

public class LauncherItem extends CrossbowItem {
    public static final Predicate<ItemStack> VALID_PROJECTILES = (itemStack) -> {
        return (itemStack.is(Items.ARROW) ||
                itemStack.is(Items.FIREWORK_ROCKET) ||
                itemStack.is(Items.FIRE_CHARGE) ||
                itemStack.is(Items.BLAZE_POWDER) ||
                itemStack.is(Items.SNOWBALL) ||
                itemStack.is(Items.EGG) ||
                itemStack.is(Items.ENDER_PEARL) ||
                itemStack.is(Items.EXPERIENCE_BOTTLE) ||
                itemStack.is(Items.SPLASH_POTION) ||
                itemStack.is(Items.LINGERING_POTION) ||
                itemStack.is(Items.TNT));
    };

    public LauncherItem(Properties properties) {
        super(properties);
    }

    private static void shootProjectile(Level level, LivingEntity livingEntity, InteractionHand interactionHand, ItemStack itemStack, ItemStack itemStack2, float f, boolean bl, float g, float h, float i) {
        if (!level.isClientSide) {
            //boolean arrow = itemStack2.is(Items.ARROW);
            boolean firework = itemStack2.is(Items.FIREWORK_ROCKET);
            boolean fire_charge = itemStack2.is(Items.FIRE_CHARGE);
            boolean blaze_powder = itemStack2.is(Items.BLAZE_POWDER);
            boolean snowball = itemStack2.is(Items.SNOWBALL);
            boolean egg = itemStack2.is(Items.EGG);
            boolean ender_pearl = itemStack2.is(Items.ENDER_PEARL);
            boolean experience_bottle = itemStack2.is(Items.EXPERIENCE_BOTTLE);
            boolean splash_potion = itemStack2.is(Items.SPLASH_POTION);
            boolean lingering_potion = itemStack2.is(Items.LINGERING_POTION);
            boolean tnt = itemStack2.is(Items.TNT);
            Projectile projectile;
            if (firework) {
                System.out.println("firework");
                projectile = new FireworkRocketEntity(level, itemStack2, livingEntity, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ(), true);
            } else if (fire_charge) {
                System.out.println("fire_charge");
                projectile = new LargeFireball(level, livingEntity, livingEntity.getViewVector(1.0F), 2);
            } else if (blaze_powder) {
                System.out.println("blaze_powder");
                projectile = new SmallFireball(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ(), livingEntity.getViewVector(1.0F));
            } else if (snowball) {
                System.out.println("snowball");
                projectile = new Snowball(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
            } else if (egg) {
                System.out.println("egg");
                projectile = new ThrownEgg(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
            } else if (ender_pearl) {
                System.out.println("ender_pearl");
                projectile = new ThrownEnderpearl(level, livingEntity);
                ((ThrownEnderpearl) projectile).setItem(itemStack2);
            } else if (experience_bottle) {
                System.out.println("experience_bottle");
                projectile = new ThrownExperienceBottle(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
            } else if (splash_potion || lingering_potion) {
                System.out.println("potion");
                projectile = new ThrownPotion(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
                ((ThrownPotion) projectile).setItem(itemStack2);
            } else if (tnt) {
                System.out.println("tnt");
                projectile = new FireworkRocketEntity(level, itemStack2, livingEntity, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ(), true);
            } else {
                System.out.println("arrow");
                projectile = new Arrow(level, livingEntity, itemStack2, itemStack);
                if (bl || i != 0.0F) {
                    ((AbstractArrow) projectile).pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                }
            }

            Vec3 vec32 = livingEntity.getViewVector(1.0F);
            Vector3f vector3f = new Vector3f((float)vec32.x, (float)vec32.y, (float)vec32.z);
            if (i != 0.0F) {
                Vector3f upVec = livingEntity.getUpVector(1.0F).toVector3f();
                vector3f.rotateAxis(i * (float)(Math.PI / 180.0), upVec.x, upVec.y, upVec.z);
            }
            projectile.shoot(vector3f.x(), vector3f.y(), vector3f.z(), g, h);

            itemStack.hurtAndBreak(firework ? 3 : 1, livingEntity, interactionHand == InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
            level.addFreshEntity(projectile);
            level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), SoundEvents.CROSSBOW_SHOOT, SoundSource.PLAYERS, 1.0F, f);
        }
    }

    public static void performShooting(Level level, LivingEntity livingEntity, InteractionHand interactionHand, ItemStack itemStack, float f, float g) {
        List<ItemStack> list = itemStack.getOrDefault(DataComponents.CHARGED_PROJECTILES, ChargedProjectiles.EMPTY).getItems();
        float[] fs = getShotPitches(livingEntity.getRandom());

        for (int i = 0; i < list.size(); ++i) {
            ItemStack itemStack2 = list.get(i);
            boolean bl = livingEntity instanceof Player && ((Player) livingEntity).getAbilities().instabuild;
            if (!itemStack2.isEmpty()) {
                if (i == 0) {
                    shootProjectile(level, livingEntity, interactionHand, itemStack, itemStack2, fs[i], bl, f, g, 0.0F);
                } else if (i == 1) {
                    shootProjectile(level, livingEntity, interactionHand, itemStack, itemStack2, fs[i], bl, f, g, -10.0F);
                } else if (i == 2) {
                    shootProjectile(level, livingEntity, interactionHand, itemStack, itemStack2, fs[i], bl, f, g, 10.0F);
                }
            }
        }

        itemStack.remove(DataComponents.CHARGED_PROJECTILES);
    }

    @Override
    public @NotNull Predicate<ItemStack> getSupportedHeldProjectiles() {
        return VALID_PROJECTILES;
    }

    @Override
    public @NotNull Predicate<ItemStack> getAllSupportedProjectiles() {
        return VALID_PROJECTILES;
    }

    @Override
    public int getDefaultProjectileRange() {
        return 20;
    }

    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (isCharged(itemStack)) {
            performShooting(level, player, interactionHand, itemStack, getShootingPower(itemStack), 1.0F, null);
            return InteractionResultHolder.consume(itemStack);
        } else if (!player.getProjectile(itemStack).isEmpty()) {
            if (!isCharged(itemStack)) {
                player.startUsingItem(interactionHand);
            }

            return InteractionResultHolder.consume(itemStack);
        } else {
            return InteractionResultHolder.fail(itemStack);
        }
    }

    private static float[] getShotPitches(RandomSource random) {
        boolean bl = random.nextBoolean();
        return new float[]{1.0F, (random.nextFloat() * 2.0F - 1.0F) * 0.2F + 1.0F, (random.nextFloat() * 2.0F - 1.0F) * 0.2F + (bl ? 1.0F : 0.82F)};
    }

    private static float getShootingPower(ItemStack chargedItemStack) {
        ChargedProjectiles charged = chargedItemStack.getOrDefault(DataComponents.CHARGED_PROJECTILES, ChargedProjectiles.EMPTY);
        if (!charged.getItems().isEmpty() && charged.getItems().get(0).is(Items.FIREWORK_ROCKET)) {
            return 1.6F;
        }
        return 3.15F;
    }
}
