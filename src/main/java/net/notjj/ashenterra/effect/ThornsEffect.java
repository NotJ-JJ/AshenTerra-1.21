package net.notjj.ashenterra.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ThornsEffect extends StatusEffect {
    protected ThornsEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }    @Override
    public void onEntityDamage(LivingEntity entity, int amplifier, DamageSource source, float amount) {
        if (source.getAttacker()!=null){
            if (entity.getStatusEffect(ModEffects.THORNS).getAmplifier()>=1){
                source.getAttacker().damage(entity.getDamageSources().thorns(entity),entity.getStatusEffect(ModEffects.THORNS).getAmplifier()*3);
            }else {
                source.getAttacker().damage(entity.getDamageSources().thorns(entity),3);
            }
        }
        super.onEntityDamage(entity, amplifier, source, amount);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
