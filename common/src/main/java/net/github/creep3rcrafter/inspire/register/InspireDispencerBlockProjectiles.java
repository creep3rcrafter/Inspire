package net.github.creep3rcrafter.inspire.register;

import net.minecraft.core.Position;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

public class InspireDispencerBlockProjectiles {
    static {
        /*

        DispenserBlock.registerBehavior(Items.DIRT, new DefaultDispenseItemBehavior() {
            @Override
            protected @NotNull ItemStack execute(BlockSource blockSource, ItemStack itemStack) {
                Direction direction = (Direction) blockSource.state().getValue(DispenserBlock.FACING);
                if (!blockSource.level().isClientSide()) {
                    BlockState blockState = blockSource.level().state(blockSource.pos().relative(direction));
                    if (blockState.getMaterial().isReplaceable() || blockState.is(Blocks.AIR)) {
                        ServerLevel serverLevel = blockSource.level();
                        if (itemStack.getItem() instanceof BlockItem blockItem) {
                            Block block = blockItem.getBlock();
                            serverLevel.setBlock(blockSource.pos().relative(direction), block.defaultBlockState(), 3);
                            blockSource.level().gameEvent((Entity) null, GameEvent.BLOCK_PLACE, blockSource.pos());
                            itemStack.shrink(1);
                        }
                    }
                }
                return itemStack;
            }
        });

        //DispenserBlock.registerBehavior(Items.DIAMOND_PICKAXE, new DefaultDispenseItemBehavior() {
        });
        /*
        DispenserBlock.registerBehavior(InspireItems.WOOD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                WoodArrow arrow = new WoodArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                arrow.setEffectsFromItem(itemStack);
                arrow.setBaseDamage(InspireItems.WOOD_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
         */
    }

    public static void registerBasicArrow(ItemLike item, AbstractArrow arrow) {
        if (item.asItem() instanceof net.minecraft.world.item.ProjectileItem) {
            DispenserBlock.registerBehavior(item, new ProjectileDispenseBehavior(item.asItem()));
        } else {
            DispenserBlock.registerBehavior(item, new DefaultDispenseItemBehavior() {
                @Override
                protected @NotNull ItemStack execute(@NotNull net.minecraft.core.dispenser.BlockSource blockSource, @NotNull ItemStack itemStack) {
                    itemStack.shrink(1);
                    return itemStack;
                }
            });
        }
    }

}
