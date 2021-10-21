package com.github.rozumek29.mindanalytics;

import com.github.rozumek29.mindanalytics.Listeners.PlayerJoin;
import com.github.rozumek29.mindanalytics.Listeners.PlayerQuit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MindAnalytics extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerListeners(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoin(), this);
        pm.registerEvents(new PlayerQuit(), this);
    }
}
