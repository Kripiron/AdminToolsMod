package net.kripiron.admintools.fabric;

import net.kripiron.admintools.AdminTools;
import net.fabricmc.api.ModInitializer;

public class AdminToolsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AdminTools.init();
    }
}