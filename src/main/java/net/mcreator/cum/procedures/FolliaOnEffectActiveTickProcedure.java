package net.mcreator.cum.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityAnchorArgument;

public class FolliaOnEffectActiveTickProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + 1 + Math.random()), (y + 1 + Math.random() / 3 + Math.random() / 3), z));
	}
}
