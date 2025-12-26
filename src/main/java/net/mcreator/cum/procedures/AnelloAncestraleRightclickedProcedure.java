package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.CumMod;

public class AnelloAncestraleRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 4000);
		if (entity instanceof ServerPlayer _player)
			_player.setGameMode(GameType.CREATIVE);
		if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(CumModMobEffects.POWER.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CumModMobEffects.POWER.get(), 9999999, 0, false, false));
		}
		CumMod.queueServerWork(1200, () -> {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
		});
	}
}
