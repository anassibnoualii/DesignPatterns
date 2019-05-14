package com.elegibility.factory.usecase;

import com.elegibility.factory.EligibilityEnum;
import com.elegibility.factory.repository.Beneficiary;
import com.elegibility.factory.repository.EligibilityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GetBeneficiaryEligibility {

    private static final String BENEFICIARY_ELIGIBILITY = "beneficiary";

    @Autowired
    @Qualifier(BENEFICIARY_ELIGIBILITY)
    private Beneficiary beneficiaryEligibility = (Beneficiary) EligibilityFactory.getEligibility(EligibilityEnum.BENEFICIARY.getEligibilityType());


    public Beneficiary handle(){
        return  beneficiaryEligibility;
    }

}
