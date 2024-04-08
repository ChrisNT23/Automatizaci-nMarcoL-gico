package com.kruger.utils.builders;

import com.kruger.entitys.GeneralProjectData;

import java.util.Map;

/**
 * The GeneralProjectDataBuilder class is responsible for building GeneralProjectData objects.
 */
public class GeneralProjectDataBuilder {
    private String name;
    private String investmentPhase;
    private String managementModel;
    private String coverage;
    private String investmentType;
    private String interventionSubSector;
    private String totalInvestment;
    private String investmentGuideline;
    private String startDate;
    private String endDate;
    private String requestType;
    private String participants;
    private String emblematic;
    private String endorsement;
    private String environmentalSheet;
    private String binationalCooperation;
    private String manager;
    private String responsible;
    private String responsiblePosition;
    private String email;
    private String additionalEmail;
    private String phoneNumber;
    private String extension;
    private String highestAuthorityResponsible;
    private String highestAuthorityEmail;
    private String product;
    private String productDetail;

    public String getName() {
        return name;
    }

    public String getInvestmentPhase() {
        return investmentPhase;
    }

    public String getManagementModel() {
        return managementModel;
    }

    public String getCoverage() {
        return coverage;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public String getInterventionSubSector() {
        return interventionSubSector;
    }

    public String getTotalInvestment() {
        return totalInvestment;
    }

    public String getInvestmentGuideline() {
        return investmentGuideline;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getParticipants() {
        return participants;
    }

    public String getEmblematic() {
        return emblematic;
    }

    public String getEndorsement() {
        return endorsement;
    }

    public String getEnvironmentalSheet() {
        return environmentalSheet;
    }

    public String getBinationalCooperation() {
        return binationalCooperation;
    }

    public String getManager() {
        return manager;
    }

    public String getResponsible() {
        return responsible;
    }

    public String getResponsiblePosition() {
        return responsiblePosition;
    }

    public String getEmail() {
        return email;
    }

    public String getAdditionalEmail() {
        return additionalEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getExtension() {
        return extension;
    }

    public String getHighestAuthorityResponsible() {
        return highestAuthorityResponsible;
    }

    public String getHighestAuthorityEmail() {
        return highestAuthorityEmail;
    }

    public String getProduct() {
        return product;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public GeneralProjectDataBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public GeneralProjectDataBuilder withInvestmentPhase(String investmentPhase) {
        this.investmentPhase = investmentPhase;
        return this;
    }

    public GeneralProjectDataBuilder withManagementModel(String managementModel) {
        this.managementModel = managementModel;
        return this;
    }

    public GeneralProjectDataBuilder withCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }

    public GeneralProjectDataBuilder withInvestmentType(String investmentType) {
        this.investmentType = investmentType;
        return this;
    }

    public GeneralProjectDataBuilder withInterventionSubSector(String interventionSubSector) {
        this.interventionSubSector = interventionSubSector;
        return this;
    }

    public GeneralProjectDataBuilder withTotalInvestment(String totalInvestment) {
        this.totalInvestment = totalInvestment;
        return this;
    }

    public GeneralProjectDataBuilder withInvestmentGuideline(String investmentGuideline) {
        this.investmentGuideline = investmentGuideline;
        return this;
    }

    public GeneralProjectDataBuilder withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public GeneralProjectDataBuilder withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public GeneralProjectDataBuilder withRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }

    public GeneralProjectDataBuilder withParticipants(String participants) {
        this.participants = participants;
        return this;
    }

    public GeneralProjectDataBuilder withEmblematic(String emblematic) {
        this.emblematic = emblematic;
        return this;
    }

    public GeneralProjectDataBuilder withEndorsement(String endorsement) {
        this.endorsement = endorsement;
        return this;
    }

    public GeneralProjectDataBuilder withEnvironmentalSheet(String environmentalSheet) {
        this.environmentalSheet = environmentalSheet;
        return this;
    }

    public GeneralProjectDataBuilder withBinationalCooperation(String binationalCooperation) {
        this.binationalCooperation = binationalCooperation;
        return this;
    }

    public GeneralProjectDataBuilder withManager(String manager) {
        this.manager = manager;
        return this;
    }

    public GeneralProjectDataBuilder withResponsible(String responsible) {
        this.responsible = responsible;
        return this;
    }

    public GeneralProjectDataBuilder withResponsiblePosition(String responsiblePosition) {
        this.responsiblePosition = responsiblePosition;
        return this;
    }

    public GeneralProjectDataBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public GeneralProjectDataBuilder withAdditionalEmail(String additionalEmail) {
        this.additionalEmail = additionalEmail;
        return this;
    }

    public GeneralProjectDataBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public GeneralProjectDataBuilder withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public GeneralProjectDataBuilder withHighestAuthorityResponsible(String highestAuthorityResponsible) {
        this.highestAuthorityResponsible = highestAuthorityResponsible;
        return this;
    }

    public GeneralProjectDataBuilder withHighestAuthorityEmail(String highestAuthorityEmail) {
        this.highestAuthorityEmail = highestAuthorityEmail;
        return this;
    }

    public GeneralProjectDataBuilder withProduct(String product) {
        this.product = product;
        return this;
    }

    public GeneralProjectDataBuilder withProductDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }

    /**
     * Sets the values of the builder from a map of data.
     *
     * @param data The map containing data.
     * @return The GeneralProjectDataBuilder instance.
     */
    public GeneralProjectDataBuilder fromMap(Map<String, String> data) {
        name = data.get("name");
        investmentPhase = data.get("investmentPhase");
        managementModel = data.get("management");
        coverage = data.get("coverage");
        investmentType = data.get("investmentType");
        interventionSubSector = data.get("interventionSubSector");
        totalInvestment = data.get("totalInvestment");
        investmentGuideline = data.get("investmentGuideline");
        startDate = data.get("startDate");
        endDate = data.get("endDate");
        requestType = data.get("requestType");
        participants = data.get("participants");
        emblematic = data.get("emblematic");
        endorsement = data.get("endorsement");
        environmentalSheet = data.get("environmentalSheet");
        binationalCooperation = data.get("binationalCooperation");
        manager = data.get("manager");
        responsible = data.get("responsible");
        responsiblePosition = data.get("responsiblePosition");
        email = data.get("email");
        additionalEmail = data.get("additionalEmail");
        phoneNumber = data.get("phoneNumber");
        extension = data.get("extension");
        highestAuthorityResponsible = data.get("highestAuthorityResponsible");
        highestAuthorityEmail = data.get("highestAuthorityEmail");
        product = data.get("product");
        productDetail = data.get("productDetail");
        return this;
    }

    /**
     * Builds a GeneralProjectData object with the set values.
     *
     * @return The built GeneralProjectData object.
     */
    public GeneralProjectData build() {
        return new GeneralProjectData(this);
    }

}
