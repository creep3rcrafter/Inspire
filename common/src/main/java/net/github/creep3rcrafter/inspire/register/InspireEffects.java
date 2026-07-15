package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.utils.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InspireEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(InspireCommon.MOD_ID, Registries.MOB_EFFECT);

    public static final RegistrySupplier<MobEffect> UNDYING;
    public static final RegistrySupplier<MobEffect> AIR_SWIM;
    public static final RegistrySupplier<MobEffect> WARMING;
    public static final RegistrySupplier<MobEffect> HOMING;
    public static final RegistrySupplier<MobEffect> RECOVERY;
    public static final RegistrySupplier<MobEffect> TELEPORTATION;
    public static final RegistrySupplier<MobEffect> SLIPPERY;
    public static final RegistrySupplier<MobEffect> THUNDEROUS;
    public static final RegistrySupplier<MobEffect> EXPLOSIVE;
    public static final RegistrySupplier<MobEffect> BURNING;
    public static final RegistrySupplier<MobEffect> FREEZING;
    public static final RegistrySupplier<MobEffect> CORROSIVE;
    public static final RegistrySupplier<MobEffect> GRAVITATION;
    public static final RegistrySupplier<MobEffect> FATAL_POISON;
    public static final RegistrySupplier<MobEffect> PROTECTION;
    public static final RegistrySupplier<MobEffect> SILENCE;
    public static final RegistrySupplier<MobEffect> NULLIFIER;
    public static final RegistrySupplier<MobEffect> INFECTION;
    public static final RegistrySupplier<MobEffect> SUFFOCATION;
    public static final RegistrySupplier<MobEffect> ARCHER;
    public static final RegistrySupplier<MobEffect> CURING;
    public static final RegistrySupplier<MobEffect> NEUTRALIZING;
    public static final RegistrySupplier<MobEffect> DESTRUCTION;
    public static final RegistrySupplier<MobEffect> FERTILIZING;
    public static final RegistrySupplier<MobEffect> REDSTONEACTIVE;
    public static final RegistrySupplier<MobEffect> NIMBLE;
    public static final RegistrySupplier<MobEffect> SPONGY;

    static {
        UNDYING = EFFECTS.register("undying", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 16766527) {
            public boolean applyEffectTick(LivingEntity livingEntity, int i) {
                return super.applyEffectTick(livingEntity, i);
            }

            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            public boolean isInstantenous() {
                return false;
            }
        });
        AIR_SWIM = EFFECTS.register("air_swim", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 24991) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                if (livingEntity.isSprinting()) {
                    if (!livingEntity.isPassenger()) {
                        if (!livingEntity.hasEffect(MobEffects.DOLPHINS_GRACE)) {
                            if (!livingEntity.isEyeInFluid(FluidTags.WATER)) {
                                if (!livingEntity.updateFluidHeightAndDoFluidPushing(FluidTags.WATER, 0.014D)) {
                                    float f;
                                    livingEntity.resetFallDistance();
                                    livingEntity.wasEyeInWater = true;
                                    livingEntity.wasTouchingWater = true;
                                    livingEntity.setSwimming(true);
                                    Vec3 vec32 = livingEntity.getDeltaMovement();
                                    f = 1.08f;
                                    if (livingEntity.horizontalCollision && livingEntity.onClimbable()) {
                                        vec32 = new Vec3(vec32.x, 0.25D, vec32.z);
                                    }
                                    livingEntity.setDeltaMovement(vec32.multiply(f, f + 0.05, f));
                                    livingEntity.gameEvent(GameEvent.SWIM);
                                }
                            }
                        }
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        WARMING = EFFECTS.register("warming", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 16757504) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.level().isClientSide()) {
                    ServerLevel serverLevel = (ServerLevel) livingEntity.level();
                    livingEntity.setTicksFrozen(0);
                    if (livingEntity instanceof SnowGolem && serverLevel.getServer().getTickCount() % 20 == 0) {
                        livingEntity.hurt(livingEntity.damageSources().magic(), amplifier + 1);
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        HOMING = EFFECTS.register("homing", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 16736892) {

            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.level().isClientSide()) {
                    if (livingEntity instanceof ServerPlayer serverPlayer && !livingEntity.isSpectator()) {
                        Vec3 pos;
                        if (serverPlayer.getRespawnPosition() != null && (serverPlayer.level().getBlockState(serverPlayer.getRespawnPosition()).getBlock() instanceof BedBlock)) {
                            pos = Vec3.atBottomCenterOf(serverPlayer.getRespawnPosition());
                            serverPlayer.connection.teleport(pos.x, pos.y, pos.z, Mth.wrapDegrees(serverPlayer.getYRot()), Mth.wrapDegrees(serverPlayer.getXRot()));
                        } else {
                            pos = Vec3.atBottomCenterOf(serverPlayer.level().getSharedSpawnPos());
                            serverPlayer.connection.teleport(pos.x, pos.y, pos.z, Mth.wrapDegrees(serverPlayer.getYRot()), Mth.wrapDegrees(serverPlayer.getXRot()));
                        }
                    } else {
                        Vec3 pos = Vec3.atBottomCenterOf(livingEntity.level().getSharedSpawnPos());
                        livingEntity.teleportTo(pos.x, pos.y, pos.z);
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return true;
            }
        });
        RECOVERY = EFFECTS.register("recovery", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 9044042) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.level().isClientSide()) {
                    if (livingEntity instanceof ServerPlayer serverPlayer && !livingEntity.isSpectator()) {
                        if (serverPlayer.getLastDeathLocation().isPresent()) {
                            if (serverPlayer.level().dimension() == serverPlayer.getLastDeathLocation().get().dimension()) {
                                Vec3 pos = Vec3.atBottomCenterOf(serverPlayer.getLastDeathLocation().get().pos());
                                serverPlayer.connection.teleport(pos.x, pos.y, pos.z, Mth.wrapDegrees(serverPlayer.getYRot()), Mth.wrapDegrees(serverPlayer.getXRot()));
                            }
                        }
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return true;
            }
        });
        TELEPORTATION = EFFECTS.register("teleportation", () -> new MobEffect(MobEffectCategory.NEUTRAL, 13041919) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.level().isClientSide()) {
                    if (livingEntity.level().getServer() != null) {
                        if (livingEntity.level().getServer().getTickCount() % (20 + livingEntity.getRandom().nextInt(-10, 40)) == 0) {
                            ServerLevel level = livingEntity.level().getServer().getLevel(livingEntity.level().dimension());
                            assert level != null;
                            if (!level.isClientSide) {
                                double d = livingEntity.getX();
                                double e = livingEntity.getY();
                                double f = livingEntity.getZ();
                                for (int i = 0; i < 32; ++i) {
                                    double g = livingEntity.getX() + (livingEntity.getRandom().nextDouble() - 0.5D) * 32.0D;
                                    double h = Mth.clamp(livingEntity.getY() + (double) (livingEntity.getRandom().nextInt(32) - 16), level.getMinBuildHeight(), level.getMinBuildHeight() + level.getLogicalHeight() - 1);
                                    double j = livingEntity.getZ() + (livingEntity.getRandom().nextDouble() - 0.5D) * 32.0D;
                                    if (livingEntity.isPassenger()) {
                                        livingEntity.stopRiding();
                                    }

                                    Vec3 vec3 = livingEntity.position();
                                    if (livingEntity.randomTeleport(g, h, j, true)) {
                                        level.gameEvent(GameEvent.TELEPORT, vec3, GameEvent.Context.of(livingEntity));
                                        SoundEvent soundEvent = livingEntity instanceof Fox ? SoundEvents.FOX_TELEPORT : SoundEvents.CHORUS_FRUIT_TELEPORT;
                                        level.playSound(null, d, e, f, soundEvent, SoundSource.PLAYERS, 1.0F, 1.0F);
                                        livingEntity.playSound(soundEvent, 1.0F, 1.0F);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        SLIPPERY = EFFECTS.register("slippery", () -> new MobEffect(MobEffectCategory.NEUTRAL, 1572863) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration > 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        THUNDEROUS = EFFECTS.register("thunderous", () -> new MobEffect(MobEffectCategory.HARMFUL, 14745599) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.level().isClientSide()) {
                    ServerLevel serverLevel = (ServerLevel) livingEntity.level();
                    Utils.lightning(livingEntity, serverLevel, amplifier);
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return true;
            }
        });
        EXPLOSIVE = EFFECTS.register("explosive", () -> new MobEffect(MobEffectCategory.HARMFUL, 4522008) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.level().isClientSide()) {
                    ServerLevel serverLevel = (ServerLevel) livingEntity.level();
                    if (!livingEntity.isSpectator()) {
                        if (livingEntity.level().dimension() == Level.NETHER) {
                            Utils.explode(serverLevel, livingEntity.blockPosition(), amplifier, true);
                        } else {
                            if (amplifier > 4) {
                                Utils.explode(serverLevel, livingEntity.blockPosition(), amplifier, true);
                            } else {
                                Utils.explode(serverLevel, livingEntity.blockPosition(), amplifier);
                            }
                        }
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        BURNING = EFFECTS.register("burning", () -> new MobEffect(MobEffectCategory.HARMFUL, 16740608) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.isInWaterRainOrBubble()) {
                    livingEntity.setRemainingFireTicks(1);
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        FREEZING = EFFECTS.register("freezing", () -> new MobEffect(MobEffectCategory.HARMFUL, 1572863) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                if (livingEntity.canFreeze()) {
                    livingEntity.setIsInPowderSnow(true);
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        CORROSIVE = EFFECTS.register("corrosive", () -> new MobEffect(MobEffectCategory.HARMFUL, 10157824) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                if (!livingEntity.level().isClientSide()) {
                    ServerLevel serverLevel = (ServerLevel) livingEntity.level();
                    if (!livingEntity.isSpectator() && serverLevel.getServer().getTickCount() % 10 == 0) {
                        MinecraftServer server = serverLevel.getServer();
                        if (livingEntity instanceof ServerPlayer) {
                            List<Item> items = new ArrayList<Item>();
                            items.add(Items.IRON_NUGGET);
                            items.add(Items.IRON_ORE);
                            items.add(Items.IRON_INGOT);
                            items.add(Items.COPPER_INGOT);
                            items.add(Items.NETHERITE_SCRAP);
                            items.add(Items.NETHERITE_INGOT);

                            List<Item> results = Utils.recipesContainsItems(server, RecipeType.CRAFTING, items);
                            results.addAll(Utils.recipesContainsItems(server, RecipeType.SMELTING, items));
                            results.addAll(Utils.recipesContainsItems(server, RecipeType.SMITHING, items));
                            results.addAll(Utils.recipesContainsItems(server, RecipeType.BLASTING, items));
                            results.addAll(Utils.recipesContainsItems(server, RecipeType.SMOKING, items));
                            results.addAll(Utils.recipesContainsItems(server, RecipeType.STONECUTTING, items));
                            results.addAll(Utils.recipesContainsItems(server, RecipeType.CAMPFIRE_COOKING, items));

                            List<Item> resultsWithoutDuplicates = new ArrayList<Item>(new HashSet<>(results));

                            Inventory inventory = ((ServerPlayer) livingEntity).getInventory();
                            for (int i = 0; i < inventory.getContainerSize(); i++) {
                                Item item = inventory.getItem(i).getItem();
                                ItemStack itemStack = inventory.getItem(i);
                                if (itemStack.isDamageableItem()) {
                                    Utils.damageItem(livingEntity, itemStack, 1 + amplifier);
                                } else if (!itemStack.isDamageableItem() && resultsWithoutDuplicates.contains(item)) {
                                    if (livingEntity.getRandom().nextInt(100) >= 90) {
                                        if (livingEntity.getRandom().nextInt(3) <= amplifier) {
                                            itemStack.shrink(1);
                                            //livingEntity.playSound(Registry.SOUND_EVENT.get(new ResourceLocation("entity.item.break")));
                                        }
                                    }
                                }
                            }
                        } else if (livingEntity instanceof IronGolem) {
                            livingEntity.hurt(livingEntity.damageSources().magic(), 1f + amplifier);//take iron damage
                        } else {
                            if (livingEntity.hasItemInSlot(EquipmentSlot.MAINHAND)) {
                                Utils.damageItem(livingEntity, EquipmentSlot.MAINHAND, 1 + amplifier);
                            }
                            if (livingEntity.hasItemInSlot(EquipmentSlot.OFFHAND)) {
                                Utils.damageItem(livingEntity, EquipmentSlot.OFFHAND, 1 + amplifier);
                            }
                            if (livingEntity.hasItemInSlot(EquipmentSlot.HEAD)) {
                                Utils.damageItem(livingEntity, EquipmentSlot.HEAD, 1 + amplifier);
                            }
                            if (livingEntity.hasItemInSlot(EquipmentSlot.CHEST)) {
                                Utils.damageItem(livingEntity, EquipmentSlot.CHEST, 1 + amplifier);
                            }
                            if (livingEntity.hasItemInSlot(EquipmentSlot.LEGS)) {
                                Utils.damageItem(livingEntity, EquipmentSlot.LEGS, 1 + amplifier);
                            }
                            if (livingEntity.hasItemInSlot(EquipmentSlot.FEET)) {
                                Utils.damageItem(livingEntity, EquipmentSlot.FEET, 1 + amplifier);
                            }
                        }
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        GRAVITATION = EFFECTS.register("gravitation", () -> new MobEffect(MobEffectCategory.HARMFUL, 11350783) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        FATAL_POISON = EFFECTS.register("fatal_poison", () -> new MobEffect(MobEffectCategory.HARMFUL, 16711935) {
            @Override
            public boolean applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
                livingEntity.hurt(livingEntity.damageSources().magic(), 1.0F);
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                int k;
                k = 25 >> amplifier;
                if (k > 0) {
                    return duration % k == 0;
                } else {
                    return true;
                }
            }
        });
        PROTECTION = EFFECTS.register("protection", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 8751501) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                if (livingEntity.getAttributes().hasAttribute(Attributes.ARMOR)) {
                    addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "protection_armor_bonus"), 1, AttributeModifier.Operation.ADD_VALUE);
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        SILENCE = EFFECTS.register("silence", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 92) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                livingEntity.setSilent(true);
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        NULLIFIER = EFFECTS.register("nullifier", () -> new MobEffect(MobEffectCategory.NEUTRAL, 13691391) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                for (MobEffectInstance effectInstance : livingEntity.getActiveEffects()) {
                    if (effectInstance.getEffect() != InspireEffects.NULLIFIER.get()) {
                        livingEntity.removeEffect(effectInstance.getEffect());
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }


            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        INFECTION = EFFECTS.register("infection", () -> new MobEffect(MobEffectCategory.HARMFUL, 14848) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                if (livingEntity.hasEffect(Holder.direct(this))) {
                    MobEffectInstance mobEffectInstance = livingEntity.getEffect(Holder.direct(this));
                    int duration = 0;
                    if (mobEffectInstance != null) {
                        duration = mobEffectInstance.getDuration();
                    }
                    if (duration == 600) {
                        livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 600, 40));
                    } else if (duration == 300) {
                        livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 300));
                    } else if (duration == 200) {
                        livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200));
                    } else if (duration == 1) {
                        if (livingEntity instanceof Player && !((Player) livingEntity).isCreative()) {
                            livingEntity.hurt(livingEntity.damageSources().magic(), 5f);
                            if ((livingEntity.isDeadOrDying())) {
                                Zombie zombie = new Zombie(EntityType.ZOMBIE, livingEntity.level());
                                zombie.copyPosition(livingEntity);
                                zombie.setCustomName(livingEntity.getCustomName());
                                zombie.setCanPickUpLoot(true);
                                EquipmentSlot[] equipmentSlots = EquipmentSlot.values();
                                for (EquipmentSlot equipmentSlot : equipmentSlots) {
                                    ItemStack itemStack = livingEntity.getItemBySlot(equipmentSlot);
                                    if (!itemStack.isEmpty()) {
                                        zombie.setItemSlot(equipmentSlot, itemStack.copy());
                                        zombie.setDropChance(equipmentSlot, zombie.getEquipmentDropChance(equipmentSlot));
                                        itemStack.setCount(0);
                                    }
                                }
                                livingEntity.level().addFreshEntity(zombie);
                                if (livingEntity.isPassenger()) {
                                    Entity entity = livingEntity.getVehicle();
                                    livingEntity.stopRiding();
                                    zombie.startRiding(entity, true);
                                }
                                zombie.addEffect(new MobEffectInstance(Holder.direct(this), 1200));
                                livingEntity.discard();
                            }
                        } else if (livingEntity instanceof Mob mob) {
                            if (livingEntity instanceof Villager) {
                                mob.convertTo(EntityType.ZOMBIE_VILLAGER, true);
                                mob.addEffect(new MobEffectInstance(Holder.direct(this), 1200));
                            } else if (livingEntity instanceof Piglin) {
                                mob.convertTo(EntityType.ZOMBIFIED_PIGLIN, true);
                                mob.addEffect(new MobEffectInstance(Holder.direct(this), 1200));
                            } else if (livingEntity instanceof Hoglin) {
                                mob.convertTo(EntityType.ZOGLIN, true);
                                mob.addEffect(new MobEffectInstance(Holder.direct(this), 1200));
                            } else if (livingEntity instanceof Horse) {
                                mob.convertTo(EntityType.ZOMBIE_HORSE, true);
                                mob.addEffect(new MobEffectInstance(Holder.direct(this), 1200));
                            } else {
                                if (!(livingEntity instanceof Zombie) && !(livingEntity instanceof ZombieHorse) && !(livingEntity instanceof Zoglin)) {
                                    livingEntity.hurt(livingEntity.damageSources().magic(), 5);
                                }
                            }
                        } else {
                            livingEntity.hurt(livingEntity.damageSources().magic(), 5);
                        }
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        SUFFOCATION = EFFECTS.register("suffocation", () -> new MobEffect(MobEffectCategory.HARMFUL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                livingEntity.setAirSupply(Math.max(livingEntity.getAirSupply() - 1, -20));
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        ARCHER = EFFECTS.register("archer", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        CURING = EFFECTS.register("curing", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                for (MobEffectInstance mobEffectInstance : livingEntity.getActiveEffects()) {
                    if (mobEffectInstance.getEffect().value().getCategory().equals(MobEffectCategory.HARMFUL)) {
                        livingEntity.removeEffect(mobEffectInstance.getEffect());
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return true;
            }
        });
        NEUTRALIZING = EFFECTS.register("neutralizing", () -> new MobEffect(MobEffectCategory.NEUTRAL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                for (MobEffectInstance mobEffectInstance : livingEntity.getActiveEffects()) {
                    if (mobEffectInstance.getEffect().value().getCategory().equals(MobEffectCategory.NEUTRAL)) {
                        livingEntity.removeEffect(mobEffectInstance.getEffect());
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return true;
            }
        });
        DESTRUCTION = EFFECTS.register("destruction", () -> new MobEffect(MobEffectCategory.HARMFUL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                for (MobEffectInstance mobEffectInstance : livingEntity.getActiveEffects()) {
                    if (mobEffectInstance.getEffect().value().getCategory().equals(MobEffectCategory.BENEFICIAL)) {
                        livingEntity.removeEffect(mobEffectInstance.getEffect());
                    }
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return true;
            }
        });
        FERTILIZING = EFFECTS.register("fertilization", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration == 1;
            }

            @Override
            public boolean isInstantenous() {
                return true;
            }
        });
        REDSTONEACTIVE = EFFECTS.register("redstoneactive", () -> new MobEffect(MobEffectCategory.NEUTRAL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        NIMBLE = EFFECTS.register("nimble", () -> new MobEffect(MobEffectCategory.BENEFICIAL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
        SPONGY = EFFECTS.register("spongy", () -> new MobEffect(MobEffectCategory.NEUTRAL, 0) {
            @Override
            public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
                Level level = livingEntity.level();
                BlockPos blockPos = livingEntity.blockPosition();
                if (Utils.removeWaterBreadthFirstSearch(level, blockPos)) {
                    //level.setBlock(blockPos, Blocks.WET_SPONGE.defaultBlockState(), 2);
                    //level.levelEvent(2001, blockPos, Block.getId(Blocks.WATER.defaultBlockState()));
                }
                return super.applyEffectTick(livingEntity, amplifier);
            }

            @Override
            public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
                return duration >= 1;
            }

            @Override
            public boolean isInstantenous() {
                return false;
            }
        });
    }
}
