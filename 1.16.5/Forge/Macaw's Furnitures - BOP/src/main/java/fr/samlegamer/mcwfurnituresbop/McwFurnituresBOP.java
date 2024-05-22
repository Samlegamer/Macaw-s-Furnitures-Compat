package fr.samlegamer.mcwfurnituresbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfurnituresbop.block.MFurniBOPBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwFurnituresBOP.MODID)
@Mod.EventBusSubscriber(modid = McwFurnituresBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwFurnituresBOP
{
	public static final String MODID = "mcwfurnituresbop";
	public static final TabsMRBOP TAB_GROUP = new TabsMRBOP("tab_mfurnibop");
	public static final Logger log = LogManager.getLogger();
	
	public McwFurnituresBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		log.info("Macaw's Furnitures - Biome O' Plenty : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFurniBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFurniBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		log.info("Macaw's Furnitures - Biome O' Plenty : Is Charged");
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.cherry_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.dead_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.fir_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.hellbark_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.jacaranda_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.magic_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.mahogany_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.palm_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.redwood_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.umbran_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBOPBlocksRegistry.willow_glass_table.get(), RenderType.translucent());
	}
	
	public static class TabsMRBOP extends ItemGroup
	{
		public TabsMRBOP(String p_i1853_2_)
		{
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(MFurniBOPBlocksRegistry.cherry_wardrobe.get());
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return false;
		}
	}
}