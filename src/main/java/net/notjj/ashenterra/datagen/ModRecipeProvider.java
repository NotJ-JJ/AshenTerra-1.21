package net.notjj.ashenterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.notjj.ashenterra.item.ModItems;

import javax.lang.model.type.TypeVariable;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private void sword(Item pickaxe, Item ingot, RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(recipeExporter);
    }

    private void pickaxe(Item pickaxe, Item ingot, RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(recipeExporter);
    }

    private void axe(Item pickaxe, Item ingot, RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(recipeExporter);
    }

    private void shovel(Item pickaxe, Item ingot, RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(recipeExporter);
    }

    private void hoe(Item pickaxe, Item ingot, RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(recipeExporter);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_HELLSTONE_ALLOY)
                .input(ModItems.HELLSTONE).input(ModItems.HELLSTONE).input(Items.OBSIDIAN)
                .criterion(hasItem(ModItems.HELLSTONE),conditionsFromItem(ModItems.HELLSTONE)).offerTo(recipeExporter);

        //Tool recipes
        sword(ModItems.COPPER_SWORD,Items.COPPER_INGOT, recipeExporter);
        sword(ModItems.TIN_SWORD,ModItems.TIN_INGOT, recipeExporter);
        sword(ModItems.LEAD_SWORD,ModItems.LEAD_INGOT, recipeExporter);
        sword(ModItems.SILVER_SWORD,ModItems.SILVER_INGOT, recipeExporter);
        sword(ModItems.TUNGSTEN_SWORD,ModItems.TUNGSTEN_INGOT, recipeExporter);
        sword(ModItems.PLATINUM_SWORD,ModItems.PLATINUM_INGOT, recipeExporter);
        sword(ModItems.DEMONITE_SWORD,ModItems.DEMONITE_INGOT, recipeExporter);
        sword(ModItems.CRIMTANE_SWORD,ModItems.CRIMTANE_INGOT, recipeExporter);
        sword(ModItems.MOLTEN_SWORD,ModItems.HELLSTONE_INGOT, recipeExporter);

        pickaxe(ModItems.COPPER_PICKAXE,Items.COPPER_INGOT, recipeExporter);
        pickaxe(ModItems.TIN_PICKAXE,ModItems.TIN_INGOT, recipeExporter);
        pickaxe(ModItems.LEAD_PICKAXE,ModItems.LEAD_INGOT, recipeExporter);
        pickaxe(ModItems.SILVER_PICKAXE,ModItems.SILVER_INGOT, recipeExporter);
        pickaxe(ModItems.TUNGSTEN_PICKAXE,ModItems.TUNGSTEN_INGOT, recipeExporter);
        pickaxe(ModItems.PLATINUM_PICKAXE,ModItems.PLATINUM_INGOT, recipeExporter);
        pickaxe(ModItems.DEMONITE_PICKAXE,ModItems.DEMONITE_INGOT, recipeExporter);
        pickaxe(ModItems.CRIMTANE_PICKAXE,ModItems.CRIMTANE_INGOT, recipeExporter);
        pickaxe(ModItems.MOLTEN_PICKAXE,ModItems.HELLSTONE_INGOT, recipeExporter);

        axe(ModItems.COPPER_AXE,Items.COPPER_INGOT, recipeExporter);
        axe(ModItems.TIN_AXE,ModItems.TIN_INGOT, recipeExporter);
        axe(ModItems.LEAD_AXE,ModItems.LEAD_INGOT, recipeExporter);
        axe(ModItems.SILVER_AXE,ModItems.SILVER_INGOT, recipeExporter);
        axe(ModItems.TUNGSTEN_AXE,ModItems.TUNGSTEN_INGOT, recipeExporter);
        axe(ModItems.PLATINUM_AXE,ModItems.PLATINUM_INGOT, recipeExporter);
        axe(ModItems.DEMONITE_AXE,ModItems.DEMONITE_INGOT, recipeExporter);
        axe(ModItems.CRIMTANE_AXE,ModItems.CRIMTANE_INGOT, recipeExporter);
        axe(ModItems.MOLTEN_AXE,ModItems.HELLSTONE_INGOT, recipeExporter);

        shovel(ModItems.COPPER_SHOVEL,Items.COPPER_INGOT, recipeExporter);
        shovel(ModItems.TIN_SHOVEL,ModItems.TIN_INGOT, recipeExporter);
        shovel(ModItems.LEAD_SHOVEL,ModItems.LEAD_INGOT, recipeExporter);
        shovel(ModItems.SILVER_SHOVEL,ModItems.SILVER_INGOT, recipeExporter);
        shovel(ModItems.TUNGSTEN_SHOVEL,ModItems.TUNGSTEN_INGOT, recipeExporter);
        shovel(ModItems.PLATINUM_SHOVEL,ModItems.PLATINUM_INGOT, recipeExporter);
        shovel(ModItems.DEMONITE_SHOVEL,ModItems.DEMONITE_INGOT, recipeExporter);
        shovel(ModItems.CRIMTANE_SHOVEL,ModItems.CRIMTANE_INGOT, recipeExporter);
        shovel(ModItems.MOLTEN_SHOVEL,ModItems.HELLSTONE_INGOT, recipeExporter);

        hoe(ModItems.COPPER_HOE,Items.COPPER_INGOT, recipeExporter);
        hoe(ModItems.TIN_HOE,ModItems.TIN_INGOT, recipeExporter);
        hoe(ModItems.LEAD_HOE,ModItems.LEAD_INGOT, recipeExporter);
        hoe(ModItems.SILVER_HOE,ModItems.SILVER_INGOT, recipeExporter);
        hoe(ModItems.TUNGSTEN_HOE,ModItems.TUNGSTEN_INGOT, recipeExporter);
        hoe(ModItems.PLATINUM_HOE,ModItems.PLATINUM_INGOT, recipeExporter);
        hoe(ModItems.DEMONITE_HOE,ModItems.DEMONITE_INGOT, recipeExporter);
        hoe(ModItems.CRIMTANE_HOE,ModItems.CRIMTANE_INGOT, recipeExporter);
        hoe(ModItems.MOLTEN_HOE,ModItems.HELLSTONE_INGOT, recipeExporter);

    }
}
