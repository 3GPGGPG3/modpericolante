package net.mcreator.cum.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cum.init.CumModMobEffects;

public class MaleniaBladeOfMiquellaPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CumModMobEffects.MARCESCENZA_SCARLATTA.get(), 260, 0, false, false));
	}
}
