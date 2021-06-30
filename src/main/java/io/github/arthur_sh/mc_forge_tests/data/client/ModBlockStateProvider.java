package io.github.arthur_sh.mc_forge_tests.data.client;

import io.github.arthur_sh.mc_forge_tests.MC_Forge_Tests;
import io.github.arthur_sh.mc_forge_tests.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MC_Forge_Tests.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.NIOBIUM_BLOCK.get());
        simpleBlock(ModBlocks.NIOBIUM_ORE.get());
    }
}
