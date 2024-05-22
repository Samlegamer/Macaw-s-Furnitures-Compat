package fr.samlegamer.mcwfurnituresbyg;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfurnituresbyg.block.MFurniBYGBlocksRegistry;

public class McwFurnituresBYG implements ModInitializer
{
	public static final String MODID = "mcwfurnituresbyg";
    private static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(MODID, "tab_mfurnituresbyg"), () -> new ItemStack(MFurniBYGBlocksRegistry.aspen_wardrobe));

	@Override
	public void onInitialize()
	{
        LOGGER.info("Macaw's Furnitures - Oh The Biomes You'll Go : Loading ...");
    	MFurniBYGBlocksRegistry.registry();
        LOGGER.info("Macaw's Furnitures - Oh The Biomes You'll Go : Is Charged");
	}
}