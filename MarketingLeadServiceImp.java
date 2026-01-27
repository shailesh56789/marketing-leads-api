package com.Kairali.marketing.leads.service;

import com.Kairali.marketing.leads.domain.MarketingLead;
import com.Kairali.marketing.leads.repository.MarketingLeadRepo;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.Validation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import jakarta.validation.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class MarketingLeadServiceImp implements MarketingLeadService{
      private MarketingLeadRepo marketingLeadRepo;
    public MarketingLeadServiceImp(MarketingLeadRepo marketingLeadRepo) {
   this.marketingLeadRepo = marketingLeadRepo;
    }
     @Override
    public ResponseEntity<?> saveMarketingLeads(List<MarketingLead> marketingLeadsList)
    {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        List<MarketingLead> valid = new ArrayList<>();
        List<Map<String,String>> failed = new ArrayList<>();
        for(MarketingLead m :marketingLeadsList)
        {
            Set<ConstraintViolation<MarketingLead>> error = validator.validate(m);
            if(error.isEmpty())
            {
                valid.add(m);
            }else{
                System.out.println("error one");
            }
        }
        marketingLeadRepo.saveAll(valid);
        return new ResponseEntity<>("marketing dat save succesfully", HttpStatus.OK);

    }
}
