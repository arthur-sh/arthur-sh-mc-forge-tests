package io.github.arthur_sh.mc_forge_tests.setup;

import io.github.arthur_sh.mc_forge_tests.MC_Forge_Tests;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {

    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_NIOBIUM = forge("ores/niobium");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_NIOBIUM = forge("storage_blocks/niobium");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(MC_Forge_Tests.MOD_ID, path).toString());
        }
    }

    public static final class Items {

        public static final ITag.INamedTag<Item> ORES_NIOBIUM = forge("ores/niobium");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_NIOBIUM = forge("storage_blocks/niobium");

        public static final ITag.INamedTag<Item> INGOTS_NIOBIUM = forge("ingots/niobium");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(MC_Forge_Tests.MOD_ID, path).toString());
        }
    }
}
