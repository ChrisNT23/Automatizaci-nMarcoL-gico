package com.kruger.ui.web.pages.workflow;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.ui.web.pages.BaseFormPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class represents the Analysis Page, where analysis for a project is performed.
 * It extends the BaseFormPage class.
 */
public class AnalysisPage extends BaseFormPage {
    private static final String DROPDOWN_XPATH = "//div[contains(span,'%s')]";
    private static final String INPUT_TEXT_XPATH = "//div[contains(h3,'%s')]/following-sibling::div[1]//p";
    @FindBy(name = "row-edit")
    WebElement addDocumentComplianceButton;
    @FindBy(name = "row-save")
    WebElement saveComplianceButton;
    @FindBy(xpath = "//h3[text()='Documentos Subidos por la Entidad']")
    WebElement documentsLabel;
    @FindBy(name = "//button[contains(@aria-label,'Aceptar An')]")
    WebElement acceptAnalysisButton;

    public AnalysisPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        documentsLabel = driverWait.until(ExpectedConditions.visibilityOf(documentsLabel));
    }

    private void clickOnAddDocumentComplianceButton() {
        UIMethods.clickOnElement(addDocumentComplianceButton);
    }

    private void clickOnAcceptAnalysisButton() {
        UIMethods.clickOnElement(acceptAnalysisButton);
    }

    private void clickOnDropdown(String dropdownTitle) {
        WebElement dropdownMenu = UIMethods.getElementFromDynamicXpath(DROPDOWN_XPATH, dropdownTitle);
        UIMethods.clickOnElement(dropdownMenu);
    }

    private void setInputText(String inputTextTitle, String text) {
        WebElement inputText = UIMethods.getElementFromDynamicXpath(INPUT_TEXT_XPATH, inputTextTitle);
        UIMethods.enterText(inputText, text);
    }

    private void clickOnAnalysisTypeDropdown() {
        clickOnDropdown(XpathText.ANALYSIS_TYPE_DROPDOWN.getText());
    }

    private void clickOnComplianceDropdown() {
        clickOnDropdown(XpathText.COMPLIANCE_DROPDOWN.getText());
    }

    private void setAnalysisInputText(String text) {
        setInputText(XpathText.ANALYSIS_TEXT_INPUT.getText(), text);
    }

    private void setRecommendationsInputText(String text) {
        setInputText(XpathText.RECOMMENDATIONS_TEXT_INPUT.getText(), text);
    }

    private void setConclusionsInputText(String text) {
        setInputText(XpathText.CONCLUSIONS_TEXT_INPUT.getText(), text);
    }

    private void clickOnSaveComplianceButton() {
        UIMethods.clickOnElement(saveComplianceButton);
    }

    private void selectCompliance(String compliance) {
        clickOnComplianceDropdown();
        selectDropdownOption(compliance.toUpperCase());
    }

    private void selectAnalysisType(String analysisType) {
        clickOnAnalysisTypeDropdown();
        selectDropdownOption(analysisType.toUpperCase());
    }

    /**
     * Sets the documents compliance for the analysis.
     *
     * @param documentsCompliance The compliance status of documents.
     */
    private void setDocumentsCompliance(String documentsCompliance) {
        clickOnAddDocumentComplianceButton();
        selectCompliance(documentsCompliance);
        clickOnSaveComplianceButton();
    }

    /**
     * Sets the analysis observations including analysis type, analysis, recommendations, and conclusions.
     *
     * @param analysisType    The type of analysis.
     * @param analysis        The analysis content.
     * @param recommendations The recommendations provided.
     * @param conclusions     The conclusions drawn.
     */
    private void setAnalysisObservations(String analysisType, String analysis, String recommendations, String conclusions) {
        selectAnalysisType(analysisType);
        setAnalysisInputText(analysis);
        setRecommendationsInputText(recommendations);
        setConclusionsInputText(conclusions);
    }

    /**
     * Creates an analysis with the specified details.
     *
     * @param documentsCompliance The compliance status of documents.
     * @param analysisType        The type of analysis.
     * @param analysis            The analysis content.
     * @param recommendations     The recommendations provided.
     * @param conclusions         The conclusions drawn.
     */
    public void createAnalysis(String documentsCompliance, String analysisType, String analysis, String recommendations, String conclusions) {
        setDocumentsCompliance(documentsCompliance);
        setAnalysisObservations(analysisType, analysis, recommendations, conclusions);
        saveData();
    }

    /**
     * Accepts the analysis.
     *
     * @return The RequestTrayPage object after accepting the analysis.
     */
    public RequestTrayPage acceptAnalysis() {
        clickOnAcceptAnalysisButton();
        return new RequestTrayPage();
    }

}
