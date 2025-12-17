package net.notjj.ashenterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.notjj.ashenterra.block.ModBlocks;
import net.notjj.ashenterra.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TIN_ORE,oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE,oreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.LEAD_ORE,oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.DEEPSLATE_LEAD_ORE,oreDrops(ModBlocks.DEEPSLATE_LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.SILVER_ORE,oreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.DEEPSLATE_SILVER_ORE,oreDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.TUNGSTEN_ORE,oreDrops(ModBlocks.TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN));
        addDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE,oreDrops(ModBlocks.DEEPSLATE_TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN));
        addDrop(ModBlocks.PLATINUM_ORE,oreDrops(ModBlocks.PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE,oreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.DEMONITE_ORE,oreDrops(ModBlocks.DEMONITE_ORE, ModItems.DEMONITE));
        addDrop(ModBlocks.CRIMTANE_ORE,oreDrops(ModBlocks.CRIMTANE_ORE, ModItems.CRIMTANE));
        addDrop(ModBlocks.METEORITE,oreDrops(ModBlocks.METEORITE, ModItems.METEORITE_CHUNK));
        addDrop(ModBlocks.HELLSTONE_ORE,oreDrops(ModBlocks.HELLSTONE_ORE, ModItems.HELLSTONE));
    }
}
