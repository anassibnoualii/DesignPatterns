package com.elegibility.factory.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Qualifier("beneficiary")
@ConfigurationProperties(prefix = "beneficiary")
public class Beneficiary extends AbstractEligibility {
    private String name;
    private int ceiling;
    private String adding;

    public Beneficiary() {
    }

    public Beneficiary(String name, int ceiling, String adding) {
        this.name = name;
        this.ceiling = ceiling;
        this.adding = adding;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }


    public void setAdding(String adding) {
        this.adding = adding;
    }

    @Override
    public String toString() {
        return "Beneficiary{" +
                "name='" + name + '\'' +
                ", ceiling=" + ceiling +
                ", adding='" + adding + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCeiling() {
        return ceiling;
    }

    @Override
    public String getAdding() {
        return adding;
    }
}
