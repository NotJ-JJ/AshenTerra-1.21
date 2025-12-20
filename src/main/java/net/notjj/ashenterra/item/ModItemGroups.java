package net.notjj.ashenterra.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.notjj.ashenterra.AshenTerra;
import net.notjj.ashenterra.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ASHENTERRA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AshenTerra.MOD_ID,"ashenterra_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MOLTEN_PICKAXE))
                    .displayName(Text.translatable("itemgroup.ashenterra.ashen_items"))
                    .entries((displayContext, entries) -> {
                        //Items

                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.DEMONITE);
                        entries.add(ModItems.CRIMTANE);
                        entries.add(ModItems.METEORITE_CHUNK);
                        entries.add(ModItems.HELLSTONE);
                        entries.add(ModItems.RAW_HELLSTONE_ALLOY);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.DEMONITE_INGOT);
                        entries.add(ModItems.CRIMTANE_INGOT);
                        entries.add(ModItems.METEORITE_INGOT);
                        entries.add(ModItems.HELLSTONE_INGOT);

                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_PICKAXE);

                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_HOE);
                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_SWORD);

                        entries.add(ModItems.LEAD_AXE);
                        entries.add(ModItems.LEAD_HOE);
                        entries.add(ModItems.LEAD_PICKAXE);
                        entries.add(ModItems.LEAD_SHOVEL);
                        entries.add(ModItems.LEAD_SWORD);

                        entries.add(ModItems.SILVER_HOE);
                        entries.add(ModItems.SILVER_AXE);
                        entries.add(ModItems.SILVER_PICKAXE);
                        entries.add(ModItems.SILVER_SHOVEL);
                        entries.add(ModItems.SILVER_SWORD);

                        entries.add(ModItems.TUNGSTEN_AXE);
                        entries.add(ModItems.TUNGSTEN_HOE);
                        entries.add(ModItems.TUNGSTEN_PICKAXE);
                        entries.add(ModItems.TUNGSTEN_SHOVEL);
                        entries.add(ModItems.TUNGSTEN_SWORD);

                        entries.add(ModItems.PLATINUM_AXE);
                        entries.add(ModItems.PLATINUM_HOE);
                        entries.add(ModItems.PLATINUM_PICKAXE);
                        entries.add(ModItems.PLATINUM_SHOVEL);
                        entries.add(ModItems.PLATINUM_SWORD);

                        entries.add(ModItems.DEMONITE_AXE);
                        entries.add(ModItems.DEMONITE_HOE);
                        entries.add(ModItems.DEMONITE_PICKAXE);
                        entries.add(ModItems.DEMONITE_SHOVEL);
                        entries.add(ModItems.DEMONITE_SWORD);

                        entries.add(ModItems.CRIMTANE_AXE);
                        entries.add(ModItems.CRIMTANE_HOE);
                        entries.add(ModItems.CRIMTANE_PICKAXE);
                        entries.add(ModItems.CRIMTANE_SHOVEL);
                        entries.add(ModItems.CRIMTANE_SWORD);

                        entries.add(ModItems.MOLTEN_AXE);
                        entries.add(ModItems.MOLTEN_SHOVEL);
                        entries.add(ModItems.MOLTEN_HOE);
                        entries.add(ModItems.MOLTEN_PICKAXE);
                        entries.add(ModItems.MOLTEN_SWORD);

                        //Blocks
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);
                        entries.add(ModBlocks.DEMONITE_ORE);
                        entries.add(ModBlocks.CRIMTANE_ORE);
                        entries.add(ModBlocks.METEORITE);
                        entries.add(ModBlocks.HELLSTONE_ORE);
                    })
                    .build());

    public static void registerItemGroups() {
        AshenTerra.LOGGER.info("Registering mod item groups for"+AshenTerra.MOD_ID);
    }
}