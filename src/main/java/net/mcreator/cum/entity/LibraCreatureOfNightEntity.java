
package net.mcreator.cum.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.cum.procedures.SePietreEzeroProcedure;
import net.mcreator.cum.procedures.SePietreEunoProcedure;
import net.mcreator.cum.procedures.SePietreEdueProcedure;
import net.mcreator.cum.procedures.LibraCreatureOfNightPlaybackConditionProcedure;
import net.mcreator.cum.procedures.LibraCreatureOfNightOnInitialEntitySpawnProcedure;
import net.mcreator.cum.procedures.LibraCreatureOfNightOnEntityTickUpdateProcedure;
import net.mcreator.cum.procedures.LibraCreatureFolliaProcedure;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEntities;

import javax.annotation.Nullable;

public class LibraCreatureOfNightEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_pietre = SynchedEntityData.defineId(LibraCreatureOfNightEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_follia = SynchedEntityData.defineId(LibraCreatureOfNightEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_whattodo = SynchedEntityData.defineId(LibraCreatureOfNightEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_libraatt = SynchedEntityData.defineId(LibraCreatureOfNightEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_interruzione = SynchedEntityData.defineId(LibraCreatureOfNightEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.RED, ServerBossEvent.BossBarOverlay.PROGRESS);

	public LibraCreatureOfNightEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CumModEntities.LIBRA_CREATURE_OF_NIGHT.get(), world);
	}

	public LibraCreatureOfNightEntity(EntityType<LibraCreatureOfNightEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 500;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(CumModItems.ARMATURA_DEL_GODO_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CumModItems.ARMATURA_DEL_GODO_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CumModItems.ARMATURA_DEL_GODO_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(CumModItems.ARMATURA_DEL_GODO_BOOTS.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_pietre, 0);
		this.entityData.define(DATA_follia, false);
		this.entityData.define(DATA_whattodo, 0);
		this.entityData.define(DATA_libraatt, 0);
		this.entityData.define(DATA_interruzione, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

			@Override
			public boolean canUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canUse() && SePietreEzeroProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canContinueToUse() && SePietreEzeroProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canUse() && SePietreEzeroProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canContinueToUse() && SePietreEzeroProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canUse() && SePietreEzeroProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canContinueToUse() && SePietreEzeroProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new FloatGoal(this) {
			@Override
			public boolean canUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canUse() && SePietreEzeroProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LibraCreatureOfNightEntity.this.getX();
				double y = LibraCreatureOfNightEntity.this.getY();
				double z = LibraCreatureOfNightEntity.this.getZ();
				Entity entity = LibraCreatureOfNightEntity.this;
				Level world = LibraCreatureOfNightEntity.this.level();
				return super.canContinueToUse() && SePietreEzeroProcedure.execute(entity);
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

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(CumModItems.RETURN_HOME.get()));
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
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		LibraCreatureOfNightOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datapietre", this.entityData.get(DATA_pietre));
		compound.putBoolean("Datafollia", this.entityData.get(DATA_follia));
		compound.putInt("Datawhattodo", this.entityData.get(DATA_whattodo));
		compound.putInt("Datalibraatt", this.entityData.get(DATA_libraatt));
		compound.putInt("Datainterruzione", this.entityData.get(DATA_interruzione));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datapietre"))
			this.entityData.set(DATA_pietre, compound.getInt("Datapietre"));
		if (compound.contains("Datafollia"))
			this.entityData.set(DATA_follia, compound.getBoolean("Datafollia"));
		if (compound.contains("Datawhattodo"))
			this.entityData.set(DATA_whattodo, compound.getInt("Datawhattodo"));
		if (compound.contains("Datalibraatt"))
			this.entityData.set(DATA_libraatt, compound.getInt("Datalibraatt"));
		if (compound.contains("Datainterruzione"))
			this.entityData.set(DATA_interruzione, compound.getInt("Datainterruzione"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(LibraCreatureOfNightPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(SePietreEunoProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(LibraCreatureFolliaProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(SePietreEdueProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		LibraCreatureOfNightOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.34);
		builder = builder.add(Attributes.MAX_HEALTH, 1024);
		builder = builder.add(Attributes.ARMOR, 100);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 60);
		builder = builder.add(Attributes.FOLLOW_RANGE, 60);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 4);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);
		return builder;
	}
}
