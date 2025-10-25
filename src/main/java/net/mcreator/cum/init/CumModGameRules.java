
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CumModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DO_DASH_IN_CREATIVE = GameRules.register("doDashInCreative", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
