package fr.samlegamer.mcwfurnituresbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfurnituresbop.block.MFurniBOPBlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwFurnituresBOP.MODID)
@Mod.EventBusSubscriber(modid = McwFurnituresBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwFurnituresBOP
{
	public static final String MODID = "mcwfurnituresbop";
	public static final Logger log = LogManager.getLogger();
	
	public McwFurnituresBOP()
	{
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		log.info("Macaw's Furnitures - Biome O' Plenty : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFurniBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFurniBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MFurniBOPBlocksRegistry.Item_Group.register(bus);
		log.info("Macaw's Furnitures - Biome O' Plenty : Is Charged");
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.dead_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.fir_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.hellbark_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.jacaranda_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.magic_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.mahogany_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.palm_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.redwood_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.umbran_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBOPBlocksRegistry.willow_glass_table.get(), RenderType.translucent());
	}
    
    private void AddTab(BuildCreativeModeTabContentsEvent event)
    {
    	 if (event.getTab() == MFurniBOPBlocksRegistry.MFURNI_CT.get())
    	 {
    		 event.accept(MFurniBOPBlocksRegistry.dead_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.dead_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.fir_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.hellbark_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.jacaranda_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.magic_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.mahogany_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.palm_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.redwood_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.umbran_cupboard_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_modern_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_double_wardrobe.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_bookshelf.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_bookshelf_cupboard.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_double_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_large_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_lower_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_triple_drawer.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_covered_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_modern_desk.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_end_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_coffee_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_glass_table.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_modern_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_striped_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_stool_chair.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_double_drawer_counter.get());

    		 event.accept(MFurniBOPBlocksRegistry.willow_cupboard_counter.get());
    		 //Finish
    	 }
    }
}