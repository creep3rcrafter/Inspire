package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import java.nio.file.Path;

public final class InspireSharedDataOutput {
    private InspireSharedDataOutput() {
    }

    public static FabricDataOutput common(FabricDataOutput output) {
        Path repoRoot = output.getOutputFolder().getParent().getParent().getParent().getParent();
        Path commonOutput = repoRoot.resolve("common").resolve("src").resolve("generated").resolve("resources");
        return new FabricDataOutput(output.getModContainer(), commonOutput, output.isStrictValidationEnabled());
    }
}
