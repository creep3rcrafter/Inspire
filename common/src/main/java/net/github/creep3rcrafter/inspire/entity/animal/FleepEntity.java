package net.github.creep3rcrafter.inspire.entity.animal;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.StringRepresentable;
import net.minecraft.util.FastColor;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FleepEntity extends Sheep {
    private static final EntityDataAccessor<String> TYPE = SynchedEntityData.defineId(FleepEntity.class, EntityDataSerializers.STRING);

    public FleepEntity(EntityType<? extends FleepEntity> entityType, Level level) {
        super(entityType, level);
    }
    public static AttributeSupplier.Builder createFleepAttributes() {
        return Sheep.createAttributes();
    }
    @Override
    public float getWalkTargetValue(BlockPos blockPos, LevelReader levelReader) {
        return levelReader.getBlockState(blockPos.below()).is(Blocks.GRASS_BLOCK) ? 10.0F : super.getWalkTargetValue(blockPos, levelReader);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putString("Type", this.getVariant().getSerializedName());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.setVariant(Type.byName(compoundTag.getString("Type")));
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(TYPE, Type.DANDELION.getSerializedName());
    }

    public void setVariant(Type type) {
        this.entityData.set(TYPE, type.getSerializedName());
    }

    public Type getVariant() {
        return Type.byName(this.entityData.get(TYPE));
    }

    @Override
    public DyeColor getColor() {
        return this.getVariant().getColor();
    }

    public static float[] getRgbColor(DyeColor dyeColor) {
        int color = dyeColor.getTextureDiffuseColor();
        return new float[]{
            FastColor.ARGB32.red(color) / 255.0f,
            FastColor.ARGB32.green(color) / 255.0f,
            FastColor.ARGB32.blue(color) / 255.0f
        };
    }

    public enum Type implements StringRepresentable {
        DANDELION("dandelion", Blocks.DANDELION.defaultBlockState(), DyeColor.YELLOW),
        POPPY("poppy", Blocks.POPPY.defaultBlockState(), DyeColor.RED),
        BLUE_ORCHID("blue_orchid", Blocks.BLUE_ORCHID.defaultBlockState(), DyeColor.LIGHT_BLUE),
        ALLIUM("allium", Blocks.ALLIUM.defaultBlockState(), DyeColor.MAGENTA),
        AZURE_BLUET("azure_bluet", Blocks.AZURE_BLUET.defaultBlockState(), DyeColor.LIGHT_GRAY),
        RED_TULIP("red_tulip", Blocks.RED_TULIP.defaultBlockState(), DyeColor.RED),
        PINK_TULIP("pink_tulip", Blocks.PINK_TULIP.defaultBlockState(), DyeColor.PINK),
        WHITE_TULIP("white_tulip", Blocks.WHITE_TULIP.defaultBlockState(), DyeColor.LIGHT_GRAY),
        ORANGE_TULIP("orange_tulip", Blocks.ORANGE_TULIP.defaultBlockState(), DyeColor.ORANGE),
        OXEYE_DAISY("oxeye_daisy", Blocks.OXEYE_DAISY.defaultBlockState(), DyeColor.LIGHT_GRAY),
        CORNFLOWER("cornflower", Blocks.CORNFLOWER.defaultBlockState(), DyeColor.BLUE),
        LILY_OF_THE_VALLEY("lily_of_the_valley", Blocks.LILY_OF_THE_VALLEY.defaultBlockState(), DyeColor.WHITE),
        TORCHFLOWER("torchflower", Blocks.TORCHFLOWER.defaultBlockState(), DyeColor.ORANGE),
        WITHER_ROSE("wither_rose", Blocks.WITHER_ROSE.defaultBlockState(), DyeColor.BLACK),
        PINK_PETALS("pink_petals", Blocks.PINK_PETALS.defaultBlockState(), DyeColor.PINK),
        PITCHER_PLANT("pitcher_plant", Blocks.PITCHER_CROP.defaultBlockState(), DyeColor.CYAN),
        LILAC("lilac", Blocks.LILAC.defaultBlockState(), DyeColor.MAGENTA),
        PEONY("peony", Blocks.PEONY.defaultBlockState(), DyeColor.PINK),
        ROSE_BUSH("rose_bush", Blocks.ROSE_BUSH.defaultBlockState(), DyeColor.RED),
        SUNFLOWER("sunflower", Blocks.SUNFLOWER.defaultBlockState(), DyeColor.YELLOW),
        BAMBOO("bamboo", Blocks.BAMBOO.defaultBlockState(), DyeColor.LIME);

        private final String name;
        private final BlockState flower;
        private final DyeColor color;

        Type(String name, BlockState flower, DyeColor color) {
            this.name = name;
            this.flower = flower;
            this.color = color;
        }

        public BlockState getFlowerState() {
            return this.flower;
        }

        public DyeColor getColor() {
            return this.color;
        }

        public static Type byName(String name) {
            for (Type value : values()) {
                if (value.name.equals(name)) {
                    return value;
                }
            }
            return DANDELION;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }
}
