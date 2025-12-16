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
    public static final Item METEORITE = Register("meteorite",new Item(new Item.Settings()));
    public static final Item HELLSTONE = Register("hellstone",new Item(new Item.Settings()));

    private static Item Register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AshenTerra.MOD_ID,name),item);
    }

    public static void registerModItems() {
        AshenTerra.LOGGER.info("Registering mod items for"+AshenTerra.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.RAW_TIN);
        });
    }
}
