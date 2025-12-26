package net.mcreator.cum.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.CumMod;

public class AnelloAncestraleItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CumModMobEffects.PENALIZZATO.get())) {
			CumMod.queueServerWork(2, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.removeAllEffects();
				CumMod.queueServerWork(1, () -> {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CumModMobEffects.POWER.get(), 9999999, 0, false, false));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"title @a subtitle {\"text\":\"L'Anello Ancestrale ha negato la penalit\u00E0.\",\"bold\":true,\"italic\":true,\"underlined\":true,\"color\":\"gold\"}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"title @a title [\"\",{\"text\":\"GODO \",\"bold\":true,\"italic\":true,\"strikethrough\":true,\"obfuscated\":true,\"color\":\"gold\"},{\"text\":\"Penalit\u00E0 negata\",\"bold\":true,\"italic\":true,\"underlined\":true,\"color\":\"gold\"},{\"text\":\"GODO\",\"bold\":true,\"italic\":true,\"strikethrough\":true,\"obfuscated\":true,\"color\":\"gold\"}]");
				});
			});
		}
	}
}
