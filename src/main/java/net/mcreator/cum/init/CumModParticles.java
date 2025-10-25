
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cum.client.particle.PericoloParticle;
import net.mcreator.cum.client.particle.BalatroLogParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CumModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CumModParticleTypes.PERICOLO.get(), PericoloParticle::provider);
		event.registerSpriteSet(CumModParticleTypes.BALATRO_LOG_PARTICLE.get(), BalatroLogParticleParticle::provider);
	}
}
