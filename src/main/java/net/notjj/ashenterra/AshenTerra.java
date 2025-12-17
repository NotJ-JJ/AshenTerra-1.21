package net.notjj.ashenterra;

import net.fabricmc.api.ModInitializer;

import net.notjj.ashenterra.block.ModBlocks;
import net.notjj.ashenterra.item.ModItemGroups;
import net.notjj.ashenterra.item.ModItems;
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
	}
}