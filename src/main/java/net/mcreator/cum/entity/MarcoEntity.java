
package net.mcreator.cum.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.cum.procedures.MarkNotWalkProcedure;
import net.mcreator.cum.procedures.MarcoOnEntityTickUpdateProcedure;
import net.mcreator.cum.procedures.MarcoEntityIsHurtProcedure;
import net.mcreator.cum.procedures.MarcoCalciaProcedure;
import net.mcreator.cum.procedures.MarcCanWalkProcedure;
import net.mcreator.cum.init.CumModEntities;

public class MarcoEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_sta_calciando = SynchedEntityData.defineId(MarcoEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();

	public MarcoEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CumModEntities.MARCO.get(), world);
	}

	public MarcoEntity(EntityType<MarcoEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 20;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_sta_calciando, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = MarcoEntity.this.getX();
				double y = MarcoEntity.this.getY();
				double z = MarcoEntity.this.getZ();
				Entity entity = MarcoEntity.this;
				Level world = MarcoEntity.this.level();
				return super.canUse() && MarcCanWalkProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = MarcoEntity.this.getX();
				double y = MarcoEntity.this.getY();
				double z = MarcoEntity.this.getZ();
				Entity entity = MarcoEntity.this;
				Level world = MarcoEntity.this.level();
				return super.canContinueToUse() && MarcCanWalkProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = MarcoEntity.this.getX();
				double y = MarcoEntity.this.getY();
				double z = MarcoEntity.this.getZ();
				Entity entity = MarcoEntity.this;
				Level world = MarcoEntity.this.level();
				return super.canUse() && MarcCanWalkProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = MarcoEntity.this.getX();
				double y = MarcoEntity.this.getY();
				double z = MarcoEntity.this.getZ();
				Entity entity = MarcoEntity.this;
				Level world = MarcoEntity.this.level();
				return super.canContinueToUse() && MarcCanWalkProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		MarcoEntityIsHurtProcedure.execute(entity, sourceentity);
		return super.hurt(damagesource, amount);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Datasta_calciando", this.entityData.get(DATA_sta_calciando));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datasta_calciando"))
			this.entityData.set(DATA_sta_calciando, compound.getBoolean("Datasta_calciando"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(MarkNotWalkProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(MarcoCalciaProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		MarcoOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.34);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 1);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 4);
		return builder;
	}
}
