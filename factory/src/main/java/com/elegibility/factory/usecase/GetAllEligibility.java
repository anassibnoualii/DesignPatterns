package com.elegibility.factory.usecase;

import com.elegibility.factory.EligibilityEnum;
import com.elegibility.factory.repository.AbstractEligibility;
import com.elegibility.factory.repository.Beneficiary;
import com.elegibility.factory.repository.EligibilityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GetAllEligibility {

    private static final String BENEFICIARY_ELIGIBILITY = "beneficiary";
    private static final String INTERNAL_ELIGIBILITY = "internal";

    @Autowired
    @Qualifier(BENEFICIARY_ELIGIBILITY)
    private Beneficiary beneficiaryEligibility = (Beneficiary) EligibilityFactory.getEligibility(EligibilityEnum.BENEFICIARY.getEligibilityType());

    @Autowired
    @Qualifier(INTERNAL_ELIGIBILITY)
    AbstractEligibility internalEligibility = EligibilityFactory.getEligibility(EligibilityEnum.INTERNAL.getEligibilityType());;

    public List<AbstractEligibility>handle(){
        return Arrays.asList(internalEligibility,beneficiaryEligibility);
    }

}
