package com.kruger.ui.web.pages.inversion.newProject;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.GeneralProjectData;
import com.kruger.ui.web.sections.EntitySelectorSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class represents the General Data Page, which extends BaseProjectPage.
 * It is used for entering general project data.
 */
public class GeneralDataPage extends BaseProjectPage {

    @FindBy(xpath = "//span[text()='Datos iniciales de Proyecto']")
    WebElement initialDataLabel;
    @FindBy(xpath = "//div[label='Entidad Ejecutora *']//button")
    WebElement executingEntityButton;
    @FindBy(xpath = "//span[@id='montoTotal']/input")
    WebElement totalInvestmentNumberBox;
    @FindBy(id = "fechaInicioProyecto")
    WebElement projectStartDate;
    @FindBy(id = "fechaFinProyecto")
    WebElement projectEndDate;
    @FindBy(id = "telefonoResponsable")
    WebElement phoneNumberBox;
    @FindBy(id = "telefonoExtension")
    WebElement extensionBox;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        initialDataLabel = driverWait.until(ExpectedConditions.visibilityOf(initialDataLabel));
    }

    private void setProjectName(String projectName) {
        setTextBox(XpathText.NAME.getText(), projectName);
    }

    private void selectInvestmentPhase(String investmentPhase) {
        selectOption(investmentPhase);
    }

    private void selectManagementModel(String managementModel) {
        clickOnDropdownMenu(XpathText.MANAGEMENT_MODEL.getText());
        selectDropdownOption(managementModel.toUpperCase());
    }

    private void selectCoverage(String coverage) {
        clickOnDropdownMenu(XpathText.COVERAGE.getText());
        selectDropdownOption(coverage.toUpperCase());
    }

    private EntitySelectorSection clickOnEntitySelector() {
        UIMethods.clickOnElement(executingEntityButton);
        return new EntitySelectorSection();
    }

    private void selectEntity() {
        EntitySelectorSection entitySection = clickOnEntitySelector();
        entitySection.selectEntity();
    }

    private void selectInvestmentType(String investmentType) {
        clickOnDropdownMenu(XpathText.INVESTMENT_TYPE.getText());
        selectDropdownOption(investmentType.toUpperCase());
    }

    private void selectInterventionSubSector(String interventionSubSector) {
        clickOnDropdownMenu(XpathText.INTERVENTION_SUB_SECTOR.getText());
        selectDropdownOption(interventionSubSector.toUpperCase());
    }

    private void setTotalInvestment(String totalInvestment) {
        UIMethods.enterText(totalInvestmentNumberBox, totalInvestment);
    }

    private void selectInvestmentGuideline(String investmentGuideline) {
        clickOnDropdownMenu(XpathText.INVESTMENT_GUIDELINE.getText());
        selectDropdownOption(investmentGuideline);
    }

    private void setProjectStartDate(String startDate) {
        setDate(projectStartDate, startDate);
    }

    private void setProjectEndDate(String endDate) {
        setDate(projectEndDate, endDate);
    }

    private void selectRequestType(String requestType) {
        clickOnDropdownMenu(XpathText.REQUEST_TYPE.getText());
        selectDropdownOption(requestType);
    }

    private void answerQuestionParticipants(String answer) {
        answerYesNoQuestions(XpathText.PARTICIPANTS.getText(), answer.toUpperCase());
    }

    private void answerQuestionEmblematic(String answer) {
        answerYesNoQuestions(XpathText.EMBLEMATIC.getText(), answer.toUpperCase());
    }

    private void answerQuestionEndorsement(String answer) {
        answerYesNoQuestions(XpathText.ENDORSEMENT.getText(), answer.toUpperCase());
    }

    private void answerQuestionEnvironmentalSheet(String answer) {
        answerYesNoQuestions(XpathText.ENVIRONMENTAL_SHEET.getText(), answer.toUpperCase());
    }

    private void answerQuestionBinationalCooperation(String answer) {
        answerYesNoQuestions(XpathText.BINATIONAL_COOPERATION.getText(), answer.toUpperCase());
    }

    private void answerQuestionManager(String answer) {
        answerYesNoQuestions(XpathText.MANAGER.getText(), answer.toUpperCase());
    }

    private void setResponsible(String responsible) {
        setTextBox(XpathText.RESPONSIBLE.getText(), responsible);
    }

    private void setResponsiblePosition(String responsiblePosition) {
        setTextBox(XpathText.RESPONSIBLE_POSITION.getText(), responsiblePosition);
    }

    private void setEmail(String email) {
        setTextBox(XpathText.EMAIL.getText(), email);
    }

    private void setAdditionalEmail(String additionalEmail) {
        setTextBox(XpathText.ADDITIONAL_EMAIL.getText(), additionalEmail);
    }

    private void setPhoneNumber(String phoneNumber) {
        UIMethods.enterText(phoneNumberBox, phoneNumber);
    }

    private void setExtension(String extension) {
        UIMethods.enterText(extensionBox, extension);
    }

    private void setHighestAuthorityResponsible(String highestAuthorityResponsible) {
        setTextBox(XpathText.HIGHEST_AUTHORITY_RESPONSIBLE.getText(), highestAuthorityResponsible);
    }

    private void setHighestAuthorityEmail(String highestAuthorityEmail) {
        setTextBox(XpathText.HIGHEST_AUTHORITY_EMAIL.getText(), highestAuthorityEmail);
    }

    private void selectProduct(String product) {
        clickOnDropdownMenu(XpathText.PRODUCT.getText());
        selectDropdownOption(product.toUpperCase());
    }

    private void setProductDetail(String productDetail) {
        setTextBox(XpathText.PRODUCT_DETAIL.getText(), productDetail);
    }

    /**
     * Sets the project details including project name, investment phase, management model, coverage, and executing entity.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void setProjectDetails(GeneralProjectData projectData) {
        setProjectName(projectData.getName());
        selectInvestmentPhase(projectData.getInvestmentPhase());
        selectManagementModel(projectData.getManagementModel());
        selectCoverage(projectData.getCoverage());
        selectEntity();
    }

    /**
     * Sets the investment details including investment type, intervention sub-sector, total investment, investment guideline, and request type.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void setInvestmentDetails(GeneralProjectData projectData) {
        selectInvestmentType(projectData.getInvestmentType());
        selectInterventionSubSector(projectData.getInterventionSubSector());
        setTotalInvestment(projectData.getTotalInvestment());
        selectInvestmentGuideline(projectData.getInvestmentGuideline());
        selectRequestType(projectData.getRequestType());
    }

    /**
     * Answers specific questions related to the project.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void answerQuestions(GeneralProjectData projectData) {
        answerQuestionParticipants(projectData.getParticipants());
        answerQuestionEmblematic(projectData.getEmblematic());
        answerQuestionEndorsement(projectData.getEndorsement());
        answerQuestionEnvironmentalSheet(projectData.getEnvironmentalSheet());
        answerQuestionBinationalCooperation(projectData.getBinationalCooperation());
        answerQuestionManager(projectData.getManager());
    }

    /**
     * Sets the contact details of the responsible party including name, position, email, phone number, and extension.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void setContactDetails(GeneralProjectData projectData) {
        setResponsible(projectData.getResponsible());
        setResponsiblePosition(projectData.getResponsiblePosition());
        setEmail(projectData.getEmail());
        setAdditionalEmail(projectData.getAdditionalEmail());
        setPhoneNumber(projectData.getPhoneNumber());
        setExtension(projectData.getExtension());
    }

    /**
     * Sets the authority details including highest authority responsible and their email.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void setAuthorityDetails(GeneralProjectData projectData) {
        setHighestAuthorityResponsible(projectData.getHighestAuthorityResponsible());
        setHighestAuthorityEmail(projectData.getHighestAuthorityEmail());
    }

    /**
     * Sets the product details including product selection and its detailed description.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void setProductDetails(GeneralProjectData projectData) {
        selectProduct(projectData.getProduct());
        setProductDetail(projectData.getProductDetail());
    }

    /**
     * Sets the initial project data including project details, investment details, start and end dates, and answers to specific questions.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void setInitialProjectData(GeneralProjectData projectData) {
        setProjectDetails(projectData);
        setInvestmentDetails(projectData);
        setProjectStartDate(projectData.getStartDate());
        answerQuestions(projectData);
        setProjectEndDate(projectData.getEndDate());
    }

    /**
     * Sets the responsible party's contact details including name, position, email, phone number, and extension.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     */
    private void setResponsibleData(GeneralProjectData projectData) {
        setContactDetails(projectData);
        setAuthorityDetails(projectData);
    }

    /**
     * Creates a new project with the provided project data.
     *
     * @param projectData The GeneralProjectData object containing project-related information.
     * @return The GeneralDataPage object representing the created project's general data page.
     */
    public GeneralDataPage createProject(GeneralProjectData projectData) {
        setInitialProjectData(projectData);
        setResponsibleData(projectData);
        setProductDetails(projectData);
        saveData();
        return this;
    }

}
