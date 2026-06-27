package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class InspireSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(InspireCommon.MOD_ID, Registries.SOUND_EVENT);
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_A_FAMILIAR_ROOM;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_AERIE;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_ANCESTRY;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_ARIA_MATH;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BIOME_FEST;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BLIND_SPOTS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_CLARK;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_COMFORTING_MEMORIES;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_DANNY;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_DREITON;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_DRY_HANDS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_FEATHERFALL;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_FLOATING_DREAM;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_HAGGSTROM;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_HAUNT_MUSKIE;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_KEY;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_KOMOREBI;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_LEFT_TO_BLOOM;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_LIVING_MICE;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_MICE_ON_VENUS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_MINECRAFT;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_ONE_MORE_DAY;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_OXYGENE;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_PUZZLEBOX;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_SUBWOOFER_LULLABY;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_SWEDEN;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_TASWELL;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_WATCHER;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_WET_HANDS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_YAKUSOKU;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BALLAD_OF_THE_CATS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_CHRYSAPOEIA;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_CONCRETE_HALLS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_DEAD_VOXEL;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_RUBEDO;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_SO_BELOW;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_WARMTH;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BOSS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_ALPHA;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_THE_END;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BEGINNING_2;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BROMELIAD;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_ECHO_IN_THE_WIND;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_ELD_UNKNOWN;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_AN_ORDIANRY_DAY;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BELOW_AND_ABOVE;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_BROKEN_CLOCKS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_CRESCENT_DUNES;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_FIREBUGS;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_FIREFLIES;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_INFINITE_AMETHYST;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_LABYRINTHINE;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_LILYPAD;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_OS_PIANO;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_STAND_TALL;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_WENDING;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_AXOLOTL;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_DRAGON_FISH;
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_SHUNIJI;

    static {
        MUSIC_DISC_A_FAMILIAR_ROOM = SOUND_EVENTS.register("music_disc.a_familiar_room", () -> createSoundEvent("music_disc.a_familiar_room"));
        MUSIC_DISC_AERIE = SOUND_EVENTS.register("music_disc.aerie", () -> createSoundEvent("music_disc.aerie"));
        MUSIC_DISC_ANCESTRY = SOUND_EVENTS.register("music_disc.ancestry", () -> createSoundEvent("music_disc.ancestry"));
        MUSIC_DISC_ARIA_MATH = SOUND_EVENTS.register("music_disc.aria_math", () -> createSoundEvent("music_disc.aria_math"));
        MUSIC_DISC_BIOME_FEST = SOUND_EVENTS.register("music_disc.biome_fest", () -> createSoundEvent("music_disc.biome_fest"));
        MUSIC_DISC_BLIND_SPOTS = SOUND_EVENTS.register("music_disc.blind_spots", () -> createSoundEvent("music_disc.blind_spots"));
        MUSIC_DISC_CLARK = SOUND_EVENTS.register("music_disc.clark", () -> createSoundEvent("music_disc.clark"));
        MUSIC_DISC_COMFORTING_MEMORIES = SOUND_EVENTS.register("music_disc.comforting_memories", () -> createSoundEvent("music_disc.comforting_memories"));
        MUSIC_DISC_DANNY = SOUND_EVENTS.register("music_disc.danny", () -> createSoundEvent("music_disc.danny"));
        MUSIC_DISC_DREITON = SOUND_EVENTS.register("music_disc.dreiton", () -> createSoundEvent("music_disc.dreiton"));
        MUSIC_DISC_DRY_HANDS = SOUND_EVENTS.register("music_disc.dry_hands", () -> createSoundEvent("music_disc.dry_hands"));
        MUSIC_DISC_FEATHERFALL = SOUND_EVENTS.register("music_disc.featherfall", () -> createSoundEvent("music_disc.featherfall"));
        MUSIC_DISC_FLOATING_DREAM = SOUND_EVENTS.register("music_disc.floating_dream", () -> createSoundEvent("music_disc.floating_dream"));
        MUSIC_DISC_HAGGSTROM = SOUND_EVENTS.register("music_disc.haggstrom", () -> createSoundEvent("music_disc.haggstrom"));
        MUSIC_DISC_HAUNT_MUSKIE = SOUND_EVENTS.register("music_disc.haunt_muskie", () -> createSoundEvent("music_disc.haunt_muskie"));
        MUSIC_DISC_KEY = SOUND_EVENTS.register("music_disc.key", () -> createSoundEvent("music_disc.key"));
        MUSIC_DISC_KOMOREBI = SOUND_EVENTS.register("music_disc.komorebi", () -> createSoundEvent("music_disc.komorebi"));
        MUSIC_DISC_LEFT_TO_BLOOM = SOUND_EVENTS.register("music_disc.left_to_bloom", () -> createSoundEvent("music_disc.left_to_bloom"));
        MUSIC_DISC_LIVING_MICE = SOUND_EVENTS.register("music_disc.living_mice", () -> createSoundEvent("music_disc.living_mice"));
        MUSIC_DISC_MICE_ON_VENUS = SOUND_EVENTS.register("music_disc.mice_on_venus", () -> createSoundEvent("music_disc.mice_on_venus"));
        MUSIC_DISC_MINECRAFT = SOUND_EVENTS.register("music_disc.minecraft", () -> createSoundEvent("music_disc.minecraft"));
        MUSIC_DISC_ONE_MORE_DAY = SOUND_EVENTS.register("music_disc.one_more_day", () -> createSoundEvent("music_disc.one_more_day"));
        MUSIC_DISC_OXYGENE = SOUND_EVENTS.register("music_disc.oxygene", () -> createSoundEvent("music_disc.oxygene"));
        MUSIC_DISC_PUZZLEBOX = SOUND_EVENTS.register("music_disc.puzzlebox", () -> createSoundEvent("music_disc.puzzlebox"));
        MUSIC_DISC_SUBWOOFER_LULLABY = SOUND_EVENTS.register("music_disc.subwoofer_lullaby", () -> createSoundEvent("music_disc.subwoofer_lullaby"));
        MUSIC_DISC_SWEDEN = SOUND_EVENTS.register("music_disc.sweden", () -> createSoundEvent("music_disc.sweden"));
        MUSIC_DISC_TASWELL = SOUND_EVENTS.register("music_disc.taswell", () -> createSoundEvent("music_disc.taswell"));
        MUSIC_DISC_WATCHER = SOUND_EVENTS.register("music_disc.watcher", () -> createSoundEvent("music_disc.watcher"));
        MUSIC_DISC_WET_HANDS = SOUND_EVENTS.register("music_disc.wet_hands", () -> createSoundEvent("music_disc.wet_hands"));
        MUSIC_DISC_YAKUSOKU = SOUND_EVENTS.register("music_disc.yakusoku", () -> createSoundEvent("music_disc.yakusoku"));
        MUSIC_DISC_BALLAD_OF_THE_CATS = SOUND_EVENTS.register("music_disc.ballad_of_the_cats", () -> createSoundEvent("music_disc.ballad_of_the_cats"));
        MUSIC_DISC_CHRYSAPOEIA = SOUND_EVENTS.register("music_disc.chrysopoeia", () -> createSoundEvent("music_disc.chrysopoeia"));
        MUSIC_DISC_CONCRETE_HALLS = SOUND_EVENTS.register("music_disc.concrete_halls", () -> createSoundEvent("music_disc.concrete_halls"));
        MUSIC_DISC_DEAD_VOXEL = SOUND_EVENTS.register("music_disc.dead_voxel", () -> createSoundEvent("music_disc.dead_voxel"));
        MUSIC_DISC_RUBEDO = SOUND_EVENTS.register("music_disc.rubedo", () -> createSoundEvent("music_disc.rubedo"));
        MUSIC_DISC_SO_BELOW = SOUND_EVENTS.register("music_disc.so_below", () -> createSoundEvent("music_disc.so_below"));
        MUSIC_DISC_WARMTH = SOUND_EVENTS.register("music_disc.warmth", () -> createSoundEvent("music_disc.warmth"));
        MUSIC_DISC_BOSS = SOUND_EVENTS.register("music_disc.boss", () -> createSoundEvent("music_disc.boss"));
        MUSIC_DISC_ALPHA = SOUND_EVENTS.register("music_disc.alpha", () -> createSoundEvent("music_disc.alpha"));
        MUSIC_DISC_THE_END = SOUND_EVENTS.register("music_disc.the_end", () -> createSoundEvent("music_disc.the_end"));
        MUSIC_DISC_BEGINNING_2 = SOUND_EVENTS.register("music_disc.beginning_2", () -> createSoundEvent("music_disc.beginning_2"));
        MUSIC_DISC_BROMELIAD = SOUND_EVENTS.register("music_disc.bromeliad", () -> createSoundEvent("music_disc.bromeliad"));
        MUSIC_DISC_ECHO_IN_THE_WIND = SOUND_EVENTS.register("music_disc.echo_in_the_wind", () -> createSoundEvent("music_disc.echo_in_the_wind"));
        MUSIC_DISC_ELD_UNKNOWN = SOUND_EVENTS.register("music_disc.eld_unknown", () -> createSoundEvent("music_disc.eld_unknown"));
        MUSIC_DISC_AN_ORDIANRY_DAY = SOUND_EVENTS.register("music_disc.an_ordinary_day", () -> createSoundEvent("music_disc.an_ordinary_day"));
        MUSIC_DISC_BELOW_AND_ABOVE = SOUND_EVENTS.register("music_disc.below_and_above", () -> createSoundEvent("music_disc.below_and_above"));
        MUSIC_DISC_BROKEN_CLOCKS = SOUND_EVENTS.register("music_disc.broken_clocks", () -> createSoundEvent("music_disc.broken_clocks"));
        MUSIC_DISC_CRESCENT_DUNES = SOUND_EVENTS.register("music_disc.crescent_dunes", () -> createSoundEvent("music_disc.crescent_dunes"));
        MUSIC_DISC_FIREBUGS = SOUND_EVENTS.register("music_disc.firebugs", () -> createSoundEvent("music_disc.firebugs"));
        MUSIC_DISC_FIREFLIES = SOUND_EVENTS.register("music_disc.fireflies", () -> createSoundEvent("music_disc.fireflies"));
        MUSIC_DISC_INFINITE_AMETHYST = SOUND_EVENTS.register("music_disc.infinite_amethyst", () -> createSoundEvent("music_disc.infinite_amethyst"));
        MUSIC_DISC_LABYRINTHINE = SOUND_EVENTS.register("music_disc.labyrinthine", () -> createSoundEvent("music_disc.labyrinthine"));
        MUSIC_DISC_LILYPAD = SOUND_EVENTS.register("music_disc.lilypad", () -> createSoundEvent("music_disc.lilypad"));
        MUSIC_DISC_OS_PIANO = SOUND_EVENTS.register("music_disc.os_piano", () -> createSoundEvent("music_disc.os_piano"));
        MUSIC_DISC_STAND_TALL = SOUND_EVENTS.register("music_disc.stand_tall", () -> createSoundEvent("music_disc.stand_tall"));
        MUSIC_DISC_WENDING = SOUND_EVENTS.register("music_disc.wending", () -> createSoundEvent("music_disc.wending"));
        MUSIC_DISC_AXOLOTL = SOUND_EVENTS.register("music_disc.axolotl", () -> createSoundEvent("music_disc.axolotl"));
        MUSIC_DISC_DRAGON_FISH = SOUND_EVENTS.register("music_disc.dragon_fish", () -> createSoundEvent("music_disc.dragon_fish"));
        MUSIC_DISC_SHUNIJI = SOUND_EVENTS.register("music_disc.shuniji", () -> createSoundEvent("music_disc.shuniji"));
    }
    private static SoundEvent createSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, name);
        return SoundEvent.createVariableRangeEvent(id);
    }

    /*
    MUSIC_DISC_A_FAMILIAR_ROOM
    MUSIC_DISC_AERIE
    MUSIC_DISC_ANCESTRY
    MUSIC_DISC_ARIA_MATH
    MUSIC_DISC_BIOME_FEST
    MUSIC_DISC_BLIND_SPOTS
    MUSIC_DISC_CLARK
    MUSIC_DISC_COMFORTING_MEMORIES
    MUSIC_DISC_DANNY
    MUSIC_DISC_DREITON
    MUSIC_DISC_DRY_HANDS
    MUSIC_DISC_FEATHERFALL
    MUSIC_DISC_FLOATING_DREAM
    MUSIC_DISC_HAGGSTROM
    MUSIC_DISC_HAUNT_MUSKIE
    MUSIC_DISC_KEY
    MUSIC_DISC_KOMOREBI
    MUSIC_DISC_LEFT_TO_BLOOM
    MUSIC_DISC_LIVING_MICE
    MUSIC_DISC_MICE_ON_VENUS
    MUSIC_DISC_MINECRAFT
    MUSIC_DISC_ONE_MORE_DAY
    MUSIC_DISC_OXYGENE
    MUSIC_DISC_PUZZLEBOX
    MUSIC_DISC_SUBWOOFER_LULLABY
    MUSIC_DISC_SWEDEN
    MUSIC_DISC_TASWELL
    MUSIC_DISC_WATCHER
    MUSIC_DISC_WET_HANDS
    MUSIC_DISC_YAKUSOKU
    MUSIC_DISC_BALLAD_OF_THE_CATS
    MUSIC_DISC_CHRYSAPOEIA
    MUSIC_DISC_CONCRETE_HALLS
    MUSIC_DISC_DEAD_VOXEL
    MUSIC_DISC_RUBEDO
    MUSIC_DISC_SO_BELOW
    MUSIC_DISC_WARMTH
    MUSIC_DISC_BOSS
    MUSIC_DISC_ALPHA
    MUSIC_DISC_THE_END
    MUSIC_DISC_BEGINNING_2

    missing---------------------------------
    bromeliad
    echo_in_the_wind
    eld_unknown
    an_ordinary_day
    below_and_above
    broken_clocks
    crescent_dunes
    firebugs
    fireflies
    infinite_amethyst
    labyrinthine
    lilypad
    os_piano
    stand_tall
    wending
    axolotl
    dragon_fish
    shuniji
    */
}
