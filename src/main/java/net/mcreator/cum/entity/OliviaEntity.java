
package net.mcreator.cum.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.cum.procedures.SpogliatiClickedProcedure;
import net.mcreator.cum.procedures.OliviaSexingProcedure;
import net.mcreator.cum.procedures.OliviaRightClickedOnEntityProcedure;
import net.mcreator.cum.procedures.OliviaMentreSpogliaProcedure;
import net.mcreator.cum.procedures.OliviaInfilingProcedure;
import net.mcreator.cum.procedures.OliviaIdleVestitaProcedure;
import net.mcreator.cum.procedures.OliviaIdleNudaConditionProcedure;
import net.mcreator.cum.procedures.OliviaEntityIsHurtProcedure;
import net.mcreator.cum.procedures.OliviaDeveStareFermaProcedure;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEntities;

public class OliviaEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_walk_normal = SynchedEntityData.defineId(OliviaEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_walk_naked = SynchedEntityData.defineId(OliviaEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_spogliati = SynchedEntityData.defineId(OliviaEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_angry = SynchedEntityData.defineId(OliviaEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_sexing = SynchedEntityData.defineId(OliviaEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_infiling = SynchedEntityData.defineId(OliviaEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();
	public final AnimationState animationState6 = new AnimationState();

	public OliviaEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CumModEntities.OLIVIA.get(), world);
	}

	public OliviaEntity(EntityType<OliviaEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 8;
		setNoAi(false);
		setCustomName(Component.literal("Olivia"));
		setCustomNameVisible(true);
		setPersistenceRequired();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_walk_normal, true);
		this.entityData.define(DATA_walk_naked, false);
		this.entityData.define(DATA_spogliati, false);
		this.entityData.define(DATA_angry, false);
		this.entityData.define(DATA_sexing, false);
		this.entityData.define(DATA_infiling, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canContinueToUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canContinueToUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new FloatGoal(this));
		this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, (float) 0.5));
		this.goalSelector.addGoal(5, new TemptGoal(this, 1, Ingredient.of(CumModItems.TERPENE.get()), false) {
			@Override
			public boolean canUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canContinueToUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new TemptGoal(this, 1, Ingredient.of(CumModItems.PENE_DURO.get()), false) {
			@Override
			public boolean canUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canContinueToUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(7, new TemptGoal(this, 1, Ingredient.of(CumModItems.CAZZO_ROSSO.get()), false) {
			@Override
			public boolean canUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canContinueToUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(8, new TemptGoal(this, 1, Ingredient.of(CumModItems.PENE_DELLA_FRENESIA.get()), true) {
			@Override
			public boolean canUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canContinueToUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(9, new TemptGoal(this, 1, Ingredient.of(CumModItems.PENE.get()), true) {
			@Override
			public boolean canUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canUse() && OliviaDeveStareFermaProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = OliviaEntity.this.getX();
				double y = OliviaEntity.this.getY();
				double z = OliviaEntity.this.getZ();
				Entity entity = OliviaEntity.this;
				Level world = OliviaEntity.this.level();
				return super.canContinueToUse() && OliviaDeveStareFermaProcedure.execute(entity);
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

		OliviaEntityIsHurtProcedure.execute(entity);
		return super.hurt(damagesource, amount);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Datawalk_normal", this.entityData.get(DATA_walk_normal));
		compound.putBoolean("Datawalk_naked", this.entityData.get(DATA_walk_naked));
		compound.putBoolean("Dataspogliati", this.entityData.get(DATA_spogliati));
		compound.putBoolean("Dataangry", this.entityData.get(DATA_angry));
		compound.putBoolean("Datasexing", this.entityData.get(DATA_sexing));
		compound.putBoolean("Datainfiling", this.entityData.get(DATA_infiling));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datawalk_normal"))
			this.entityData.set(DATA_walk_normal, compound.getBoolean("Datawalk_normal"));
		if (compound.contains("Datawalk_naked"))
			this.entityData.set(DATA_walk_naked, compound.getBoolean("Datawalk_naked"));
		if (compound.contains("Dataspogliati"))
			this.entityData.set(DATA_spogliati, compound.getBoolean("Dataspogliati"));
		if (compound.contains("Dataangry"))
			this.entityData.set(DATA_angry, compound.getBoolean("Dataangry"));
		if (compound.contains("Datasexing"))
			this.entityData.set(DATA_sexing, compound.getBoolean("Datasexing"));
		if (compound.contains("Datainfiling"))
			this.entityData.set(DATA_infiling, compound.getBoolean("Datainfiling"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		OliviaRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState1.animateWhen(OliviaMentreSpogliaProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(OliviaIdleVestitaProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(OliviaIdleNudaConditionProcedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(OliviaSexingProcedure.execute(this), this.tickCount);
			this.animationState6.animateWhen(OliviaInfilingProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		SpogliatiClickedProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this, sourceentity);
	}

	public static void init() {
		SpawnPlacements.register(CumModEntities.OLIVIA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 8);
		builder = builder.add(Attributes.FOLLOW_RANGE, 25);
		return builder;
	}
}
