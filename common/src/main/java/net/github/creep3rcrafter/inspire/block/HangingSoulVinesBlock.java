package net.github.creep3rcrafter.inspire.block;

import com.mojang.serialization.MapCodec;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CaveVines;
import net.minecraft.world.level.block.CaveVinesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class HangingSoulVinesBlock extends CaveVinesBlock {
    public static final MapCodec<CaveVinesBlock> CODEC = simpleCodec(HangingSoulVinesBlock::new);

    public HangingSoulVinesBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(CaveVines.BERRIES, true));
    }

    @Override
    public MapCodec<CaveVinesBlock> codec() {
        return CODEC;
    }

    @Override
    protected Block getBodyBlock() {
        return InspireBlocks.HANGING_SOUL_VINES_PLANT.get();
    }

    @Override
    protected BlockState updateBodyAfterConvertedFromHead(BlockState headState, BlockState bodyState) {
        return bodyState.setValue(CaveVines.BERRIES, true);
    }

    @Override
    protected BlockState getGrowIntoState(BlockState state, net.minecraft.util.RandomSource random) {
        return super.getGrowIntoState(state, random).setValue(CaveVines.BERRIES, true);
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack(InspireItems.HANGING_SOUL_VINES.get());
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, net.minecraft.world.entity.player.Player player, BlockHitResult hitResult) {
        return InteractionResult.PASS;
    }
}
