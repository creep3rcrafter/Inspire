package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.block.entity.BreakerBlockEntity;
import net.github.creep3rcrafter.inspire.block.entity.CursedTableBlockEntity;
import net.github.creep3rcrafter.inspire.block.entity.FilteredHopperBlockEntity;
import net.github.creep3rcrafter.inspire.block.entity.RegularBedBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ComparatorBlockEntity;

public class InspireBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(InspireCommon.MOD_ID, Registries.BLOCK_ENTITY_TYPE);
    //public static final RegistrySupplier<BlockEntityType<PotionLiquidBlockEntity>> POTION_LIQUID_BLOCK_ENTITY_TYPE;
    //public static final RegistrySupplier<BlockEntityType<ObsidianChestBlockEntity>> OBSIDIAN_CHEST;
    public static final RegistrySupplier<BlockEntityType<BreakerBlockEntity>> BREAKER;
    public static final RegistrySupplier<BlockEntityType<CursedTableBlockEntity>> CURSED_TABLE;
    public static final RegistrySupplier<BlockEntityType<FilteredHopperBlockEntity>> FILTERED_HOPPER;
    //public static final RegistrySupplier<BlockEntityType<ComparatorBlockEntity>> BLUESTONE_COMPARATOR;

    // BlockEntityType registration for 1.21.1 - disabled due to constructor signature changes
    // The exact constructor signature is unclear for 1.21.1
    // TODO: Verify correct BlockEntityType construction for 1.21.1
    /*
    public static RegistrySupplier<BlockEntityType<RegularBedBlockEntity>> BED =
            BLOCK_ENTITY_TYPES.register("bed", () -> new BlockEntityType<>(RegularBedBlockEntity::new, InspireBlocks.BED.get()));
    */
    public static RegistrySupplier<BlockEntityType<RegularBedBlockEntity>> BED;
    static {
        /*
        POTION_LIQUID_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPES.register(
                "potion_liquid_block_entity", () -> BlockEntityType.Builder.of(PotionLiquidBlockEntity::new, InspireBlocks.POTION_FLUID.get()).build(null));
         */
        /*
        OBSIDIAN_CHEST = BLOCK_ENTITY_TYPES.register(
                "obsidian_chest", () -> BlockEntityType.Builder.of(ObsidianChestBlockEntity::new, InspireBlocks.OBSIDIAN_CHEST.get()).build(null));
         */
        BREAKER = BLOCK_ENTITY_TYPES.register(
                "breaker", () -> BlockEntityType.Builder.of(BreakerBlockEntity::new, InspireBlocks.BREAKER.get()).build(null));
        CURSED_TABLE = BLOCK_ENTITY_TYPES.register(
                "cursed_table", () -> BlockEntityType.Builder.of(CursedTableBlockEntity::new, InspireBlocks.CURSED_TABLE.get()).build(null));
        FILTERED_HOPPER = BLOCK_ENTITY_TYPES.register(
                "filtered_hopper", () -> BlockEntityType.Builder.of(FilteredHopperBlockEntity::new, InspireBlocks.FILTERED_HOPPER.get()).build(null));
        //BLUESTONE_COMPARATOR = BLOCK_ENTITY_TYPES.register("bluestone_comparator", () -> BlockEntityType.Builder.of(ComparatorBlockEntity::new, InspireBlocks.BLUESTONE_COMPARATOR.get()).build(null));
    }
}
