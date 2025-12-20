package net.notjj.ashenterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.notjj.ashenterra.block.ModBlocks;
import net.notjj.ashenterra.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.DEEPSLATE_LEAD_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.TUNGSTEN_ORE)
                .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(ModBlocks.DEMONITE_ORE)
                .add(ModBlocks.CRIMTANE_ORE)
                .add(ModBlocks.METEORITE)
                .add(ModBlocks.HELLSTONE_ORE);

        //Correct for
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.HELLSTONE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_GOLD_TOOL)
                .add(ModBlocks.DEMONITE_ORE)
                .add(ModBlocks.CRIMTANE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_SILVER_TOOL)
                .add(ModBlocks.METEORITE)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TUNGSTEN_ORE)
                .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_COPPER_TOOL)
                .add(Blocks.IRON_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.DEEPSLATE_LEAD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE);

        //Incorrect for
        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_MOLTEN_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_DEMONITE_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_GOLD_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL)
                .addTag(ModTags.Blocks.NEEDS_GOLD_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .addTag(ModTags.Blocks.NEEDS_SILVER_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_IRON_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_COPPER_TOOL);
    }
}
