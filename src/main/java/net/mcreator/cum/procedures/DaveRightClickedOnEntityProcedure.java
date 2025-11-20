package net.mcreator.cum.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.entity.DaveEntity;
import net.mcreator.cum.CumMod;

public class DaveRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CumModItems.TACO.get()) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CumModItems.TACO.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Dave> GrAZie ViCino"), false);
			if (entity instanceof DaveEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 1);
		}
		if ((entity instanceof DaveEntity _datEntI ? _datEntI.getEntityData().get(DaveEntity.DATA_dialogo) : 0) == 3) {
			if (entity instanceof DaveEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DaveEntity.DATA_dialogo, 0);
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"tellraw @a {\"text\":\"[!] Hai infranto la legge facendo compiere ad un interdetto giudiziale atti di straordinaria amministrazione\"}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"tellraw @a {\"text\":\"[!] Hai 15 secondi prima di essere giustiziato\"}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect give @a cum:vacatiolegis 15 10 true");
			CumMod.queueServerWork(300, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon cum:ordinamento_giuridico");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"title @a title {\"text\":\"Sei Ricercato\",\"bold\":true,\"color\":\"dark_red\"}");
			});
		}
	}
}
