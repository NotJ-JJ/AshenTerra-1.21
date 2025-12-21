package net.notjj.ashenterra.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METEORITE_REPLACEABLE = createTag("meteorite_replaceable");
        public static final TagKey<Block> HELLSTONE_REPLACEABLE = createTag("hellstone_replaceable");

        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> NEEDS_SILVER_TOOL = createTag("needs_silver_tool");
        public static final TagKey<Block> NEEDS_GOLD_TOOL = createTag("needs_gold_tool");

        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_IRON_TOOL = createTag("incorrect_for_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");
        public static final TagKey<Block> INCORRECT_FOR_GOLD_TOOL = createTag("incorrect_for_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_DEMONITE_TOOL = createTag("incorrect_for_demonite_tool");
        public static final TagKey<Block> INCORRECT_FOR_MOLTEN_TOOL = createTag("incorrect_for_molten_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AshenTerra.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> COPPER_TIER_INGOTS = createTag("copper_tier_ingots");
        public static final TagKey<Item> IRON_TIER_INGOTS = createTag("iron_tier_ingots");
        public static final TagKey<Item> SILVER_TIER_INGOTS = createTag("silver_tier_ingots");
        public static final TagKey<Item> GOLD_TIER_INGOTS = createTag("gold_tier_ingots");
        public static final TagKey<Item> DEMONITE_TIER_INGOTS = createTag("demonite_tier_ingots");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(AshenTerra.MOD_ID, name));
        }
    }
}
