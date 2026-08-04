package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import java.util.Map;

public class InspirePaintingVariantProvider implements DataProvider {

    private final FabricDataOutput output;

    public InspirePaintingVariantProvider(FabricDataOutput  output) {
        this.output = output;
    }

    @Override
    public @NotNull CompletableFuture<?> run(CachedOutput cachedOutput) {

        Map<ResourceLocation, JsonObject> paintings = new HashMap<>();

        addPainting(paintings, "creative1", 4, 2);
        addPainting(paintings, "creative2", 8, 4);
        addPainting(paintings, "nirvana", 2, 2);
        addPainting(paintings, "red_hot_chili_peppers", 1, 1);
        addPainting(paintings, "rem", 3, 3);
        addPainting(paintings, "screaming_trees", 3, 3);
        addPainting(paintings, "tame_impala", 3, 3);
        addPainting(paintings, "another_portal", 4, 2);
        addPainting(paintings, "demo", 8, 4);
        addPainting(paintings, "my_eyes_hurt", 4, 2);
        addPainting(paintings, "the_alter", 4, 2);
        addPainting(paintings, "the_arena", 4, 2);
        addPainting(paintings, "the_lab", 4, 2);

        return CompletableFuture.allOf(
                paintings.entrySet().stream()
                        .map(entry -> {
                            Path path = output
                                    .getOutputFolder()
                                    .resolve("data/" + entry.getKey().getNamespace()
                                            + "/painting_variant/"
                                            + entry.getKey().getPath()
                                            + ".json");

                            return DataProvider.saveStable(
                                    cachedOutput,
                                    entry.getValue(),
                                    path
                            );
                        })
                        .toArray(CompletableFuture[]::new)
        );
    }


    private void addPainting(
            Map<ResourceLocation, JsonObject> paintings,
            String name,
            int width,
            int height
    ) {
        JsonObject json = new JsonObject();

        json.addProperty(
                "asset_id",
                "inspire:" + name
        );

        json.addProperty(
                "width",
                width
        );

        json.addProperty(
                "height",
                height
        );

        paintings.put(
                ResourceLocation.fromNamespaceAndPath(
                        "inspire",
                        name
                ),
                json
        );
    }


    @Override
    public @NotNull String getName() {
        return "Inspire Painting Variants";
    }
}