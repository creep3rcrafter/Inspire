package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.CachedOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class InspireFabricBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public InspireFabricBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(BlockTags.FENCES)
                // Nether Bricks
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.RED_NETHER_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.NETHER_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_TILE_FENCE.get())))
                // Bricks & Tiles
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BRICK_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_TILE_FENCE.get())))
                // Prismarine
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PRISMARINE_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PRISMARINE_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.DARK_PRISMARINE_FENCE.get())))
                // End Stone
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.END_STONE_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.END_STONE_TILE_FENCE.get())))
                // Purpur
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PURPUR_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PURPUR_TILE_FENCE.get())))
                // Stone & Mossy Stone
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.STONE_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.STONE_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.MOSSY_STONE_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.MOSSY_STONE_TILE_FENCE.get())))
                // Polished Deepslate & Deepslate
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.POLISHED_DEEPSLATE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.POLISHED_DEEPSLATE_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.DEEPSLATE_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.DEEPSLATE_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.NETHER_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.RED_NETHER_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.RED_NETHER_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.MUD_BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.MUD_TILE_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BRICK_FENCE.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BRICK_TILE_FENCE.get())));

        builder(BlockTags.WALLS)
                // Nether Bricks
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_BRICK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.NETHER_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_TILE_WALL.get())))
                // Bricks & Tiles
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BRICK_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_BRICK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_TILE_WALL.get())))
                // Prismarine
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PRISMARINE_BRICK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PRISMARINE_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.DARK_PRISMARINE_WALL.get())))
                // End Stone
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.END_STONE_TILE_WALL.get())))
                // Purpur
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PURPUR_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PURPUR_TILE_WALL.get())))
                // Stone & Mossy Stone
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.STONE_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.MOSSY_STONE_TILE_WALL.get())))
                // Polished Deepslate & Deepslate
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.POLISHED_DEEPSLATE_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.NETHER_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.RED_NETHER_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_BRICK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CYAN_NETHER_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_BRICK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.QUARTZ_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.MUD_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BRICK_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BRICK_TILE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.OAK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.SPRUCE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BIRCH_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.JUNGLE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.ACACIA_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.DARK_OAK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.MANGROVE_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CHERRY_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.PALE_OAK_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.BAMBOO_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.CRIMSON_WALL.get())))
                .add(ResourceKey.create(Registries.BLOCK, BuiltInRegistries.BLOCK.getKey(InspireBlocks.WARPED_WALL.get())))
        ;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cachedOutput) {
        return super.run(cachedOutput);
    }
}
