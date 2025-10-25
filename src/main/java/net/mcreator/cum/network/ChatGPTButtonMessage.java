
package net.mcreator.cum.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.world.inventory.ChatGPTMenu;
import net.mcreator.cum.procedures.TerraOnButtonClickedProcedure;
import net.mcreator.cum.procedures.PietraOnButtonClickedProcedure;
import net.mcreator.cum.procedures.PericolanteOnButtonClickedProcedure;
import net.mcreator.cum.procedures.IndietroOnButtonClickedProcedure;
import net.mcreator.cum.procedures.FammiRelazioneOnButtonClickedProcedure;
import net.mcreator.cum.procedures.ErbaOnButtonClickedProcedure;
import net.mcreator.cum.procedures.DiamanteOnButtonClickedProcedure;
import net.mcreator.cum.CumMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChatGPTButtonMessage {
	private final int buttonID, x, y, z;

	public ChatGPTButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChatGPTButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChatGPTButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChatGPTButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ChatGPTMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PietraOnButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TerraOnButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 2) {

			ErbaOnButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 3) {

			PericolanteOnButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 4) {

			DiamanteOnButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 5) {

			FammiRelazioneOnButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 6) {

			IndietroOnButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CumMod.addNetworkMessage(ChatGPTButtonMessage.class, ChatGPTButtonMessage::buffer, ChatGPTButtonMessage::new, ChatGPTButtonMessage::handler);
	}
}
