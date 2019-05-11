package com.itepastra.moredonuts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.itepastra.moredonuts.lists.BlockList;
import com.itepastra.moredonuts.lists.ItemList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreDonuts.MODID)
public class MoreDonuts {
    public static final String MODID = "moredonuts";

    public static MoreDonuts instance;
    private static final Logger logger = LogManager.getLogger(MODID);

    public MoreDonuts() {
	instance = this;

	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

	MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void clientRegistries(final FMLClientSetupEvent event)
    {
	logger.info("clientRegistries method registered.");
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
	    event.getRegistry().registerAll
	    (
		    BlockList.fourtytwo_block,
		    BlockList.fourtytwo_ore_block


		    );

	    logger.info("Blocks registered.");
	}
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
	    event.getRegistry().registerAll(
		    ItemList.stone_donut,
		    ItemList.coal_donut,
		    ItemList.iron_donut,
		    ItemList.gold_donut,
		    ItemList.diamond_donut,
		    ItemList.emerald_donut,
		    ItemList.the_ultimate_donut,
		    
		    ItemList.fourtytwo_block,
		    ItemList.fourtytwo_ore_block
		
		    );
	    logger.info("Items registered");
	}
    }



}
