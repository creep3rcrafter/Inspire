package net.github.creep3rcrafter.inspire.block.entity;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Nameable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CursedTableBlockEntity extends BlockEntity implements Nameable {
    private static final RandomSource RANDOM = RandomSource.create();
    public int time;
    public float flip;
    public float oFlip;
    public float flipT;
    public float flipA;
    public float open;
    public float oOpen;
    public float rot;
    public float oRot;
    public float tRot;
    private Component name;

    public CursedTableBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(InspireBlockEntityTypes.CURSED_TABLE.get(), blockPos, blockState);
    }

    public static void bookAnimationTick(Level level, BlockPos blockPos, BlockState ignoredBlockState, CursedTableBlockEntity cursedTableBlockEntity) {
        cursedTableBlockEntity.oOpen = cursedTableBlockEntity.open;
        cursedTableBlockEntity.oRot = cursedTableBlockEntity.rot;
        Player player = level.getNearestPlayer((double) blockPos.getX() + (double) 0.5F, (double) blockPos.getY() + (double) 0.5F, (double) blockPos.getZ() + (double) 0.5F, 3.0F, false);
        if (player != null) {
            double d = player.getX() - ((double) blockPos.getX() + (double) 0.5F);
            double e = player.getZ() - ((double) blockPos.getZ() + (double) 0.5F);
            cursedTableBlockEntity.tRot = (float) Mth.atan2(e, d);
            cursedTableBlockEntity.open += 0.1F;
            if (cursedTableBlockEntity.open < 0.5F || RANDOM.nextInt(40) == 0) {
                float f = cursedTableBlockEntity.flipT;

                do {
                    cursedTableBlockEntity.flipT += (float) (RANDOM.nextInt(4) - RANDOM.nextInt(4));
                } while (f == cursedTableBlockEntity.flipT);
            }
        } else {
            cursedTableBlockEntity.tRot += 0.02F;
            cursedTableBlockEntity.open -= 0.1F;
        }

        while (cursedTableBlockEntity.rot >= (float) Math.PI) {
            cursedTableBlockEntity.rot -= ((float) Math.PI * 2F);
        }

        while (cursedTableBlockEntity.rot < -(float) Math.PI) {
            cursedTableBlockEntity.rot += ((float) Math.PI * 2F);
        }

        while (cursedTableBlockEntity.tRot >= (float) Math.PI) {
            cursedTableBlockEntity.tRot -= ((float) Math.PI * 2F);
        }

        while (cursedTableBlockEntity.tRot < -(float) Math.PI) {
            cursedTableBlockEntity.tRot += ((float) Math.PI * 2F);
        }

        float g;
        for (g = cursedTableBlockEntity.tRot - cursedTableBlockEntity.rot; g >= (float) Math.PI; g -= ((float) Math.PI * 2F)) {
        }

        while (g < -(float) Math.PI) {
            g += ((float) Math.PI * 2F);
        }

        cursedTableBlockEntity.rot += g * 0.4F;
        cursedTableBlockEntity.open = Mth.clamp(cursedTableBlockEntity.open, 0.0F, 1.0F);
        ++cursedTableBlockEntity.time;
        cursedTableBlockEntity.oFlip = cursedTableBlockEntity.flip;
        float h = (cursedTableBlockEntity.flipT - cursedTableBlockEntity.flip) * 0.4F;
        h = Mth.clamp(h, -0.2F, 0.2F);
        cursedTableBlockEntity.flipA += (h - cursedTableBlockEntity.flipA) * 0.9F;
        cursedTableBlockEntity.flip += cursedTableBlockEntity.flipA;
    }

    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        if (this.hasCustomName()) {
            compoundTag.putString("CustomName", Component.Serializer.toJson(this.name));
        }

    }

    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        if (compoundTag.contains("CustomName", 8)) {
            this.name = Component.Serializer.fromJson(compoundTag.getString("CustomName"));
        }

    }

    public @NotNull Component getName() {
        return this.name != null ? this.name : Component.translatable(InspireCommon.MOD_ID + ".container.curse");
    }

    @Nullable
    public Component getCustomName() {
        return this.name;
    }

    public void setCustomName(@Nullable Component component) {
        this.name = component;
    }
}
