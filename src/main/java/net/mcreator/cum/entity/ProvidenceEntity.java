
package net.mcreator.cum.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.procedures.ProvidenceOnEntityTickUpdateProcedure;
import net.mcreator.cum.procedures.ProvidenceEntityIsHurtProcedure;
import net.mcreator.cum.procedures.ProvidenceEntityDiesProcedure;
import net.mcreator.cum.procedures.ProvIdleProcedure;
import net.mcreator.cum.procedures.ProvAttackProcedure;
import net.mcreator.cum.init.CumModEntities;

public class ProvidenceEntity extends Monster implements RangedAttackMob {
	public static final EntityDataAccessor<Boolean> DATA_is_attacking = SynchedEntityData.defineId(ProvidenceEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState1 = new AnimationState();

	public ProvidenceEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CumModEntities.PROVIDENCE.get(), world);
	}

	public ProvidenceEntity(EntityType<ProvidenceEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 30;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_is_attacking, false);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, V1Entity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, V2Entity.class, false, false));
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 1, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = ProvidenceEntity.this.getRandom();
				double dir_x = ProvidenceEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = ProvidenceEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = ProvidenceEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

			@Override
			public boolean canUse() {
				double x = ProvidenceEntity.this.getX();
				double y = ProvidenceEntity.this.getY();
				double z = ProvidenceEntity.this.getZ();
				Entity entity = ProvidenceEntity.this;
				Level world = ProvidenceEntity.this.level();
				return super.canUse() && ProvIdleProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ProvidenceEntity.this.getX();
				double y = ProvidenceEntity.this.getY();
				double z = ProvidenceEntity.this.getZ();
				Entity entity = ProvidenceEntity.this;
				Level world = ProvidenceEntity.this.level();
				return super.canContinueToUse() && ProvIdleProcedure.execute(entity);
			}

		});
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(6, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 40, 30f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:providence_death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
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

		ProvidenceEntityIsHurtProcedure.execute(world, entity);
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		ProvidenceEntityDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Datais_attacking", this.entityData.get(DATA_is_attacking));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datais_attacking"))
			this.entityData.set(DATA_is_attacking, compound.getBoolean("Datais_attacking"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(ProvIdleProcedure.execute(this), this.tickCount);
			this.animationState1.animateWhen(ProvAttackProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		ProvidenceOnEntityTickUpdateProcedure.execute(this.level(), this);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		MagentaProiettileEntity.shoot(this, target);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 200);
		builder = builder.add(Attributes.ARMOR, 4);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 18);
		builder = builder.add(Attributes.FOLLOW_RANGE, 200);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.8);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}
}
