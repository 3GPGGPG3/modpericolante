
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.cum.block.entity.TavoloBalatranteBlockEntity;
import net.mcreator.cum.block.entity.FrigoBlockEntity;
import net.mcreator.cum.CumMod;

public class CumModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CumMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TAVOLO_BALATRANTE = register("tavolo_balatrante", CumModBlocks.TAVOLO_BALATRANTE, TavoloBalatranteBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FRIGO = register("frigo", CumModBlocks.FRIGO, FrigoBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
