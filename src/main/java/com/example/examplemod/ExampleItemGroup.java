package com.example.examplemod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ExampleItemGroup extends ItemGroup {
    public static final ExampleItemGroup DEFAULT = new ExampleItemGroup();

    public ExampleItemGroup() {
        super("examplemod");
    }

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(Items.LIGHT_BLUE_BANNER);
	}
	
	
	

    
}