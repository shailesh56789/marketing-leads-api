package com.Kairali.marketing.leads.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="marketing_leads")
public class MarketingLead {
    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;
    @Column(name = "date_and_time")
    private LocalDate dateAndTime;
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name_of_client")
    private String nameOfClient;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "subjects")
    private String subjects;
    @Column(name = "notes")
    private String notes;
    @Column(name = "ivr_url")
    private String ivrUrl;
    @Column(name = "website_name")
    private String websiteName;
    @Column(name = "data_source")
    private String dataSource;
    @Column(name = "assign_to_mr_main")
    private String assignToMrMain;
    @Column(name = "verified_source")
    private String verifiedSource;
    @Column(name = "sheet_name")
    private String sheetName;
    @Column(name = "campaign_name")
    private String campaignName;
    @Column(name = "company_based_on_sheet")
    private String companyBasedOnSheet;
    @Column(name = "medium")
    private String medium;

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LocalDate getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDate dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public void setNameOfClient(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getIvrUrl() {
        return ivrUrl;
    }

    public void setIvrUrl(String ivrUrl) {
        this.ivrUrl = ivrUrl;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getAssignToMrMain() {
        return assignToMrMain;
    }

    public void setAssignToMrMain(String assignToMrMain) {
        this.assignToMrMain = assignToMrMain;
    }

    public String getVerifiedSource() {
        return verifiedSource;
    }

    public void setVerifiedSource(String verifiedSource) {
        this.verifiedSource = verifiedSource;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCompanyBasedOnSheet() {
        return companyBasedOnSheet;
    }

    public void setCompanyBasedOnSheet(String companyBasedOnSheet) {
        this.companyBasedOnSheet = companyBasedOnSheet;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
