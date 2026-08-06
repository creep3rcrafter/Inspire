package net.github.creep3rcrafter.inspire.register;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public final class InspireSurfaceRuleData {
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final SurfaceRules.RuleSource BLACKSTONE = makeStateRule(Blocks.BLACKSTONE);
    private static final SurfaceRules.RuleSource BASALT = makeStateRule(Blocks.BASALT);
    private static final SurfaceRules.RuleSource CRIMSON_NYLIUM = makeStateRule(Blocks.CRIMSON_NYLIUM);
    private static final SurfaceRules.RuleSource GRAVEL = makeStateRule(Blocks.GRAVEL);
    private static final SurfaceRules.RuleSource LAVA = makeStateRule(Blocks.LAVA);
    private static final SurfaceRules.RuleSource NETHERRACK = makeStateRule(Blocks.NETHERRACK);
    private static final SurfaceRules.RuleSource NETHER_WART_BLOCK = makeStateRule(Blocks.NETHER_WART_BLOCK);
    private static final SurfaceRules.RuleSource SOUL_SAND = makeStateRule(Blocks.SOUL_SAND);
    private static final SurfaceRules.RuleSource SOUL_SOIL = makeStateRule(Blocks.SOUL_SOIL);
    private static final SurfaceRules.RuleSource WARPED_NYLIUM = makeStateRule(Blocks.WARPED_NYLIUM);
    private static final SurfaceRules.RuleSource WARPED_WART_BLOCK = makeStateRule(Blocks.WARPED_WART_BLOCK);

    private InspireSurfaceRuleData() {
    }

    public static SurfaceRules.RuleSource nether() {
        SurfaceRules.ConditionSource atSoulSoilDepth = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(31), 0);
        SurfaceRules.ConditionSource aboveSoulSoilDepth = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(32), 0);
        SurfaceRules.ConditionSource belowSoulSoilDepth = SurfaceRules.yStartCheck(VerticalAnchor.absolute(30), 0);
        SurfaceRules.ConditionSource belowSoulSoilCeiling = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(35), 0));
        SurfaceRules.ConditionSource nearRoof = SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0);
        SurfaceRules.ConditionSource hole = SurfaceRules.hole();
        SurfaceRules.ConditionSource soulSandLayer = SurfaceRules.noiseCondition(Noises.SOUL_SAND_LAYER, -0.012);
        SurfaceRules.ConditionSource gravelLayer = SurfaceRules.noiseCondition(Noises.GRAVEL_LAYER, -0.012);
        SurfaceRules.ConditionSource patchNoise = SurfaceRules.noiseCondition(Noises.PATCH, -0.012);
        SurfaceRules.ConditionSource netherrackNoise = SurfaceRules.noiseCondition(Noises.NETHERRACK, 0.54);
        SurfaceRules.ConditionSource netherWartNoise = SurfaceRules.noiseCondition(Noises.NETHER_WART, 1.17);
        SurfaceRules.ConditionSource stateSelectorNoise = SurfaceRules.noiseCondition(Noises.NETHER_STATE_SELECTOR, 0.0);
        SurfaceRules.RuleSource gravelPatch = SurfaceRules.ifTrue(
                patchNoise,
                SurfaceRules.ifTrue(belowSoulSoilDepth, SurfaceRules.ifTrue(belowSoulSoilCeiling, GRAVEL))
        );

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK),
                SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())), BEDROCK),
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(InspireBiomes.WITHERED_WASTES),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(nearRoof, BLACKSTONE),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, BLACKSTONE),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.ON_FLOOR,
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(SurfaceRules.not(aboveSoulSoilDepth), SurfaceRules.ifTrue(hole, LAVA)),
                                                SOUL_SOIL
                                        )
                                ),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, BLACKSTONE),
                                BLACKSTONE
                        )
                ),
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(InspireBiomes.SOUL_FOREST),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(nearRoof, BLACKSTONE),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, BLACKSTONE),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.ON_FLOOR,
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(SurfaceRules.not(aboveSoulSoilDepth), SurfaceRules.ifTrue(hole, LAVA)),
                                                SOUL_SOIL
                                        )
                                ),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, BLACKSTONE),
                                BLACKSTONE
                        )
                ),
                SurfaceRules.ifTrue(nearRoof, NETHERRACK),
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.BASALT_DELTAS),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, BASALT),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.sequence(gravelPatch, SurfaceRules.ifTrue(stateSelectorNoise, BASALT), BLACKSTONE))
                        )
                ),
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.SOUL_SAND_VALLEY),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, SurfaceRules.sequence(SurfaceRules.ifTrue(stateSelectorNoise, SOUL_SAND), SOUL_SOIL)),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.sequence(gravelPatch, SurfaceRules.ifTrue(stateSelectorNoise, SOUL_SAND), SOUL_SOIL))
                        )
                ),
                SurfaceRules.ifTrue(
                        SurfaceRules.ON_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.not(aboveSoulSoilDepth), SurfaceRules.ifTrue(hole, LAVA)),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(Biomes.WARPED_FOREST),
                                        SurfaceRules.ifTrue(
                                                SurfaceRules.not(netherrackNoise),
                                                SurfaceRules.ifTrue(atSoulSoilDepth, SurfaceRules.sequence(SurfaceRules.ifTrue(netherWartNoise, WARPED_WART_BLOCK), WARPED_NYLIUM))
                                        )
                                ),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(Biomes.CRIMSON_FOREST),
                                        SurfaceRules.ifTrue(
                                                SurfaceRules.not(netherrackNoise),
                                                SurfaceRules.ifTrue(atSoulSoilDepth, SurfaceRules.sequence(SurfaceRules.ifTrue(netherWartNoise, NETHER_WART_BLOCK), CRIMSON_NYLIUM))
                                        )
                                )
                        )
                ),
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.NETHER_WASTES),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.UNDER_FLOOR,
                                        SurfaceRules.ifTrue(
                                                soulSandLayer,
                                                SurfaceRules.sequence(
                                                        SurfaceRules.ifTrue(SurfaceRules.not(hole), SurfaceRules.ifTrue(belowSoulSoilDepth, SurfaceRules.ifTrue(belowSoulSoilCeiling, SOUL_SAND))),
                                                        NETHERRACK
                                                )
                                        )
                                ),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.ON_FLOOR,
                                        SurfaceRules.ifTrue(
                                                atSoulSoilDepth,
                                                SurfaceRules.ifTrue(
                                                        belowSoulSoilCeiling,
                                                        SurfaceRules.ifTrue(
                                                                gravelLayer,
                                                                SurfaceRules.sequence(
                                                                        SurfaceRules.ifTrue(aboveSoulSoilDepth, GRAVEL),
                                                                        SurfaceRules.ifTrue(SurfaceRules.not(hole), GRAVEL)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                ),
                NETHERRACK
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
