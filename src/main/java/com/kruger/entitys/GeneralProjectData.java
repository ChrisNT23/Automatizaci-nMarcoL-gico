package com.kruger.entitys;

import com.kruger.utils.builders.GeneralProjectDataBuilder;

/**
 * The GeneralProjectData class represents general project data, used in conjunction with its builder class.
 * It encapsulates various attributes related to a project.
 */
public class GeneralProjectData {
    private final String name;
    private final String investmentPhase;
    private final String managementModel;
    private final String coverage;
    private final String investmentType;
    private final String interventionSubSector;
    private final String totalInvestment;
    private final String investmentGuideline;
    private final String startDate;
    private final String endDate;
    private final String requestType;
    private final String participants;
    private final String emblematic;
    private final String endorsement;
    private final String environmentalSheet;
    private final String binationalCooperation;
    private final String manager;
    private final String responsible;
    private final String responsiblePosition;
    private final String email;
    private final String additionalEmail;
    private final String phoneNumber;
    private final String extension;
    private final String highestAuthorityResponsible;
    private final String highestAuthorityEmail;
    private final String product;
    private final String productDetail;

    /**
     * Constructs a new GeneralProjectData instance with the provided builder.
     *
     * @param builder The builder containing general project data.
     */
    public GeneralProjectData(GeneralProjectDataBuilder builder) {
        name = builder.getName();
        investmentPhase = builder.getInvestmentPhase();
        managementModel = builder.getManagementModel();
        coverage = builder.getCoverage();
        investmentType = builder.getInvestmentType();
        interventionSubSector = builder.getInterventionSubSector();
        totalInvestment = builder.getTotalInvestment();
        investmentGuideline = builder.getInvestmentGuideline();
        startDate = builder.getStartDate();
        endDate = builder.getEndDate();
        requestType = builder.getRequestType();
        participants = builder.getParticipants();
        emblematic = builder.getEmblematic();
        endorsement = builder.getEndorsement();
        environmentalSheet = builder.getEnvironmentalSheet();
        binationalCooperation = builder.getBinationalCooperation();
        manager = builder.getManager();
        responsible = builder.getResponsible();
        responsiblePosition = builder.getResponsiblePosition();
        email = builder.getEmail();
        additionalEmail = builder.getAdditionalEmail();
        phoneNumber = builder.getPhoneNumber();
        extension = builder.getExtension();
        highestAuthorityResponsible = builder.getHighestAuthorityResponsible();
        highestAuthorityEmail = builder.getHighestAuthorityEmail();
        product = builder.getProduct();
        productDetail = builder.getProductDetail();
    }

    /**
     * Retrieves a new instance of GeneralProjectDataBuilder to facilitate object construction.
     *
     * @return A new instance of GeneralProjectDataBuilder.
     */
    public static GeneralProjectDataBuilder builder() {
        return new GeneralProjectDataBuilder();
    }

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

}
