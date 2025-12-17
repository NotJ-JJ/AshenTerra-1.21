package net.notjj.ashenterra.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;

public class ModItems {
    public static final Item RAW_TIN = Register("raw_tin",new Item(new Item.Settings()));
    public static final Item RAW_LEAD = Register("raw_lead",new Item(new Item.Settings()));
    public static final Item RAW_SILVER = Register("raw_silver",new Item(new Item.Settings()));
    public static final Item RAW_TUNGSTEN = Register("raw_tungsten",new Item(new Item.Settings()));
    public static final Item RAW_PLATINUM = Register("raw_platinum",new Item(new Item.Settings()));
    public static final Item DEMONITE = Register("demonite",new Item(new Item.Settings()));
    public static final Item CRIMTANE = Register("crimtane",new Item(new Item.Settings()));
    public static final Item METEORITE_CHUNK = Register("meteorite_chunk",new Item(new Item.Settings()));
    public static final Item HELLSTONE = Register("hellstone",new Item(new Item.Settings()));
    public static final Item RAW_HELLSTONE_ALLOY = Register("raw_hellstone_alloy",new Item(new Item.Settings()));

    public static final Item TIN_INGOT = Register("tin_ingot",new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = Register("lead_ingot",new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = Register("silver_ingot",new Item(new Item.Settings()));
    public static final Item TUNGSTEN_INGOT = Register("tungsten_ingot",new Item(new Item.Settings()));
    public static final Item PLATINUM_INGOT = Register("platinum_ingot",new Item(new Item.Settings()));
    public static final Item DEMONITE_INGOT = Register("demonite_ingot",new Item(new Item.Settings()));
    public static final Item CRIMTANE_INGOT = Register("crimtane_ingot",new Item(new Item.Settings()));
    public static final Item METEORITE_INGOT = Register("meteorite_ingot",new Item(new Item.Settings()));
    public static final Item HELLSTONE_INGOT = Register("hellstone_ingot",new Item(new Item.Settings()));

    public static final Item COPPER_SWORD = Register("copper_sword", new SwordItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER,3,-2.4f))));
    public static final Item TIN_SWORD = Register("tin_sword", new SwordItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER,3,-2.4f))));
    public static final Item LEAD_SWORD = Register("lead_sword", new SwordItem(ToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,3,-2.4f))));
    public static final Item SILVER_SWORD = Register("silver_sword", new SwordItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER,3,-2.4f))));
    public static final Item TUNGSTEN_SWORD = Register("tungsten_sword", new SwordItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER,3,-2.4f))));
    public static final Item PLATINUM_SWORD = Register("platinum_sword", new SwordItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GOLD,3,-2.4f))));
    public static final Item DEMONITE_SWORD = Register("demonite_sword", new SwordItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,3,-2.4f))));
    public static final Item CRIMTANE_SWORD = Register("crimtane_sword", new SwordItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,3,-2.4f))));
    public static final Item HELLSTONE_SWORD = Register("hellstone_sword", new SwordItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,3,-2.4f))));

    public static final Item COPPER_PICKAXE = Register("copper_pickaxe",new PickaxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER,1f,-2.8f))));

    //
    private static Item Register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AshenTerra.MOD_ID,name),item);
    }

    public static void registerModItems() {
        AshenTerra.LOGGER.info("Registering mod items for"+AshenTerra.MOD_ID);
    }
}