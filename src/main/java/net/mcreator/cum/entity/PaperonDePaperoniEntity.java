
package net.mcreator.cum.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.cum.procedures.PaperoneAttackPlayerConditionProcedure;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEntities;

public class PaperonDePaperoniEntity extends Monster implements RangedAttackMob {
	public static final EntityDataAccessor<Boolean> DATA_Paperone_player_attack_condition = SynchedEntityData.defineId(PaperonDePaperoniEntity.class, EntityDataSerializers.BOOLEAN);

	public PaperonDePaperoniEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CumModEntities.PAPERON_DE_PAPERONI.get(), world);
	}

	public PaperonDePaperoniEntity(EntityType<PaperonDePaperoniEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.4f);
		xpReward = 30;
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
		this.entityData.define(DATA_Paperone_player_attack_condition, true);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new LeapAtTargetGoal(this, (float) 5));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

			@Override
			public boolean canUse() {
				double x = PaperonDePaperoniEntity.this.getX();
				double y = PaperonDePaperoniEntity.this.getY();
				double z = PaperonDePaperoniEntity.this.getZ();
				Entity entity = PaperonDePaperoniEntity.this;
				Level world = PaperonDePaperoniEntity.this.level();
				return super.canUse() && PaperoneAttackPlayerConditionProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = PaperonDePaperoniEntity.this.getX();
				double y = PaperonDePaperoniEntity.this.getY();
				double z = PaperonDePaperoniEntity.this.getZ();
				Entity entity = PaperonDePaperoniEntity.this;
				Level world = PaperonDePaperoniEntity.this.level();
				return super.canContinueToUse() && PaperoneAttackPlayerConditionProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 0.8));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = PaperonDePaperoniEntity.this.getX();
				double y = PaperonDePaperoniEntity.this.getY();
				double z = PaperonDePaperoniEntity.this.getZ();
				Entity entity = PaperonDePaperoniEntity.this;
				Level world = PaperonDePaperoniEntity.this.level();
				return super.canUse() && PaperoneAttackPlayerConditionProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = PaperonDePaperoniEntity.this.getX();
				double y = PaperonDePaperoniEntity.this.getY();
				double z = PaperonDePaperoniEntity.this.getZ();
				Entity entity = PaperonDePaperoniEntity.this;
				Level world = PaperonDePaperoniEntity.this.level();
				return super.canContinueToUse() && PaperoneAttackPlayerConditionProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PaperonDePaperoniEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, EnderMan.class, false, false));
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(10, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(11, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 5, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.ILLAGER;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(CumModItems.BASTONE_PAPERONE.get()));
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
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("DataPaperone_player_attack_condition", this.entityData.get(DATA_Paperone_player_attack_condition));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataPaperone_player_attack_condition"))
			this.entityData.set(DATA_Paperone_player_attack_condition, compound.getBoolean("DataPaperone_player_attack_condition"));
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		ScheggiaDiPietraBalatranteProjectileEntity.shoot(this, target);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.35);
		builder = builder.add(Attributes.MAX_HEALTH, 65);
		builder = builder.add(Attributes.ARMOR, 30);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 10);
		return builder;
	}
}
