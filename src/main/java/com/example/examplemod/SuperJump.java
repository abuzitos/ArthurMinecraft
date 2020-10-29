package com.example.examplemod;

import net.minecraft.client.KeyboardListener;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.entity.player.PlayerEntity;

public class SuperJump {

	// @SubscribeEvent
	// public void makeJumpHigher(LivingJumpEvent event) {
	// if (!(event.entity instanceof EntityPlayer)) {
	// return;
	// }
	// event.entity.motionY *= 5;
	// }

	@SubscribeEvent
	public void makeJumpHigher(LivingJumpEvent event) {

		if (event.getEntityLiving() instanceof PlayerEntity) {

			if (event.getEntityLiving().collidedVertically == true) {
				System.out.println("Colisão");
			} else {
				Entity entity = event.getEntityLiving();
				double y = entity.getMotion().getY();
				y = y * 10;
				entity.setMotion(entity.getMotion().getX(), y, entity.getMotion().getZ());
				System.out.println("Tecla de espaço");
			}
		}
	}
}
