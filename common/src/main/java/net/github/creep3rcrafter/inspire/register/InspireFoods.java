package net.github.creep3rcrafter.inspire.register;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class InspireFoods {
    public static final FoodProperties CHOCOLATE_MILK;
    public static final FoodProperties SWEET_BERRY_JELLY;
    public static final FoodProperties GLOW_BERRY_JELLY;
    public static final FoodProperties BAKED_NETHER_POTATO;
    public static final FoodProperties BAKED_CARROT;
    public static final FoodProperties BAKED_NETHER_CARROT;
    public static final FoodProperties BAKED_BEETROOT;
    public static final FoodProperties BAKED_NETHER_BEETROOT;
    public static final FoodProperties CARAMEL;
    public static final FoodProperties CARAMEL_APPLE;
    public static final FoodProperties CARAMEL_ENCHANTED_GOLDEN_APPLE;
    public static final FoodProperties CARAMEL_GOLDEN_APPLE;
    public static final FoodProperties GOLDEN_NETHER_CARROT;
    public static final FoodProperties NETHER_POTATO;
    public static final FoodProperties POISONOUS_NETHER_POTATO;
    public static final FoodProperties NETHER_CARROT;
    public static final FoodProperties NETHER_BEETROOT;
    public static final FoodProperties COOKED_TROPICAL_FISH;
    public static final FoodProperties DOUGH;
    public static final FoodProperties SUGAR_COOKIE;
    public static final FoodProperties CREEPER_COOKIE;
    public static final FoodProperties CHOCOLATE_COOKIE;
    public static final FoodProperties NETHER_BEETROOT_SOUP;
    public static final FoodProperties NETHER_CARROT_SOUP;
    public static final FoodProperties NETHER_POTATO_SOUP;
    public static final FoodProperties CARROT_SOUP;
    public static final FoodProperties POTATO_SOUP;
    public static final FoodProperties BEEF_STEW;
    public static final FoodProperties CHICKEN_STEW;
    public static final FoodProperties MUTTON_STEW;
    public static final FoodProperties BAKED_PUMPKIN_SEEDS;
    public static final FoodProperties CHEESE;
    public static final FoodProperties CORN;
    public static final FoodProperties BAKED_CORN;
    public static final FoodProperties POPPED_CORN;
    public static final FoodProperties CARAMEL_CORN;

    static {
        CHOCOLATE_MILK = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.8f)
                .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 1), 1.0f).build();
        SWEET_BERRY_JELLY = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build();
        GLOW_BERRY_JELLY = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build();
        BAKED_CARROT = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.8f).build();
        BAKED_BEETROOT = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.6f).build();
        NETHER_POTATO = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.4F).build();
        POISONOUS_NETHER_POTATO = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3F)
                .effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 0.6F).build();
        NETHER_CARROT = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.7f).build();
        NETHER_BEETROOT = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.7f).build();
        BAKED_NETHER_POTATO = (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.8F).build();
        BAKED_NETHER_CARROT = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.8f).build();
        BAKED_NETHER_BEETROOT = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.8f).build();
        CARAMEL = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1f)
                .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100 / 4, 1), 1.0F).alwaysEdible().build();
        CARAMEL_APPLE = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.4F)
                .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100 / 4, 1), 1.0F).alwaysEdible().build();
        CARAMEL_ENCHANTED_GOLDEN_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(1.2F)
                .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
                .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F)
                .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
                .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F)
                .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100 / 4, 1), 1.0F).alwaysEdible().build();
        CARAMEL_GOLDEN_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(1.2F)
                .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F)
                .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
                .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100 / 4, 1), 1.0F).alwaysEdible().build();
        GOLDEN_NETHER_CARROT = (new FoodProperties.Builder()).nutrition(8).saturationModifier(1.3F).build();
        COOKED_TROPICAL_FISH = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.6F).build();
        DOUGH = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.6F).build();
        SUGAR_COOKIE = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
        CHOCOLATE_COOKIE = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
        CREEPER_COOKIE = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F)
                .effect(new MobEffectInstance(InspireEffects.EXPLOSIVE, 600, 2), 1.0f).build();
        NETHER_BEETROOT_SOUP = stew(8).build();
        NETHER_CARROT_SOUP = stew(9).build();
        NETHER_POTATO_SOUP = stew(10).build();
        CARROT_SOUP = stew(7).build();
        POTATO_SOUP = stew(8).build();
        BEEF_STEW = stew(13).build();
        CHICKEN_STEW = stew(11).build();
        MUTTON_STEW = stew(11).build();
        BAKED_PUMPKIN_SEEDS = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build();
        CHEESE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.8f).build();
        CORN = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.8f).build();
        BAKED_CORN = (new FoodProperties.Builder()).nutrition(5).saturationModifier(1f).build();
        POPPED_CORN = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.2f).build();
        CARAMEL_CORN = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f)
                .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100 / 4, 1), 1.0F).alwaysEdible().build();
    }

    public static FoodProperties.Builder stew(int nutrition) {
        return (new FoodProperties.Builder()).nutrition(nutrition).saturationModifier(0.6F);
    }
}

