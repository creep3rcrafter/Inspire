package net.github.creep3rcrafter.inspire.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Random;

public class PotionLiquidBlockEntity extends BlockEntity {

    public Potion potion = Potions.EMPTY;
    public int startTicks = 0;

    public PotionLiquidBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    /*

    public PotionLiquidBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(InspireBlockEntityTypes.POTION_LIQUID_BLOCK_ENTITY_TYPE.get(), blockPos, blockState);
    }

     */

    public static <T extends BlockEntity> void tick(Level level, BlockPos blockPos, BlockState blockState, T t) {
        if (level.getServer() != null) {
            PotionLiquidBlockEntity potionLiquidBlockEntity = (PotionLiquidBlockEntity) level.getBlockEntity(blockPos);
            Random random = new Random();
            if (potionLiquidBlockEntity != null) {
                potionLiquidBlockEntity.tick(level, blockPos, blockState, random);
            }
        }
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
        setChanged();
    }

    public void setStartTicks(int startTicks) {
        this.startTicks = startTicks;
        setChanged();
    }

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        ResourceLocation resourceLocation = Registry.POTION.getKey(potion);
        compoundTag.putString("Potion", resourceLocation.toString());
        compoundTag.putInt("startTicks", startTicks);
        super.saveAdditional(compoundTag);
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        if (compoundTag.get("Potion") != null) {
            potion = PotionUtils.getPotion(compoundTag);
        } else {
            potion = Potions.EMPTY;
        }
        startTicks = compoundTag.getInt("startTicks");
    }

    public CompoundTag save(CompoundTag compoundTag) {
        ResourceLocation resourceLocation = Registry.POTION.getKey(potion);
        compoundTag.putString("Potion", resourceLocation.toString());
        compoundTag.putInt("startTicks", startTicks);
        return compoundTag;
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public @NotNull CompoundTag getUpdateTag() {
        return save(new CompoundTag());
    }

    public void tick(Level level, BlockPos blockPos, BlockState blockState, Random random) {
        if (level.getServer() != null) {

            if (potion == Potions.EMPTY) {
                if (level.getBlockEntity(blockPos.above()) instanceof PotionLiquidBlockEntity) {
                    setPotion(((PotionLiquidBlockEntity) Objects.requireNonNull(level.getBlockEntity(blockPos.above()))).potion);
                } else if (level.getBlockEntity(blockPos.below()) instanceof PotionLiquidBlockEntity) {
                    setPotion(((PotionLiquidBlockEntity) Objects.requireNonNull(level.getBlockEntity(blockPos.below()))).potion);
                } else if (level.getBlockEntity(blockPos.north()) instanceof PotionLiquidBlockEntity) {
                    setPotion(((PotionLiquidBlockEntity) Objects.requireNonNull(level.getBlockEntity(blockPos.north()))).potion);
                } else if (level.getBlockEntity(blockPos.east()) instanceof PotionLiquidBlockEntity) {
                    setPotion(((PotionLiquidBlockEntity) Objects.requireNonNull(level.getBlockEntity(blockPos.east()))).potion);
                } else if (level.getBlockEntity(blockPos.south()) instanceof PotionLiquidBlockEntity) {
                    setPotion(((PotionLiquidBlockEntity) Objects.requireNonNull(level.getBlockEntity(blockPos.south()))).potion);
                } else if (level.getBlockEntity(blockPos.west()) instanceof PotionLiquidBlockEntity) {
                    setPotion(((PotionLiquidBlockEntity) Objects.requireNonNull(level.getBlockEntity(blockPos.west()))).potion);
                }
            }
            /*
            if (level.getServer().getTickCount() >= startTicks + 300 + random.nextInt(100)) {
                if (level.getFluidState(blockPos).is(InspireFluids.POTION_FLUID.get()) && level.getFluidState(blockPos).isSource()) {
                    level.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 3);
                }
            }
             */
        }
    }
}
