package com.elegibility.factory.repository;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Qualifier("internal")
@ConfigurationProperties(prefix = "internal")
public class Internal  extends AbstractEligibility {
    private String name;
    private int ceiling;

    public Internal() {
    }

    public Internal(String name, int ceiling) {
        this.name = name;
        this.ceiling = ceiling;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCeiling() {
        return ceiling;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public String getAdding() {
        return null;
    }
    @Override
    public String toString() {
        return "Internal{" +
                "name='" + name + '\'' +
                ", ceiling=" + ceiling +
                '}';
    }

}
