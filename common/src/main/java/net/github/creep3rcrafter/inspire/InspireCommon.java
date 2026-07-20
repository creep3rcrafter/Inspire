package net.github.creep3rcrafter.inspire;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import net.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import net.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.github.creep3rcrafter.inspire.entity.animal.WitherSkeletonHorseEntity;
import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonCreeperEntity;
import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonPiglinEntity;
import net.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.github.creep3rcrafter.inspire.mixin.BlockEntityTypeAccessor;
import net.github.creep3rcrafter.inspire.network.InspireNetworking;
import net.github.creep3rcrafter.inspire.register.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.HashSet;
import java.util.Set;


//@SuppressWarnings("deprecation")
public final class InspireCommon {
    public static final String MOD_ID = "inspire";
    public static final TagKey<Item> MUSIC_DISCS = TagKey.create(Registries.ITEM,  ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "music_discs"));
    public static final ResourceLocation PACKET = ResourceLocation.fromNamespaceAndPath(MOD_ID, "packet");
    public static void init() {
        new InspireJukeBoxSongs();
        new InspireNetworking();
        new InspireCreativeTabs();
        InspireSoundEvents.SOUND_EVENTS.register();
        InspireDataComponents.DATA_COMPONENT_TYPES.register();
        InspireArmorMaterials.ARMOR_MATERIALS.register();
        InspireEntityTypes.ENTITY_TYPES.register();
        InspireFluids.FLUIDS.register();
        InspireBlocks.BLOCKS.register();
        BlockEntityTypeAccessor accessor =
                (BlockEntityTypeAccessor) (Object) BlockEntityType.COMPARATOR;
        Set<Block> blocks = new HashSet<>(accessor.inspire$getValidBlocks());
        blocks.add(InspireBlocks.BLUESTONE_COMPARATOR.get());
        accessor.inspire$setValidBlocks(Set.copyOf(blocks));
        InspireBlockEntityTypes.BLOCK_ENTITY_TYPES.register();
        InspireItems.ITEMS.register();
        InspireEffects.EFFECTS.register();
        InspirePotions.POTIONS.register();
        new InspireEntityRenderers();
        EntityAttributeRegistry.register(InspireEntityTypes.WITHER_SKELETON_HORSE, WitherSkeletonHorseEntity::createSkeletonHorseAttributes);
        EntityAttributeRegistry.register(InspireEntityTypes.SKELETON_PIGLIN, SkeletonPiglinEntity::createAttributes);
        EntityAttributeRegistry.register(InspireEntityTypes.SKELETON_CREEPER, SkeletonCreeperEntity::createAttributes);
        EntityAttributeRegistry.register(InspireEntityTypes.FLEEP, FleepEntity::createAttributes);
        EntityAttributeRegistry.register(InspireEntityTypes.SUNKEN, SunkenEntity::createAttributes);
        //InspirePaintings.PAINTINGS.register();
        //ShulkerBoxBlock
        //BlockFamilies
    }
}


