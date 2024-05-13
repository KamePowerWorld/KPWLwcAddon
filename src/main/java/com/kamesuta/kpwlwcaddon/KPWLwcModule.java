package com.kamesuta.kpwlwcaddon;

import com.griefcraft.scripting.JavaModule;
import com.griefcraft.scripting.event.LWCProtectionRegisterEvent;
import org.bukkit.block.Block;

public class KPWLwcModule extends JavaModule {
    @Override
    public void onRegisterProtection(LWCProtectionRegisterEvent event) {
        Block block = event.getBlock();

        // ネザーではLWC禁止
        if (block.getLocation().getWorld().getName().endsWith("_nether")) {
            event.setCancelled(true);
        }
    }
}
