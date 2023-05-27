package com.example.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    private int minium;
    private int maxium;

    public int getMinium() {
        return minium;
    }

    public void setMinium(int minium) {
        this.minium = minium;
    }

    public int getMaxium() {
        return maxium;
    }

    public void setMaxium(int maxium) {
        this.maxium = maxium;
    }
}
