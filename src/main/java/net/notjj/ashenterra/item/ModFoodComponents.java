package net.notjj.ashenterra.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    //Normal foods
    public static final FoodComponent APRICOT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25F).build();
    public static final FoodComponent COCONUT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent DRAGON_FRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent ELDERBERRY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent BLOOD_ORANGE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent LEMON = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();

    public static final FoodComponent RAMBUTAN = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 8000, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 200), 1.0F).build();

    public static final FoodComponent SPICY_PEPPER = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1), 1.0F).build();

    public static final FoodComponent STAR_FRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 800), 1.0F).build();

    public static final FoodComponent COFFEE = new FoodComponent.Builder().nutrition(0).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100), 1.0F).build();

    public static final FoodComponent SHUCKED_OYSTER = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 6000), 1.0F).build();

    public static final FoodComponent STEAK = new FoodComponent.Builder().nutrition(4).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000), 1.0F).build();

    public static final FoodComponent MARSHMALLOW = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 4), 1.0F).build();

    public static final FoodComponent BACON = new FoodComponent.Builder().nutrition(5).saturationModifier(0.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2000, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 8), 1.0F).build();
}
