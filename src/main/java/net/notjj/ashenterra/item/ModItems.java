package net.notjj.ashenterra.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;

public class ModItems {

    //Ores
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

    //Swords
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

    //Pickaxes
    public static final Item COPPER_PICKAXE = Register("copper_pickaxe",new PickaxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER,1.0f,-2.8f))));
    public static final Item TIN_PICKAXE = Register("tin_pickaxe",new PickaxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER,1.0f,-2.8f))));
    public static final Item LEAD_PICKAXE = Register("lead_pickaxe",new PickaxeItem(ToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON,1.0f,-2.8f))));
    public static final Item SILVER_PICKAXE = Register("silver_pickaxe",new PickaxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER,1.0f,-2.8f))));
    public static final Item TUNGSTEN_PICKAXE = Register("tungsten_pickaxe",new PickaxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER,1.0f,-2.8f))));
    public static final Item PLATINUM_PICKAXE = Register("platinum_pickaxe",new PickaxeItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GOLD,1.0f,-2.8f))));
    public static final Item DEMONITE_PICKAXE = Register("demonite_pickaxe",new PickaxeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND,1.0f,-2.8f))));
    public static final Item CRIMTANE_PICKAXE = Register("crimtane_pickaxe",new PickaxeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND,1.0f,-2.8f))));
    public static final Item HELLSTONE_PICKAXE = Register("hellstone_pickaxe",new PickaxeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND,1.0f,-2.8f))));

    //Axes
    public static final Item COPPER_AXE = Register("copper_axe",new AxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER,6.0f,-3.1f))));
    public static final Item TIN_AXE = Register("tin_axe",new AxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER,6.0f,-3.1f))));
    public static final Item LEAD_AXE = Register("lead_axe",new AxeItem(ToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.IRON,6.0f,-3.1f))));
    public static final Item SILVER_AXE = Register("silver_axe",new AxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER,6.0f,-3.1f))));
    public static final Item TUNGSTEN_AXE = Register("tungsten_axe",new AxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER,6.0f,-3.1f))));
    public static final Item PLATINUM_AXE = Register("platinum_axe",new AxeItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GOLD,6.0f,-3.1f))));
    public static final Item DEMONITE_AXE = Register("demonite_axe",new AxeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.DIAMOND,6.0f,-3.1f))));
    public static final Item CRIMTANE_AXE = Register("crimtane_axe",new AxeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.DIAMOND,6.0f,-3.1f))));
    public static final Item HELLSTONE_AXE = Register("hellstone_axe",new AxeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.DIAMOND,6.0f,-3.1f))));

    //Shovels
    public static final Item COPPER_SHOVEL = Register("copper_shovel",new ShovelItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER,1.5f,-3.0f))));
    public static final Item TIN_SHOVEL = Register("tin_shovel",new ShovelItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER,1.5f,-3.0f))));
    public static final Item LEAD_SHOVEL = Register("lead_shovel",new ShovelItem(ToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.IRON,1.5f,-3.0f))));
    public static final Item SILVER_SHOVEL = Register("silver_shovel",new ShovelItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER,1.5f,-3.0f))));
    public static final Item TUNGSTEN_SHOVEL = Register("tungsten_shovel",new ShovelItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER,1.5f,-3.0f))));
    public static final Item PLATINUM_SHOVEL = Register("platinum_shovel",new ShovelItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GOLD,1.5f,-3.0f))));
    public static final Item DEMONITE_SHOVEL = Register("demonite_shovel",new ShovelItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND,1.5f,-3.0f))));
    public static final Item CRIMTANE_SHOVEL = Register("crimtane_shovel",new ShovelItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND,1.5f,-3.0f))));
    public static final Item HELLSTONE_SHOVEL = Register("hellstone_shovel",new ShovelItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND,1.5f,-3.0f))));

    //Hoes
    public static final Item COPPER_HOE = Register("copper_hoe",new HoeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER,0f,-1.0f))));
    public static final Item TIN_HOE = Register("tin_hoe",new HoeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER,0f,-1.0f))));
    public static final Item LEAD_HOE = Register("lead_hoe",new HoeItem(ToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.IRON,0f,-1.0f))));
    public static final Item SILVER_HOE = Register("silver_hoe",new HoeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER,0f,-1.0f))));
    public static final Item TUNGSTEN_HOE = Register("tungsten_hoe",new HoeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER,0f,-1.0f))));
    public static final Item PLATINUM_HOE = Register("platinum_hoe",new HoeItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GOLD,0f,-1.0f))));
    public static final Item DEMONITE_HOE = Register("demonite_hoe",new HoeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.DIAMOND,0f,-1.0f))));
    public static final Item CRIMTANE_HOE = Register("crimtane_hoe",new HoeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.DIAMOND,0f,-1.0f))));
    public static final Item HELLSTONE_HOE = Register("hellstone_hoe",new HoeItem(ToolMaterials.DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.DIAMOND,0f,-1.0f))));

    //Registering
    private static Item Register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AshenTerra.MOD_ID,name),item);
    }

    public static void registerModItems() {
        AshenTerra.LOGGER.info("Registering mod items for"+AshenTerra.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.TIN_INGOT);
        });
    }
}