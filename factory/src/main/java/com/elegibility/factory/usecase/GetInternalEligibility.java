package com.elegibility.factory.usecase;

import com.elegibility.factory.EligibilityEnum;
import com.elegibility.factory.repository.EligibilityFactory;
import com.elegibility.factory.repository.Internal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GetInternalEligibility {

    @Autowired
    @Qualifier("internal")
    Internal internalEligibility = (Internal)EligibilityFactory.getEligibility(EligibilityEnum.INTERNAL.getEligibilityType());;

    public Internal handle(){
         return internalEligibility;
    }
}
