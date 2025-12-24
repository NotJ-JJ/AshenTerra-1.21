package net.notjj.ashenterra.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DefaultModEffect extends StatusEffect {
    protected DefaultModEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
