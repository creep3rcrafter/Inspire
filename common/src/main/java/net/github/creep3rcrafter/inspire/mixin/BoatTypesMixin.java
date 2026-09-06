package net.github.creep3rcrafter.inspire.mixin;

import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mixin(Boat.Type.class)
public abstract class BoatTypesMixin {
    @Shadow
    @Mutable
    @Final
    private static Boat.Type[] $VALUES;
    @Unique
    private static final Boat.Type CRIMSON = inspire$addType(Blocks.CRIMSON_PLANKS, "crimson");
    @Unique
    private static final Boat.Type WARPED = inspire$addType(Blocks.WARPED_PLANKS, "warped");
    @Unique
    private static final Boat.Type SOUL = inspire$addType(InspireBlocks.SOUL_PLANKS.getOrNull(), "soul");
    @Unique
    private static final Boat.Type WITHERED = inspire$addType(InspireBlocks.WITHERED_PLANKS.getOrNull(), "withered");
    @Unique
    private static final Boat.Type PINE = inspire$addType(InspireBlocks.PINE_PLANKS.getOrNull(), "pine");
    @Unique
    private static final Boat.Type REDWOOD = inspire$addType(InspireBlocks.REDWOOD_PLANKS.getOrNull(), "redwood");

    @Invoker("<init>")
    private static Boat.Type invokeInit(String enumName, int internalId, Block wood, String name) {
        throw new AssertionError();
    }

    @Unique
    private static Boat.Type inspire$addType(Block block, String name) {
        List<Boat.Type> variants = new ArrayList<>(Arrays.asList($VALUES));
        Boat.Type type = invokeInit(name.toUpperCase(), variants.get(variants.size() - 1).ordinal() + 1, block, name);
        variants.add(type);
        $VALUES = variants.toArray(new Boat.Type[0]);
        return type;
    }

    @Unique
    private static Boat.Type inspire$addType(RegistrySupplier<Block> blockRegistrySupplier, String name) {
        List<Boat.Type> variants = new ArrayList<>(Arrays.asList($VALUES));
        Boat.Type type = invokeInit(name.toUpperCase(), variants.get(variants.size() - 1).ordinal() + 1, blockRegistrySupplier.get(), name);
        variants.add(type);
        $VALUES = variants.toArray(new Boat.Type[0]);
        return type;
    }
}
