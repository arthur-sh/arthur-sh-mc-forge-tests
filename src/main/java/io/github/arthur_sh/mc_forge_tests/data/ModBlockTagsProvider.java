package io.github.arthur_sh.mc_forge_tests.data;

import io.github.arthur_sh.mc_forge_tests.MC_Forge_Tests;
import io.github.arthur_sh.mc_forge_tests.setup.ModBlocks;
import io.github.arthur_sh.mc_forge_tests.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator p_i48256_1_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_i48256_1_, MC_Forge_Tests.MOD_ID, existingFileHelper);
    }

    protected void registerTags() {
        tag(ModTags.Blocks.ORES_NIOBIUM).add(ModBlocks.NIOBIUM_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_NIOBIUM);
        tag(ModTags.Blocks.STORAGE_BLOCKS_NIOBIUM).add(ModBlocks.NIOBIUM_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_NIOBIUM);
    }
}
