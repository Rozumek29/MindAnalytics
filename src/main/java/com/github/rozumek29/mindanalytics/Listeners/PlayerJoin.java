package com.github.rozumek29.mindanalytics.Listeners;

import com.github.rozumek29.mindanalytics.analytics.AnalyticPlayer;
import com.github.rozumek29.mindanalytics.analytics.AnalyticPlayers;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        AnalyticPlayers.getAnalyticsPlayers().put(event.getPlayer().getUniqueId(), new AnalyticPlayer())
    }
}
