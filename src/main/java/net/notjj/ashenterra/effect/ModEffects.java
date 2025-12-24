package net.notjj.ashenterra.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> TITAN = registerStatusEffect("titan",
            new TitanEffect(StatusEffectCategory.BENEFICIAL,16762624).addAttributeModifier(EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
                    Identifier.of(AshenTerra.MOD_ID),1.5f,EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    //public static final RegistryEntry<StatusEffect> IRONSKIN = registerStatusEffect("ironskin",
    //        new IronskinEffect(StatusEffectCategory.BENEFICIAL,16762624).addAttributeModifier(EntityAttributes.GENERIC_ARMOR,
    //                Identifier.of(AshenTerra.MOD_ID),2f,EntityAttributeModifier.Operation.ADD_VALUE));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(AshenTerra.MOD_ID,name),statusEffect);
    }

    public static void registerEffects(){
        AshenTerra.LOGGER.info("Registering effects for "+AshenTerra.MOD_ID);
    }
}
