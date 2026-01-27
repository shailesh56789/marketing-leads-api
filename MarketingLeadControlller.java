package com.Kairali.marketing.leads.controller;

import com.Kairali.marketing.leads.domain.MarketingLead;
import com.Kairali.marketing.leads.service.MarketingLeadService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MarketingLeadControlller {

    private MarketingLeadService marketingLeadService;

    public MarketingLeadControlller(MarketingLeadService marketingLeadService) {
        this.marketingLeadService = marketingLeadService;
    }

    @PostMapping("/SaveAll")
    public ResponseEntity<?> SaveAllMarketingData(List<MarketingLead> marketingList)
    {
        return marketingLeadService.saveMarketingLeads(marketingList);
    }

}
