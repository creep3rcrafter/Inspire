package net.github.creep3rcrafter.inspire.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.levelgen.structure.templatesystem.AlwaysTrueTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockRotProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.ProcessorRule;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

import java.util.List;

public final class InspireProcessorLists {
    public static final ResourceKey<StructureProcessorList> EMPTY = createKey("empty");
    public static final ResourceKey<StructureProcessorList> WITHERED_BONE_FOSSIL = createKey("withered_bone_fossil");

    private InspireProcessorLists() {
    }

    public static void bootstrap(BootstrapContext<StructureProcessorList> context) {
        context.register(EMPTY, new StructureProcessorList(List.of()));
        context.register(WITHERED_BONE_FOSSIL, new StructureProcessorList(List.of(
                new BlockRotProcessor(0.9f),
                new RuleProcessor(List.of(
                        replaceBone(Direction.Axis.X),
                        replaceBone(Direction.Axis.Y),
                        replaceBone(Direction.Axis.Z)
                ))
        )));
    }

    private static ProcessorRule replaceBone(Direction.Axis axis) {
        return new ProcessorRule(
                new BlockStateMatchTest(net.minecraft.world.level.block.Blocks.BONE_BLOCK.defaultBlockState().setValue(RotatedPillarBlock.AXIS, axis)),
                AlwaysTrueTest.INSTANCE,
                InspireBlocks.WITHERED_BONE_BLOCK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, axis)
        );
    }

    private static ResourceKey<StructureProcessorList> createKey(String name) {
        return ResourceKey.create(
                Registries.PROCESSOR_LIST,
                ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, name)
        );
    }
}
