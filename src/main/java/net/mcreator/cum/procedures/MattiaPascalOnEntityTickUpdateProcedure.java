package net.mcreator.cum.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cum.entity.MattiaPascalEntity;

public class MattiaPascalOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isVehicle() && (entity instanceof MattiaPascalEntity _datEntL1 && _datEntL1.getEntityData().get(MattiaPascalEntity.DATA_story_sound)) == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @p * minecraft_movie:mattia_pascal_story");
			if (entity instanceof MattiaPascalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(MattiaPascalEntity.DATA_story_sound, false);
		}
		if (entity.isVehicle()) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.3), (entity.getLookAngle().y), (entity.getLookAngle().z * 1.3)));
		}
	}
}
