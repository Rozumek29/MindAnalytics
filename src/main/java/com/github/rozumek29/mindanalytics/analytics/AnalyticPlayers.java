package com.github.rozumek29.mindanalytics.analytics;

import java.util.HashMap;
import java.util.UUID;

public class AnalyticPlayers {
    private static HashMap<UUID, AnalyticPlayer> analyticsPlayers = new HashMap<>();

    public static HashMap<UUID, AnalyticPlayer> getAnalyticsPlayers() {
        return analyticsPlayers;
    }
}
