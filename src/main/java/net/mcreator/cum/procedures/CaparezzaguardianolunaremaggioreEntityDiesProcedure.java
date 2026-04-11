package net.mcreator.cum.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cum.CumMod;

public class CaparezzaguardianolunaremaggioreEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 5; index0++) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 30, Level.ExplosionInteraction.NONE);
		}
		for (int index1 = 0; index1 < 50; index1++) {
			CumMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn
							.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(Mth.nextDouble(RandomSource.create(), x - 20, x + 20), Mth.nextDouble(RandomSource.create(), y - 20, y + 20), Mth.nextDouble(RandomSource.create(), z - 20, z + 20))));;
					_level.addFreshEntity(entityToSpawn);
				}
			});
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"stopsound @a ambient cum:caparezza_fight_loop");
	}
}
