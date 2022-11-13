package com.deepcoredrilling.blocks.simpleblocks;

import api.deepcoreapi.blocks.factories.SimpleBlockFactory;
import com.deepcoredrilling.DeepcoreDrilling;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class DeepcoreSimpleBlocksInit {
    private static final SimpleBlockFactory SIMPLE_BLOCK_FACTORY = new SimpleBlockFactory(DeepcoreDrilling.MOD_ID, SimpleBlockData.values());
    private static final IEventBus MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public static void RegisterSimpleBlocks() {
        SIMPLE_BLOCK_FACTORY.BuildBlockRegistry().register(MOD_EVENT_BUS);
    }

    public static void RegisterSimpleBlockItems() {
        SIMPLE_BLOCK_FACTORY.BuildBlockItemRegistry().register(MOD_EVENT_BUS);
    }
}
