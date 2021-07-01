package io.github.arthur_sh.mc_forge_tests.setup;

import io.github.arthur_sh.mc_forge_tests.MC_Forge_Tests;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MC_Forge_Tests.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MC_Forge_Tests.MOD_ID);

    public static void register(){

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        ModItems.register();
        ModBlocks.register();
    }
}
