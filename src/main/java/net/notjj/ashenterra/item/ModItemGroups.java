package net.notjj.ashenterra.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;

public class ModItemGroups {
    public static final ItemGroup ASHENTERRA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AshenTerra.MOD_ID,"ashenterra_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_TIN))
                    .displayName(Text.translatable("itemgroup.ashenterra.ashen_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.DEMONITE);
                        entries.add(ModItems.CRIMTANE);
                        entries.add(ModItems.METEORITE);
                        entries.add(ModItems.HELLSTONE);
                    })
                    .build());

    public static void registerItemGroups() {
        AshenTerra.LOGGER.info("Registering mod item groups for"+AshenTerra.MOD_ID);
    }
}
