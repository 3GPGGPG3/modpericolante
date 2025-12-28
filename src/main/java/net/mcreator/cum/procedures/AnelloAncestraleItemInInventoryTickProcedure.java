package net.mcreator.cum.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
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
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/effect clear @s cum:penalizzato");
					}
				}
				CumMod.queueServerWork(1, () -> {
					if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CumModMobEffects.POWER.get())) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CumModMobEffects.POWER.get(), 9999999, 0, false, false));
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"title @a subtitle {\"text\":\"L'Anello Ancestrale ha negato la penalit\u00E0.\",\"bold\":true,\"italic\":true,\"underlined\":true,\"color\":\"gold\"}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"title @a title [\"\",{\"text\":\"GODO \",\"bold\":true,\"italic\":true,\"strikethrough\":true,\"obfuscated\":true,\"color\":\"gold\"},{\"text\":\"Penalit\u00E0 negata\",\"bold\":true,\"italic\":true,\"underlined\":true,\"color\":\"gold\"},{\"text\":\"GODO\",\"bold\":true,\"italic\":true,\"strikethrough\":true,\"obfuscated\":true,\"color\":\"gold\"}]");
				});
			});
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 1) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
