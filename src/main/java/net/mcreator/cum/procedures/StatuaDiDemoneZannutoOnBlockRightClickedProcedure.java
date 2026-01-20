package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEntities;
import net.mcreator.cum.init.CumModBlocks;

import java.util.Map;

public class StatuaDiDemoneZannutoOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CumModItems.CHIAVE_DI_PIETRA.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.power_select")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.power_select")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CumModItems.CHIAVE_DI_PIETRA.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = CumModBlocks.STATUA_DI_DEMONE_ZANNUTO_USATA.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (Math.random() < 0.4) {
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CumModEntities.KILLER.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CumModEntities.ALESSANDRO_MANZONI.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CumModEntities.MATTIA_PASCAL.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				}
			} else {
				if (Math.random() < 0.4) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.GIOCATORE_VIII.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.GIOCATORE_VIII.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.MALICIOUS_FACE.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.FILFH.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.FILFH.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.STRAY.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.STRAY.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
				} else {
					if (Math.random() < 0.4) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CumModEntities.ORDINAMENTO_GIURIDICO.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CumModEntities.DAVE.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CumModEntities.ASSASSINA_DEI_NERI_COLTELLI.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						}
					} else {
						if (Math.random() < 0.4) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CumModEntities.PERICOLANTE_7.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CumModEntities.PERICOLANTE_4.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CumModEntities.PERICOLANTE_4.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CumModEntities.PER_INV_1.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						}
					}
				}
			}
		}
	}
}
