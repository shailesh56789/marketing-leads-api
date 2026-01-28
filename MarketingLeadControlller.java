package com.Kairali.marketing.leads.controller;

import com.Kairali.marketing.leads.domain.MarketingLead;
import com.Kairali.marketing.leads.service.MarketingLeadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarketingLeadControlller {

    private MarketingLeadService marketingLeadService;

    public MarketingLeadControlller(MarketingLeadService marketingLeadService) {
        this.marketingLeadService = marketingLeadService;
    }

    @PostMapping("/SaveAll")
    public ResponseEntity<?> SaveAllMarketingData(  @RequestBody List<MarketingLead> marketingList)
    {
         marketingLeadService.saveMarketingLeads(marketingList);
        return new ResponseEntity<>("Marketing data saved successfully", HttpStatus.OK);
    }
    @PostMapping("/SaveAll1")
    public ResponseEntity<?> SaveAllMarketingData1(  @RequestBody List<MarketingLead> marketingList)
    {
        marketingLeadService.saveMarketingLeads1(marketingList);
        return new ResponseEntity<>("Marketing data saved successfully", HttpStatus.OK);
    }

}
