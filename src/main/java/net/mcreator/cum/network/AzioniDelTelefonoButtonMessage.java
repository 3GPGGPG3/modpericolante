
package net.mcreator.cum.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.world.inventory.AzioniDelTelefonoMenu;
import net.mcreator.cum.procedures.ScommessaOnButtonClickedProcedure;
import net.mcreator.cum.procedures.PCraftOnButtonClickedProcedure;
import net.mcreator.cum.procedures.MAPSOnButtonClickedProcedure;
import net.mcreator.cum.procedures.ChatGPTOnButtonClickedProcedure;
import net.mcreator.cum.procedures.CaricaLaBatteriaOnButtonClickedProcedure;
import net.mcreator.cum.CumMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AzioniDelTelefonoButtonMessage {
	private final int buttonID, x, y, z;

	public AzioniDelTelefonoButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AzioniDelTelefonoButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AzioniDelTelefonoButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AzioniDelTelefonoButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = AzioniDelTelefonoMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ChatGPTOnButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ScommessaOnButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			CaricaLaBatteriaOnButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 3) {

			MAPSOnButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			PCraftOnButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CumMod.addNetworkMessage(AzioniDelTelefonoButtonMessage.class, AzioniDelTelefonoButtonMessage::buffer, AzioniDelTelefonoButtonMessage::new, AzioniDelTelefonoButtonMessage::handler);
	}
}
