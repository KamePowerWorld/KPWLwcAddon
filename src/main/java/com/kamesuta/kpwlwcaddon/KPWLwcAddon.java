package com.kamesuta.kpwlwcaddon;

import com.griefcraft.lwc.LWC;
import org.bukkit.plugin.java.JavaPlugin;

public final class KPWLwcAddon extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        LWC.getInstance().getModuleLoader().registerModule(this, new KPWLwcModule());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        LWC.getInstance().getModuleLoader().removeModules(this);
    }
}
