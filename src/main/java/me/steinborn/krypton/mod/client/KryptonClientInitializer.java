package me.steinborn.krypton.mod.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.steinborn.krypton.mod.shared.KryptonSharedInitializer;

@EventBusSubscriber(bus = Bus.MOD, modid = KryptonSharedInitializer.MOD_ID, value = Dist.CLIENT)
public class KryptonClientInitializer {
    private static final Logger LOGGER = LogManager.getLogger(KryptonClientInitializer.class);

    @SubscribeEvent
    public static void onInitializeClient(FMLClientSetupEvent event) {
        LOGGER.info("Krypton is now accelerating your Minecraft client's networking stack \uD83D\uDE80");
        LOGGER.info("Note that Krypton is most effective on servers, not the client.");
    }
}
