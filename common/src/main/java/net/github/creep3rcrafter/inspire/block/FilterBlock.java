package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("deprecation")
public class FilterBlock extends Block {
    protected static final VoxelShape FLAT_AABB = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 2.0F, 16.0F);
    private static final VoxelShape ABOVE = Block.box(0.0, 0.0, 0.0, 16.0, 32.0, 16.0);

    public FilterBlock(Properties properties) {
        super(properties);
    }

    public static List<ItemEntity> getItemsAtAndAbove(Level level, BlockPos blockPos) {
        return ABOVE.toAabbs().stream().flatMap((aABB) -> level.getEntitiesOfClass(ItemEntity.class, aABB.move(blockPos.getX(), blockPos.getY(), blockPos.getZ()), EntitySelector.ENTITY_STILL_ALIVE).stream()).collect(Collectors.toList());
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return FLAT_AABB;
    }

    @Override
    public boolean isRandomlyTicking(BlockState blockState) {
        //return super.isRandomlyTicking(blockState);
        return true;
        //SugarCaneBlock
    }

    @Override
    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (!serverLevel.isClientSide()) {
            List<ItemEntity> itemEntities = getItemsAtAndAbove(serverLevel, blockPos);
            //List<ItemStack> itemStacks = new ArrayList<>();
            for (ItemEntity itemEntity : itemEntities) {
                //itemStacks.add(itemEntity.getItem());
                if (itemEntity.getItem().is(Items.COBBLESTONE)) {
                    itemEntity.setItem(new ItemStack(Items.GRAVEL, itemEntity.getItem().getCount()));
                } else if (itemEntity.getItem().is(Items.GRAVEL)) {
                    itemEntity.setItem(new ItemStack(Items.SAND, itemEntity.getItem().getCount()));
                }
            }
        }
        super.randomTick(blockState, serverLevel, blockPos, randomSource);
        //HopperBlock
        //RailBlock
    }
}