package net.github.creep3rcrafter.inspire.entity.animal;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.DyeColor;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class FleepEntity extends SheepEntity {

    private static final TrackedData<String> TYPE;
    public FleepEntity(EntityType<? extends FleepEntity> entityType, World world) {
        super(entityType, world);
    }
    @Override
    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        return world.getBlockState(pos.down()).isOf(Blocks.GRASS_BLOCK) ? 10.0F : world.getPhototaxisFavor(pos);
    }

    @Override
    public void sheared(SoundCategory shearedSoundCategory) {
        this.getWorld().playSoundFromEntity((PlayerEntity)null, this, SoundEvents.ENTITY_SHEEP_SHEAR, shearedSoundCategory, 1.0F, 1.0F);
        this.setSheared(true);
        int i = 1 + this.random.nextInt(3);

        for(int j = 0; j < i; ++j) {
            ItemEntity itemEntity = this.dropItem((ItemConvertible)DROPS.get(this.getColor()), 1);
            if (itemEntity != null) {
                itemEntity.setVelocity(itemEntity.getVelocity().add((double)((this.random.nextFloat() - this.random.nextFloat()) * 0.1F), (double)(this.random.nextFloat() * 0.05F), (double)((this.random.nextFloat() - this.random.nextFloat()) * 0.1F)));
            }
            ItemEntity itemEntity2 = this.dropItem(getVariant().getFlowerState().getBlock().asItem(), 1);
            if (itemEntity2 != null) {
                itemEntity2.setVelocity(itemEntity2.getVelocity().add((double)((this.random.nextFloat() - this.random.nextFloat()) * 0.1F), (double)(this.random.nextFloat() * 0.05F), (double)((this.random.nextFloat() - this.random.nextFloat()) * 0.1F)));
            }
        }
    }
    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putString("Type", this.getVariant().asString());
    }
    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.setVariant(Type.fromName(nbt.getString("Type")));
    }
    public void setVariant(Type type) {
        this.dataTracker.set(TYPE, type.name);
    }
    @Override
    public DyeColor getColor() {
        return getVariant().getColor();
    }
    public Type getVariant() {
        return Type.fromName((String)this.dataTracker.get(TYPE));
    }
    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(TYPE, Type.DANDELION.asString());
    }

    static {
        TYPE = DataTracker.registerData(FleepEntity.class, TrackedDataHandlerRegistry.STRING);
    }

    public static enum Type implements StringIdentifiable {
        DANDELION("dandelion", Blocks.DANDELION.getDefaultState(), DyeColor.YELLOW),
        POPPY("poppy", Blocks.POPPY.getDefaultState(), DyeColor.RED),
        BLUE_ORCHID("blue_orchid", Blocks.BLUE_ORCHID.getDefaultState(), DyeColor.LIGHT_BLUE),
        ALLIUM("allium", Blocks.ALLIUM.getDefaultState(), DyeColor.MAGENTA),
        AZURE_BLUET("azure_bluet", Blocks.AZURE_BLUET.getDefaultState(), DyeColor.LIGHT_GRAY),
        RED_TULIP("red_tulip", Blocks.RED_TULIP.getDefaultState(), DyeColor.RED),
        PINK_TULIP("pink_tulip", Blocks.PINK_TULIP.getDefaultState(), DyeColor.PINK),
        WHITE_TULIP("white_tulip", Blocks.WHITE_TULIP.getDefaultState(), DyeColor.LIGHT_GRAY),
        ORANGE_TULIP("orange_tulip", Blocks.ORANGE_TULIP.getDefaultState(), DyeColor.ORANGE),
        OXEYE_DAISY("oxeye_daisy", Blocks.OXEYE_DAISY.getDefaultState(), DyeColor.LIGHT_GRAY),
        CORNFLOWER("cornflower", Blocks.CORNFLOWER.getDefaultState(), DyeColor.BLUE),
        LILY_OF_THE_VALLEY("lily_of_the_valley", Blocks.LILY_OF_THE_VALLEY.getDefaultState(), DyeColor.WHITE),
        TORCHFLOWER("torchflower", Blocks.TORCHFLOWER.getDefaultState(), DyeColor.ORANGE),
        WITHER_ROSE("wither_rose", Blocks.WITHER_ROSE.getDefaultState(), DyeColor.BLACK),
        PINK_PETALS("pink_petals", Blocks.PINK_PETALS.getDefaultState(), DyeColor.PINK),
        PITCHER_PLANT("pitcher_plant", Blocks.PITCHER_PLANT.getDefaultState(), DyeColor.CYAN),
        LILAC("lilac", Blocks.LILAC.getDefaultState(), DyeColor.MAGENTA),
        PEONY("peony", Blocks.PEONY.getDefaultState(), DyeColor.PINK),
        ROSE_BUSH("rose_bush", Blocks.ROSE_BUSH.getDefaultState(), DyeColor.RED),
        SUNFLOWER("sunflower", Blocks.SUNFLOWER.getDefaultState(), DyeColor.YELLOW),
        BAMBOO("bamboo", Blocks.BAMBOO.getDefaultState(), DyeColor.LIME);

        public static final StringIdentifiable.Codec<Type> CODEC = StringIdentifiable.createCodec(Type::values);
        final String name;
        final BlockState flower;
        final DyeColor dyeColor;

        private Type(String name, BlockState flower, DyeColor dyeColor) {
            this.name = name;
            this.flower = flower;
            this.dyeColor = dyeColor;
        }

        public BlockState getFlowerState() {
            return this.flower;
        }
        public DyeColor getColor() {
            return this.dyeColor;
        }

        public String asString() {
            return this.name;
        }

        static Type fromName(String name) {
            return (Type)CODEC.byId(name, DANDELION);
        }
    }
}
