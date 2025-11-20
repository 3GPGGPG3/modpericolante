package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.CumMod;

public class NormadestudentazioneentityswingsitemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(CumModItems.NORMADESTUDENTAZIONE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CumModMobEffects.VACATIOLEGIS.get(), 300, 10, false, false));
		CumMod.queueServerWork(300, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CumModMobEffects.DESTUDENTAZIONEEFFECT.get());
		});
	}
}
