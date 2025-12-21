package net.notjj.ashenterra.world;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.notjj.ashenterra.AshenTerra;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACED = registerKey("lead_ore_placed");
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED = registerKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> TUNGSTEN_ORE_PLACED = registerKey("tungsten_ore_placed");
    public static final RegistryKey<PlacedFeature> PLATINUM_ORE_PLACED = registerKey("platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> METEORITE_ORE_PLACED = registerKey("meteorite_ore_placed");
    public static final RegistryKey<PlacedFeature> DEMONITE_ORE_PLACED = registerKey("demonite_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMTANE_ORE_PLACED = registerKey("crimtane_ore_placed");
    public static final RegistryKey<PlacedFeature> HELLSTONE_ORE_PLACED = registerKey("hellstone_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context,TIN_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-40),YOffset.fixed(70))));
        register(context,LEAD_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.fixed(-60),YOffset.fixed(60))));
        register(context,SILVER_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, HeightRangePlacementModifier.uniform(YOffset.fixed(-70),YOffset.fixed(40))));
        register(context,TUNGSTEN_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, HeightRangePlacementModifier.uniform(YOffset.fixed(-70),YOffset.fixed(40))));
        register(context,PLATINUM_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(-50),YOffset.fixed(15))));
        register(context,METEORITE_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.METEORITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1, HeightRangePlacementModifier.trapezoid(YOffset.fixed(60),YOffset.fixed(76))));
        register(context,DEMONITE_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.DEMONITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(-80),YOffset.fixed(10))));
        register(context,CRIMTANE_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMTANE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(-80),YOffset.fixed(10))));
        register(context,HELLSTONE_ORE_PLACED,configuredFeatures.getOrThrow(ModConfiguredFeatures.HELLSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-5),YOffset.fixed(20))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(AshenTerra.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}