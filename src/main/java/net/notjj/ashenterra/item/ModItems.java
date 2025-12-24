package net.notjj.ashenterra.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;

public class ModItems {

    //Foods
    public static final Item APRICOT = Register("apricot",new Item(new Item.Settings().food(ModFoodComponents.APRICOT)));
    public static final Item BANANA = Register("banana",new Item(new Item.Settings().food(ModFoodComponents.BANANA)));
    public static final Item GRAPEFRUIT = Register("grapefruit",new Item(new Item.Settings().food(ModFoodComponents.GRAPEFRUIT)));
    public static final Item BLOOD_ORANGE = Register("blood_orange",new Item(new Item.Settings().food(ModFoodComponents.BLOOD_ORANGE)));
    public static final Item BLACKCURRANT = Register("blackcurrant",new Item(new Item.Settings().food(ModFoodComponents.BLACKCURRANT)));
    public static final Item CHERRY = Register("cherry",new Item(new Item.Settings().food(ModFoodComponents.CHERRY)));
    public static final Item COCONUT = Register("coconut",new Item(new Item.Settings().food(ModFoodComponents.COCONUT)));
    public static final Item LEMON = Register("lemon",new Item(new Item.Settings().food(ModFoodComponents.LEMON)));
    public static final Item MANGO = Register("manga",new Item(new Item.Settings().food(ModFoodComponents.MANGO)));
    public static final Item PEACH = Register("peach",new Item(new Item.Settings().food(ModFoodComponents.PEACH)));
    public static final Item DRAGON_FRUIT = Register("dragon_fruit",new Item(new Item.Settings().food(ModFoodComponents.DRAGON_FRUIT)));
    public static final Item ELDERBERRY = Register("elderberry",new Item(new Item.Settings().food(ModFoodComponents.ELDERBERRY)));
    public static final Item PINEAPPLE = Register("pineapple",new Item(new Item.Settings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item PLUM = Register("plum",new Item(new Item.Settings().food(ModFoodComponents.PLUM)));
    public static final Item POMEGRANATE = Register("pomegranate",new Item(new Item.Settings().food(ModFoodComponents.POMEGRANATE)));
    public static final Item CHICKEN_NUGGET = Register("chicken_nugget",new Item(new Item.Settings().food(ModFoodComponents.CHICKEN_NUGGET)));
    public static final Item FRIED_EGG = Register("fried_egg",new Item(new Item.Settings().food(ModFoodComponents.FRIED_EGG)));
    public static final Item GRAPES = Register("grapes",new Item(new Item.Settings().food(ModFoodComponents.GRAPES)));

    public static final Item RAMBUTAN = Register("rambutan",new Item(new Item.Settings().food(ModFoodComponents.RAMBUTAN)));
    public static final Item SPICY_PEPPER = Register("spicy_pepper",new Item(new Item.Settings().food(ModFoodComponents.SPICY_PEPPER)));
    public static final Item STAR_FRUIT = Register("star_fruit",new Item(new Item.Settings().food(ModFoodComponents.STAR_FRUIT)));
    public static final Item COFFEE = Register("coffee",new Item(new Item.Settings().food(ModFoodComponents.COFFEE)));
    public static final Item SHUCKED_OYSTER = Register("shucked_oyster",new Item(new Item.Settings().food(ModFoodComponents.SHUCKED_OYSTER)));
    public static final Item STEAK = Register("steak",new Item(new Item.Settings().food(ModFoodComponents.STEAK)));
    public static final Item MARSHMALLOW = Register("marshmallow",new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW)));
    public static final Item BACON = Register("bacon",new Item(new Item.Settings().food(ModFoodComponents.BACON)));

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
    public static final Item LEAD_SWORD = Register("lead_sword", new SwordItem(ModToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON,3,-2.4f))));
    public static final Item SILVER_SWORD = Register("silver_sword", new SwordItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER,3,-2.4f))));
    public static final Item TUNGSTEN_SWORD = Register("tungsten_sword", new SwordItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER,3,-2.4f))));
    public static final Item PLATINUM_SWORD = Register("platinum_sword", new SwordItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GOLD,3,-2.4f))));
    public static final Item DEMONITE_SWORD = Register("demonite_sword", new SwordItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.DEMONITE,3,-2.4f))));
    public static final Item CRIMTANE_SWORD = Register("crimtane_sword", new SwordItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.DEMONITE,3,-2.4f))));
    public static final Item MOLTEN_SWORD = Register("molten_sword", new SwordItem(ModToolMaterials.MOLTEN,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MOLTEN,3,-2.4f))));

    //Pickaxes
    public static final Item COPPER_PICKAXE = Register("copper_pickaxe",new PickaxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER,1.0f,-2.8f))));
    public static final Item TIN_PICKAXE = Register("tin_pickaxe",new PickaxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER,1.0f,-2.8f))));
    public static final Item LEAD_PICKAXE = Register("lead_pickaxe",new PickaxeItem(ModToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON,1.0f,-2.8f))));
    public static final Item SILVER_PICKAXE = Register("silver_pickaxe",new PickaxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER,1.0f,-2.8f))));
    public static final Item TUNGSTEN_PICKAXE = Register("tungsten_pickaxe",new PickaxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER,1.0f,-2.8f))));
    public static final Item PLATINUM_PICKAXE = Register("platinum_pickaxe",new PickaxeItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GOLD,1.0f,-2.8f))));
    public static final Item DEMONITE_PICKAXE = Register("demonite_pickaxe",new PickaxeItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.DEMONITE,1.0f,-2.8f))));
    public static final Item CRIMTANE_PICKAXE = Register("crimtane_pickaxe",new PickaxeItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.DEMONITE,1.0f,-2.8f))));
    public static final Item MOLTEN_PICKAXE = Register("molten_pickaxe",new PickaxeItem(ModToolMaterials.MOLTEN,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MOLTEN,1.0f,-2.8f))));

    //Axes
    public static final Item COPPER_AXE = Register("copper_axe",new AxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER,6.0f,-3.1f))));
    public static final Item TIN_AXE = Register("tin_axe",new AxeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER,6.0f,-3.1f))));
    public static final Item LEAD_AXE = Register("lead_axe",new AxeItem(ModToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON,6.0f,-3.1f))));
    public static final Item SILVER_AXE = Register("silver_axe",new AxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER,6.0f,-3.1f))));
    public static final Item TUNGSTEN_AXE = Register("tungsten_axe",new AxeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER,6.0f,-3.1f))));
    public static final Item PLATINUM_AXE = Register("platinum_axe",new AxeItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GOLD,6.0f,-3.1f))));
    public static final Item DEMONITE_AXE = Register("demonite_axe",new AxeItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.DEMONITE,6.0f,-3.1f))));
    public static final Item CRIMTANE_AXE = Register("crimtane_axe",new AxeItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.DEMONITE,6.0f,-3.1f))));
    public static final Item MOLTEN_AXE = Register("molten_axe",new AxeItem(ModToolMaterials.MOLTEN,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MOLTEN,6.0f,-3.1f))));

    //Shovels
    public static final Item COPPER_SHOVEL = Register("copper_shovel",new ShovelItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER,1.5f,-3.0f))));
    public static final Item TIN_SHOVEL = Register("tin_shovel",new ShovelItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER,1.5f,-3.0f))));
    public static final Item LEAD_SHOVEL = Register("lead_shovel",new ShovelItem(ModToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON,1.5f,-3.0f))));
    public static final Item SILVER_SHOVEL = Register("silver_shovel",new ShovelItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER,1.5f,-3.0f))));
    public static final Item TUNGSTEN_SHOVEL = Register("tungsten_shovel",new ShovelItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER,1.5f,-3.0f))));
    public static final Item PLATINUM_SHOVEL = Register("platinum_shovel",new ShovelItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GOLD,1.5f,-3.0f))));
    public static final Item DEMONITE_SHOVEL = Register("demonite_shovel",new ShovelItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.DEMONITE,1.5f,-3.0f))));
    public static final Item CRIMTANE_SHOVEL = Register("crimtane_shovel",new ShovelItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.DEMONITE,1.5f,-3.0f))));
    public static final Item MOLTEN_SHOVEL = Register("molten_shovel",new ShovelItem(ModToolMaterials.MOLTEN,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MOLTEN,1.5f,-3.0f))));

    //Hoes
    public static final Item COPPER_HOE = Register("copper_hoe",new HoeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER,0f,-1.0f))));
    public static final Item TIN_HOE = Register("tin_hoe",new HoeItem(ModToolMaterials.COPPER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER,0f,-1.0f))));
    public static final Item LEAD_HOE = Register("lead_hoe",new HoeItem(ModToolMaterials.IRON,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON,0f,-1.0f))));
    public static final Item SILVER_HOE = Register("silver_hoe",new HoeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER,0f,-1.0f))));
    public static final Item TUNGSTEN_HOE = Register("tungsten_hoe",new HoeItem(ModToolMaterials.SILVER,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER,0f,-1.0f))));
    public static final Item PLATINUM_HOE = Register("platinum_hoe",new HoeItem(ModToolMaterials.GOLD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GOLD,0f,-1.0f))));
    public static final Item DEMONITE_HOE = Register("demonite_hoe",new HoeItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.DEMONITE,0f,-1.0f))));
    public static final Item CRIMTANE_HOE = Register("crimtane_hoe",new HoeItem(ModToolMaterials.DEMONITE,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.DEMONITE,0f,-1.0f))));
    public static final Item MOLTEN_HOE = Register("molten_hoe",new HoeItem(ModToolMaterials.MOLTEN,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MOLTEN,0f,-1.0f))));

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