package net.notjj.ashenterra;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.notjj.ashenterra.block.ModBlocks;
import net.notjj.ashenterra.effect.ModEffects;
import net.notjj.ashenterra.item.ModItemGroups;
import net.notjj.ashenterra.item.ModItems;
import net.notjj.ashenterra.potion.ModPotions;
import net.notjj.ashenterra.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AshenTerra implements ModInitializer {
	public static final String MOD_ID = "ashenterra";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModEffects.registerModEffects();
		ModPotions.registerPotions();

		//Potion recipes

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.BONE,ModPotions.TITAN_POTION);
			builder.registerPotionRecipe(Potions.AWKWARD, Items.RAW_IRON,ModPotions.IRONSKIN_POTION);
			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.RAW_LEAD,ModPotions.IRONSKIN_POTION);
			builder.registerPotionRecipe(Potions.AWKWARD, Items.CACTUS,ModPotions.THORNS_POTION);

			builder.registerPotionRecipe(ModPotions.TITAN_POTION, Items.REDSTONE,ModPotions.LONG_TITAN_POTION);
			builder.registerPotionRecipe(ModPotions.IRONSKIN_POTION, Items.REDSTONE,ModPotions.LONG_IRONSKIN_POTION);
			builder.registerPotionRecipe(ModPotions.THORNS_POTION, Items.REDSTONE,ModPotions.LONG_THORNS_POTION);

			builder.registerPotionRecipe(ModPotions.TITAN_POTION, Items.GLOWSTONE_DUST,ModPotions.STRONG_TITAN_POTION);
			builder.registerPotionRecipe(ModPotions.IRONSKIN_POTION, Items.GLOWSTONE_DUST,ModPotions.STRONG_IRONSKIN_POTION);
			builder.registerPotionRecipe(ModPotions.THORNS_POTION, Items.GLOWSTONE_DUST,ModPotions.STRONG_THORNS_POTION);
		});
	}
}