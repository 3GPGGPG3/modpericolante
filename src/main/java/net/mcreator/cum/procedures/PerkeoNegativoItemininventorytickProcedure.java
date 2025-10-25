package net.mcreator.cum.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.world.inventory.BalatroGUIMenu;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEnchantments;
import net.mcreator.cum.init.CumModBlocks;

public class PerkeoNegativoItemininventorytickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(EnchantmentHelper.getItemEnchantmentLevel(CumModEnchantments.NEGATIVITA.get(), itemstack) != 0)) {
			itemstack.enchant(CumModEnchantments.NEGATIVITA.get(), 1);
		}
		if (entity instanceof Player _plr4 && _plr4.containerMenu instanceof BalatroGUIMenu) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("perkeon");
				if (_so == null)
					_so = _sc.addObjective("perkeon", ObjectiveCriteria.DUMMY, Component.literal("perkeon"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
		}
		if (!(entity instanceof Player _plr6 && _plr6.containerMenu instanceof BalatroGUIMenu) && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("perkeon", entity) == 1) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("perkeon");
				if (_so == null)
					_so = _sc.addObjective("perkeon", ObjectiveCriteria.DUMMY, Component.literal("perkeon"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.5) {
						if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModBlocks.BLOCCO_PERICOLANTE.get())) : false)
								|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModBlocks.BLOCCO_PERICOLANTE_NEGATIVO.get())) : false)) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CumModBlocks.BLOCCO_PERICOLANTE_NEGATIVO.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					} else {
						if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.STELLA_DEL_GODO.get())) : false)
								|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.STELLA_DEL_GODO_NEGATIVA.get())) : false)) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CumModItems.STELLA_DEL_GODO_NEGATIVA.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				} else {
					if (Math.random() < 0.5) {
						if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.DIMENSIONE_PERICOLANTE.get())) : false)
								|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.ASSO_DI_PICCHIE_NEGATIVO.get())) : false)) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CumModItems.ASSO_DI_PICCHIE_NEGATIVO.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					} else {
						if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.ECTOPLASMA.get())) : false)
								|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.ECTOPLASMA_NEGATIVO.get())) : false)) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CumModItems.ECTOPLASMA_NEGATIVO.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				}
			} else {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.5) {
						if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.STAFFA_DEL_GODO.get())) : false)
								|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.STAFFA_DEL_GODO_NEGATIVA.get())) : false)) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CumModItems.STAFFA_DEL_GODO_NEGATIVA.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					} else {
						if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.CIANOGRAFIA.get())) : false)
								|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.CIANOGRAFIA_NEGATIVA.get())) : false)) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CumModItems.CIANOGRAFIA_NEGATIVA.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				} else {
					if (Math.random() < 0.5) {
						if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.PERKEO.get())) : false)
								|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModItems.PERKEO_NEGATIVO.get())) : false)) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CumModItems.PERKEO_NEGATIVO.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					} else {
						if (Math.random() < 0.5) {
							if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModBlocks.BLOCCO_PERICOLOSO.get())) : false)
									|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModBlocks.BLOCCO_PERICOLOSO_NEGATIVO.get())) : false)) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(CumModBlocks.BLOCCO_PERICOLOSO_NEGATIVO.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							}
						} else {
							if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModBlocks.BLOCCO_MEDIO.get())) : false)
									|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CumModBlocks.BLOCCO_MEDIO_NEGATIVO.get())) : false)) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(CumModBlocks.BLOCCO_MEDIO_NEGATIVO.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							}
						}
					}
				}
			}
		}
	}
}
