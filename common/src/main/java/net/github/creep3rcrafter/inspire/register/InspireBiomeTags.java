package net.github.creep3rcrafter.inspire.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public final class InspireBiomeTags {
    public static final TagKey<Biome> HAS_WITHERED_TREES = create("has_withered_trees");

    private InspireBiomeTags() {
    }

    private static TagKey<Biome> create(String name) {
        return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, name));
    }
}
