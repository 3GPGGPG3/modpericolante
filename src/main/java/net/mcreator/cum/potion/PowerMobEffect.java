
package net.mcreator.cum.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.procedures.PowerOnEffectActiveTickjProcedure;
import net.mcreator.cum.procedures.PowerOnEffectActiveTickProcedure;
import net.mcreator.cum.procedures.PowerEffectStartedappliedProcedure;

import java.util.List;
import java.util.ArrayList;

public class PowerMobEffect extends MobEffect {
	public PowerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16751002);
		this.addAttributeModifier(Attributes.ARMOR, "c617098d-28d7-3c4d-bc42-4970d3a0bea9", 75, AttributeModifier.Operation.MULTIPLY_TOTAL);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "15ab4471-8dc5-35d5-94f8-9d163a4d80ff", 75, AttributeModifier.Operation.MULTIPLY_TOTAL);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, "2a4f228d-39ce-3e53-9133-e009306efae5", 50, AttributeModifier.Operation.MULTIPLY_TOTAL);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "23737634-d20d-3983-9684-e7fbaec52816", 50, AttributeModifier.Operation.MULTIPLY_TOTAL);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "9b51af51-7578-347f-b72c-954d473f5c67", 600, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "1891de58-eece-3510-a265-e953e19929df", 20, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "0a687ebc-7227-347d-ae44-cefe6d831c72", 20, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "3e045ebe-1791-3442-884b-79a02da2917f", 0.25, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ARMOR_TOUGHNESS, "544844d9-2993-3896-8041-3bbb625071a0", 75, AttributeModifier.Operation.MULTIPLY_TOTAL);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, "49847dc3-c90d-3c13-98a4-b56bf7b8acd8", 0.17, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		PowerEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PowerOnEffectActiveTickjProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return PowerOnEffectActiveTickProcedure.execute(amplifier, duration);
	}
}
