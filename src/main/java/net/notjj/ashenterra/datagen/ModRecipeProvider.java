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

    private void sword(Item pickaxe, Item ingot) {
        RecipeExporter RecipeExporter;
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(RecipeExporter);
    }

    private void pickaxe(Item pickaxe, Item ingot) {
        RecipeExporter RecipeExporter;
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(RecipeExporter);
    }

    private void axe(Item pickaxe, Item ingot) {
        RecipeExporter RecipeExporter;
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(RecipeExporter);
    }

    private void shovel(Item pickaxe, Item ingot) {
        RecipeExporter RecipeExporter;
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(RecipeExporter);
    }

    private void hoe(Item pickaxe, Item ingot) {
        RecipeExporter RecipeExporter;
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,pickaxe)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I',ingot).input('S',Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT)).offerTo(RecipeExporter);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_HELLSTONE_ALLOY)
                .input(ModItems.HELLSTONE).input(ModItems.HELLSTONE).input(Items.OBSIDIAN)
                .criterion(hasItem(ModItems.HELLSTONE),conditionsFromItem(ModItems.HELLSTONE)).offerTo(recipeExporter);

        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);
        sword(ModItems.,ModItems.);

        pickaxe(ModItems.COPPER_PICKAXE,Items.COPPER_INGOT);
        pickaxe(ModItems.TIN_PICKAXE,ModItems.TIN_INGOT);
        pickaxe(ModItems.LEAD_PICKAXE,ModItems.LEAD_INGOT);
        pickaxe(ModItems.SILVER_PICKAXE,ModItems.SILVER_INGOT);
        pickaxe(ModItems.TUNGSTEN_PICKAXE,ModItems.TUNGSTEN_INGOT);
        pickaxe(ModItems.PLATINUM_PICKAXE,ModItems.PLATINUM_INGOT);
        pickaxe(ModItems.DEMONITE_PICKAXE,ModItems.DEMONITE_INGOT);
        pickaxe(ModItems.CRIMTANE_PICKAXE,ModItems.CRIMTANE_INGOT);
        pickaxe(ModItems.MOLTEN_PICKAXE,ModItems.HELLSTONE_INGOT);

        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);
        axe(ModItems.,ModItems.);

        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);
        shovel(ModItems.,ModItems.);

        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);
        hoe(ModItems.,ModItems.);

    }
}
