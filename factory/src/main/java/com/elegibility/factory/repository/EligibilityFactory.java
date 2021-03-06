package com.elegibility.factory.repository;

import com.elegibility.factory.EligibilityEnum;

public class EligibilityFactory {

    public static AbstractEligibility getEligibility(String name){
        if(EligibilityEnum.INTERNAL.getEligibilityType().equals(name)){
            return new Internal();
        }
        else if(EligibilityEnum.BENEFICIARY.getEligibilityType().equals(name)){
            return new Beneficiary();
        }
        throw new UnsupportedOperationException("Unsupported eligibility type");

    }
}
