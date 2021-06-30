package io.github.arthur_sh.mc_forge_tests.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> NIOBIUM_INGOT = Registration.ITEMS.register("niobium_ingot", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register() {
        //stub
    }
}
