package net.notjj.ashenterra.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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


    private static Item Register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AshenTerra.MOD_ID,name),item);
    }

    public static void registerModItems() {
        AshenTerra.LOGGER.info("Registering mod items for"+AshenTerra.MOD_ID);
    }
}