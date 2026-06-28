package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.block.entity.RegularBedBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class InspireBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(InspireCommon.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    // BlockEntityType registration for 1.21.1 - disabled due to constructor signature changes
    // The exact constructor signature is unclear for 1.21.1
    // TODO: Verify correct BlockEntityType construction for 1.21.1
    /*
    public static RegistrySupplier<BlockEntityType<RegularBedBlockEntity>> BED =
            BLOCK_ENTITY_TYPES.register("bed", () -> new BlockEntityType<>(RegularBedBlockEntity::new, InspireBlocks.BED.get()));
    */
    public static RegistrySupplier<BlockEntityType<RegularBedBlockEntity>> BED;
}
