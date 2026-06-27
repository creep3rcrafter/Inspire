package net.github.creep3rcrafter.inspire.utils;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class BetterBlockFamily {
    public DyeColor dyeColor;
    public Block ofType;
    public Block main;
    public Block cracked;
    public Block stair;
    public Block slab;
    public Block wall;
    public Block fence;
    public Block fenceGate;
    public Block chiseled;
    public Block pillar;
    public Block door;
    public Block trapdoor;
    public Block button;
    public Block pressurePlate;
    public Block lamp;
    public Block sign;
    public Block hangingSign;
    public Block shelf;
    public Block grate;

    public BetterBlockFamily(
            DyeColor dyeColor,
            @Nullable Block ofType,
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
        this.ofType = ofType;
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
