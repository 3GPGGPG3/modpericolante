package net.mcreator.cum.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.MattiaPascalEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MattiaPascalPlaybackConditionProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof MattiaPascalEntity _datEntL0 && _datEntL0.getEntityData().get(MattiaPascalEntity.DATA_disco_sound);
	}
}
