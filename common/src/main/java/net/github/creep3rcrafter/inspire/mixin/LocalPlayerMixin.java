package net.github.creep3rcrafter.inspire.mixin;

import net.creep3rcrafter.theupdatemod.register.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.OptionalInt;

@Mixin(Player.class)
public abstract class LocalPlayerMixin extends LivingEntity {

    @Unique
    private static final Component CONTAINER_TITLE = Component.translatable("container.crafting");

    protected LocalPlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Shadow
    public abstract OptionalInt openMenu(@Nullable MenuProvider menuProvider);

    @Inject(method = "openItemGui", at = @At(value = "HEAD"))
    private void InjectOnHitBlock(ItemStack itemStack, InteractionHand interactionHand, CallbackInfo ci) {
        if (itemStack.is(ModItems.CRAFTING_TABLET.get())) {
            if (getLevel().isClientSide()) {
                openMenu(new SimpleMenuProvider((i, inventory, player) -> new CraftingMenu(i, inventory), CONTAINER_TITLE));
            }
            //openMenu(new SimpleMenuProvider((i, inventory, player) -> new CraftingMenu(i, inventory), CONTAINER_TITLE));
        }
    }
}
