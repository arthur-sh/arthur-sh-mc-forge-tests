package io.github.arthur_sh.mc_forge_tests.data;

import io.github.arthur_sh.mc_forge_tests.MC_Forge_Tests;
import io.github.arthur_sh.mc_forge_tests.setup.ModBlocks;
import io.github.arthur_sh.mc_forge_tests.setup.ModItems;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.NIOBIUM_INGOT.get(), 9)
                .requires(ModBlocks.NIOBIUM_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.NIOBIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NIOBIUM_BLOCK.get())
                .define('#', ModItems.NIOBIUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.NIOBIUM_INGOT.get()))
                .save(consumer);

        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.NIOBIUM_ORE.get()), ModItems.NIOBIUM_INGOT.get(),
                0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.NIOBIUM_ORE.get()))
                .save(consumer, modId("niobium_ingot_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.NIOBIUM_ORE.get()), ModItems.NIOBIUM_INGOT.get(),
                0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.NIOBIUM_ORE.get()))
                .save(consumer, modId("niobium_ingot_blasting"));
    }

    private static ResourceLocation modId(String path){
        return new ResourceLocation(MC_Forge_Tests.MOD_ID, path);
    }
}
