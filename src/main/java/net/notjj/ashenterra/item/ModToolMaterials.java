package net.notjj.ashenterra.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.notjj.ashenterra.util.ModTags;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    COPPER(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL, 190, 4.5F, 1.5F, 8, () -> Ingredient.fromTag(ModTags.Items.COPPER_TIER_INGOTS)),
    IRON(ModTags.Blocks.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.fromTag(ModTags.Items.IRON_TIER_INGOTS)),
    SILVER(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL, 450, 6.5F, 2.5F, 12, () -> Ingredient.fromTag(ModTags.Items.SILVER_TIER_INGOTS)),
    GOLD(ModTags.Blocks.INCORRECT_FOR_GOLD_TOOL, 900, 7.0F, 2.5F, 10, () -> Ingredient.fromTag(ModTags.Items.GOLD_TIER_INGOTS)),
    DEMONITE(ModTags.Blocks.INCORRECT_FOR_DEMONITE_TOOL, 980, 8.5F, 3.5F, 25, () -> Ingredient.fromTag(ModTags.Items.DEMONITE_TIER_INGOTS)),
    MOLTEN(ModTags.Blocks.INCORRECT_FOR_MOLTEN_TOOL, 3200, 10.0F, 5.5F, 13, () -> Ingredient.ofItems(ModItems.HELLSTONE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
