
package net.mcreator.cum.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class AltPiercerBeamEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(CumModItems.BLUE_ORB.get());

	public AltPiercerBeamEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(CumModEntities.ALT_PIERCER_BEAM.get(), world);
	}

	public AltPiercerBeamEntity(EntityType<? extends AltPiercerBeamEntity> type, Level world) {
		super(type, world);
	}

	public AltPiercerBeamEntity(EntityType<? extends AltPiercerBeamEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public AltPiercerBeamEntity(EntityType<? extends AltPiercerBeamEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static AltPiercerBeamEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 10f, 5.4, 0);
	}

	public static AltPiercerBeamEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 10f, 5.4, 0);
	}

	public static AltPiercerBeamEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		AltPiercerBeamEntity entityarrow = new AltPiercerBeamEntity(CumModEntities.ALT_PIERCER_BEAM.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static AltPiercerBeamEntity shoot(LivingEntity entity, LivingEntity target) {
		AltPiercerBeamEntity entityarrow = new AltPiercerBeamEntity(CumModEntities.ALT_PIERCER_BEAM.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 10f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5.4);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
