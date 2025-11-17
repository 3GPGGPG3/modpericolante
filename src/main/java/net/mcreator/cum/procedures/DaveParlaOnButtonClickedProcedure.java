package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.entity.DaveEntity;
import net.mcreator.cum.CumMod;

public class DaveParlaOnButtonClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (entity instanceof DaveEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 1);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> ciAo VIcInO iO SoNO DaVE iL pAZzO, mA PUoi chIAmArmI ancHE DavE Il PaZzo!"), false);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave1")), SoundSource.AMBIENT, 1, 1, false);
			}
		}
		CumMod.queueServerWork(40, () -> {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> sE VuOi sApEre dI PI\u00F9 DaMmI uN TACOO!!!!!"), false);
		});
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave8_arrabbiato")), SoundSource.AMBIENT, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:dave8_arrabbiato")), SoundSource.AMBIENT, 1, 1, false);
			}
		}
	}
}
