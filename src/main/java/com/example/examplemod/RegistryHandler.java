package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ExampleMod.MODID);

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

	// Block
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",
			() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f)
					.sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));

	public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
			() -> new BlockItem(COPPER_ORE.get(), new Item.Properties().group(ExampleItemGroup.DEFAULT)));
	
	// Arthur
	public static final RegistryObject<Block> ARTHUR = BLOCKS.register("arthur",
			() -> new Block(Block.Properties.create(Material.FIRE).hardnessAndResistance(5.0f, 6.0f)
					.sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));

	public static final RegistryObject<Item> ARTHUR_ITEM = ITEMS.register("arthur",
			() -> new BlockItem(ARTHUR.get(), new Item.Properties().group(ExampleItemGroup.DEFAULT)));
	
	//Item
	public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
			() -> new Item(new Item.Properties().group(ExampleItemGroup.DEFAULT)));
	
	public static final RegistryObject<Item> IRON_INGOT_ARTHUR = ITEMS.register("iron_ingot_arthur",
			() -> new Item(new Item.Properties().group(ExampleItemGroup.DEFAULT)));
	
	public static final RegistryObject<Item> ENDER_INGOT = ITEMS.register("ender_ingot",
			() -> new Item(new EnderIngot.Properties().group(ExampleItemGroup.DEFAULT)));
	
	public static final RegistryObject<Item> CUSTOM_SWORD = ITEMS.register("custom_sword",
			() -> new Item(new CustomSword.Properties().group(ExampleItemGroup.DEFAULT)));
	

	public static void init() {
		// attach DeferredRegister to the event bus
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
		MinecraftForge.EVENT_BUS.register(new SuperJump());
	}

}
