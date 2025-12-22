package net.notjj.ashenterra.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.notjj.ashenterra.AshenTerra;
import net.notjj.ashenterra.block.ModBlocks;
import net.notjj.ashenterra.util.ModTags;

import java.util.List;
import java.util.Random;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> METEORITE_ORE_KEY = registerKey("meteorite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DEMONITE_ORE_KEY = registerKey("demonite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> CRIMTANE_ORE_KEY = registerKey("crimtane_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> HELLSTONE_ORE_KEY = registerKey("hellstone_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context) {
        RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest hellstoneReplaceable = new TagMatchRuleTest(ModTags.Blocks.HELLSTONE_REPLACEABLE);
        RuleTest meteoriteReplaceable = new TagMatchRuleTest(ModTags.Blocks.METEORITE_REPLACEABLE);

        List<OreFeatureConfig.Target> tinReplaceables =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.TIN_ORE.getDefaultState()),
                (OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState())));
        List<OreFeatureConfig.Target> leadReplaceables =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.LEAD_ORE.getDefaultState()),
                        (OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_LEAD_ORE.getDefaultState())));
        List<OreFeatureConfig.Target> silverReplaceables =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.SILVER_ORE.getDefaultState()),
                        (OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState())));
        List<OreFeatureConfig.Target> tungstenReplaceables =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.TUNGSTEN_ORE.getDefaultState()),
                        (OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.getDefaultState())));
        List<OreFeatureConfig.Target> platinumReplaceables =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.PLATINUM_ORE.getDefaultState()),
                        (OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState())));
        //List<OreFeatureConfig.Target> meteoriteReplaceables =
                //List.of(OreFeatureConfig.createTarget(meteoriteReplaceable, ModBlocks.METEORITE.getDefaultState()));
        List<OreFeatureConfig.Target> demoniteReplaceables =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.DEMONITE_ORE.getDefaultState()),
                        (OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEMONITE_ORE.getDefaultState())));
        List<OreFeatureConfig.Target> crimtaneReplaceables =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.CRIMTANE_ORE.getDefaultState()),
                        (OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.CRIMTANE_ORE.getDefaultState())));
        List<OreFeatureConfig.Target> hellstoneReplaceables =
                List.of(OreFeatureConfig.createTarget(hellstoneReplaceable, ModBlocks.HELLSTONE_ORE.getDefaultState()));

        register(context,TIN_ORE_KEY,Feature.ORE,new OreFeatureConfig(tinReplaceables,10));
        register(context,LEAD_ORE_KEY,Feature.ORE,new OreFeatureConfig(leadReplaceables,6));
        register(context,SILVER_ORE_KEY,Feature.ORE,new OreFeatureConfig(silverReplaceables,5));
        register(context,TUNGSTEN_ORE_KEY,Feature.ORE,new OreFeatureConfig(tungstenReplaceables,5));
        register(context,PLATINUM_ORE_KEY,Feature.ORE,new OreFeatureConfig(platinumReplaceables,4));
        //register(context,METEORITE_ORE_KEY,Feature.SCATTERED_ORE,new OreFeatureConfig(meteoriteReplaceables,14,0.6f));
        register(context,DEMONITE_ORE_KEY,Feature.ORE,new OreFeatureConfig(demoniteReplaceables,3));
        register(context,CRIMTANE_ORE_KEY,Feature.ORE,new OreFeatureConfig(crimtaneReplaceables,3));
        register(context,HELLSTONE_ORE_KEY,Feature.ORE,new OreFeatureConfig(hellstoneReplaceables,7,0.4f));
    }

    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(AshenTerra.MOD_ID,name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?,?>>key,F feature, FC configuration) {
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}
