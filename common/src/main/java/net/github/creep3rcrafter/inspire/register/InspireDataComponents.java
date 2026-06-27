package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;

import java.util.function.UnaryOperator;

public class InspireDataComponents {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES = DeferredRegister.create(InspireCommon.MOD_ID, Registries.DATA_COMPONENT_TYPE);
    public static final RegistrySupplier<DataComponentType<ItemStack>> PORTABLE_JUKEBOX_CONTENTS;
    //public static final RegistrySupplier<DataComponentType<PortableJukeboxContents>> PORTABLE_JUKEBOX_CONTENTS;
    static {
        PORTABLE_JUKEBOX_CONTENTS = register("portable_jukebox_disc",  (builder) -> builder.persistent(ItemStack.OPTIONAL_CODEC).networkSynchronized(ItemStack.OPTIONAL_STREAM_CODEC).cacheEncoding());
        //PORTABLE_JUKEBOX_CONTENTS = register("portable_jukebox_disc",  (builder) -> builder.persistent(ItemStack.OPTIONAL_CODEC).cacheEncoding());
        //PORTABLE_JUKEBOX_CONTENTS = register("portable_jukebox_disc",  (builder) -> builder.persistent(PortableJukeboxContents.CODEC).cacheEncoding());
    }

    private static <T>RegistrySupplier<DataComponentType<T>> register(String name, UnaryOperator<DataComponentType.Builder<T>> builderUnaryOperator) {
        return DATA_COMPONENT_TYPES.register(name, () -> builderUnaryOperator.apply(DataComponentType.builder()).build());
    }
}
