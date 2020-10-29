package com.example.examplemod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;


public class BlockBreakMessage {
	@SubscribeEvent
	public void sendMessage(BreakEvent event) {
		
		String part = "(Abu e Arthur) - You broke a block!";

		PlayerEntity player = event.getPlayer();
			
		ITextComponent t = new StringTextComponent(part);

		player.sendMessage(t, null);
	}
}