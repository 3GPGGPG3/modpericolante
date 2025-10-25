package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cum.CumMod;

public class MINOSPRIMEENTITYISHURTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 390 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("mp_weak", entity) == 0 && entity.isAlive()) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("WEAK"), false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_weak")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_weak")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("mp_weak");
				if (_so == null)
					_so = _sc.addObjective("mp_weak", ObjectiveCriteria.DUMMY, Component.literal("mp_weak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
		}
		if (entity instanceof Mob _mobEnt6 && _mobEnt6.isAggressive() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("minosatt", entity) == 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("minosatt");
				if (_so == null)
					_so = _sc.addObjective("minosatt", ObjectiveCriteria.DUMMY, Component.literal("minosatt"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
			if (Math.random() < 0.7) {
				CumMod.queueServerWork(40, () -> {
					if (Math.random() < 0.38) {
						if (entity.isAlive()) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("JUDGMENT!"), false);
							if (Math.random() < 0.5) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_judgment2")), SoundSource.HOSTILE, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_judgment2")), SoundSource.HOSTILE, 1, 1, false);
									}
								}
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_judgment")), SoundSource.HOSTILE, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_judgment")), SoundSource.HOSTILE, 1, 1, false);
									}
								}
							}
							CumMod.queueServerWork(25, () -> {
								if (entity.isAlive()) {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tp @s @p");
										}
									}
									entity.setNoGravity(false);
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 7, Level.ExplosionInteraction.MOB);
									{
										Entity _ent = entity;
										Scoreboard _sc = _ent.level().getScoreboard();
										Objective _so = _sc.getObjective("minosatt");
										if (_so == null)
											_so = _sc.addObjective("minosatt", ObjectiveCriteria.DUMMY, Component.literal("minosatt"), ObjectiveCriteria.RenderType.INTEGER);
										_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
									}
								}
							});
						}
					} else {
						if (Math.random() < 0.5) {
							if (entity.isAlive()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 70, 90, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 30, 9, false, false));
								CumMod.queueServerWork(30, () -> {
									if (entity.isAlive()) {
										entity.setNoGravity(true);
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Die!"), false);
										if (Math.random() < 0.5) {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_die")), SoundSource.HOSTILE, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_die")), SoundSource.HOSTILE, 1, 1, false);
												}
											}
										} else {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_die2")), SoundSource.HOSTILE, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_die2")), SoundSource.HOSTILE, 1, 1, false);
												}
											}
										}
										CumMod.queueServerWork(25, () -> {
											if (entity.isAlive()) {
												{
													Entity _ent = entity;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tp @s @p");
													}
												}
												entity.setNoGravity(false);
												if (world instanceof Level _level && !_level.isClientSide())
													_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 4, Level.ExplosionInteraction.MOB);
												{
													Entity _ent = entity;
													Scoreboard _sc = _ent.level().getScoreboard();
													Objective _so = _sc.getObjective("minosatt");
													if (_so == null)
														_so = _sc.addObjective("minosatt", ObjectiveCriteria.DUMMY, Component.literal("minosatt"), ObjectiveCriteria.RenderType.INTEGER);
													_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
												}
											}
										});
									}
								});
							}
						} else {
							if (entity.isAlive()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 119, 90, false, false));
								CumMod.queueServerWork(30, () -> {
									if (entity.isAlive()) {
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Thy end is now!"), false);
										if (Math.random() < 0.5) {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_thyend")), SoundSource.HOSTILE, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_thyend")), SoundSource.HOSTILE, 1, 1, false);
												}
											}
										} else {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_thyend2")), SoundSource.HOSTILE, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:mp_thyend2")), SoundSource.HOSTILE, 1, 1, false);
												}
											}
										}
										CumMod.queueServerWork(17, () -> {
											if (entity.isAlive()) {
												{
													Entity _ent = entity;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tp @s @p");
													}
												}
												CumMod.queueServerWork(17, () -> {
													if (entity.isAlive()) {
														{
															Entity _ent = entity;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																				_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"tp @s @p");
															}
														}
														CumMod.queueServerWork(17, () -> {
															if (entity.isAlive()) {
																{
																	Entity _ent = entity;
																	if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands()
																				.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																						_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"tp @s @p");
																	}
																}
																CumMod.queueServerWork(17, () -> {
																	if (entity.isAlive()) {
																		{
																			Entity _ent = entity;
																			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																						_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"tp @s @p");
																			}
																		}
																		CumMod.queueServerWork(21, () -> {
																			if (entity.isAlive()) {
																				{
																					Entity _ent = entity;
																					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																						_ent.getServer().getCommands()
																								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																										_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
																										_ent.level().getServer(), _ent), "tp @s @p");
																					}
																				}
																				{
																					Entity _ent = entity;
																					Scoreboard _sc = _ent.level().getScoreboard();
																					Objective _so = _sc.getObjective("minosatt");
																					if (_so == null)
																						_so = _sc.addObjective("minosatt", ObjectiveCriteria.DUMMY, Component.literal("minosatt"), ObjectiveCriteria.RenderType.INTEGER);
																					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
																				}
																			}
																		});
																	}
																});
															}
														});
													}
												});
											}
										});
									}
								});
							}
						}
					}
				});
			} else {
				if (entity.isAlive()) {
					CumMod.queueServerWork(30, () -> {
						if (entity.isAlive()) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tp @s @p");
								}
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.level().getScoreboard();
								Objective _so = _sc.getObjective("minosatt");
								if (_so == null)
									_so = _sc.addObjective("minosatt", ObjectiveCriteria.DUMMY, Component.literal("minosatt"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
							}
						}
					});
				}
			}
		}
	}
}
