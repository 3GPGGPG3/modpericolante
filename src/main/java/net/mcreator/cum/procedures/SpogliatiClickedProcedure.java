package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.entity.OliviaEntity;
import net.mcreator.cum.CumMod;

public class SpogliatiClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof OliviaEntity _datEntL0 && _datEntL0.getEntityData().get(OliviaEntity.DATA_walk_normal)) == true && (entity instanceof OliviaEntity _datEntL1 && _datEntL1.getEntityData().get(OliviaEntity.DATA_angry)) == false
				&& sourceentity.isShiftKeyDown() && !(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(CumModMobEffects.DIVIETODISESSOEFFECT.get()))) {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_normal, false);
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_spogliati, true);
			CumMod.queueServerWork(100, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CumModItems.REGGISENO_DI_OLIVIA.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_spogliati, false);
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, true);
			});
		} else if ((entity instanceof OliviaEntity _datEntL11 && _datEntL11.getEntityData().get(OliviaEntity.DATA_walk_naked)) == true
				&& (entity instanceof OliviaEntity _datEntL12 && _datEntL12.getEntityData().get(OliviaEntity.DATA_angry)) == false) {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, false);
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_sexing, true);
			CumMod.queueServerWork(100, () -> {
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_sexing, false);
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, true);
			});
		}
	}
}
