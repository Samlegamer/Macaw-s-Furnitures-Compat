package fr.samlegamer.mcwfurnituresbyg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfurnituresbyg.block.MFurniBYGBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwFurnituresBYG.MODID)
@Mod.EventBusSubscriber(modid = McwFurnituresBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwFurnituresBYG
{
	public static final String MODID = "mcwfurnituresbyg";
	public static final TabsMRBOP TAB_GROUP = new TabsMRBOP("tab_mfurnibyg");
	public static final Logger log = LogManager.getLogger();
	
	public McwFurnituresBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		log.info("Macaw's Furnitures - Oh the Biomes You'll Go : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFurniBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFurniBYGBlocksRegistry.BLOCKS.register(bus);
		log.info("Macaw's Furnitures - Oh the Biomes You'll Go : Is Charged");
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.aspen_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_aspen_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.baobab_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_baobab_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.blue_enchanted_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_blue_enchanted_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.cherry_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_cherry_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.cika_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_cika_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.cypress_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_cypress_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.ebony_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_ebony_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.ether_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_ether_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.fir_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_fir_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.green_enchanted_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_green_enchanted_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.holly_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_holly_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.jacaranda_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_jacaranda_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.lament_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_lament_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.mahogany_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_mahogany_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.mangrove_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_mangrove_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.maple_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_maple_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.nightshade_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_nightshade_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.palm_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_palm_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.pine_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_pine_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.rainbow_eucalyptus_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_rainbow_eucalyptus_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.redwood_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_redwood_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.skyris_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_skyris_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.willow_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_willow_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.witch_hazel_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_witch_hazel_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.zelkova_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_zelkova_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.bulbis_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_bulbis_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.imparius_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_imparius_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.sythian_glass_table.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer((Block)MFurniBYGBlocksRegistry.stripped_sythian_glass_table.get(), RenderType.translucent());
	}
	
	public static class TabsMRBOP extends ItemGroup
	{
		public TabsMRBOP(String p_i1853_2_)
		{
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(MFurniBYGBlocksRegistry.aspen_bookshelf.get());
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return false;
		}
	}
}