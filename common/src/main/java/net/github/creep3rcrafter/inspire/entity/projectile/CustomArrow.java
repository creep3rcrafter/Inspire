package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.github.creep3rcrafter.inspire.utils.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class CustomArrow extends AbstractArrow {

    private static final EntityDataAccessor<Float> TIP;
    private static final EntityDataAccessor<Float> ROD;
    private static final EntityDataAccessor<Float> TAIL;

    static {
        TIP = SynchedEntityData.defineId(CustomArrow.class, EntityDataSerializers.FLOAT);
        ROD = SynchedEntityData.defineId(CustomArrow.class, EntityDataSerializers.FLOAT);
        TAIL = SynchedEntityData.defineId(CustomArrow.class, EntityDataSerializers.FLOAT);
    }

    private int tick;

    public CustomArrow(EntityType<? extends CustomArrow> entityType, Level level) {
        super(entityType, level);
        //this.tip = 0;
        //this.rod = 0;
        //this.tail = 0;
    }

    public CustomArrow(Level level, double x, double y, double z) {
        super(InspireEntityTypes.CUSTOM_ARROW.get(), x, y, z, level);
    }

    public CustomArrow(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.CUSTOM_ARROW.get(), livingEntity, level);
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(TIP, 0.0f);
        this.entityData.define(ROD, 0.0f);
        this.entityData.define(TAIL, 0.0f);
    }


    @Override
    protected float getWaterInertia() {
        if (getTip() == 0.55f) {
            return 1f;
        } else {
            return super.getWaterInertia();
        }
    }

    @Override
    public boolean fireImmune() {
        if (getTip() == 0.55f) {
            return true;
        } else {
            return super.fireImmune();
        }
    }

    @Override
    public void setKnockback(int i) {
        if (this.getRod() == 0.1f) {
            super.setKnockback(i + 1);
            if (this.getTip() == 0.6f) {
                super.setKnockback(i + 5);
            }
        } else {
            if (this.getTip() == 0.6f) {
                super.setKnockback(i + 4);
            } else {
                setKnockback(i);
            }
        }
    }

    @Override
    public void setBaseDamage(double d) {
        super.setBaseDamage(d);
    }

    @Override
    protected void tickDespawn() {
        if (getTip() == 0.9f) {
            ++this.life;
            if (this.life >= 600) {
                this.discard();
            }
        } else {
            super.tickDespawn();
        }
    }

    @Override
    public void tick() {
        if (getTip() == 0.85f) {
            tick++;
            if (tick == 1) {
                this.playSound(SoundEvents.WARDEN_SONIC_CHARGE, 0.5F, 40.0F);
            }
        }
        if (getRod() == 0.1f) {
            tick++;
            if (tick == 1) {
                this.playSound(SoundEvents.FIREWORK_ROCKET_SHOOT, 0.5F, 40.0F);
            }
        }
        super.tick();
        if (getTip() == 0.55f) {
            clearFire();
        } else if (getTip() == 0.9f) {
            tickDespawn();
        }
    }

    @Override
    public boolean isOnFire() {
        if (getRod() == 0.1f) {
            return true;
        } else {
            return super.isOnFire();
        }
    }

    @Override
    public boolean isNoGravity() {
        if (getTip() == 0.9f) {
            return true;
        } else {
            return super.isNoGravity();
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            ServerLevel serverLevel = (ServerLevel) getLevel();
            if (this.getTip() == 0.05f) {
            } else if (this.getTip() == 0.15f) {
                RandomSource random = serverLevel.getRandom();
                if (random.nextFloat() <= 0.5F) {
                    if (serverLevel.isThundering()) {
                        LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
                        if (lightningBolt != null) {
                            lightningBolt.moveTo(Vec3.atBottomCenterOf(entityHitResult.getEntity().getOnPos()));
                            lightningBolt.setCause(getOwner() instanceof ServerPlayer ? (ServerPlayer) getOwner() : null);
                            serverLevel.addFreshEntity(lightningBolt);
                            discard();
                        }
                    }
                }
            } else if (this.getTip() == 0.6f) {
                discard();
            } else if (this.getTip() == 0.65f) {
                if (serverLevel.getBlockState(entityHitResult.getEntity().blockPosition()).getMaterial().isReplaceable()) {
                    serverLevel.setBlock(entityHitResult.getEntity().blockPosition(), Blocks.COBWEB.defaultBlockState(), 3);
                }
                this.discard();
            } else if (this.getTip() == 0.7f) {
                LivingEntity livingEntity = (LivingEntity) entityHitResult.getEntity();
                double d = livingEntity.getX();
                double e = livingEntity.getY();
                double f = livingEntity.getZ();

                for (int i = 0; i < 16; ++i) {
                    double g = livingEntity.getX() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
                    double h = Mth.clamp(livingEntity.getY() + (double) (livingEntity.getRandom().nextInt(16) - 8), level.getMinBuildHeight(), level.getMinBuildHeight() + ((ServerLevel) level).getLogicalHeight() - 1);
                    double j = livingEntity.getZ() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
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
                    this.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT);
                    this.discard();
                }
            } else if (this.getTip() == 0.75f) {
                Utils.explode(this.level, entityHitResult.getEntity().blockPosition(), 2f);
                discard();
            } else if (this.getTip() == 0.8f) {
                if (this.getOwner() != null) {
                    this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                    this.getOwner().teleportTo(this.position().x, this.position().y, this.position().z);
                }
                this.discard();
            } else if (this.getTip() == 0.85f) {
                float range = 20;
                LivingEntity livingEntity;
                if (serverLevel.getNearestPlayer(this, range) != null && serverLevel.getNearestPlayer(this, range) != this.getOwner()) {
                    livingEntity = serverLevel.getNearestPlayer(this, range);
                } else if (serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != null &&
                        serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != this.getOwner()) {
                    livingEntity = serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range));
                } else {
                    livingEntity = null;
                }

                if (livingEntity != null) {
                    Vec3 vec32 = livingEntity.getEyePosition().subtract(this.position());
                    Vec3 vec33 = vec32.normalize();
                    for (int i = 1; i < Mth.floor(vec32.length()) + 7; ++i) {
                        Vec3 vec34 = this.position().add(vec33.scale(i));
                        serverLevel.sendParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                    }

                    this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                    livingEntity.hurt(DamageSource.sonicBoom(this.getOwner()), 5.0F);
                    double d = 0.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                    double e = 2.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                    livingEntity.push(vec33.x() * e, vec33.y() * d, vec33.z() * e);
                } else {
                    this.playSound(SoundEvents.GLASS_BREAK, 1.0F, 1.0F);
                }
                this.discard();
            } else {
                discard();
            }
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.getLevel().isClientSide) {
            ServerLevel serverLevel = (ServerLevel) this.getLevel();
            if (this.getTip() == 0.05f) {
                BlockState blockState1 = serverLevel.getBlockState(blockHitResult.getBlockPos());
                if (blockState1.is(Blocks.IRON_BLOCK)
                        || blockState1.is(Blocks.IRON_BARS)
                        || blockState1.is(Blocks.IRON_DOOR)
                        || blockState1.is(Blocks.DEEPSLATE_IRON_ORE)
                        || blockState1.is(Blocks.IRON_ORE)
                        || blockState1.is(Blocks.IRON_TRAPDOOR)) {
                    BlockPos blockPos = blockPosition().relative(blockHitResult.getDirection().getOpposite());
                    if (!CampfireBlock.canLight(serverLevel.getBlockState(blockPos)) && !CandleBlock.canLight(serverLevel.getBlockState(blockPos)) && !CandleCakeBlock.canLight(serverLevel.getBlockState(blockPos))) {
                        BlockPos blockPos2 = blockPos.relative(blockHitResult.getDirection());
                        if (BaseFireBlock.canBePlacedAt(serverLevel, blockPos2, blockHitResult.getDirection())) {
                            BlockState blockState3 = BaseFireBlock.getState(serverLevel, blockPos2);
                            serverLevel.setBlock(blockPos2, blockState3, 11);
                            serverLevel.gameEvent(this, GameEvent.BLOCK_PLACE, blockPos);
                        }
                    } else {
                        serverLevel.setBlock(blockPos, (BlockState) serverLevel.getBlockState(blockPos).setValue(BlockStateProperties.LIT, true), 11);
                        serverLevel.gameEvent(this, GameEvent.BLOCK_CHANGE, blockPos);
                    }
                }
            } else if (this.getTip() == 0.15f) {
                RandomSource random = serverLevel.getRandom();
                if (random.nextFloat() <= 0.5F) {
                    if (serverLevel.isThundering()) {
                        LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
                        if (lightningBolt != null) {
                            lightningBolt.moveTo(Vec3.atBottomCenterOf(blockHitResult.getBlockPos()));
                            lightningBolt.setCause(getOwner() instanceof ServerPlayer ? (ServerPlayer) getOwner() : null);
                            serverLevel.addFreshEntity(lightningBolt);
                            discard();
                        }
                    }
                }
            } else if (this.getTip() == 0.6f) {
                discard();
            } else if (this.getTip() == 0.65f) {
                if (serverLevel.getBlockState(this.blockPosition()).getMaterial().isReplaceable()) {
                    serverLevel.setBlock(this.blockPosition(), Blocks.COBWEB.defaultBlockState(), 3);
                }
                this.discard();
            } else if (this.getTip() == 0.7f) {
                this.discard();
            } else if (this.getTip() == 0.75f) {
                Utils.explode(serverLevel, blockHitResult.getBlockPos(), 2f);
                discard();
            } else if (this.getTip() == 0.8f) {
                if (this.getOwner() != null) {
                    this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                    this.getOwner().teleportTo(this.position().x, this.position().y, this.position().z);
                }
                this.discard();
            } else if (this.getTip() == 0.85f) {
                float range = 20;
                if (this.getOwner() != null) {
                    LivingEntity livingEntity;
                    if (serverLevel.getNearestPlayer(this, range) != null && serverLevel.getNearestPlayer(this, range) != this.getOwner()) {
                        livingEntity = serverLevel.getNearestPlayer(this, range);
                    } else if (serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != null &&
                            serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != this.getOwner()) {
                        livingEntity = serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range));
                    } else {
                        livingEntity = null;
                    }

                    if (livingEntity != null) {
                        Vec3 vec32 = livingEntity.getEyePosition().subtract(this.position());
                        Vec3 vec33 = vec32.normalize();
                        for (int i = 1; i < Mth.floor(vec32.length()) + 7; ++i) {
                            Vec3 vec34 = this.position().add(vec33.scale(i));
                            serverLevel.sendParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                        }

                        this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                        livingEntity.hurt(DamageSource.sonicBoom(this.getOwner()), 4);
                        double d = 0.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        double e = 2.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        livingEntity.push(vec33.x() * e, vec33.y() * d, vec33.z() * e);
                    } else {
                        this.playSound(SoundEvents.SMALL_AMETHYST_BUD_BREAK, 1.0F, 1.0F);
                    }
                }
                this.discard();
            } else {
                discard();
            }
        }
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        if (this.getTip() == 0.0f) {
            if (this.getRod() == 0.0f) {
                return SoundEvents.WOODEN_BUTTON_CLICK_OFF;
            } else if (this.getRod() == 0.05f) {
                return SoundEvents.BAMBOO_BREAK;
            } else {
                return SoundEvents.BLAZE_SHOOT;
            }
        } else if (this.getTip() == 0.05f) {
            return SoundEvents.ARROW_HIT;
        } else if (this.getTip() == 0.1f) {
            return SoundEvents.BONE_BLOCK_BREAK;
        } else if (this.getTip() == 0.15f) {
            return SoundEvents.COPPER_HIT;
        } else if (this.getTip() == 0.2f) {
            return SoundEvents.NETHERITE_BLOCK_HIT;
        } else if (this.getTip() == 0.25f) {
            return SoundEvents.COPPER_PLACE;
        } else if (this.getTip() == 0.3f) {
            return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
        } else if (this.getTip() == 0.35f) {
            return SoundEvents.NETHERITE_BLOCK_PLACE;
        } else if (this.getTip() == 0.4f) {
            return SoundEvents.AMETHYST_BLOCK_BREAK;
        } else if (this.getTip() == 0.45f) {
            return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
        } else if (this.getTip() == 0.5f) {
            return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
        } else if (this.getTip() == 0.55f) {
            return SoundEvents.TRIDENT_HIT_GROUND;
        } else if (this.getTip() == 0.6f) {
            return SoundEvents.SLIME_JUMP;
        } else if (this.getTip() == 0.65f) {
            return SoundEvents.WOOL_PLACE;
        } else if (this.getTip() == 0.7f) {
            return SoundEvents.CROP_PLANTED;
        } else if (this.getTip() == 0.75f) {
            return SoundEvents.CREEPER_PRIMED;
        } else if (this.getTip() == 0.8f) {
            return SoundEvents.ENDER_EYE_LAUNCH;
        } else if (this.getTip() == 0.85f) {
            return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
        } else {
            return SoundEvents.SOUL_ESCAPE;
        }
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        ItemStack itemStack;
        /*
        if (getTip() == 0.05f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_FLINT_TIP.get());
        } else if (getTip() == 0.1f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_BONE_TIP.get());
        } else if (getTip() == 0.15f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_COPPER_TIP.get());
        } else if (getTip() == 0.2f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_IRON_TIP.get());
        } else if (getTip() == 0.25f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_GOLD_TIP.get());
        } else if (getTip() == 0.3f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_DIAMOND_TIP.get());
        } else if (getTip() == 0.35f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_NETHERITE_TIP.get());
        } else if (getTip() == 0.4f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_OBSIDIAN_TIP.get());
        } else if (getTip() == 0.45f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_NETHER_QUARTZ_TIP.get());
        } else if (getTip() == 0.5f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_AMETHYST_TIP.get());
        } else if (getTip() == 0.55f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_PRISMARINE_TIP.get());
        } else if (getTip() == 0.6f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_SLIME_TIP.get());
        } else if (getTip() == 0.65f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_COBWEB_TIP.get());
        } else if (getTip() == 0.7f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_CHORUS_TIP.get());
        } else if (getTip() == 0.75f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_DYNAMITE_TIP.get());
        } else if (getTip() == 0.8f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_ENDER_TIP.get());
        } else if (getTip() == 0.85f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_ECHO_TIP.get());
        } else if (getTip() == 0.9f) {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_SOUL_TIP.get());
        } else {
            itemStack = new ItemStack(InspireItems.CUSTOM_ARROW_NO_TIP.get());
        }

         */
        itemStack = new ItemStack(InspireItems.CUSTOM_ARROW.get());
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        compoundTag.putFloat("tip", getTip());
        compoundTag.putFloat("rod", getRod());
        compoundTag.putFloat("tail", getTail());
        return itemStack.copy();
        //return new ItemStack(InspireItems.WOOD_ARROW.get());
    }

    public float getTip() {
        return this.entityData.get(TIP);
    }

    public void setTip(float tip) {
        this.entityData.set(TIP, tip);
    }

    public float getRod() {
        return this.entityData.get(ROD);
    }

    public void setRod(float rod) {
        this.entityData.set(ROD, rod);
    }

    public float getTail() {
        return this.entityData.get(TAIL);
    }

    public void setTail(float tail) {
        this.entityData.set(TAIL, tail);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putFloat("tip", getTip());
        compoundTag.putFloat("rod", getRod());
        compoundTag.putFloat("tail", getTail());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("tip")) {
            setTip(getTip());
        }
        if (compoundTag.contains("rod")) {
            setRod(compoundTag.getFloat("rod"));
        }
        if (compoundTag.contains("tail")) {
            setTail(compoundTag.getFloat("tail"));
        }
    }

    @Override
    protected @NotNull Component getTypeName() {
        String tip = "";
        String rod = "";
        String tail = "";
        if (getTip() == 0.05f) {
            tip = "inspire.flint_tip";
        } else if (getTip() == 0.1f) {
            tip = "inspire.bone_tip";
        } else if (getTip() == 0.15f) {
            tip = "inspire.copper_tip";
        } else if (getTip() == 0.2f) {
            tip = "inspire.iron_tip";
        } else if (getTip() == 0.25f) {
            tip = "inspire.gold_tip";
        } else if (getTip() == 0.3f) {
            tip = "inspire.diamond_tip";
        } else if (getTip() == 0.35f) {
            tip = "inspire.netherite_tip";
        } else if (getTip() == 0.4f) {
            tip = "inspire.obsidian_tip";
        } else if (getTip() == 0.45f) {
            tip = "inspire.nether_quartz_tip";
        } else if (getTip() == 0.5f) {
            tip = "inspire.amethyst_tip";
        } else if (getTip() == 0.55f) {
            tip = "inspire.prismarine_tip";
        } else if (getTip() == 0.6f) {
            tip = "inspire.slime_tip";
        } else if (getTip() == 0.65f) {
            tip = "inspire.cobweb_tip";
        } else if (getTip() == 0.7f) {
            tip = "inspire.chorus_tip";
        } else if (getTip() == 0.75f) {
            tip = "inspire.dynamite_tip";
        } else if (getTip() == 0.8f) {
            tip = "inspire.ender_tip";
        } else if (getTip() == 0.85f) {
            tip = "inspire.echo_tip";
        } else if (getTip() == 0.9f) {
            tip = "inspire.soul_tip";
        }

        if (getRod() == 0.0f) {
            rod = "inspire.wood_rod";
        } else if (getRod() == 0.05f) {
            rod = "inspire.bamboo_rod";
        } else if (getRod() == 0.1f) {
            rod = "inspire.blaze_rod";
        }

        if (getTail() == 0.0f) {
            if (getRod() == 0.1f) {
                tail = "inspire.burnt_feather_tail";
            } else {
                tail = "inspire.feather_tail";
            }
        } else if (getTail() == 0.05f) {
            tail = "inspire.strider_scale_tail";
        }

        return Component.translatable(tip).append(Component.translatable(rod).append(Component.translatable(tail).append(Component.translatable("inspire.custom_arrow"))));
    }
}
