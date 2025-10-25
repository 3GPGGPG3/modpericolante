package net.mcreator.cum.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.init.CumModEntities;
import net.mcreator.cum.entity.FireballStrayProjEntity;
import net.mcreator.cum.CumMod;

public class MaliciousFaceOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("mauriceattack", entity) == 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("mauriceattack");
				if (_so == null)
					_so = _sc.addObjective("mauriceattack", ObjectiveCriteria.DUMMY, Component.literal("mauriceattack"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
			CumMod.queueServerWork(20, () -> {
				if (entity.isAlive()) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new FireballStrayProjEntity(CumModEntities.FIREBALL_STRAY_PROJ.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 5, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					CumMod.queueServerWork(5, () -> {
						if (entity.isAlive()) {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new FireballStrayProjEntity(CumModEntities.FIREBALL_STRAY_PROJ.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 5, 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							CumMod.queueServerWork(5, () -> {
								if (entity.isAlive()) {
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level();
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
													AbstractArrow entityToSpawn = new FireballStrayProjEntity(CumModEntities.FIREBALL_STRAY_PROJ.get(), level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity, 5, 1);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
									CumMod.queueServerWork(5, () -> {
										if (entity.isAlive()) {
											{
												Entity _shootFrom = entity;
												Level projectileLevel = _shootFrom.level();
												if (!projectileLevel.isClientSide()) {
													Projectile _entityToSpawn = new Object() {
														public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
															AbstractArrow entityToSpawn = new FireballStrayProjEntity(CumModEntities.FIREBALL_STRAY_PROJ.get(), level);
															entityToSpawn.setOwner(shooter);
															entityToSpawn.setBaseDamage(damage);
															entityToSpawn.setKnockback(knockback);
															entityToSpawn.setSilent(true);
															return entityToSpawn;
														}
													}.getArrow(projectileLevel, entity, 5, 1);
													_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
													_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
													projectileLevel.addFreshEntity(_entityToSpawn);
												}
											}
											CumMod.queueServerWork(5, () -> {
												if (entity.isAlive()) {
													{
														Entity _shootFrom = entity;
														Level projectileLevel = _shootFrom.level();
														if (!projectileLevel.isClientSide()) {
															Projectile _entityToSpawn = new Object() {
																public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																	AbstractArrow entityToSpawn = new FireballStrayProjEntity(CumModEntities.FIREBALL_STRAY_PROJ.get(), level);
																	entityToSpawn.setOwner(shooter);
																	entityToSpawn.setBaseDamage(damage);
																	entityToSpawn.setKnockback(knockback);
																	entityToSpawn.setSilent(true);
																	return entityToSpawn;
																}
															}.getArrow(projectileLevel, entity, 5, 1);
															_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
															_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
															projectileLevel.addFreshEntity(_entityToSpawn);
														}
													}
													CumMod.queueServerWork(5, () -> {
														if (entity.isAlive()) {
															{
																Entity _shootFrom = entity;
																Level projectileLevel = _shootFrom.level();
																if (!projectileLevel.isClientSide()) {
																	Projectile _entityToSpawn = new Object() {
																		public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																			AbstractArrow entityToSpawn = new FireballStrayProjEntity(CumModEntities.FIREBALL_STRAY_PROJ.get(), level);
																			entityToSpawn.setOwner(shooter);
																			entityToSpawn.setBaseDamage(damage);
																			entityToSpawn.setKnockback(knockback);
																			entityToSpawn.setSilent(true);
																			return entityToSpawn;
																		}
																	}.getArrow(projectileLevel, entity, 5, 1);
																	_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																	_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
																	projectileLevel.addFreshEntity(_entityToSpawn);
																}
															}
															CumMod.queueServerWork(5, () -> {
																if (entity.isAlive()) {
																	{
																		Entity _shootFrom = entity;
																		Level projectileLevel = _shootFrom.level();
																		if (!projectileLevel.isClientSide()) {
																			Projectile _entityToSpawn = new Object() {
																				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																					AbstractArrow entityToSpawn = new FireballStrayProjEntity(CumModEntities.FIREBALL_STRAY_PROJ.get(), level);
																					entityToSpawn.setOwner(shooter);
																					entityToSpawn.setBaseDamage(damage);
																					entityToSpawn.setKnockback(knockback);
																					entityToSpawn.setSilent(true);
																					return entityToSpawn;
																				}
																			}.getArrow(projectileLevel, entity, 5, 1);
																			_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																			_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
																			projectileLevel.addFreshEntity(_entityToSpawn);
																		}
																	}
																	CumMod.queueServerWork(36, () -> {
																		{
																			Entity _ent = entity;
																			Scoreboard _sc = _ent.level().getScoreboard();
																			Objective _so = _sc.getObjective("mauriceattack");
																			if (_so == null)
																				_so = _sc.addObjective("mauriceattack", ObjectiveCriteria.DUMMY, Component.literal("mauriceattack"), ObjectiveCriteria.RenderType.INTEGER);
																			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
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
					});
				}
			});
		}
	}
}
