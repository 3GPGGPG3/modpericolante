
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CumModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DO_DASH_IN_CREATIVE = GameRules.register("doDashInCreative", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> MARCO_ATMOSFERICO_EVENT = GameRules.register("marcoAtmosfericoEvent", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> MARCO_ATMOSFERICO_PROBABILITY = GameRules.register("marcoAtmosfericoProbability", GameRules.Category.PLAYER, GameRules.IntegerValue.create(1));
}
