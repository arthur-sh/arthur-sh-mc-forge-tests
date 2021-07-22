package io.github.arthur_sh.mc_forge_tests.data;

import io.github.arthur_sh.mc_forge_tests.MC_Forge_Tests;
import io.github.arthur_sh.mc_forge_tests.setup.ModItems;
import io.github.arthur_sh.mc_forge_tests.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModITemTagsProvider extends ItemTagsProvider {
    public ModITemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, MC_Forge_Tests.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        copy(ModTags.Blocks.ORES_NIOBIUM, ModTags.Items.ORES_NIOBIUM);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_NIOBIUM, ModTags.Items.STORAGE_BLOCKS_NIOBIUM);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.INGOTS_NIOBIUM).add(ModItems.NIOBIUM_INGOT.get());
        tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_NIOBIUM);
    }
}
