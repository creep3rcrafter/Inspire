package net.github.creep3rcrafter.inspire.utils;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class BetterBlockFamily {
    public @Nullable DyeColor dyeColor;
    public @Nullable Block main;
    public @Nullable Block cracked;
    public @Nullable Block stair;
    public @Nullable Block slab;
    public @Nullable Block wall;
    public @Nullable Block fence;
    public @Nullable Block fenceGate;
    public @Nullable Block chiseled;
    public @Nullable Block pillar;
    public @Nullable Block door;
    public @Nullable Block trapdoor;
    public @Nullable Block button;
    public @Nullable Block pressurePlate;
    public @Nullable Block lamp;
    public @Nullable Block sign;
    public @Nullable Block hangingSign;
    public @Nullable Block shelf;
    public @Nullable Block grate;

    public BetterBlockFamily(
            @Nullable DyeColor dyeColor,
            @Nullable Block main,
            @Nullable Block cracked,
            @Nullable Block stair,
            @Nullable Block slab,
            @Nullable Block wall,
            @Nullable Block fence,
            @Nullable Block fenceGate,
            @Nullable Block chiseled,
            @Nullable Block pillar,
            @Nullable Block door,
            @Nullable Block trapdoor,
            @Nullable Block button,
            @Nullable Block pressurePlate,
            @Nullable Block lamp,
            @Nullable Block sign,
            @Nullable Block hangingSign,
            @Nullable Block shelf,
            @Nullable Block grate){
        this.dyeColor = dyeColor;
        this.main = main;
        this.cracked = cracked;
        this.stair = stair;
        this.slab = slab;
        this.wall = wall;
        this.fence = fence;
        this.fenceGate = fenceGate;
        this.chiseled = chiseled;
        this.pillar = pillar;
        this.door = door;
        this.trapdoor = trapdoor;
        this.button = button;
        this.pressurePlate = pressurePlate;
        this.lamp = lamp;
        this.sign = sign;
        this.hangingSign = hangingSign;
        this.shelf = shelf;
        this.grate = grate;
    }
}
