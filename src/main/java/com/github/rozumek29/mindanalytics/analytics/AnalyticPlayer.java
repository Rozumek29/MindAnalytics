package com.github.rozumek29.mindanalytics.analytics;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AnalyticPlayer {
    private UUID uuid;
    public AnalyticPlayer(UUID uuid, double joinTime){
        this.uuid = uuid;
        this.joinTime = joinTime;
    }
    private double joinTime;
    private double inGameTime;
}
