package net.github.creep3rcrafter.inspire.fabric.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.register.InspireBlockFamilies;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.github.creep3rcrafter.inspire.utils.BetterBlockFamilies;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.RangeSelectItemModel;
import net.minecraft.client.renderer.item.SelectItemModel;
import net.minecraft.client.renderer.item.properties.numeric.CrossbowPull;
import net.minecraft.client.renderer.item.properties.numeric.UseDuration;
import net.minecraft.client.renderer.item.properties.select.Charge;
import net.minecraft.client.renderer.special.BedSpecialRenderer;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DripstoneThickness;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.client.data.models.BlockModelGenerators.NOP;
import static net.minecraft.client.data.models.BlockModelGenerators.Y_ROT_90;

public class InspireFabricModelProvider extends FabricModelProvider {
    public InspireFabricModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        new BetterBlockFamilies();
        createRotatable(InspireBlocks.WARPED_NYLIUM_SHELF.get(), blockModelGenerators);
        createRotatable(InspireBlocks.CRIMSON_NYLIUM_SHELF.get(), blockModelGenerators);
        blockModelGenerators.family(InspireBlocks.CYAN_NETHER_BRICKS.get()).generateFor(InspireBlockFamilies.CYAN_NETHER_BRICKS_FAMILY);
        blockModelGenerators.family(InspireBlocks.CYAN_NETHER_TILES.get()).generateFor(InspireBlockFamilies.CYAN_NETHER_TILES_FAMILY);
        //blockModelGenerators.family(InspireBlocks.POLISHED_CYAN_NETHER_BRICKS.get()).generateFor(InspireBlockFamilies.POLISHED_CYAN_NETHER_BRICKS);
        blockModelGenerators.family(Blocks.RED_NETHER_BRICKS).generateFor(InspireBlockFamilies.RED_NETHER_BRICKS_FAMILY);
        blockModelGenerators.family(InspireBlocks.RED_NETHER_TILES.get()).generateFor(InspireBlockFamilies.RED_NETHER_TILES_FAMILY);
        //blockModelGenerators.family(InspireBlocks.POLISHED_RED_NETHER_BRICKS.get()).generateFor(InspireBlockFamilies.POLISHED_RED_NETHER_BRICKS);
        blockModelGenerators.family(Blocks.NETHER_BRICKS).generateFor(InspireBlockFamilies.NETHER_BRICKS_FAMILY);
        blockModelGenerators.family(InspireBlocks.NETHER_TILES.get()).generateFor(InspireBlockFamilies.NETHER_TILES_FAMILY);
        blockModelGenerators.family(Blocks.QUARTZ_BRICKS).generateFor(InspireBlockFamilies.QUARTZ_BRICKS_FAMILY);
        blockModelGenerators.family(InspireBlocks.QUARTZ_TILES.get()).generateFor(InspireBlockFamilies.QUARTZ_TILES_FAMILY);
        //blockModelGenerators.family(Blocks.BRICKS).generateFor(InspireBlockFamilies.BRICKS_FAMILY);
        blockModelGenerators.family(InspireBlocks.BRICK_TILES.get()).generateFor(InspireBlockFamilies.BRICK_TILES_FAMILY);
        blockModelGenerators.family(InspireBlocks.PRISMARINE_TILES.get()).generateFor(InspireBlockFamilies.PRISMARINE_TILES_FAMILY);
        blockModelGenerators.family(Blocks.DARK_PRISMARINE).generateFor(InspireBlockFamilies.DARK_PRISMARINE_FAMILY);
        blockModelGenerators.family(InspireBlocks.END_STONE_TILES.get()).generateFor(InspireBlockFamilies.END_STONE_TILES_FAMILY);
        blockModelGenerators.family(InspireBlocks.PURPUR_TILES.get()).generateFor(InspireBlockFamilies.PURPUR_TILES_FAMILY);
        blockModelGenerators.family(InspireBlocks.STONE_TILES.get()).generateFor(InspireBlockFamilies.STONE_TILES_FAMILY);
        blockModelGenerators.family(Blocks.STONE_BRICKS).generateFor(InspireBlockFamilies.STONE_BRICKS_FAMILY);
        blockModelGenerators.family(InspireBlocks.MOSSY_STONE_TILES.get()).generateFor(InspireBlockFamilies.MOSSY_STONE_TILES_FAMILY);
        blockModelGenerators.family(Blocks.MOSSY_STONE_BRICKS).generateFor(InspireBlockFamilies.MOSSY_STONE_BRICKS_FAMILY);
        blockModelGenerators.family(InspireBlocks.POLISHED_DEEPSLATE_TILES.get()).generateFor(InspireBlockFamilies.POLISHED_DEEPSLATE_TILES_FAMILY);
        blockModelGenerators.family(Blocks.POLISHED_DEEPSLATE).generateFor(InspireBlockFamilies.POLISHED_DEEPSLATE_FAMILY);

        //blockModelGenerators.family(Blocks.DEEPSLATE_TILES).generateFor(InspireBlockFamilies.DEEPSLATE_TILES_FAMILY);
        //blockModelGenerators.family(Blocks.DEEPSLATE_BRICKS).generateFor(InspireBlockFamilies.DEEPSLATE_BRICKS_FAMILY);
        blockModelGenerators.family(Blocks.END_STONE_BRICKS).generateFor(InspireBlockFamilies.END_STONE_BRICKS_FAMILY);
        blockModelGenerators.family(Blocks.PURPUR_BLOCK).generateFor(InspireBlockFamilies.PURPUR_FAMILY);
        blockModelGenerators.family(Blocks.PRISMARINE_BRICKS).generateFor(InspireBlockFamilies.PRISMARINE_BRICKS_FAMILY);
        //blockModelGenerators.family(Blocks.BRICKS).generateFor(InspireBlockFamilies.BRICKS);
        //blockModelGenerators.family(Blocks.MUD_BRICKS).generateFor(InspireBlockFamilies.MUD_BRICKS);

        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.AMARANTH_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.BLUSH_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.CELADON_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.CLOUDY_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.COBALT_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.CRIMSON_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.FROSTED_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.MIDNIGHT_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.MISTY_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.SEAFOAM_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.UMBER_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.WARM_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.SKY_FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);

        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.NETHER_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.DARK_PRISMARINE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.BRICK_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.DEEPSLATE_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.DEEPSLATE_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.CYAN_NETHER_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.CYAN_NETHER_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.END_STONE_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.END_STONE_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.MOSSY_STONE_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.MOSSY_STONE_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.MUD_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.MUD_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.POLISHED_DEEPSLATE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.POLISHED_DEEPSLATE_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.PRISMARINE_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.PRISMARINE_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.PURPUR_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.QUARTZ_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.NETHER_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.QUARTZ_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.RED_NETHER_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.RED_NETHER_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.STONE_BRICK_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.STONE_TILE_PILLAR.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);

        MultiVariant multiVariant = BlockModelGenerators.plainVariant(ModelLocationUtils.decorateBlockModelLocation("bed"));
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(InspireBlocks.BED.get(), multiVariant));
        blockModelGenerators.createFullAndCarpetBlocks(InspireBlocks.WOOL.get(), InspireBlocks.CARPET.get());
        blockModelGenerators.createTrivialCube(InspireBlocks.CONCRETE.get());
        blockModelGenerators.createColoredBlockWithRandomRotations(TexturedModel.CUBE, InspireBlocks.CONCRETE_POWDER.get());
        blockModelGenerators.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, InspireBlocks.GLAZED_TERRACOTTA.get());
        blockModelGenerators.createGlassBlocks(Blocks.TINTED_GLASS, InspireBlocks.TINTED_GLASS_PANE.get());
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(InspireBlocks.FROGLIGHT.get(), TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);

        PropertyDispatch.C2<MultiVariant, @NotNull Direction, @NotNull DripstoneThickness> c2 = PropertyDispatch.initial(BlockStateProperties.VERTICAL_DIRECTION, BlockStateProperties.DRIPSTONE_THICKNESS);
        for(DripstoneThickness dripstoneThickness : DripstoneThickness.values()) {
            c2.select(Direction.UP, dripstoneThickness, createPointedVariant(blockModelGenerators, Direction.UP, dripstoneThickness, InspireBlocks.ICICLE.get()));
        }
        for(DripstoneThickness dripstoneThickness : DripstoneThickness.values()) {
            c2.select(Direction.DOWN, dripstoneThickness, createPointedVariant(blockModelGenerators, Direction.DOWN, dripstoneThickness, InspireBlocks.ICICLE.get()));
        }
        blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(InspireBlocks.ICICLE.get()).with(c2));


        createWall(blockModelGenerators, InspireBlocks.OAK_WALL.get(), Blocks.OAK_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.SPRUCE_WALL.get(), Blocks.SPRUCE_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.BIRCH_WALL.get(), Blocks.BIRCH_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.JUNGLE_WALL.get(), Blocks.JUNGLE_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.ACACIA_WALL.get(), Blocks.ACACIA_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.DARK_OAK_WALL.get(), Blocks.DARK_OAK_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.MANGROVE_WALL.get(), Blocks.MANGROVE_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.CHERRY_WALL.get(), Blocks.CHERRY_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.PALE_OAK_WALL.get(), Blocks.PALE_OAK_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.BAMBOO_WALL.get(), Blocks.BAMBOO_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.CRIMSON_WALL.get(), Blocks.CRIMSON_PLANKS);
        createWall(blockModelGenerators, InspireBlocks.WARPED_WALL.get(), Blocks.WARPED_PLANKS);
        //BlockModelGenerators.createWall()

    }
    public void createWall(BlockModelGenerators blockModelGenerators, Block wall, Block copy){
        MultiVariant multiVariant = BlockModelGenerators.plainVariant(ModelTemplates.WALL_POST.create(wall, TextureMapping.columnWithWall(copy), blockModelGenerators.modelOutput));
        MultiVariant multiVariant2 = BlockModelGenerators.plainVariant(ModelTemplates.WALL_LOW_SIDE.create(wall, TextureMapping.columnWithWall(copy), blockModelGenerators.modelOutput));
        MultiVariant multiVariant3 = BlockModelGenerators.plainVariant(ModelTemplates.WALL_TALL_SIDE.create(wall, TextureMapping.columnWithWall(copy), blockModelGenerators.modelOutput));
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createWall(wall, multiVariant, multiVariant2, multiVariant3));
        ResourceLocation ResourceLocation = ModelTemplates.WALL_INVENTORY.create(wall, TextureMapping.columnWithWall(copy), blockModelGenerators.modelOutput);
        blockModelGenerators.registerSimpleItemModel(wall, ResourceLocation);
    }
    public final MultiVariant createPointedVariant(BlockModelGenerators blockModelGenerators, Direction direction, DripstoneThickness dripstoneThickness, Block block) {
        String var10000 = direction.getSerializedName();
        String string = "_" + var10000 + "_" + dripstoneThickness.getSerializedName();
        TextureMapping textureMapping = TextureMapping.cross(TextureMapping.getBlockTexture(block, string));
        return BlockModelGenerators.plainVariant(ModelTemplates.POINTED_DRIPSTONE.createWithSuffix(block, string, textureMapping, blockModelGenerators.modelOutput));
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        ResourceLocation ResourceLocation = ModelTemplates.BED_INVENTORY.create(ModelLocationUtils.getModelLocation(InspireBlocks.BED.get()), TextureMapping.particle(InspireBlocks.WOOL.get()), itemModelGenerators.modelOutput);
        itemModelGenerators.itemModelOutput.accept(InspireItems.BED.get(), ItemModelUtils.specialModel(ResourceLocation, new BedSpecialRenderer.Unbaked(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "regular"))));
        generateBow(itemModelGenerators, InspireItems.BONE_BOW);
        generateBow(itemModelGenerators, InspireItems.TWISTING_VINE_BOW);
        generateBow(itemModelGenerators, InspireItems.WEEPING_VINE_BOW);
        generateBow(itemModelGenerators, InspireItems.SOUL_BOW);
        generateCrossbow(itemModelGenerators, InspireItems.SOUL_CROSSBOW);
        generateCrossbow(itemModelGenerators, InspireItems.SOUL_MULTI_CROSSBOW);
        generateCrossbow(itemModelGenerators, InspireItems.MULTI_CROSSBOW);
        itemModelGenerators.generateFlatItem(InspireItems.SOAP.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(InspireItems.HARNESS.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(Items.POINTED_DRIPSTONE);
        itemModelGenerators.generateFlatItem(InspireItems.PORTABLE_JUKEBOX.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_A_FAMILIAR_ROOM.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_AERIE.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_ANCESTRY.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_ARIA_MATH.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BIOME_FEST.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BLIND_SPOTS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_CLARK.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_COMFORTING_MEMORIES.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_DANNY.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_DREITON.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_DRY_HANDS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_FEATHERFALL.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_FLOATING_DREAM.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_HAGGSTROM.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_HAUNT_MUSKIE.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_KEY.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_KOMOREBI.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_LEFT_TO_BLOOM.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_LIVING_MICE.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_MICE_ON_VENUS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_MINECRAFT.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_ONE_MORE_DAY.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_OXYGENE.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_PUZZLEBOX.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_SUBWOOFER_LULLABY.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_SWEDEN.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_TASWELL.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_WATCHER.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_WET_HANDS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_YAKUSOKU.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BALLAD_OF_THE_CATS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_CHRYSAPOEIA.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_CONCRETE_HALLS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_DEAD_VOXEL.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_RUBEDO.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_SO_BELOW.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_WARMTH.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BOSS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_ALPHA.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_THE_END.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BEGINNING_2.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BROMELIAD.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_ECHO_IN_THE_WIND.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_ELD_UNKNOWN.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_AN_ORDIANRY_DAY.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BELOW_AND_ABOVE.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_BROKEN_CLOCKS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_CRESCENT_DUNES.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_FIREBUGS.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_FIREFLIES.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_INFINITE_AMETHYST.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_LABYRINTHINE.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_LILYPAD.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_OS_PIANO.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_STAND_TALL.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_WENDING.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_AXOLOTL.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_DRAGON_FISH.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_SHUNIJI.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.MUSIC_DISC_DEEPER.get(), ModelTemplates.MUSIC_DISC);
        itemModelGenerators.generateFlatItem(InspireItems.WARPED_NYLIUM_SHELF.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(InspireItems.CRIMSON_NYLIUM_SHELF.get(), ModelTemplates.FLAT_ITEM);
    }
    public final void generateBow(ItemModelGenerators itemModelGenerators, RegistrySupplier<Item> itemRegistrySupplier) {
        ItemModel.Unbaked unbaked = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), ModelTemplates.BOW));
        ItemModel.Unbaked unbaked2 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_pulling_0", ModelTemplates.BOW));
        ItemModel.Unbaked unbaked3 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_pulling_1", ModelTemplates.BOW));
        ItemModel.Unbaked unbaked4 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_pulling_2", ModelTemplates.BOW));
        itemModelGenerators.itemModelOutput.accept(itemRegistrySupplier.get(), ItemModelUtils.conditional(ItemModelUtils.isUsingItem(), ItemModelUtils.rangeSelect(new UseDuration(false), 0.05F, unbaked2, new RangeSelectItemModel.Entry[]{ItemModelUtils.override(unbaked3, 0.65F), ItemModelUtils.override(unbaked4, 0.9F)}), unbaked));
    }

    public final void generateCrossbow(ItemModelGenerators itemModelGenerators, RegistrySupplier<Item> itemRegistrySupplier) {
        ItemModel.Unbaked unbaked = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), ModelTemplates.CROSSBOW));
        ItemModel.Unbaked unbaked2 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_pulling_0", ModelTemplates.CROSSBOW));
        ItemModel.Unbaked unbaked3 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_pulling_1", ModelTemplates.CROSSBOW));
        ItemModel.Unbaked unbaked4 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_pulling_2", ModelTemplates.CROSSBOW));
        ItemModel.Unbaked unbaked5 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_arrow", ModelTemplates.CROSSBOW));
        ItemModel.Unbaked unbaked6 = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(itemRegistrySupplier.get(), "_firework", ModelTemplates.CROSSBOW));
        itemModelGenerators.itemModelOutput.accept(itemRegistrySupplier.get(), ItemModelUtils.select(new Charge(), ItemModelUtils.conditional(ItemModelUtils.isUsingItem(), ItemModelUtils.rangeSelect(new CrossbowPull(), unbaked2, new RangeSelectItemModel.Entry[]{ItemModelUtils.override(unbaked3, 0.58F), ItemModelUtils.override(unbaked4, 1.0F)}), unbaked), new SelectItemModel.SwitchCase[]{ItemModelUtils.when(CrossbowItem.ChargeType.ARROW, unbaked4), ItemModelUtils.when(CrossbowItem.ChargeType.ROCKET, unbaked4)}));
    }

    public static ResourceLocation getModelLocation(RegistrySupplier<Item> itemRegistrySupplier) {
        ResourceLocation resourceLocation = itemRegistrySupplier.getRegistryId();
        return resourceLocation.withPrefix("item/");
    }

    public static ResourceLocation getModelLocation(RegistrySupplier<Item> itemRegistrySupplier, String string) {
        ResourceLocation resourceLocation = itemRegistrySupplier.getRegistryId();
        return resourceLocation.withPath((string2) -> "item/" + string2 + string);
    }

    private void createRotatable(Block block, BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.blockStateOutput
                .accept(MultiVariantGenerator.dispatch(block, BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block)))
                .with(PropertyDispatch.modify(BlockStateProperties.ATTACH_FACE, BlockStateProperties.HORIZONTAL_FACING)
                        .select(AttachFace.FLOOR, Direction.NORTH, NOP)
                        .select(AttachFace.FLOOR, Direction.EAST, Y_ROT_90)
                        .select(AttachFace.FLOOR, Direction.SOUTH, BlockModelGenerators.Y_ROT_180)
                        .select(AttachFace.FLOOR, Direction.WEST, BlockModelGenerators.Y_ROT_270)
                        .select(AttachFace.WALL, Direction.NORTH, BlockModelGenerators.X_ROT_90)
                        .select(AttachFace.WALL, Direction.EAST, BlockModelGenerators.X_ROT_90.then(Y_ROT_90))
                        .select(AttachFace.WALL, Direction.SOUTH, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_180))
                        .select(AttachFace.WALL, Direction.WEST, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_270))
                        .select(AttachFace.CEILING, Direction.SOUTH, BlockModelGenerators.X_ROT_180)
                        .select(AttachFace.CEILING, Direction.WEST, BlockModelGenerators.X_ROT_180.then(Y_ROT_90))
                        .select(AttachFace.CEILING, Direction.NORTH, BlockModelGenerators.X_ROT_180.then(BlockModelGenerators.Y_ROT_180))
                        .select(AttachFace.CEILING, Direction.EAST, BlockModelGenerators.X_ROT_180.then(BlockModelGenerators.Y_ROT_270))));
    }
}
