package com.elegibility.factory;

import com.elegibility.factory.usecase.GetAllEligibility;
import com.elegibility.factory.usecase.GetBeneficiaryEligibility;
import com.elegibility.factory.usecase.GetInternalEligibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public abstract class FactoryApplication implements CommandLineRunner {

	private final  Logger logger = Logger.getLogger(String.valueOf(this.getClass()));


	@Autowired
	private GetInternalEligibility internalEligibility ;
	@Autowired
	private GetBeneficiaryEligibility beneficiaryEligibility;
	@Autowired
	private GetAllEligibility getAllEligibility;

	public static void main(String[] args) {

		SpringApplication.run(FactoryApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
	    logger.info(internalEligibility.handle().toString());
	    logger.info(beneficiaryEligibility.handle().toString());
	    logger.info(getAllEligibility.handle().toString());



    }
}
