package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.block.entity.CursedTableBlockEntity;
import net.github.creep3rcrafter.inspire.inventory.CurseMenu;
import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("deprecation")
public class CursedTableBlock extends BaseEntityBlock {
    public static final List<BlockPos> BOOKSHELF_OFFSETS = BlockPos.betweenClosedStream(-2, 0, -2, 2, 1, 2).filter((blockPos) -> Math.abs(blockPos.getX()) == 2 || Math.abs(blockPos.getZ()) == 2).map(BlockPos::immutable).toList();
    protected static final VoxelShape SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 12.0F, 16.0F);

    public CursedTableBlock(Properties properties) {
        super(properties);
    }

    public static boolean isValidCursedBlock(Level level, BlockPos blockPos, BlockPos blockPos2) {
        return level.getBlockState(blockPos.offset(blockPos2)).is(Blocks.NETHER_BRICKS) && level.isEmptyBlock(blockPos.offset(blockPos2.getX() / 2, blockPos2.getY(), blockPos2.getZ() / 2));
    }

    public boolean useShapeForLightOcclusion(BlockState blockState) {
        return true;
    }

    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
        super.animateTick(blockState, level, blockPos, randomSource);

        for (BlockPos blockPos2 : BOOKSHELF_OFFSETS) {
            if (randomSource.nextInt(16) == 0 && isValidCursedBlock(level, blockPos, blockPos2)) {
                level.addParticle(ParticleTypes.ENCHANT, (double) blockPos.getX() + (double) 0.5F, (double) blockPos.getY() + (double) 2.0F, (double) blockPos.getZ() + (double) 0.5F, (double) ((float) blockPos2.getX() + randomSource.nextFloat()) - (double) 0.5F, (float) blockPos2.getY() - randomSource.nextFloat() - 1.0F, (double) ((float) blockPos2.getZ() + randomSource.nextFloat()) - (double) 0.5F);
            }
        }

    }

    public @NotNull RenderShape getRenderShape(BlockState blockState) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new CursedTableBlockEntity(blockPos, blockState);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> blockEntityType) {
        return level.isClientSide ? createTickerHelper(blockEntityType, InspireBlockEntityTypes.CURSED_TABLE.get(), CursedTableBlockEntity::bookAnimationTick) : null;
    }

    public @NotNull InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(blockState.getMenuProvider(level, blockPos));
            return InteractionResult.CONSUME;
        }
    }

    @Nullable
    public MenuProvider getMenuProvider(BlockState blockState, Level level, BlockPos blockPos) {
        BlockEntity blockEntity = level.getBlockEntity(blockPos);
        if (blockEntity instanceof CursedTableBlockEntity) {
            Component component = ((Nameable) blockEntity).getDisplayName();
            return new SimpleMenuProvider((i, inventory, player) -> new CurseMenu(i, inventory, ContainerLevelAccess.create(level, blockPos)), component);
        } else {
            return null;
        }
    }

    public void setPlacedBy(Level level, BlockPos blockPos, BlockState blockState, LivingEntity livingEntity, ItemStack itemStack) {
        if (itemStack.hasCustomHoverName()) {
            BlockEntity blockEntity = level.getBlockEntity(blockPos);
            if (blockEntity instanceof CursedTableBlockEntity) {
                ((CursedTableBlockEntity) blockEntity).setCustomName(itemStack.getHoverName());
            }
        }

    }

    public boolean isPathfindable(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, PathComputationType pathComputationType) {
        return false;
    }
}
