package net.notjj.ashenterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.notjj.ashenterra.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD)
                .add(ModItems.TIN_SWORD)
                .add(ModItems.LEAD_SWORD)
                .add(ModItems.SILVER_SWORD)
                .add(ModItems.TUNGSTEN_SWORD)
                .add(ModItems.PLATINUM_SWORD)
                .add(ModItems.DEMONITE_SWORD)
                .add(ModItems.CRIMTANE_SWORD)
                .add(ModItems.MOLTEN_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE)
                .add(ModItems.TIN_PICKAXE)
                .add(ModItems.LEAD_PICKAXE)
                .add(ModItems.SILVER_PICKAXE)
                .add(ModItems.TUNGSTEN_PICKAXE)
                .add(ModItems.PLATINUM_PICKAXE)
                .add(ModItems.DEMONITE_PICKAXE)
                .add(ModItems.CRIMTANE_PICKAXE)
                .add(ModItems.MOLTEN_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE)
                .add(ModItems.TIN_AXE)
                .add(ModItems.LEAD_AXE)
                .add(ModItems.SILVER_AXE)
                .add(ModItems.TUNGSTEN_AXE)
                .add(ModItems.PLATINUM_AXE)
                .add(ModItems.DEMONITE_AXE)
                .add(ModItems.CRIMTANE_AXE)
                .add(ModItems.MOLTEN_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL)
                .add(ModItems.TIN_SHOVEL)
                .add(ModItems.LEAD_SHOVEL)
                .add(ModItems.SILVER_SHOVEL)
                .add(ModItems.TUNGSTEN_SHOVEL)
                .add(ModItems.PLATINUM_SHOVEL)
                .add(ModItems.DEMONITE_SHOVEL)
                .add(ModItems.CRIMTANE_SHOVEL)
                .add(ModItems.MOLTEN_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE)
                .add(ModItems.TIN_HOE)
                .add(ModItems.LEAD_HOE)
                .add(ModItems.SILVER_HOE)
                .add(ModItems.TUNGSTEN_HOE)
                .add(ModItems.PLATINUM_HOE)
                .add(ModItems.DEMONITE_HOE)
                .add(ModItems.CRIMTANE_HOE)
                .add(ModItems.MOLTEN_HOE);

    }
}
