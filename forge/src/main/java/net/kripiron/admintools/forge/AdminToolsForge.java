package net.kripiron.admintools.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import net.kripiron.admintools.AdminTools;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdminTools.MOD_ID)
public class AdminToolsForge {
    public AdminToolsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AdminTools.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        AdminTools.init();
    }
}