package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.register.ModBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

@SuppressWarnings({"unused"})
public interface SimpleLavaLoggedBlock extends BucketPickup, LiquidBlockContainer {
    default boolean canPlaceLiquid(@Nullable Player player, BlockGetter blockGetter, BlockPos blockPos, BlockState blockState, Fluid fluid) {
        return !(Boolean) blockState.getValue(ModBlockStateProperties.LAVALOGGED) && fluid == Fluids.LAVA;
    }

    default boolean placeLiquid(LevelAccessor levelAccessor, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
        if (!(Boolean) blockState.getValue(ModBlockStateProperties.LAVALOGGED) && fluidState.getType() == Fluids.LAVA) {
            if (!levelAccessor.isClientSide()) {
                levelAccessor.setBlock(blockPos, blockState.setValue(ModBlockStateProperties.LAVALOGGED, true), 3);
                levelAccessor.scheduleTick(blockPos, fluidState.getType(), fluidState.getType().getTickDelay(levelAccessor));
            }

            return true;
        } else {
            return false;
        }
    }

    default @NotNull ItemStack pickupBlock(Player player, LevelAccessor levelAccessor, BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(ModBlockStateProperties.LAVALOGGED)) {
            levelAccessor.setBlock(blockPos, blockState.setValue(ModBlockStateProperties.LAVALOGGED, false), 3);
            if (!blockState.canSurvive(levelAccessor, blockPos)) {
                levelAccessor.destroyBlock(blockPos, true);
            }

            return new ItemStack(Items.LAVA_BUCKET);
        } else {
            return ItemStack.EMPTY;
        }
    }

    default @NotNull Optional<SoundEvent> getPickupSound() {
        return Fluids.LAVA.getPickupSound();
    }
}
