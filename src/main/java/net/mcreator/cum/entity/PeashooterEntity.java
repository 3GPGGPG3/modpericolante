
package net.mcreator.cum.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.cum.init.CumModEntities;

public class PeashooterEntity extends Monster implements RangedAttackMob {
	public final AnimationState animationState0 = new AnimationState();

	public PeashooterEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CumModEntities.PEASHOOTER.get(), world);
	}

	public PeashooterEntity(EntityType<PeashooterEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 5;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Zombie.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, UomoPrimitivoEntity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ZombieVillager.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Spider.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Husk.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ZombifiedPiglin.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Zoglin.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, ZombieHorse.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Skeleton.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CaveSpider.class, false, false));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 25, 10f) {
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
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		SemiSparatiEntity.shoot(this, target);
	}

	@Override
	public boolean canCollideWith(Entity entity) {
		return true;
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	public static void init() {
		SpawnPlacements.register(CumModEntities.PEASHOOTER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 14);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 100);
		return builder;
	}
}
