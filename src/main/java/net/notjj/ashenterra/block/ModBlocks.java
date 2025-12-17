package net.notjj.ashenterra.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;

public class ModBlocks {
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool()));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(AbstractBlock.Settings.create().strength(4.5f,3.0f).requiresTool()));

    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool()));
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new Block(AbstractBlock.Settings.create().strength(4.5f,3.0f).requiresTool()));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool()));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(AbstractBlock.Settings.create().strength(4.5f,3.0f).requiresTool()));

    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore",
            new Block(AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool()));
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            new Block(AbstractBlock.Settings.create().strength(4.5f,3.0f).requiresTool()));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new Block(AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool()));
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new Block(AbstractBlock.Settings.create().strength(4.5f,3.0f).requiresTool()));

    public static final Block DEMONITE_ORE = registerBlock("demonite_ore",
            new Block(AbstractBlock.Settings.create().strength(15.0F, 1200.0F).requiresTool()));

    public static final Block CRIMTANE_ORE = registerBlock("crimtane_ore",
            new Block(AbstractBlock.Settings.create().strength(15.0F, 1200.0F).requiresTool()));

    public static final Block METEORITE = registerBlock("meteorite",
            new Block(AbstractBlock.Settings.create().strength(10.0F, 1500.0F).requiresTool()));

    public static final Block HELLSTONE_ORE = registerBlock("hellstone_ore",
            new Block(AbstractBlock.Settings.create().strength(18.0F, 10.0F).requiresTool()));

    //Registries
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(AshenTerra.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AshenTerra.MOD_ID,name),new BlockItem(block,new Item.Settings()));
    }

    public static void registerModBlocks() {
        AshenTerra.LOGGER.info("Registering blocks for"+AshenTerra.MOD_ID);
    }
}
