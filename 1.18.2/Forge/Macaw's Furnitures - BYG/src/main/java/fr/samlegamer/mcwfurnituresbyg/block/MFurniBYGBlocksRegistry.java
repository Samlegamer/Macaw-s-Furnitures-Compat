package fr.samlegamer.mcwfurnituresbyg.block;

import com.google.common.base.Supplier;
import com.mcwfurnitures.kikoz.objects.Chair;
import com.mcwfurnitures.kikoz.objects.Desk;
import com.mcwfurnitures.kikoz.objects.Table;
import com.mcwfurnitures.kikoz.objects.TableHitbox;
import com.mcwfurnitures.kikoz.objects.TallFurniture;
import com.mcwfurnitures.kikoz.objects.TallFurnitureHinge;
import com.mcwfurnitures.kikoz.objects.WideFurniture;
import com.mcwfurnitures.kikoz.objects.bookshelves.BookCabinet;
import com.mcwfurnitures.kikoz.objects.bookshelves.BookCabinetHinge;
import com.mcwfurnitures.kikoz.objects.bookshelves.BookDrawer;
import com.mcwfurnitures.kikoz.objects.chairs.ClassicChair;
import com.mcwfurnitures.kikoz.objects.chairs.ModernChair;
import com.mcwfurnitures.kikoz.objects.chairs.StripedChair;
import com.mcwfurnitures.kikoz.objects.counters.Counter;
import com.mcwfurnitures.kikoz.objects.counters.CupboardCounter;
import com.mcwfurnitures.kikoz.objects.counters.StorageCounter;
import fr.samlegamer.mcwfurnituresbyg.McwFurnituresBYG;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MFurniBYGBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwFurnituresBYG.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwFurnituresBYG.MODID);
	
	public static final RegistryObject<Block> aspen_wardrobe = createBlock("aspen_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_modern_wardrobe = createBlock("aspen_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_double_wardrobe = createBlock("aspen_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_bookshelf = createBlock("aspen_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_bookshelf_cupboard = createBlock("aspen_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_drawer = createBlock("aspen_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_double_drawer = createBlock("aspen_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_bookshelf_drawer = createBlock("aspen_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_lower_bookshelf_drawer = createBlock("aspen_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_large_drawer = createBlock("aspen_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_lower_triple_drawer = createBlock("aspen_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_triple_drawer = createBlock("aspen_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_desk = createBlock("aspen_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_covered_desk = createBlock("aspen_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_modern_desk = createBlock("aspen_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_table = createBlock("aspen_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_end_table = createBlock("aspen_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_coffee_table = createBlock("aspen_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_glass_table = createBlock("aspen_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_chair = createBlock("aspen_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_modern_chair = createBlock("aspen_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_striped_chair = createBlock("aspen_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_stool_chair = createBlock("aspen_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_counter = createBlock("aspen_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_drawer_counter = createBlock("aspen_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_double_drawer_counter = createBlock("aspen_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> aspen_cupboard_counter = createBlock("aspen_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> baobab_wardrobe = createBlock("baobab_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_modern_wardrobe = createBlock("baobab_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_double_wardrobe = createBlock("baobab_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_bookshelf = createBlock("baobab_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_bookshelf_cupboard = createBlock("baobab_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_drawer = createBlock("baobab_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_double_drawer = createBlock("baobab_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_bookshelf_drawer = createBlock("baobab_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_lower_bookshelf_drawer = createBlock("baobab_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_large_drawer = createBlock("baobab_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_lower_triple_drawer = createBlock("baobab_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_triple_drawer = createBlock("baobab_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_desk = createBlock("baobab_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_covered_desk = createBlock("baobab_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_modern_desk = createBlock("baobab_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_table = createBlock("baobab_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_end_table = createBlock("baobab_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_coffee_table = createBlock("baobab_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_glass_table = createBlock("baobab_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_chair = createBlock("baobab_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_modern_chair = createBlock("baobab_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_striped_chair = createBlock("baobab_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_stool_chair = createBlock("baobab_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_counter = createBlock("baobab_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_drawer_counter = createBlock("baobab_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_double_drawer_counter = createBlock("baobab_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> baobab_cupboard_counter = createBlock("baobab_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> blue_enchanted_wardrobe = createBlock("blue_enchanted_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_modern_wardrobe = createBlock("blue_enchanted_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_double_wardrobe = createBlock("blue_enchanted_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_bookshelf = createBlock("blue_enchanted_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_bookshelf_cupboard = createBlock("blue_enchanted_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_drawer = createBlock("blue_enchanted_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_double_drawer = createBlock("blue_enchanted_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_bookshelf_drawer = createBlock("blue_enchanted_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_lower_bookshelf_drawer = createBlock("blue_enchanted_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_large_drawer = createBlock("blue_enchanted_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_lower_triple_drawer = createBlock("blue_enchanted_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_triple_drawer = createBlock("blue_enchanted_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_desk = createBlock("blue_enchanted_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_covered_desk = createBlock("blue_enchanted_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_modern_desk = createBlock("blue_enchanted_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_table = createBlock("blue_enchanted_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_end_table = createBlock("blue_enchanted_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_coffee_table = createBlock("blue_enchanted_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_glass_table = createBlock("blue_enchanted_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_chair = createBlock("blue_enchanted_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_modern_chair = createBlock("blue_enchanted_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_striped_chair = createBlock("blue_enchanted_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_stool_chair = createBlock("blue_enchanted_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_counter = createBlock("blue_enchanted_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_drawer_counter = createBlock("blue_enchanted_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_double_drawer_counter = createBlock("blue_enchanted_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> blue_enchanted_cupboard_counter = createBlock("blue_enchanted_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> cherry_wardrobe = createBlock("cherry_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_modern_wardrobe = createBlock("cherry_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_double_wardrobe = createBlock("cherry_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_bookshelf = createBlock("cherry_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_bookshelf_cupboard = createBlock("cherry_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_drawer = createBlock("cherry_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_double_drawer = createBlock("cherry_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_bookshelf_drawer = createBlock("cherry_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_lower_bookshelf_drawer = createBlock("cherry_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_large_drawer = createBlock("cherry_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_lower_triple_drawer = createBlock("cherry_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_triple_drawer = createBlock("cherry_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_desk = createBlock("cherry_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_covered_desk = createBlock("cherry_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_modern_desk = createBlock("cherry_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_table = createBlock("cherry_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_end_table = createBlock("cherry_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_coffee_table = createBlock("cherry_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_glass_table = createBlock("cherry_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_chair = createBlock("cherry_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_modern_chair = createBlock("cherry_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_striped_chair = createBlock("cherry_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_stool_chair = createBlock("cherry_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_counter = createBlock("cherry_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_drawer_counter = createBlock("cherry_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_double_drawer_counter = createBlock("cherry_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cherry_cupboard_counter = createBlock("cherry_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> cika_wardrobe = createBlock("cika_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_modern_wardrobe = createBlock("cika_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_double_wardrobe = createBlock("cika_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_bookshelf = createBlock("cika_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_bookshelf_cupboard = createBlock("cika_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_drawer = createBlock("cika_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_double_drawer = createBlock("cika_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_bookshelf_drawer = createBlock("cika_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_lower_bookshelf_drawer = createBlock("cika_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_large_drawer = createBlock("cika_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_lower_triple_drawer = createBlock("cika_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_triple_drawer = createBlock("cika_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_desk = createBlock("cika_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_covered_desk = createBlock("cika_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_modern_desk = createBlock("cika_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_table = createBlock("cika_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_end_table = createBlock("cika_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_coffee_table = createBlock("cika_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_glass_table = createBlock("cika_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_chair = createBlock("cika_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_modern_chair = createBlock("cika_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_striped_chair = createBlock("cika_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_stool_chair = createBlock("cika_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_counter = createBlock("cika_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_drawer_counter = createBlock("cika_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_double_drawer_counter = createBlock("cika_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cika_cupboard_counter = createBlock("cika_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> cypress_wardrobe = createBlock("cypress_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_modern_wardrobe = createBlock("cypress_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_double_wardrobe = createBlock("cypress_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_bookshelf = createBlock("cypress_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_bookshelf_cupboard = createBlock("cypress_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_drawer = createBlock("cypress_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_double_drawer = createBlock("cypress_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_bookshelf_drawer = createBlock("cypress_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_lower_bookshelf_drawer = createBlock("cypress_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_large_drawer = createBlock("cypress_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_lower_triple_drawer = createBlock("cypress_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_triple_drawer = createBlock("cypress_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_desk = createBlock("cypress_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_covered_desk = createBlock("cypress_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_modern_desk = createBlock("cypress_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_table = createBlock("cypress_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_end_table = createBlock("cypress_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_coffee_table = createBlock("cypress_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_glass_table = createBlock("cypress_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_chair = createBlock("cypress_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_modern_chair = createBlock("cypress_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_striped_chair = createBlock("cypress_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_stool_chair = createBlock("cypress_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_counter = createBlock("cypress_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_drawer_counter = createBlock("cypress_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_double_drawer_counter = createBlock("cypress_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> cypress_cupboard_counter = createBlock("cypress_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> ebony_wardrobe = createBlock("ebony_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_modern_wardrobe = createBlock("ebony_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_double_wardrobe = createBlock("ebony_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_bookshelf = createBlock("ebony_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_bookshelf_cupboard = createBlock("ebony_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_drawer = createBlock("ebony_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_double_drawer = createBlock("ebony_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_bookshelf_drawer = createBlock("ebony_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_lower_bookshelf_drawer = createBlock("ebony_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_large_drawer = createBlock("ebony_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_lower_triple_drawer = createBlock("ebony_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_triple_drawer = createBlock("ebony_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_desk = createBlock("ebony_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_covered_desk = createBlock("ebony_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_modern_desk = createBlock("ebony_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_table = createBlock("ebony_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_end_table = createBlock("ebony_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_coffee_table = createBlock("ebony_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_glass_table = createBlock("ebony_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_chair = createBlock("ebony_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_modern_chair = createBlock("ebony_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_striped_chair = createBlock("ebony_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_stool_chair = createBlock("ebony_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_counter = createBlock("ebony_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_drawer_counter = createBlock("ebony_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_double_drawer_counter = createBlock("ebony_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ebony_cupboard_counter = createBlock("ebony_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> ether_wardrobe = createBlock("ether_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_modern_wardrobe = createBlock("ether_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_double_wardrobe = createBlock("ether_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_bookshelf = createBlock("ether_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_bookshelf_cupboard = createBlock("ether_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_drawer = createBlock("ether_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_double_drawer = createBlock("ether_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_bookshelf_drawer = createBlock("ether_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_lower_bookshelf_drawer = createBlock("ether_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_large_drawer = createBlock("ether_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_lower_triple_drawer = createBlock("ether_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_triple_drawer = createBlock("ether_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_desk = createBlock("ether_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_covered_desk = createBlock("ether_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_modern_desk = createBlock("ether_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_table = createBlock("ether_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_end_table = createBlock("ether_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_coffee_table = createBlock("ether_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_glass_table = createBlock("ether_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_chair = createBlock("ether_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_modern_chair = createBlock("ether_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_striped_chair = createBlock("ether_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_stool_chair = createBlock("ether_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_counter = createBlock("ether_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_drawer_counter = createBlock("ether_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_double_drawer_counter = createBlock("ether_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> ether_cupboard_counter = createBlock("ether_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> fir_wardrobe = createBlock("fir_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_modern_wardrobe = createBlock("fir_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_double_wardrobe = createBlock("fir_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_bookshelf = createBlock("fir_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_bookshelf_cupboard = createBlock("fir_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_drawer = createBlock("fir_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_double_drawer = createBlock("fir_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_bookshelf_drawer = createBlock("fir_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_lower_bookshelf_drawer = createBlock("fir_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_large_drawer = createBlock("fir_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_lower_triple_drawer = createBlock("fir_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_triple_drawer = createBlock("fir_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_desk = createBlock("fir_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_covered_desk = createBlock("fir_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_modern_desk = createBlock("fir_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_table = createBlock("fir_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_end_table = createBlock("fir_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_coffee_table = createBlock("fir_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_glass_table = createBlock("fir_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_chair = createBlock("fir_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_modern_chair = createBlock("fir_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_striped_chair = createBlock("fir_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_stool_chair = createBlock("fir_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_counter = createBlock("fir_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_drawer_counter = createBlock("fir_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_double_drawer_counter = createBlock("fir_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> fir_cupboard_counter = createBlock("fir_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> green_enchanted_wardrobe = createBlock("green_enchanted_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_modern_wardrobe = createBlock("green_enchanted_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_double_wardrobe = createBlock("green_enchanted_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_bookshelf = createBlock("green_enchanted_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_bookshelf_cupboard = createBlock("green_enchanted_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_drawer = createBlock("green_enchanted_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_double_drawer = createBlock("green_enchanted_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_bookshelf_drawer = createBlock("green_enchanted_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_lower_bookshelf_drawer = createBlock("green_enchanted_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_large_drawer = createBlock("green_enchanted_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_lower_triple_drawer = createBlock("green_enchanted_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_triple_drawer = createBlock("green_enchanted_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_desk = createBlock("green_enchanted_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_covered_desk = createBlock("green_enchanted_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_modern_desk = createBlock("green_enchanted_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_table = createBlock("green_enchanted_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_end_table = createBlock("green_enchanted_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_coffee_table = createBlock("green_enchanted_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_glass_table = createBlock("green_enchanted_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_chair = createBlock("green_enchanted_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_modern_chair = createBlock("green_enchanted_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_striped_chair = createBlock("green_enchanted_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_stool_chair = createBlock("green_enchanted_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_counter = createBlock("green_enchanted_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_drawer_counter = createBlock("green_enchanted_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_double_drawer_counter = createBlock("green_enchanted_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> green_enchanted_cupboard_counter = createBlock("green_enchanted_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> holly_wardrobe = createBlock("holly_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_modern_wardrobe = createBlock("holly_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_double_wardrobe = createBlock("holly_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_bookshelf = createBlock("holly_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_bookshelf_cupboard = createBlock("holly_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_drawer = createBlock("holly_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_double_drawer = createBlock("holly_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_bookshelf_drawer = createBlock("holly_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_lower_bookshelf_drawer = createBlock("holly_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_large_drawer = createBlock("holly_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_lower_triple_drawer = createBlock("holly_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_triple_drawer = createBlock("holly_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_desk = createBlock("holly_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_covered_desk = createBlock("holly_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_modern_desk = createBlock("holly_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_table = createBlock("holly_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_end_table = createBlock("holly_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_coffee_table = createBlock("holly_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_glass_table = createBlock("holly_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_chair = createBlock("holly_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_modern_chair = createBlock("holly_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_striped_chair = createBlock("holly_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_stool_chair = createBlock("holly_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_counter = createBlock("holly_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_drawer_counter = createBlock("holly_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_double_drawer_counter = createBlock("holly_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> holly_cupboard_counter = createBlock("holly_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> jacaranda_wardrobe = createBlock("jacaranda_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_modern_wardrobe = createBlock("jacaranda_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_double_wardrobe = createBlock("jacaranda_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_bookshelf = createBlock("jacaranda_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_bookshelf_cupboard = createBlock("jacaranda_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_drawer = createBlock("jacaranda_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_double_drawer = createBlock("jacaranda_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_bookshelf_drawer = createBlock("jacaranda_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_lower_bookshelf_drawer = createBlock("jacaranda_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_large_drawer = createBlock("jacaranda_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_lower_triple_drawer = createBlock("jacaranda_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_triple_drawer = createBlock("jacaranda_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_desk = createBlock("jacaranda_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_covered_desk = createBlock("jacaranda_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_modern_desk = createBlock("jacaranda_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_table = createBlock("jacaranda_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_end_table = createBlock("jacaranda_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_coffee_table = createBlock("jacaranda_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_glass_table = createBlock("jacaranda_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_chair = createBlock("jacaranda_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_modern_chair = createBlock("jacaranda_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_striped_chair = createBlock("jacaranda_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_stool_chair = createBlock("jacaranda_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_counter = createBlock("jacaranda_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_drawer_counter = createBlock("jacaranda_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_double_drawer_counter = createBlock("jacaranda_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> jacaranda_cupboard_counter = createBlock("jacaranda_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> lament_wardrobe = createBlock("lament_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_modern_wardrobe = createBlock("lament_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_double_wardrobe = createBlock("lament_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_bookshelf = createBlock("lament_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_bookshelf_cupboard = createBlock("lament_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_drawer = createBlock("lament_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_double_drawer = createBlock("lament_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_bookshelf_drawer = createBlock("lament_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_lower_bookshelf_drawer = createBlock("lament_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_large_drawer = createBlock("lament_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_lower_triple_drawer = createBlock("lament_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_triple_drawer = createBlock("lament_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_desk = createBlock("lament_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_covered_desk = createBlock("lament_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_modern_desk = createBlock("lament_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_table = createBlock("lament_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_end_table = createBlock("lament_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_coffee_table = createBlock("lament_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_glass_table = createBlock("lament_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_chair = createBlock("lament_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_modern_chair = createBlock("lament_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_striped_chair = createBlock("lament_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_stool_chair = createBlock("lament_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_counter = createBlock("lament_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_drawer_counter = createBlock("lament_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_double_drawer_counter = createBlock("lament_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> lament_cupboard_counter = createBlock("lament_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> mahogany_wardrobe = createBlock("mahogany_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_modern_wardrobe = createBlock("mahogany_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_double_wardrobe = createBlock("mahogany_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_bookshelf = createBlock("mahogany_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_bookshelf_cupboard = createBlock("mahogany_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_drawer = createBlock("mahogany_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_double_drawer = createBlock("mahogany_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_bookshelf_drawer = createBlock("mahogany_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_lower_bookshelf_drawer = createBlock("mahogany_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_large_drawer = createBlock("mahogany_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_lower_triple_drawer = createBlock("mahogany_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_triple_drawer = createBlock("mahogany_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_desk = createBlock("mahogany_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_covered_desk = createBlock("mahogany_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_modern_desk = createBlock("mahogany_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_table = createBlock("mahogany_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_end_table = createBlock("mahogany_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_coffee_table = createBlock("mahogany_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_glass_table = createBlock("mahogany_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_chair = createBlock("mahogany_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_modern_chair = createBlock("mahogany_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_striped_chair = createBlock("mahogany_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_stool_chair = createBlock("mahogany_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_counter = createBlock("mahogany_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_drawer_counter = createBlock("mahogany_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_double_drawer_counter = createBlock("mahogany_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mahogany_cupboard_counter = createBlock("mahogany_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> mangrove_wardrobe = createBlock("mangrove_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_modern_wardrobe = createBlock("mangrove_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_double_wardrobe = createBlock("mangrove_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_bookshelf = createBlock("mangrove_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_bookshelf_cupboard = createBlock("mangrove_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_drawer = createBlock("mangrove_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_double_drawer = createBlock("mangrove_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_bookshelf_drawer = createBlock("mangrove_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_lower_bookshelf_drawer = createBlock("mangrove_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_large_drawer = createBlock("mangrove_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_lower_triple_drawer = createBlock("mangrove_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_triple_drawer = createBlock("mangrove_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_desk = createBlock("mangrove_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_covered_desk = createBlock("mangrove_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_modern_desk = createBlock("mangrove_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_table = createBlock("mangrove_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_end_table = createBlock("mangrove_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_coffee_table = createBlock("mangrove_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_glass_table = createBlock("mangrove_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_chair = createBlock("mangrove_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_modern_chair = createBlock("mangrove_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_striped_chair = createBlock("mangrove_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_stool_chair = createBlock("mangrove_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_counter = createBlock("mangrove_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_drawer_counter = createBlock("mangrove_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_double_drawer_counter = createBlock("mangrove_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> mangrove_cupboard_counter = createBlock("mangrove_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> maple_wardrobe = createBlock("maple_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_modern_wardrobe = createBlock("maple_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_double_wardrobe = createBlock("maple_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_bookshelf = createBlock("maple_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_bookshelf_cupboard = createBlock("maple_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_drawer = createBlock("maple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_double_drawer = createBlock("maple_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_bookshelf_drawer = createBlock("maple_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_lower_bookshelf_drawer = createBlock("maple_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_large_drawer = createBlock("maple_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_lower_triple_drawer = createBlock("maple_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_triple_drawer = createBlock("maple_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_desk = createBlock("maple_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_covered_desk = createBlock("maple_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_modern_desk = createBlock("maple_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_table = createBlock("maple_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_end_table = createBlock("maple_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_coffee_table = createBlock("maple_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_glass_table = createBlock("maple_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_chair = createBlock("maple_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_modern_chair = createBlock("maple_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_striped_chair = createBlock("maple_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_stool_chair = createBlock("maple_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_counter = createBlock("maple_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_drawer_counter = createBlock("maple_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_double_drawer_counter = createBlock("maple_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> maple_cupboard_counter = createBlock("maple_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> nightshade_wardrobe = createBlock("nightshade_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_modern_wardrobe = createBlock("nightshade_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_double_wardrobe = createBlock("nightshade_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_bookshelf = createBlock("nightshade_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_bookshelf_cupboard = createBlock("nightshade_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_drawer = createBlock("nightshade_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_double_drawer = createBlock("nightshade_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_bookshelf_drawer = createBlock("nightshade_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_lower_bookshelf_drawer = createBlock("nightshade_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_large_drawer = createBlock("nightshade_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_lower_triple_drawer = createBlock("nightshade_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_triple_drawer = createBlock("nightshade_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_desk = createBlock("nightshade_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_covered_desk = createBlock("nightshade_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_modern_desk = createBlock("nightshade_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_table = createBlock("nightshade_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_end_table = createBlock("nightshade_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_coffee_table = createBlock("nightshade_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_glass_table = createBlock("nightshade_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_chair = createBlock("nightshade_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_modern_chair = createBlock("nightshade_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_striped_chair = createBlock("nightshade_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_stool_chair = createBlock("nightshade_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_counter = createBlock("nightshade_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_drawer_counter = createBlock("nightshade_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_double_drawer_counter = createBlock("nightshade_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> nightshade_cupboard_counter = createBlock("nightshade_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> palm_wardrobe = createBlock("palm_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_modern_wardrobe = createBlock("palm_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_double_wardrobe = createBlock("palm_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_bookshelf = createBlock("palm_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_bookshelf_cupboard = createBlock("palm_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_drawer = createBlock("palm_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_double_drawer = createBlock("palm_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_bookshelf_drawer = createBlock("palm_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_lower_bookshelf_drawer = createBlock("palm_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_large_drawer = createBlock("palm_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_lower_triple_drawer = createBlock("palm_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_triple_drawer = createBlock("palm_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_desk = createBlock("palm_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_covered_desk = createBlock("palm_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_modern_desk = createBlock("palm_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_table = createBlock("palm_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_end_table = createBlock("palm_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_coffee_table = createBlock("palm_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_glass_table = createBlock("palm_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_chair = createBlock("palm_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_modern_chair = createBlock("palm_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_striped_chair = createBlock("palm_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_stool_chair = createBlock("palm_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_counter = createBlock("palm_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_drawer_counter = createBlock("palm_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_double_drawer_counter = createBlock("palm_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> palm_cupboard_counter = createBlock("palm_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> pine_wardrobe = createBlock("pine_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_modern_wardrobe = createBlock("pine_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_double_wardrobe = createBlock("pine_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_bookshelf = createBlock("pine_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_bookshelf_cupboard = createBlock("pine_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_drawer = createBlock("pine_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_double_drawer = createBlock("pine_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_bookshelf_drawer = createBlock("pine_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_lower_bookshelf_drawer = createBlock("pine_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_large_drawer = createBlock("pine_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_lower_triple_drawer = createBlock("pine_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_triple_drawer = createBlock("pine_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_desk = createBlock("pine_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_covered_desk = createBlock("pine_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_modern_desk = createBlock("pine_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_table = createBlock("pine_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_end_table = createBlock("pine_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_coffee_table = createBlock("pine_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_glass_table = createBlock("pine_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_chair = createBlock("pine_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_modern_chair = createBlock("pine_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_striped_chair = createBlock("pine_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_stool_chair = createBlock("pine_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_counter = createBlock("pine_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_drawer_counter = createBlock("pine_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_double_drawer_counter = createBlock("pine_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> pine_cupboard_counter = createBlock("pine_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> rainbow_eucalyptus_wardrobe = createBlock("rainbow_eucalyptus_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_modern_wardrobe = createBlock("rainbow_eucalyptus_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_double_wardrobe = createBlock("rainbow_eucalyptus_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_bookshelf = createBlock("rainbow_eucalyptus_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_bookshelf_cupboard = createBlock("rainbow_eucalyptus_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_drawer = createBlock("rainbow_eucalyptus_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_double_drawer = createBlock("rainbow_eucalyptus_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_bookshelf_drawer = createBlock("rainbow_eucalyptus_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_lower_bookshelf_drawer = createBlock("rainbow_eucalyptus_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_large_drawer = createBlock("rainbow_eucalyptus_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_lower_triple_drawer = createBlock("rainbow_eucalyptus_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_triple_drawer = createBlock("rainbow_eucalyptus_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_desk = createBlock("rainbow_eucalyptus_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_covered_desk = createBlock("rainbow_eucalyptus_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_modern_desk = createBlock("rainbow_eucalyptus_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_table = createBlock("rainbow_eucalyptus_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_end_table = createBlock("rainbow_eucalyptus_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_coffee_table = createBlock("rainbow_eucalyptus_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_glass_table = createBlock("rainbow_eucalyptus_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_chair = createBlock("rainbow_eucalyptus_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_modern_chair = createBlock("rainbow_eucalyptus_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_striped_chair = createBlock("rainbow_eucalyptus_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_stool_chair = createBlock("rainbow_eucalyptus_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_counter = createBlock("rainbow_eucalyptus_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_drawer_counter = createBlock("rainbow_eucalyptus_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_double_drawer_counter = createBlock("rainbow_eucalyptus_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> rainbow_eucalyptus_cupboard_counter = createBlock("rainbow_eucalyptus_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> redwood_wardrobe = createBlock("redwood_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_modern_wardrobe = createBlock("redwood_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_double_wardrobe = createBlock("redwood_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_bookshelf = createBlock("redwood_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_bookshelf_cupboard = createBlock("redwood_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_drawer = createBlock("redwood_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_double_drawer = createBlock("redwood_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_bookshelf_drawer = createBlock("redwood_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_lower_bookshelf_drawer = createBlock("redwood_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_large_drawer = createBlock("redwood_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_lower_triple_drawer = createBlock("redwood_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_triple_drawer = createBlock("redwood_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_desk = createBlock("redwood_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_covered_desk = createBlock("redwood_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_modern_desk = createBlock("redwood_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_table = createBlock("redwood_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_end_table = createBlock("redwood_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_coffee_table = createBlock("redwood_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_glass_table = createBlock("redwood_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_chair = createBlock("redwood_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_modern_chair = createBlock("redwood_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_striped_chair = createBlock("redwood_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_stool_chair = createBlock("redwood_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_counter = createBlock("redwood_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_drawer_counter = createBlock("redwood_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_double_drawer_counter = createBlock("redwood_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> redwood_cupboard_counter = createBlock("redwood_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> skyris_wardrobe = createBlock("skyris_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_modern_wardrobe = createBlock("skyris_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_double_wardrobe = createBlock("skyris_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_bookshelf = createBlock("skyris_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_bookshelf_cupboard = createBlock("skyris_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_drawer = createBlock("skyris_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_double_drawer = createBlock("skyris_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_bookshelf_drawer = createBlock("skyris_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_lower_bookshelf_drawer = createBlock("skyris_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_large_drawer = createBlock("skyris_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_lower_triple_drawer = createBlock("skyris_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_triple_drawer = createBlock("skyris_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_desk = createBlock("skyris_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_covered_desk = createBlock("skyris_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_modern_desk = createBlock("skyris_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_table = createBlock("skyris_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_end_table = createBlock("skyris_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_coffee_table = createBlock("skyris_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_glass_table = createBlock("skyris_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_chair = createBlock("skyris_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_modern_chair = createBlock("skyris_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_striped_chair = createBlock("skyris_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_stool_chair = createBlock("skyris_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_counter = createBlock("skyris_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_drawer_counter = createBlock("skyris_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_double_drawer_counter = createBlock("skyris_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> skyris_cupboard_counter = createBlock("skyris_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> willow_wardrobe = createBlock("willow_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_modern_wardrobe = createBlock("willow_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_double_wardrobe = createBlock("willow_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_bookshelf = createBlock("willow_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_bookshelf_cupboard = createBlock("willow_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_drawer = createBlock("willow_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_double_drawer = createBlock("willow_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_bookshelf_drawer = createBlock("willow_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_lower_bookshelf_drawer = createBlock("willow_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_large_drawer = createBlock("willow_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_lower_triple_drawer = createBlock("willow_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_triple_drawer = createBlock("willow_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_desk = createBlock("willow_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_covered_desk = createBlock("willow_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_modern_desk = createBlock("willow_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_table = createBlock("willow_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_end_table = createBlock("willow_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_coffee_table = createBlock("willow_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_glass_table = createBlock("willow_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_chair = createBlock("willow_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_modern_chair = createBlock("willow_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_striped_chair = createBlock("willow_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_stool_chair = createBlock("willow_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_counter = createBlock("willow_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_drawer_counter = createBlock("willow_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_double_drawer_counter = createBlock("willow_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> willow_cupboard_counter = createBlock("willow_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> witch_hazel_wardrobe = createBlock("witch_hazel_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_modern_wardrobe = createBlock("witch_hazel_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_double_wardrobe = createBlock("witch_hazel_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_bookshelf = createBlock("witch_hazel_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_bookshelf_cupboard = createBlock("witch_hazel_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_drawer = createBlock("witch_hazel_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_double_drawer = createBlock("witch_hazel_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_bookshelf_drawer = createBlock("witch_hazel_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_lower_bookshelf_drawer = createBlock("witch_hazel_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_large_drawer = createBlock("witch_hazel_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_lower_triple_drawer = createBlock("witch_hazel_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_triple_drawer = createBlock("witch_hazel_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_desk = createBlock("witch_hazel_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_covered_desk = createBlock("witch_hazel_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_modern_desk = createBlock("witch_hazel_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_table = createBlock("witch_hazel_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_end_table = createBlock("witch_hazel_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_coffee_table = createBlock("witch_hazel_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_glass_table = createBlock("witch_hazel_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_chair = createBlock("witch_hazel_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_modern_chair = createBlock("witch_hazel_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_striped_chair = createBlock("witch_hazel_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_stool_chair = createBlock("witch_hazel_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_counter = createBlock("witch_hazel_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_drawer_counter = createBlock("witch_hazel_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_double_drawer_counter = createBlock("witch_hazel_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> witch_hazel_cupboard_counter = createBlock("witch_hazel_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> zelkova_wardrobe = createBlock("zelkova_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_modern_wardrobe = createBlock("zelkova_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_double_wardrobe = createBlock("zelkova_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_bookshelf = createBlock("zelkova_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_bookshelf_cupboard = createBlock("zelkova_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_drawer = createBlock("zelkova_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_double_drawer = createBlock("zelkova_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_bookshelf_drawer = createBlock("zelkova_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_lower_bookshelf_drawer = createBlock("zelkova_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_large_drawer = createBlock("zelkova_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_lower_triple_drawer = createBlock("zelkova_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_triple_drawer = createBlock("zelkova_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_desk = createBlock("zelkova_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_covered_desk = createBlock("zelkova_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_modern_desk = createBlock("zelkova_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_table = createBlock("zelkova_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_end_table = createBlock("zelkova_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_coffee_table = createBlock("zelkova_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_glass_table = createBlock("zelkova_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_chair = createBlock("zelkova_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_modern_chair = createBlock("zelkova_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_striped_chair = createBlock("zelkova_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_stool_chair = createBlock("zelkova_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_counter = createBlock("zelkova_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_drawer_counter = createBlock("zelkova_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_double_drawer_counter = createBlock("zelkova_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> zelkova_cupboard_counter = createBlock("zelkova_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	 
	public static final RegistryObject<Block> bulbis_wardrobe = createBlock("bulbis_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_modern_wardrobe = createBlock("bulbis_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_double_wardrobe = createBlock("bulbis_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_bookshelf = createBlock("bulbis_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_bookshelf_cupboard = createBlock("bulbis_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_drawer = createBlock("bulbis_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_double_drawer = createBlock("bulbis_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_bookshelf_drawer = createBlock("bulbis_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_lower_bookshelf_drawer = createBlock("bulbis_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_large_drawer = createBlock("bulbis_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_lower_triple_drawer = createBlock("bulbis_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_triple_drawer = createBlock("bulbis_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_desk = createBlock("bulbis_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_covered_desk = createBlock("bulbis_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_modern_desk = createBlock("bulbis_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_table = createBlock("bulbis_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_end_table = createBlock("bulbis_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_coffee_table = createBlock("bulbis_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_glass_table = createBlock("bulbis_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_chair = createBlock("bulbis_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_modern_chair = createBlock("bulbis_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_striped_chair = createBlock("bulbis_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_stool_chair = createBlock("bulbis_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_counter = createBlock("bulbis_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_drawer_counter = createBlock("bulbis_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_double_drawer_counter = createBlock("bulbis_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> bulbis_cupboard_counter = createBlock("bulbis_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	public static final RegistryObject<Block> imparius_wardrobe = createBlock("imparius_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_modern_wardrobe = createBlock("imparius_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_double_wardrobe = createBlock("imparius_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_bookshelf = createBlock("imparius_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_bookshelf_cupboard = createBlock("imparius_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_drawer = createBlock("imparius_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_double_drawer = createBlock("imparius_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_bookshelf_drawer = createBlock("imparius_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_lower_bookshelf_drawer = createBlock("imparius_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_large_drawer = createBlock("imparius_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_lower_triple_drawer = createBlock("imparius_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_triple_drawer = createBlock("imparius_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_desk = createBlock("imparius_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_covered_desk = createBlock("imparius_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_modern_desk = createBlock("imparius_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_table = createBlock("imparius_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_end_table = createBlock("imparius_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_coffee_table = createBlock("imparius_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_glass_table = createBlock("imparius_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_chair = createBlock("imparius_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_modern_chair = createBlock("imparius_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_striped_chair = createBlock("imparius_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_stool_chair = createBlock("imparius_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_counter = createBlock("imparius_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_drawer_counter = createBlock("imparius_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_double_drawer_counter = createBlock("imparius_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> imparius_cupboard_counter = createBlock("imparius_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_wardrobe = createBlock("sythian_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_modern_wardrobe = createBlock("sythian_modern_wardrobe", () -> new TallFurnitureHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_double_wardrobe = createBlock("sythian_double_wardrobe", () -> new TallFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_bookshelf = createBlock("sythian_bookshelf", () -> new BookCabinet(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_bookshelf_cupboard = createBlock("sythian_bookshelf_cupboard", () -> new BookCabinetHinge(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_drawer = createBlock("sythian_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_double_drawer = createBlock("sythian_double_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_bookshelf_drawer = createBlock("sythian_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_lower_bookshelf_drawer = createBlock("sythian_lower_bookshelf_drawer", () -> new BookDrawer(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_large_drawer = createBlock("sythian_large_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_lower_triple_drawer = createBlock("sythian_lower_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_triple_drawer = createBlock("sythian_triple_drawer", () -> new WideFurniture(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_desk = createBlock("sythian_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_covered_desk = createBlock("sythian_covered_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_modern_desk = createBlock("sythian_modern_desk", () -> new Desk(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_table = createBlock("sythian_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_end_table = createBlock("sythian_end_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_coffee_table = createBlock("sythian_coffee_table", () -> new Table(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_glass_table = createBlock("sythian_glass_table", () -> new TableHitbox(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_chair = createBlock("sythian_chair", () -> new ClassicChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_modern_chair = createBlock("sythian_modern_chair", () -> new ModernChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_striped_chair = createBlock("sythian_striped_chair", () -> new StripedChair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_stool_chair = createBlock("sythian_stool_chair", () -> new Chair(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_counter = createBlock("sythian_counter", () -> new Counter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_drawer_counter = createBlock("sythian_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_double_drawer_counter = createBlock("sythian_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
	  public static final RegistryObject<Block> sythian_cupboard_counter = createBlock("sythian_cupboard_counter", () -> new CupboardCounter(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));
	  
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(McwFurnituresBYG.TAB_GROUP)));
        return block;
    }
}