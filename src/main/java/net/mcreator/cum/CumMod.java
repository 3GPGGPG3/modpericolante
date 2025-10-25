package net.mcreator.cum;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.cum.init.CumModTabs;
import net.mcreator.cum.init.CumModSounds;
import net.mcreator.cum.init.CumModPotions;
import net.mcreator.cum.init.CumModParticleTypes;
import net.mcreator.cum.init.CumModPaintings;
import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.init.CumModMenus;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModFluids;
import net.mcreator.cum.init.CumModFluidTypes;
import net.mcreator.cum.init.CumModEntities;
import net.mcreator.cum.init.CumModEnchantments;
import net.mcreator.cum.init.CumModBlocks;
import net.mcreator.cum.init.CumModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("cum")
public class CumMod {
	public static final Logger LOGGER = LogManager.getLogger(CumMod.class);
	public static final String MODID = "cum";

	public CumMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		CumModSounds.REGISTRY.register(bus);
		CumModBlocks.REGISTRY.register(bus);
		CumModBlockEntities.REGISTRY.register(bus);
		CumModItems.REGISTRY.register(bus);
		CumModEntities.REGISTRY.register(bus);
		CumModEnchantments.REGISTRY.register(bus);
		CumModTabs.REGISTRY.register(bus);

		CumModMobEffects.REGISTRY.register(bus);
		CumModPotions.REGISTRY.register(bus);
		CumModPaintings.REGISTRY.register(bus);
		CumModParticleTypes.REGISTRY.register(bus);

		CumModMenus.REGISTRY.register(bus);
		CumModFluids.REGISTRY.register(bus);
		CumModFluidTypes.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
