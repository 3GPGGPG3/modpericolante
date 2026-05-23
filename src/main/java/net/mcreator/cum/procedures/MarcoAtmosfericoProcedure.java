package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModGameRules;
import net.mcreator.cum.CumMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MarcoAtmosfericoProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (!((world.getLevelData().getGameRules().getInt(CumModGameRules.MARCO_ATMOSFERICO_PROBABILITY)) <= 200 && (world.getLevelData().getGameRules().getInt(CumModGameRules.MARCO_ATMOSFERICO_PROBABILITY)) >= 1)) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal(
								(("MarcoAtmosfericoProbability has to be from 1 to 20. You put " + (world.getLevelData().getGameRules().getInt(CumModGameRules.MARCO_ATMOSFERICO_PROBABILITY))) + " that can't be accepted, so the now it is set to 1.")),
								false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("If you wish to disable the event, you need to set the game rule MarcoAtmosfericoEvent to false."), false);
			world.getLevelData().getGameRules().getRule(CumModGameRules.MARCO_ATMOSFERICO_PROBABILITY).set(1, world.getServer());
		}
		if (world.getLevelData().getGameRules().getBoolean(CumModGameRules.MARCO_ATMOSFERICO_EVENT) == true && Math.random() < (world.getLevelData().getGameRules().getInt(CumModGameRules.MARCO_ATMOSFERICO_PROBABILITY)) / 10000) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:marco_urla")), SoundSource.AMBIENT, 2, (float) 0.1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:marco_urla")), SoundSource.AMBIENT, 2, (float) 0.1, false);
				}
			}
			CumMod.queueServerWork(40, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:marco_rompe")), SoundSource.AMBIENT, 2, (float) 0.1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:marco_rompe")), SoundSource.AMBIENT, 2, (float) 0.1, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			});
		}
	}
}
