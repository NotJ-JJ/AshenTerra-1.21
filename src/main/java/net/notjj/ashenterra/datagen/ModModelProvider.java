package net.notjj.ashenterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.notjj.ashenterra.block.ModBlocks;
import net.notjj.ashenterra.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEMONITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMTANE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.METEORITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HELLSTONE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMTANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.METEORITE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELLSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_HELLSTONE_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMONITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMTANE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.METEORITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELLSTONE_INGOT, Models.GENERATED);
    }
}