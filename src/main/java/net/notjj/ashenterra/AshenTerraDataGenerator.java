package net.notjj.ashenterra;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.notjj.ashenterra.datagen.ModBlockTagProvider;
import net.notjj.ashenterra.datagen.ModLootTableProvider;
import net.notjj.ashenterra.datagen.ModModelProvider;
import net.notjj.ashenterra.datagen.ModRecipeProvider;

public class AshenTerraDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
