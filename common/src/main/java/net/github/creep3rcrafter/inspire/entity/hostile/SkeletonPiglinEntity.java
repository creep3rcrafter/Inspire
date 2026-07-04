package net.github.creep3rcrafter.inspire.entity.hostile;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.CrossbowAttackGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Difficulty;
import org.jetbrains.annotations.Nullable;

public class SkeletonPiglinEntity extends AbstractSkeletonEntity implements CrossbowUser {

    private static final TrackedData<Boolean> CHARGING;

    static {
        CHARGING = DataTracker.registerData(SkeletonPiglinEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    }

    private final CrossbowAttackGoal<SkeletonPiglinEntity> crossbowAttackGoal = new CrossbowAttackGoal<>(this, (double) 1.0F, 10);

    public SkeletonPiglinEntity(EntityType<? extends SkeletonPiglinEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, PiglinEntity.class, true));
        super.initGoals();
        //this.goalSelector.add(6, new CrossbowAttackGoal<>(this, 1, 20));
    }

    @Override
    public void updateAttackType() {
        if (this.getWorld() != null && !this.getWorld().isClient) {
            this.goalSelector.remove(this.meleeAttackGoal);
            this.goalSelector.remove(this.crossbowAttackGoal);
            this.goalSelector.remove(this.bowAttackGoal);
            ItemStack itemStack = this.getStackInHand(ProjectileUtil.getHandPossiblyHolding(this, Items.BOW));
            ItemStack itemStack2 = this.getStackInHand(ProjectileUtil.getHandPossiblyHolding(this, Items.CROSSBOW));
            if (itemStack.isOf(Items.BOW)) {
                int i = 20;
                if (this.getWorld().getDifficulty() != Difficulty.HARD) {
                    i = 40;
                }

                this.bowAttackGoal.setAttackInterval(i);
                this.goalSelector.add(4, this.bowAttackGoal);
            } else if (itemStack2.isOf(Items.CROSSBOW)) {
                this.goalSelector.add(4, this.crossbowAttackGoal);
            } else {
                this.goalSelector.add(4, this.meleeAttackGoal);
            }

        }
    }

    @Override
    public boolean canFreeze() {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SKELETON_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SKELETON_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SKELETON_DEATH;
    }

    @Override
    public SoundEvent getStepSound() {
        return SoundEvents.ENTITY_SKELETON_STEP;
    }

    @Override
    protected void dropEquipment(DamageSource source, int lootingMultiplier, boolean allowDrops) {
        super.dropEquipment(source, lootingMultiplier, allowDrops);
        Entity entity = source.getAttacker();
        if (entity instanceof CreeperEntity creeperEntity) {
            if (creeperEntity.shouldDropHead()) {
                creeperEntity.onHeadDropped();
                this.dropItem(Items.SKELETON_SKULL);
            }
        }

    }

    @Override
    public void tick() {
        super.tick();

    }

    private void equipAtChance(EquipmentSlot slot, ItemStack stack, Random random) {
        if (random.nextFloat() < 0.1F) {
            this.equipStack(slot, stack);
        }

    }

    @Override
    public double getMountedHeightOffset() {
        return (double) this.getHeight() * 0.92;
    }

    @Override
    protected void initEquipment(Random random, LocalDifficulty localDifficulty) {
        this.equipAtChance(EquipmentSlot.HEAD, new ItemStack(Items.GOLDEN_HELMET), random);
        this.equipAtChance(EquipmentSlot.CHEST, new ItemStack(Items.GOLDEN_CHESTPLATE), random);
        this.equipAtChance(EquipmentSlot.LEGS, new ItemStack(Items.GOLDEN_LEGGINGS), random);
        this.equipAtChance(EquipmentSlot.FEET, new ItemStack(Items.GOLDEN_BOOTS), random);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(CHARGING, false);
    }

    private boolean isCharging() {
        return (Boolean) this.dataTracker.get(CHARGING);
    }

    @Override
    public void setCharging(boolean charging) {
        this.dataTracker.set(CHARGING, charging);
    }

    @Override
    public void attack(LivingEntity target, float pullProgress) {
        this.shoot(this, 1.6F);
    }

    @Override
    public void shoot(LivingEntity target, ItemStack crossbow, ProjectileEntity projectile, float multiShotSpray) {
        this.shoot(this, target, projectile, multiShotSpray, 1.6F);
    }

    @Override
    public boolean canUseRangedWeapon(RangedWeaponItem weapon) {
        return weapon == Items.CROSSBOW || weapon == Items.BOW;
    }

    public State getState() {
        if (this.isCharging()) {
            return State.CROSSBOW_CHARGE;
        } else if (this.isHolding(Items.CROSSBOW)) {
            return State.CROSSBOW_HOLD;
        } else {
            return this.isAttacking() ? State.ATTACKING : State.NEUTRAL;
        }
    }

    @Override
    public void postShoot() {
        this.despawnCounter = 0;
    }

    @Override
    public boolean canGather(ItemStack stack) {
        return this.getWorld().getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING) && this.canPickUpLoot();
    }

    private ItemStack makeInitialWeapon() {
        return (double) this.random.nextFloat() < (double) 0.5F ? new ItemStack(Items.CROSSBOW) : new ItemStack(Items.GOLDEN_SWORD);
    }

    @Nullable
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        Random random = world.getRandom();
        if (spawnReason != SpawnReason.STRUCTURE) {
            this.equipStack(EquipmentSlot.MAINHAND, this.makeInitialWeapon());
        }
        this.initEquipment(random, difficulty);
        this.updateEnchantments(random, difficulty);
        this.updateAttackType();
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    public static enum State {
        ATTACKING,
        CROSSBOW_HOLD,
        CROSSBOW_CHARGE,
        NEUTRAL;

        private State() {
        }
    }
}
