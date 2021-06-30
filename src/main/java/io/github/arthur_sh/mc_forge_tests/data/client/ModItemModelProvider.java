package io.github.arthur_sh.mc_forge_tests.data.client;

import io.github.arthur_sh.mc_forge_tests.MC_Forge_Tests;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;


public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MC_Forge_Tests.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
//        withExistingParent("niobium_block", modLoc("block/niobium_block"));
//        withExistingParent("niobium_ore", modLoc("block/niobium_ore"));
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "niobium_ingot");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
