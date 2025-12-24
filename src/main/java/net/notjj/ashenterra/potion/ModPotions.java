package net.notjj.ashenterra.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;
import net.notjj.ashenterra.effect.ModEffects;

public class ModPotions {

    public static final RegistryEntry<Potion> TITAN_POTION = registerPotion("titan_potion",
            new Potion(new StatusEffectInstance(ModEffects.TITAN,1200,0)));
    public static final RegistryEntry<Potion> STRONG_TITAN_POTION = registerPotion("strong_titan_potion",
            new Potion(new StatusEffectInstance(ModEffects.TITAN,1200,1)));
    public static final RegistryEntry<Potion> LONG_TITAN_POTION = registerPotion("long_titan_potion",
            new Potion(new StatusEffectInstance(ModEffects.TITAN,3600,0)));


    public static final RegistryEntry<Potion> THORNS_POTION = registerPotion("thorns_potion",
            new Potion(new StatusEffectInstance(ModEffects.THORNS,1200,0)));
    public static final RegistryEntry<Potion> STRONG_THORNS_POTION = registerPotion("strong_thorns_potion",
            new Potion(new StatusEffectInstance(ModEffects.THORNS,1200,1)));
    public static final RegistryEntry<Potion> LONG_THORNS_POTION = registerPotion("long_thorns_potion",
            new Potion(new StatusEffectInstance(ModEffects.THORNS,3600,0)));


    public static final RegistryEntry<Potion> IRONSKIN_POTION = registerPotion("ironskin_potion",
            new Potion(new StatusEffectInstance(ModEffects.IRONSKIN,2400,0)));
    public static final RegistryEntry<Potion> STRONG_IRONSKIN_POTION = registerPotion("strong_ironskin_potion",
            new Potion(new StatusEffectInstance(ModEffects.IRONSKIN,2400,1)));
    public static final RegistryEntry<Potion> LONG_IRONSKIN_POTION = registerPotion("long_ironskin_potion",
            new Potion(new StatusEffectInstance(ModEffects.IRONSKIN,7200,0)));

    private static RegistryEntry<Potion> registerPotion(String name,Potion potion){
        return Registry.registerReference(Registries.POTION, Identifier.of(AshenTerra.MOD_ID,name),potion);
    }

    public static void registerPotions(){
        AshenTerra.LOGGER.info("Registering potions for "+AshenTerra.MOD_ID);
    }
}
