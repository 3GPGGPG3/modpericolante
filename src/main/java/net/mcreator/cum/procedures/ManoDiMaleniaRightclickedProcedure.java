package net.mcreator.cum.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cum.CumMod;

public class ManoDiMaleniaRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.onGround() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("mano_malenia", entity) == 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("mano_malenia");
				if (_so == null)
					_so = _sc.addObjective("mano_malenia", ObjectiveCriteria.DUMMY, Component.literal("mano_malenia"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, x, y, z, 5, 3, 3, 3, 1);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 15);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 45, 7, false, false));
			entity.setNoGravity(true);
			CumMod.queueServerWork(15, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute at @p positioned ~ ~ ~ run tp @p ^ ^ ^6.7");
				CumMod.queueServerWork(3, () -> {
					entity.setNoGravity(false);
					CumMod.queueServerWork(7, () -> {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 25, 5, false, false));
						CumMod.queueServerWork(25, () -> {
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(itemstack.getItem(), 90);
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.level().getScoreboard();
								Objective _so = _sc.getObjective("mano_malenia");
								if (_so == null)
									_so = _sc.addObjective("mano_malenia", ObjectiveCriteria.DUMMY, Component.literal("mano_malenia"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
							}
						});
					});
				});
			});
		}
	}
}
