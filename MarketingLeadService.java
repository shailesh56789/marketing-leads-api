package com.Kairali.marketing.leads.service;

import com.Kairali.marketing.leads.domain.MarketingLead;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MarketingLeadService {
    public ResponseEntity<?> saveMarketingLeads(List<MarketingLead> marketingLeadsList);
}
