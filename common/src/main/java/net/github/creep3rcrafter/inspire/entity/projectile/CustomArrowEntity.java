package net.github.creep3rcrafter.inspire.entity.projectile;

import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class CustomArrowEntity extends PersistentProjectileEntity {

    private static final TrackedData<Float> TIP;
    private static final TrackedData<Float> ROD;
    private static final TrackedData<Float> TAIL;

    static {
        TIP = DataTracker.registerData(CustomArrowEntity.class, TrackedDataHandlerRegistry.FLOAT);
        ROD = DataTracker.registerData(CustomArrowEntity.class, TrackedDataHandlerRegistry.FLOAT);
        TAIL = DataTracker.registerData(CustomArrowEntity.class, TrackedDataHandlerRegistry.FLOAT);
    }

    private int tick;

    public CustomArrowEntity(EntityType<? extends CustomArrowEntity> entityType, World world) {
        super(entityType, world);
        //this.tip = 0;
        //this.rod = 0;
        //this.tail = 0;
    }

    public CustomArrowEntity(World world, double x, double y, double z) {
        super(InspireEntityTypes.CUSTOM_ARROW.get(), x, y, z, world);
    }

    public CustomArrowEntity(World world, LivingEntity livingEntity) {
        super(InspireEntityTypes.CUSTOM_ARROW.get(), livingEntity, world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(TIP, 0.0f);
        this.dataTracker.startTracking(ROD, 0.0f);
        this.dataTracker.startTracking(TAIL, 0.0f);
    }

    /*
    @Override
    protected float getWaterInertia() {
        if (getTip() == 0.55f) {
            return 1f;
        } else {
            return super.getWaterInertia();
        }
    }
     */

    @Override
    public boolean isFireImmune() {
        if (getTip() == 0.55f) {
            return true;
        } else {
            return super.isFireImmune();
        }
    }


    /*
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
     */

    @Override
    public void setDamage(double damage) {
        super.setDamage(damage);
    }

    @Override
    public void checkDespawn() {
        if (getTip() == 0.9f) {
            ++this.age;
            if (this.age >= 600) {
                this.discard();
            }
        } else {
            super.checkDespawn();
        }
    }

    @Override
    public void tick() {
        if (getTip() == 0.85f) {
            tick++;
            if (tick == 1) {
                //this.playSound(SoundEvents.WARDEN_SONIC_CHARGE, 0.5F, 40.0F);
            }
        }
        if (getRod() == 0.1f) {
            tick++;
            if (tick == 1) {
                //this.playSound(SoundEvents.FIREWORK_ROCKET_SHOOT, 0.5F, 40.0F);
            }
        }
        super.tick();
        if (getTip() == 0.55f) {
            setOnFire(false);
        } else if (getTip() == 0.9f) {
            checkDespawn();
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
    public boolean hasNoGravity() {
        if (getTip() == 0.9f) {
            return true;
        } else {
            return super.hasNoGravity();
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        if (!this.getWorld().isClient()) {
            ServerWorld serverWorld = (ServerWorld) getWorld();
            if (this.getTip() == 0.05f) {
            } else if (this.getTip() == 0.15f) {
                Random random = serverWorld.getRandom();
                if (random.nextFloat() <= 0.5F) {
                    if (serverWorld.isThundering()) {
                        LightningEntity lightningBolt = EntityType.LIGHTNING_BOLT.create(serverWorld);
                        if (lightningBolt != null) {
                            lightningBolt.setPosition(Vec3d.ofBottomCenter(entityHitResult.getEntity().getBlockPos()));
                            lightningBolt.setChanneler(getOwner() instanceof ServerPlayerEntity ? (ServerPlayerEntity) getOwner() : null);
                            serverWorld.spawnEntity(lightningBolt);
                            discard();
                        }
                    }
                }
            } else if (this.getTip() == 0.6f) {
                discard();
            } else if (this.getTip() == 0.65f) {
                if (serverWorld.getBlockState(entityHitResult.getEntity().getBlockPos()).isReplaceable()) {
                    serverWorld.setBlockState(entityHitResult.getEntity().getBlockPos(), Blocks.COBWEB.getDefaultState(), 3);
                }
                this.discard();
            } else if (this.getTip() == 0.7f) {
                LivingEntity livingEntity = (LivingEntity) entityHitResult.getEntity();
                double d = livingEntity.getX();
                double e = livingEntity.getY();
                double f = livingEntity.getZ();

                for (int i = 0; i < 16; ++i) {
                    double g = livingEntity.getX() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
                    double h = MathHelper.clamp(livingEntity.getY() + (double) (livingEntity.getRandom().nextInt(16) - 8), serverWorld.getBottomY(), serverWorld.getBottomY() + ((ServerWorld) serverWorld).getLogicalHeight() - 1);
                    double j = livingEntity.getZ() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
                    if (livingEntity.hasVehicle()) {
                        livingEntity.stopRiding();
                    }

                    Vec3d vec3 = livingEntity.getPos();
                    if (livingEntity.teleport(g, h, j, true)) {
                        //world.gameEvent(GameEvent.TELEPORT, vec3, GameEvent.Context.of(livingEntity));
                        //SoundEvent soundEvent = livingEntity instanceof Fox ? SoundEvents.FOX_TELEPORT : SoundEvents.CHORUS_FRUIT_TELEPORT;
                        //world.playSound(null, d, e, f, soundEvent, SoundSource.PLAYERS, 1.0F, 1.0F);
                        //livingEntity.playSound(soundEvent, 1.0F, 1.0F);
                        break;
                    }
                    //this.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT);
                    this.discard();
                }
            } else if (this.getTip() == 0.75f) {
                //Utils.explode(this.world, entityHitResult.getEntity().blockPosition(), 2f);
                discard();
            } else if (this.getTip() == 0.8f) {
                if (this.getOwner() != null) {
                    //this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                    this.getOwner().requestTeleport(this.getPos().getX(), this.getPos().getY(), this.getPos().getZ());
                }
                this.discard();
            } else if (this.getTip() == 0.85f) {
                float range = 20;
                LivingEntity livingEntity;
                if (serverWorld.getClosestPlayer(this, range) != null && serverWorld.getClosestPlayer(this, range) != this.getOwner()) {
                    livingEntity = serverWorld.getClosestPlayer(this, range);
                } else if (serverWorld.getClosestEntity(LivingEntity.class, TargetPredicate.createAttackable(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().expand(range, range, range)) != null &&
                        serverWorld.getClosestEntity(LivingEntity.class, TargetPredicate.createAttackable(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().expand(range, range, range)) != this.getOwner()) {
                    livingEntity = serverWorld.getClosestEntity(LivingEntity.class, TargetPredicate.createAttackable(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().expand(range, range, range));
                } else {
                    livingEntity = null;
                }

                if (livingEntity != null) {
                    Vec3d vec32 = livingEntity.getEyePos().subtract(this.getPos());
                    Vec3d vec33 = vec32.normalize();
                    for (int i = 1; i < MathHelper.floor(vec32.length()) + 7; ++i) {
                        Vec3d vec34 = this.getPos().add(vec33.multiply(i));
                        serverWorld.spawnParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                    }

                    //this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                    livingEntity.damage(this.getDamageSources().sonicBoom(this.getOwner()), 5.0F);
                    double d = 0.5 * (1.0 - livingEntity.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
                    double e = 2.5 * (1.0 - livingEntity.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
                    livingEntity.addVelocity(vec33.getX() * e, vec33.getY() * d, vec33.getZ() * e);
                } else {
                    //this.playSound(SoundEvents.GLASS_BREAK, 1.0F, 1.0F);
                }
                this.discard();
            } else {
                discard();
            }
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        if (!this.getWorld().isClient()) {
            ServerWorld serverWorld = (ServerWorld) this.getWorld();
            if (this.getTip() == 0.05f) {
                BlockState blockState1 = serverWorld.getBlockState(blockHitResult.getBlockPos());
                if (blockState1.isOf(Blocks.IRON_BLOCK)
                        || blockState1.isOf(Blocks.IRON_BARS)
                        || blockState1.isOf(Blocks.IRON_DOOR)
                        || blockState1.isOf(Blocks.DEEPSLATE_IRON_ORE)
                        || blockState1.isOf(Blocks.IRON_ORE)
                        || blockState1.isOf(Blocks.IRON_TRAPDOOR)) {
                    BlockPos blockPos = getBlockPos().offset((blockHitResult.getSide().getOpposite()));
                    if (!CampfireBlock.canBeLit(serverWorld.getBlockState(blockPos)) && !CandleBlock.canBeLit(serverWorld.getBlockState(blockPos)) && !CandleCakeBlock.canBeLit(serverWorld.getBlockState(blockPos))) {
                        BlockPos blockPos2 = blockPos.offset(blockHitResult.getSide());
                        if (FireBlock.canPlaceAt(serverWorld, blockPos2, blockHitResult.getSide())) {
                            BlockState blockState3 = FireBlock.getState(serverWorld, blockPos2);
                            serverWorld.setBlockState(blockPos2, blockState3, 11);
                            serverWorld.emitGameEvent(this, GameEvent.BLOCK_PLACE, blockPos);
                        }
                    } else {
                        serverWorld.setBlockState(blockPos, (BlockState) serverWorld.getBlockState(blockPos).with(Properties.LIT, true), 11);
                        serverWorld.emitGameEvent(this, GameEvent.BLOCK_CHANGE, blockPos);
                    }
                }
            } else if (this.getTip() == 0.15f) {
                Random random = serverWorld.getRandom();
                if (random.nextFloat() <= 0.5F) {
                    if (serverWorld.isThundering()) {
                        LightningEntity lightningBolt = EntityType.LIGHTNING_BOLT.create(serverWorld);
                        if (lightningBolt != null) {
                            lightningBolt.setPosition(Vec3d.ofBottomCenter(blockHitResult.getBlockPos()));
                            lightningBolt.setChanneler(getOwner() instanceof ServerPlayerEntity ? (ServerPlayerEntity) getOwner() : null);
                            serverWorld.spawnEntity(lightningBolt);
                            discard();
                        }
                    }
                }
            } else if (this.getTip() == 0.6f) {
                discard();
            } else if (this.getTip() == 0.65f) {
                if (serverWorld.getBlockState(this.getBlockPos()).isReplaceable()) {
                    serverWorld.setBlockState(this.getBlockPos(), Blocks.COBWEB.getDefaultState(), 3);
                }
                this.discard();
            } else if (this.getTip() == 0.7f) {
                this.discard();
            } else if (this.getTip() == 0.75f) {
                //Utils.explode(serverWorld, blockHitResult.getBlockPos(), 2f);
                discard();
            } else if (this.getTip() == 0.8f) {
                if (this.getOwner() != null) {
                    //this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                    this.getOwner().teleport(this.getPos().getX(), this.getPos().getY(), this.getPos().getZ());
                }
                this.discard();
            } else if (this.getTip() == 0.85f) {
                float range = 20;
                if (this.getOwner() != null) {
                    LivingEntity livingEntity;
                    if (serverWorld.getClosestPlayer(this, range) != null && serverWorld.getClosestPlayer(this, range) != this.getOwner()) {
                        livingEntity = serverWorld.getClosestPlayer(this, range);
                    } else if (serverWorld.getClosestEntity(LivingEntity.class, TargetPredicate.createAttackable(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().expand(range, range, range)) != null &&
                            serverWorld.getClosestEntity(LivingEntity.class, TargetPredicate.createAttackable(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().expand(range, range, range)) != this.getOwner()) {
                        livingEntity = serverWorld.getClosestEntity(LivingEntity.class, TargetPredicate.createAttackable(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().expand(range, range, range));
                    } else {
                        livingEntity = null;
                    }

                    if (livingEntity != null) {
                        Vec3d vec32 = livingEntity.getEyePos().subtract(this.getPos());
                        Vec3d vec33 = vec32.normalize();
                        for (int i = 1; i < MathHelper.floor(vec32.length()) + 7; ++i) {
                            Vec3d vec34 = this.getPos().add(vec33.multiply(i));
                            serverWorld.spawnParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                        }

                        //this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                        livingEntity.damage(this.getDamageSources().sonicBoom(this.getOwner()), 4);
                        double d = 0.5 * (1.0 - livingEntity.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
                        double e = 2.5 * (1.0 - livingEntity.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
                        //livingEntity.push(vec33.x() * e, vec33.y() * d, vec33.z() * e);
                    } else {
                        //this.playSound(SoundEvents.SMALL_AMETHYST_BUD_BREAK, 1.0F, 1.0F);
                    }
                }
                this.discard();
            } else {
                discard();
            }
        }
    }

    /*
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

     */

    @Override
    protected ItemStack asItemStack() {
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
        //itemStack = new ItemStack(InspireItems.CUSTOM_ARROW.get());
        itemStack = null;
        NbtCompound nbtCompound = itemStack.getOrCreateNbt();
        nbtCompound.putFloat("tip", getTip());
        nbtCompound.putFloat("rod", getRod());
        nbtCompound.putFloat("tail", getTail());
        return itemStack.copy();
        //return new ItemStack(InspireItems.WOOD_ARROW.get());
    }

    public float getTip() {
        return this.dataTracker.get(TIP);
    }

    public void setTip(float tip) {
        this.dataTracker.set(TIP, tip);
    }

    public float getRod() {
        return this.dataTracker.get(ROD);
    }

    public void setRod(float rod) {
        this.dataTracker.set(ROD, rod);
    }

    public float getTail() {
        return this.dataTracker.get(TAIL);
    }

    public void setTail(float tail) {
        this.dataTracker.set(TAIL, tail);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putFloat("tip", getTip());
        nbt.putFloat("rod", getRod());
        nbt.putFloat("tail", getTail());
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("tip")) {
            setTip(getTip());
        }
        if (nbt.contains("rod")) {
            setRod(nbt.getFloat("rod"));
        }
        if (nbt.contains("tail")) {
            setTail(nbt.getFloat("tail"));
        }
    }

    @Override
    protected Text getDefaultName() {
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

        return Text.translatable(tip).append(Text.translatable(rod).append(Text.translatable(tail).append(Text.translatable("inspire.custom_arrow"))));
    }
}
