package fr.samlegamer.mcwfurnituresbyg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfurnituresbyg.block.MFurniBYGBlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwFurnituresBYG.MODID)
@Mod.EventBusSubscriber(modid = McwFurnituresBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwFurnituresBYG
{
	public static final String MODID = "mcwfurnituresbyg";
	public static final Logger log = LogManager.getLogger();
	private static CreativeModeTab MFURNI_BYG;
	
	public McwFurnituresBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreateTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		log.info("Macaw's Furnitures - Oh the Biomes You'll Go : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFurniBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFurniBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		log.info("Macaw's Furnitures - Oh the Biomes You'll Go : Is Charged");
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.aspen_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.baobab_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.blue_enchanted_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.cherry_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.cika_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.cypress_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.ebony_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.ether_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.fir_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.green_enchanted_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.holly_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.jacaranda_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.lament_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.mahogany_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.white_mangrove_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.maple_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.nightshade_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.palm_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.pine_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.rainbow_eucalyptus_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.redwood_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.skyris_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.willow_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.witch_hazel_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.zelkova_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.bulbis_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.imparius_glass_table.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer((Block)MFurniBYGBlocksRegistry.sythian_glass_table.get(), RenderType.translucent());
	}

	private void CreateTab(CreativeModeTabEvent.Register event)
    {
		MFURNI_BYG = event.registerCreativeModeTab(new ResourceLocation("mcwfurnituresbyg", "tab_mfurnibyg"), builder -> builder
        .icon(() -> new ItemStack(MFurniBYGBlocksRegistry.aspen_wardrobe.get()))
        .title(Component.literal("Macaw's Furnitures - BYG")));
    }
    
    private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == MFURNI_BYG)
    	 {
    		 event.accept(MFurniBYGBlocksRegistry.aspen_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.aspen_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.baobab_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.blue_enchanted_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cherry_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cika_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.cypress_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ebony_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.ether_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.fir_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.green_enchanted_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.holly_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.jacaranda_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.lament_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.mahogany_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.white_mangrove_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.maple_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.nightshade_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.palm_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.pine_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.rainbow_eucalyptus_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.redwood_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.skyris_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.willow_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.witch_hazel_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.zelkova_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.bulbis_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.imparius_cupboard_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_modern_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_double_wardrobe.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_bookshelf.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_bookshelf_cupboard.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_double_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_lower_bookshelf_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_large_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_lower_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_triple_drawer.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_covered_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_modern_desk.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_end_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_coffee_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_glass_table.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_modern_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_striped_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_stool_chair.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_double_drawer_counter.get());

    		 event.accept(MFurniBYGBlocksRegistry.sythian_cupboard_counter.get());
    		 //Finish
    	 }
    }
}