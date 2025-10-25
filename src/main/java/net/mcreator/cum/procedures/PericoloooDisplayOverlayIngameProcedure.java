package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModBlocks;

public class PericoloooDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		return ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_PERICOLANTE.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_PERICOLOSO.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_MEDIO.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_PERICOLANTE_NEGATIVO.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_MEDIO_NEGATIVO.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_PERICOLOSO_NEGATIVO.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_PERICOLANTE_INVERSO.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_MEDIO_INVERSO.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CumModBlocks.BLOCCO_PERICOLOSO_INVERSO.get())
				&& !((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.DIMENSIONE_PERICOLANTE.get())) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.ASSO_MULTIUSO.get())) : false) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
								}
								return false;
							}
						}.checkGamemode(entity));
	}
}
