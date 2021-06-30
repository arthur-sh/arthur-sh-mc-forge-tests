package io.github.arthur_sh.mc_forge_tests.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> NIOBIUM_ORE = register("niobium_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestLevel(3)
                    .sound(SoundType.STONE)
                    .harvestTool(ToolType.PICKAXE)
            ));
    public static final RegistryObject<Block> NIOBIUM_BLOCK = register("niobium_block", () ->
            new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3, 10)
                    .harvestLevel(3)
                    .sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE)
            ));


    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return ret;
    }

    public static void register() {
        //stub
    }
}
