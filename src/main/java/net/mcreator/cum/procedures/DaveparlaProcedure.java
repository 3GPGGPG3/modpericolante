package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.entity.DaveEntity;

public class DaveparlaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof DaveEntity _datEntI ? _datEntI.getEntityData().get(DaveEntity.DATA_dialogo) : 0) == 0 && Math.random() < 0.001) {
			if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			} else if (Math.random() < 0.6) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			}
		}
		if ((entity instanceof DaveEntity _datEntI ? _datEntI.getEntityData().get(DaveEntity.DATA_dialogo) : 0) == 1) {
			if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> gLi zOmBIE voGLioNO ManGIArE lE MIE PIANTE!"), false);
				if (Math.random() < 0.2) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.2) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> DevO pROtEggErE lE MIe piANTe!!"), false);
				if (Math.random() < 0.2) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> i'vE HeaRD tHaT AlsO pRImiTIvE mEn WanT To eAT mY pLAnTS."), false);
				if (Math.random() < 0.2) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> YoU saI wHY iO spEAk dUE laNGuaGes? pErKEo I soNo CRAZYYY!!!!!!!"), false);
				if (Math.random() < 0.2) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> vOGlIo Un AltRO tACo!"), false);
				if (Math.random() < 0.2) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> Di noTTe lE PiaNTe sOnO sTAnChe!"), false);
				if (Math.random() < 0.2) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> oGNi TanTO viENi A viSItaRe il MiO nEgoZIo!!"), false);
				if (Math.random() < 0.2) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (Math.random() < 0.004) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> voGLio faRe SESSO PAZZO!!!!!!!"), false);
				if (Math.random() < 0.02) {
					if (entity instanceof DaveEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 2);
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave2")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave3")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave4")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave5_contento")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave6")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else if (Math.random() < 0.55) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave7")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave9")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			}
		}
		if ((entity instanceof DaveEntity _datEntI ? _datEntI.getEntityData().get(DaveEntity.DATA_dialogo) : 0) == 2) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> sAI? i mIEi faMIlIaRi diCOno chE iO SIA PAZZO e aLLOra mI haNNo FattO diCHiaRare iNTerdeTTo giUdiZIAlE!"), false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave8_arrabbiato")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave8_arrabbiato")), SoundSource.AMBIENT, 1, 1, false);
				}
			}
			if (entity instanceof DaveEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 3);
		}
	}
}
