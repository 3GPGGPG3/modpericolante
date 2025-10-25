
package net.mcreator.cum.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
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
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModEntities;

public class KillerEntity extends Monster {
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.WHITE, ServerBossEvent.BossBarOverlay.PROGRESS);

	public KillerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CumModEntities.KILLER.get(), world);
	}

	public KillerEntity(EntityType<KillerEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.4f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
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
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MattiaPascalEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, AlessandroManzoniEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DiFazioEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, FlashPanopticomEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MinosPrimeEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MirabellaEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Pericolante1Entity.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Pericolante2Entity.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Pericolante3Entity.class, false, false));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Pericolante4Entity.class, false, false));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Pericolante5Entity.class, false, false));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Pericolante6Entity.class, false, false));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Pericolante7Entity.class, false, false));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, SisyphusPrimeEntity.class, false, false));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, GabrielEntity.class, false, false));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, MaliciousFaceEntity.class, false, false));
		this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, V1Entity.class, false, false));
		this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, V2Entity.class, false, false));
		this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, OliviaEntity.class, false, false));
		this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, UomoPrimitivoEntity.class, false, false));
		this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, StrayEntity.class, false, false));
		this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, FilfhEntity.class, false, false));
		this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, FilfhErrEntity.class, false, false));
		this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, VirusEntity.class, false, false));
		this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, PerInv1Entity.class, false, false));
		this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, KillerEntity.class, false, false));
		this.targetSelector.addGoal(30, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(31, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(32, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.ILLAGER;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15f, 1);
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
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		return super.hurt(damagesource, amount);
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
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.6);
		builder = builder.add(Attributes.MAX_HEALTH, 140);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 40);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);
		return builder;
	}
}
