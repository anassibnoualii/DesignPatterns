package com.elegibility.factory;

public enum EligibilityEnum {

    INTERNAL("internal"),BENEFICIARY("beneficiary");

    private  final  String eligibilityType;

    EligibilityEnum(String eligibilityType) {
        
        this.eligibilityType=eligibilityType;

    }

    public   final String getEligibilityType() {
        return eligibilityType;
    }
}

