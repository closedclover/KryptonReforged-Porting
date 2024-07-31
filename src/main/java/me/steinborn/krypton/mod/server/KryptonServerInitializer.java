package me.steinborn.krypton.mod.server;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.steinborn.krypton.mod.shared.KryptonSharedInitializer;

@EventBusSubscriber(bus = Bus.MOD, modid = KryptonSharedInitializer.MOD_ID, value = Dist.DEDICATED_SERVER)
public class KryptonServerInitializer {
    private static final Logger LOGGER = LogManager.getLogger(KryptonServerInitializer.class);

    @SubscribeEvent
    public static void onInitializeServer(FMLDedicatedServerSetupEvent event) {
        LOGGER.info("Krypton is now accelerating your Minecraft server's networking stack \uD83D\uDE80");
    }
}
