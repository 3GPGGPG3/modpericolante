package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class TomoDellEruditoRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("pa_lev", entity) == 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("pa_lev");
				if (_so == null)
					_so = _sc.addObjective("pa_lev", ObjectiveCriteria.DUMMY, Component.literal("pa_lev"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("pa");
				if (_so == null)
					_so = _sc.addObjective("pa", ObjectiveCriteria.DUMMY, Component.literal("pa"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(140);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.AMBIENT, 1, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 4, false, false));
		} else {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("pa");
				if (_so == null)
					_so = _sc.addObjective("pa", ObjectiveCriteria.DUMMY, Component.literal("pa"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("pa", entity) + 45));
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 250);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.AMBIENT, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 4, false, false));
		}
	}
}
