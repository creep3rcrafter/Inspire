package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.entity.projectile.ThrownBrickEntity;
import net.github.creep3rcrafter.inspire.entity.projectile.ThrownNetherBrickEntity;
import net.github.creep3rcrafter.inspire.entity.projectile.ThrownSlimeballEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public abstract class ItemMixin implements ItemLike {

    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    public void injectUseOn(Level level, Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> cir) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (itemStack.is(Items.SLIME_BALL)) {
            level.playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.SLIME_JUMP_SMALL, SoundSource.PLAYERS, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
            if (!level.isClientSide) {
                ThrownSlimeballEntity thrownEgg = new ThrownSlimeballEntity(level, player);
                thrownEgg.setItem(itemStack);
                thrownEgg.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1F, 1.0F);
                level.addFreshEntity(thrownEgg);
            }
            player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }
            cir.setReturnValue(InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide()));
        } else if (itemStack.is(Items.BRICK)) {
            level.playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.NETHER_BRICKS_FALL, SoundSource.PLAYERS, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
            if (!level.isClientSide) {
                ThrownBrickEntity thrownEgg = new ThrownBrickEntity(level, player);
                thrownEgg.setItem(itemStack);
                thrownEgg.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 0.75F, 1.0F);
                level.addFreshEntity(thrownEgg);
            }
            player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }
            cir.setReturnValue(InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide()));
        } else if (itemStack.is(Items.NETHER_BRICK)) {
            level.playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.NETHER_BRICKS_FALL, SoundSource.PLAYERS, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
            if (!level.isClientSide) {
                ThrownNetherBrickEntity thrownEgg = new ThrownNetherBrickEntity(level, player);
                thrownEgg.setItem(itemStack);
                thrownEgg.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 0.75F, 1.0F);
                level.addFreshEntity(thrownEgg);
            }
            player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }
            cir.setReturnValue(InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide()));
        }
    }
    /*
    @Shadow
    public abstract boolean isEdible();

    @Unique
    public Block getBlock() {
        return ModBlocks.GLOWSTONE_WIRE.get();
    }

    @Shadow
    public abstract InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand);

    @Inject(method = "useOn", at = @At("HEAD"), cancellable = true)
    public void injectUseOn(UseOnContext useOnContext, CallbackInfoReturnable<InteractionResult> cir) {
        if (((Item) (Object) this) == Items.GLOWSTONE_DUST) {
            InteractionResult interactionResult = this.place(new BlockPlaceContext(useOnContext));
            if (!interactionResult.consumesAction() && this.isEdible()) {
                InteractionResult interactionResult2 = this.use(useOnContext.getLevel(), useOnContext.getPlayer(), useOnContext.getHand()).getResult();
                cir.setReturnValue(interactionResult2 == InteractionResult.CONSUME ? InteractionResult.CONSUME_PARTIAL : interactionResult2);
            } else {
                cir.setReturnValue(interactionResult);
            }
        }
    }

    @Inject(method = "appendHoverText(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Ljava/util/List;Lnet/minecraft/world/item/TooltipFlag;)V", at = @At("HEAD"))
    public void injectAppendHoverText(ItemStack itemStack, Level level, List<Component> list, TooltipFlag tooltipFlag, CallbackInfo ci) {
        if (EnchantmentHelper.getItemEnchantmentLevel(ModEnchantments.COUNTING_ENCHANTMENT.get(), itemStack) > 0) {
            if (itemStack.getTag().contains("blockCount")) {
                list.add(Component.translatable("Blocks Mined: " + itemStack.getTag().getInt("blockCount")));
            }
        }
    }

    @Unique
    @Nullable
    public BlockPlaceContext updatePlacementContext(BlockPlaceContext blockPlaceContext) {
        return blockPlaceContext;
    }

    @Unique
    @Nullable
    protected BlockState getPlacementState(BlockPlaceContext blockPlaceContext) {
        BlockState blockState = this.getBlock().getStateForPlacement(blockPlaceContext);
        return blockState != null && this.canPlace(blockPlaceContext, blockState) ? blockState : null;
    }

    @Unique
    protected boolean placeBlock(BlockPlaceContext blockPlaceContext, BlockState blockState) {
        return blockPlaceContext.getLevel().setBlock(blockPlaceContext.getClickedPos(), blockState, 11);
    }


    @Unique
    protected boolean canPlace(BlockPlaceContext blockPlaceContext, BlockState blockState) {
        Player player = blockPlaceContext.getPlayer();
        CollisionContext collisionContext = player == null ? CollisionContext.empty() : CollisionContext.of(player);
        return (!this.mustSurvive() || blockState.canSurvive(blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos())) && blockPlaceContext.getLevel().isUnobstructed(blockState, blockPlaceContext.getClickedPos(), collisionContext);
    }

    @Unique
    protected boolean mustSurvive() {
        return true;
    }

    @Unique
    private BlockState updateBlockStateFromTag(BlockPos blockPos, Level level, ItemStack itemStack, BlockState blockState) {
        BlockState blockState2 = blockState;
        CompoundTag compoundTag = itemStack.getTag();
        if (compoundTag != null) {
            CompoundTag compoundTag2 = compoundTag.getCompound("BlockStateTag");
            StateDefinition<Block, BlockState> stateDefinition = blockState.getBlock().getStateDefinition();
            Iterator var9 = compoundTag2.getAllKeys().iterator();

            while (var9.hasNext()) {
                String string = (String) var9.next();
                Property<?> property = stateDefinition.getProperty(string);
                if (property != null) {
                    String string2 = compoundTag2.get(string).getAsString();
                    blockState2 = BlockItem.updateState(blockState2, property, string2);
                }
            }
        }

        if (blockState2 != blockState) {
            level.setBlock(blockPos, blockState2, 2);
        }

        return blockState2;
    }

    @Unique
    protected boolean updateCustomBlockEntityTag(BlockPos blockPos, Level level, @Nullable Player player, ItemStack itemStack, BlockState blockState) {
        return BlockItem.updateCustomBlockEntityTag(level, player, blockPos, itemStack);
    }

    @Unique
    public InteractionResult place(BlockPlaceContext blockPlaceContext) {
        if (!blockPlaceContext.canPlace()) {
            return InteractionResult.FAIL;
        } else {
            BlockPlaceContext blockPlaceContext2 = this.updatePlacementContext(blockPlaceContext);
            if (blockPlaceContext2 == null) {
                return InteractionResult.FAIL;
            } else {
                BlockState blockState = this.getPlacementState(blockPlaceContext2);
                if (blockState == null) {
                    return InteractionResult.FAIL;
                } else if (!this.placeBlock(blockPlaceContext2, blockState)) {
                    return InteractionResult.FAIL;
                } else {
                    BlockPos blockPos = blockPlaceContext2.getClickedPos();
                    Level level = blockPlaceContext2.getLevel();
                    Player player = blockPlaceContext2.getPlayer();
                    ItemStack itemStack = blockPlaceContext2.getItemInHand();
                    BlockState blockState2 = level.getBlockState(blockPos);
                    if (blockState2.is(blockState.getBlock())) {
                        blockState2 = this.updateBlockStateFromTag(blockPos, level, itemStack, blockState2);
                        this.updateCustomBlockEntityTag(blockPos, level, player, itemStack, blockState2);
                        blockState2.getBlock().setPlacedBy(level, blockPos, blockState2, player, itemStack);
                        if (player instanceof ServerPlayer) {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, blockPos, itemStack);
                        }
                    }

                    SoundType soundType = blockState2.getSoundType();
                    level.playSound(player, blockPos, this.getPlaceSound(blockState2), SoundSource.BLOCKS, (soundType.getVolume() + 1.0F) / 2.0F, soundType.getPitch() * 0.8F);
                    level.gameEvent(GameEvent.BLOCK_PLACE, blockPos, GameEvent.Context.of(player, blockState2));
                    if (player == null || !player.getAbilities().instabuild) {
                        itemStack.shrink(1);
                    }

                    return InteractionResult.sidedSuccess(level.isClientSide);
                }
            }
        }
    }

    protected SoundEvent getPlaceSound(BlockState blockState) {
        return blockState.getSoundType().getPlaceSound();
    }

     */
}