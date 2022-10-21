package fr.samlegamer.mcwfurnituresbop.block;

import com.google.common.base.Supplier;
import com.mcwfurnitures.kikoz.objects.Chair;
import com.mcwfurnitures.kikoz.objects.Desk;
import com.mcwfurnitures.kikoz.objects.Table;
import com.mcwfurnitures.kikoz.objects.TableHitbox;
import com.mcwfurnitures.kikoz.objects.TallFurniture;
import com.mcwfurnitures.kikoz.objects.WideFurniture;
import com.mcwfurnitures.kikoz.objects.bookshelves.BookCabinet;
import com.mcwfurnitures.kikoz.objects.bookshelves.BookDrawer;
import com.mcwfurnitures.kikoz.objects.chairs.ClassicChair;
import com.mcwfurnitures.kikoz.objects.chairs.ModernChair;
import com.mcwfurnitures.kikoz.objects.chairs.StripedChair;
import com.mcwfurnitures.kikoz.objects.counters.Counter;
import com.mcwfurnitures.kikoz.objects.counters.StorageCounter;
import fr.samlegamer.mcwfurnituresbop.McwFurnituresBOP;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MFurniBOPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwFurnituresBOP.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwFurnituresBOP.MODID);

	  public static final RegistryObject<Block> cherry_wardrobe = createBlock("cherry_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_modern_wardrobe = createBlock("cherry_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_double_wardrobe = createBlock("cherry_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_bookshelf = createBlock("cherry_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_bookshelf_cupboard = createBlock("cherry_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_drawer = createBlock("cherry_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_double_drawer = createBlock("cherry_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_bookshelf_drawer = createBlock("cherry_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_lower_bookshelf_drawer = createBlock("cherry_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_large_drawer = createBlock("cherry_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_lower_triple_drawer = createBlock("cherry_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_triple_drawer = createBlock("cherry_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_desk = createBlock("cherry_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_covered_desk = createBlock("cherry_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_modern_desk = createBlock("cherry_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_table = createBlock("cherry_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_end_table = createBlock("cherry_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_coffee_table = createBlock("cherry_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_glass_table = createBlock("cherry_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_chair = createBlock("cherry_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_modern_chair = createBlock("cherry_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_striped_chair = createBlock("cherry_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_stool_chair = createBlock("cherry_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_counter = createBlock("cherry_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_drawer_counter = createBlock("cherry_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_double_drawer_counter = createBlock("cherry_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_cupboard_counter = createBlock("cherry_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> dead_wardrobe = createBlock("dead_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_modern_wardrobe = createBlock("dead_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_double_wardrobe = createBlock("dead_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_bookshelf = createBlock("dead_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_bookshelf_cupboard = createBlock("dead_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_drawer = createBlock("dead_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_double_drawer = createBlock("dead_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_bookshelf_drawer = createBlock("dead_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_lower_bookshelf_drawer = createBlock("dead_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_large_drawer = createBlock("dead_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_lower_triple_drawer = createBlock("dead_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_triple_drawer = createBlock("dead_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_desk = createBlock("dead_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_covered_desk = createBlock("dead_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_modern_desk = createBlock("dead_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_table = createBlock("dead_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_end_table = createBlock("dead_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_coffee_table = createBlock("dead_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_glass_table = createBlock("dead_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_chair = createBlock("dead_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_modern_chair = createBlock("dead_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_striped_chair = createBlock("dead_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_stool_chair = createBlock("dead_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_counter = createBlock("dead_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_drawer_counter = createBlock("dead_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_double_drawer_counter = createBlock("dead_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> dead_cupboard_counter = createBlock("dead_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> fir_wardrobe = createBlock("fir_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_modern_wardrobe = createBlock("fir_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_double_wardrobe = createBlock("fir_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_bookshelf = createBlock("fir_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_bookshelf_cupboard = createBlock("fir_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_drawer = createBlock("fir_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_double_drawer = createBlock("fir_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_bookshelf_drawer = createBlock("fir_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_lower_bookshelf_drawer = createBlock("fir_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_large_drawer = createBlock("fir_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_lower_triple_drawer = createBlock("fir_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_triple_drawer = createBlock("fir_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_desk = createBlock("fir_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_covered_desk = createBlock("fir_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_modern_desk = createBlock("fir_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_table = createBlock("fir_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_end_table = createBlock("fir_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_coffee_table = createBlock("fir_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_glass_table = createBlock("fir_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_chair = createBlock("fir_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_modern_chair = createBlock("fir_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_striped_chair = createBlock("fir_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_stool_chair = createBlock("fir_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_counter = createBlock("fir_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_drawer_counter = createBlock("fir_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_double_drawer_counter = createBlock("fir_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_cupboard_counter = createBlock("fir_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> hellbark_wardrobe = createBlock("hellbark_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_modern_wardrobe = createBlock("hellbark_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_double_wardrobe = createBlock("hellbark_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_bookshelf = createBlock("hellbark_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_bookshelf_cupboard = createBlock("hellbark_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_drawer = createBlock("hellbark_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_double_drawer = createBlock("hellbark_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_bookshelf_drawer = createBlock("hellbark_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_lower_bookshelf_drawer = createBlock("hellbark_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_large_drawer = createBlock("hellbark_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_lower_triple_drawer = createBlock("hellbark_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_triple_drawer = createBlock("hellbark_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_desk = createBlock("hellbark_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_covered_desk = createBlock("hellbark_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_modern_desk = createBlock("hellbark_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_table = createBlock("hellbark_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_end_table = createBlock("hellbark_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_coffee_table = createBlock("hellbark_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_glass_table = createBlock("hellbark_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_chair = createBlock("hellbark_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_modern_chair = createBlock("hellbark_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_striped_chair = createBlock("hellbark_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_stool_chair = createBlock("hellbark_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_counter = createBlock("hellbark_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_drawer_counter = createBlock("hellbark_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_double_drawer_counter = createBlock("hellbark_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> hellbark_cupboard_counter = createBlock("hellbark_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> jacaranda_wardrobe = createBlock("jacaranda_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_modern_wardrobe = createBlock("jacaranda_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_double_wardrobe = createBlock("jacaranda_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_bookshelf = createBlock("jacaranda_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_bookshelf_cupboard = createBlock("jacaranda_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_drawer = createBlock("jacaranda_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_double_drawer = createBlock("jacaranda_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_bookshelf_drawer = createBlock("jacaranda_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_lower_bookshelf_drawer = createBlock("jacaranda_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_large_drawer = createBlock("jacaranda_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_lower_triple_drawer = createBlock("jacaranda_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_triple_drawer = createBlock("jacaranda_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_desk = createBlock("jacaranda_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_covered_desk = createBlock("jacaranda_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_modern_desk = createBlock("jacaranda_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_table = createBlock("jacaranda_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_end_table = createBlock("jacaranda_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_coffee_table = createBlock("jacaranda_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_glass_table = createBlock("jacaranda_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_chair = createBlock("jacaranda_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_modern_chair = createBlock("jacaranda_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_striped_chair = createBlock("jacaranda_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_stool_chair = createBlock("jacaranda_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_counter = createBlock("jacaranda_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_drawer_counter = createBlock("jacaranda_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_double_drawer_counter = createBlock("jacaranda_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_cupboard_counter = createBlock("jacaranda_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> magic_wardrobe = createBlock("magic_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_modern_wardrobe = createBlock("magic_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_double_wardrobe = createBlock("magic_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_bookshelf = createBlock("magic_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_bookshelf_cupboard = createBlock("magic_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_drawer = createBlock("magic_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_double_drawer = createBlock("magic_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_bookshelf_drawer = createBlock("magic_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_lower_bookshelf_drawer = createBlock("magic_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_large_drawer = createBlock("magic_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_lower_triple_drawer = createBlock("magic_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_triple_drawer = createBlock("magic_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_desk = createBlock("magic_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_covered_desk = createBlock("magic_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_modern_desk = createBlock("magic_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_table = createBlock("magic_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_end_table = createBlock("magic_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_coffee_table = createBlock("magic_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_glass_table = createBlock("magic_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_chair = createBlock("magic_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_modern_chair = createBlock("magic_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_striped_chair = createBlock("magic_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_stool_chair = createBlock("magic_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_counter = createBlock("magic_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_drawer_counter = createBlock("magic_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_double_drawer_counter = createBlock("magic_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> magic_cupboard_counter = createBlock("magic_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> mahogany_wardrobe = createBlock("mahogany_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_modern_wardrobe = createBlock("mahogany_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_double_wardrobe = createBlock("mahogany_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_bookshelf = createBlock("mahogany_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_bookshelf_cupboard = createBlock("mahogany_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_drawer = createBlock("mahogany_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_double_drawer = createBlock("mahogany_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_bookshelf_drawer = createBlock("mahogany_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_lower_bookshelf_drawer = createBlock("mahogany_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_large_drawer = createBlock("mahogany_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_lower_triple_drawer = createBlock("mahogany_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_triple_drawer = createBlock("mahogany_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_desk = createBlock("mahogany_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_covered_desk = createBlock("mahogany_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_modern_desk = createBlock("mahogany_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_table = createBlock("mahogany_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_end_table = createBlock("mahogany_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_coffee_table = createBlock("mahogany_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_glass_table = createBlock("mahogany_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_chair = createBlock("mahogany_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_modern_chair = createBlock("mahogany_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_striped_chair = createBlock("mahogany_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_stool_chair = createBlock("mahogany_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_counter = createBlock("mahogany_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_drawer_counter = createBlock("mahogany_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_double_drawer_counter = createBlock("mahogany_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_cupboard_counter = createBlock("mahogany_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> palm_wardrobe = createBlock("palm_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_modern_wardrobe = createBlock("palm_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_double_wardrobe = createBlock("palm_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_bookshelf = createBlock("palm_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_bookshelf_cupboard = createBlock("palm_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_drawer = createBlock("palm_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_double_drawer = createBlock("palm_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_bookshelf_drawer = createBlock("palm_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_lower_bookshelf_drawer = createBlock("palm_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_large_drawer = createBlock("palm_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_lower_triple_drawer = createBlock("palm_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_triple_drawer = createBlock("palm_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_desk = createBlock("palm_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_covered_desk = createBlock("palm_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_modern_desk = createBlock("palm_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_table = createBlock("palm_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_end_table = createBlock("palm_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_coffee_table = createBlock("palm_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_glass_table = createBlock("palm_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_chair = createBlock("palm_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_modern_chair = createBlock("palm_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_striped_chair = createBlock("palm_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_stool_chair = createBlock("palm_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_counter = createBlock("palm_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_drawer_counter = createBlock("palm_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_double_drawer_counter = createBlock("palm_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_cupboard_counter = createBlock("palm_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> redwood_wardrobe = createBlock("redwood_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_modern_wardrobe = createBlock("redwood_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_double_wardrobe = createBlock("redwood_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_bookshelf = createBlock("redwood_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_bookshelf_cupboard = createBlock("redwood_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_drawer = createBlock("redwood_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_double_drawer = createBlock("redwood_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_bookshelf_drawer = createBlock("redwood_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_lower_bookshelf_drawer = createBlock("redwood_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_large_drawer = createBlock("redwood_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_lower_triple_drawer = createBlock("redwood_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_triple_drawer = createBlock("redwood_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_desk = createBlock("redwood_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_covered_desk = createBlock("redwood_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_modern_desk = createBlock("redwood_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_table = createBlock("redwood_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_end_table = createBlock("redwood_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_coffee_table = createBlock("redwood_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_glass_table = createBlock("redwood_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_chair = createBlock("redwood_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_modern_chair = createBlock("redwood_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_striped_chair = createBlock("redwood_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_stool_chair = createBlock("redwood_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_counter = createBlock("redwood_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_drawer_counter = createBlock("redwood_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_double_drawer_counter = createBlock("redwood_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_cupboard_counter = createBlock("redwood_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> umbran_wardrobe = createBlock("umbran_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_modern_wardrobe = createBlock("umbran_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_double_wardrobe = createBlock("umbran_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_bookshelf = createBlock("umbran_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_bookshelf_cupboard = createBlock("umbran_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_drawer = createBlock("umbran_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_double_drawer = createBlock("umbran_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_bookshelf_drawer = createBlock("umbran_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_lower_bookshelf_drawer = createBlock("umbran_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_large_drawer = createBlock("umbran_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_lower_triple_drawer = createBlock("umbran_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_triple_drawer = createBlock("umbran_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_desk = createBlock("umbran_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_covered_desk = createBlock("umbran_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_modern_desk = createBlock("umbran_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_table = createBlock("umbran_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_end_table = createBlock("umbran_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_coffee_table = createBlock("umbran_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_glass_table = createBlock("umbran_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_chair = createBlock("umbran_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_modern_chair = createBlock("umbran_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_striped_chair = createBlock("umbran_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_stool_chair = createBlock("umbran_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_counter = createBlock("umbran_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_drawer_counter = createBlock("umbran_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_double_drawer_counter = createBlock("umbran_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> umbran_cupboard_counter = createBlock("umbran_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> willow_wardrobe = createBlock("willow_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_modern_wardrobe = createBlock("willow_modern_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_double_wardrobe = createBlock("willow_double_wardrobe", () -> new TallFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_bookshelf = createBlock("willow_bookshelf", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_bookshelf_cupboard = createBlock("willow_bookshelf_cupboard", () -> new BookCabinet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_drawer = createBlock("willow_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_double_drawer = createBlock("willow_double_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_bookshelf_drawer = createBlock("willow_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_lower_bookshelf_drawer = createBlock("willow_lower_bookshelf_drawer", () -> new BookDrawer(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_large_drawer = createBlock("willow_large_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_lower_triple_drawer = createBlock("willow_lower_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_triple_drawer = createBlock("willow_triple_drawer", () -> new WideFurniture(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_desk = createBlock("willow_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_covered_desk = createBlock("willow_covered_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_modern_desk = createBlock("willow_modern_desk", () -> new Desk(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_table = createBlock("willow_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_end_table = createBlock("willow_end_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_coffee_table = createBlock("willow_coffee_table", () -> new Table(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_glass_table = createBlock("willow_glass_table", () -> new TableHitbox(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_chair = createBlock("willow_chair", () -> new ClassicChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_modern_chair = createBlock("willow_modern_chair", () -> new ModernChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_striped_chair = createBlock("willow_striped_chair", () -> new StripedChair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_stool_chair = createBlock("willow_stool_chair", () -> new Chair(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_counter = createBlock("willow_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_drawer_counter = createBlock("willow_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_double_drawer_counter = createBlock("willow_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_cupboard_counter = createBlock("willow_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 2.3F)));
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(McwFurnituresBOP.TAB_GROUP)));
        return block;
    }
}