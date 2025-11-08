package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.entity.OliviaEntity;
import net.mcreator.cum.CumMod;

public class OliviaRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof OliviaEntity _datEntL0 && _datEntL0.getEntityData().get(OliviaEntity.DATA_sexing)) == true
				&& !((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CumModItems.REGGISENO_DI_OLIVIA.get())
				&& (entity instanceof OliviaEntity _datEntL3 && _datEntL3.getEntityData().get(OliviaEntity.DATA_infiling)) == false) {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_sexing, false);
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_infiling, true);
			CumMod.queueServerWork(80, () -> {
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_infiling, false);
			});
		} else if ((entity instanceof OliviaEntity _datEntL8 && _datEntL8.getEntityData().get(OliviaEntity.DATA_angry)) == true
				&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.POPPY.asItem()) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.POPPY);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_angry, false);
		} else if ((entity instanceof OliviaEntity _datEntL13 && _datEntL13.getEntityData().get(OliviaEntity.DATA_walk_naked)) == true
				&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CumModItems.REGGISENO_DI_OLIVIA.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.AMBIENT, 1, 1, false);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CumModItems.REGGISENO_DI_OLIVIA.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, false);
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_normal, true);
		}
	}
}
