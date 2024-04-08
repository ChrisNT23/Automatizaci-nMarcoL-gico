package com.kruger.ui.web.pages.inversion.newProject;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.IndicatorsData;
import com.kruger.ui.web.sections.AddFinancialMovementSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * IndicatorsPage class represents the page for managing indicators in a project.
 * It extends the BaseProjectPage class and provides methods to interact with various elements of the indicators page.
 */
public class IndicatorsPage extends BaseProjectPage {
    private static final String FLOW_TEXT_BOX_XPATH = "//div[contains(h4,'%s')]/following-sibling::div[1]//input";
    private static final String INPUT_TEXT_BOX_XPATH = "//label[contains(text(),'%s')]/preceding-sibling::span/input";
    private static final String ANSWER_TEXT_BOX_XPATH = "//div[contains(text(),'%s')]//following::input[1]";
    private static final String ANSWER_OPTION_XPATH = "//div[contains(label,'%s')]//div[contains(@class,'p-radiobutton-box')]";
    private static final String MALE_FEMALE_TEXT_BOX_XPATH = "//span[@id='%s']/input";
    private static final String ADD_FINANCIAL_MOVEMENT_BUTTON_XPATH = "//div[contains(h3,'%s')]/../..//button[@aria-label='%s']";
    @FindBy(xpath = "//button[@aria-label='Agregar ingreso']")
    WebElement addIncomeButton;
    @FindBy(xpath = "(//div[contains(@class,'p-radiobutton-box')])[2]//following::input[1]")
    WebElement answerYesTextBox;
    @FindBy(xpath = "//div[contains(@class,'p-dropdown p-component p-inputwrapper p-dropdown-clearable')]")
    WebElement dropdownPriorityGroup;
    @FindBy(xpath = "//button[contains(@class,'p-component flex')]")
    WebElement addGroupButton;
    @FindBy(xpath = "//div[text()='Los indicadores se guardaron exitosamente.']")
    WebElement saveIndicatorsNotification;
    private AddFinancialMovementSection financialSection;

    public IndicatorsPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        addIncomeButton = driverWait.until(ExpectedConditions.visibilityOf(addIncomeButton));
    }

    private void setDiscount(String discount, String titleTextBox) {
        WebElement discountTextBox = UIMethods.getElementFromDynamicXpath(FLOW_TEXT_BOX_XPATH, titleTextBox);
        UIMethods.enterText(discountTextBox, discount);
    }

    private void setInputTextBox(String text, String titleTextBox) {
        WebElement inputTextBox = UIMethods.getElementFromDynamicXpath(INPUT_TEXT_BOX_XPATH, titleTextBox);
        UIMethods.enterText(inputTextBox, text);
    }

    private void setAnswer(String answer, String titleAnswer) {
        WebElement answerTextBox = UIMethods.getElementFromDynamicXpath(ANSWER_TEXT_BOX_XPATH, titleAnswer);
        UIMethods.enterText(answerTextBox, answer);
    }

    private void selectMethodologyAnswer(String answer) {
        WebElement answerOption = UIMethods.getElementFromDynamicXpath(ANSWER_OPTION_XPATH, answer);
        UIMethods.clickOnElement(answerOption);
    }

    private void setGenderAmount(String amount, String idGender) {
        WebElement genderTextBox = UIMethods.getElementFromDynamicXpath(MALE_FEMALE_TEXT_BOX_XPATH, idGender);
        UIMethods.enterText(genderTextBox, amount);
    }

    private void clickOnAddFinancialMovementButton(String flow, String titleButton) {
        WebElement addFinancialButton = UIMethods.getElementFromDynamicXpath(ADD_FINANCIAL_MOVEMENT_BUTTON_XPATH, flow, titleButton);
        UIMethods.clickOnElement(addFinancialButton);
    }

    private void clickOnAddFinancialFlowButton(String titleButton) {
        clickOnAddFinancialMovementButton(XpathText.FINANCIAL_FLOW_LABEL.getText(), titleButton);
    }

    private void clickOnAddEconomicalFlowButton(String titleButton) {
        clickOnAddFinancialMovementButton(XpathText.ECONOMICAL_FLOW_LABEL.getText(), titleButton);
    }

    private void setFinancialFlowDiscount(String financialFlowDiscount) {
        setDiscount(financialFlowDiscount, XpathText.FINANCIAL_FLOW_TEXT_BOX.getText());
    }

    private void setEconomicalFlowDiscount(String economicalFlowDiscount) {
        setDiscount(economicalFlowDiscount, XpathText.ECONOMICAL_FLOW_TEXT_BOX.getText());
    }

    private void setInterestGrowthRate(String interestGrowthRate) {
        setInputTextBox(interestGrowthRate, XpathText.INTEREST_GROWTH_RATE.getText());
    }

    private AddFinancialMovementSection clickOnAddIncomeButton() {
        UIMethods.clickOnElement(addIncomeButton);
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddFinancialCapitalExpenseButton() {
        clickOnAddFinancialFlowButton(XpathText.ADD_CAPITAL_EXPENSE_BUTTON.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddFinancialOperatingExpenseButton() {
        clickOnAddFinancialFlowButton(XpathText.ADD_OPERATING_EXPENSE.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddFinancialAdministrativeExpenseButton() {
        clickOnAddFinancialFlowButton(XpathText.ADD_ADMINISTRATIVE_EXPENSE.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddFinancialMaintenanceExpenseButton() {
        clickOnAddFinancialFlowButton(XpathText.ADD_MAINTENANCE_EXPENSE.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddEconomicalCapitalExpenseButton() {
        clickOnAddEconomicalFlowButton(XpathText.ADD_CAPITAL_EXPENSE_BUTTON.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddEconomicalOperatingExpenseButton() {
        clickOnAddEconomicalFlowButton(XpathText.ADD_OPERATING_EXPENSE.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddEconomicalAdministrativeExpenseButton() {
        clickOnAddEconomicalFlowButton(XpathText.ADD_ADMINISTRATIVE_EXPENSE.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddEconomicalMaintenanceExpenseButton() {
        clickOnAddEconomicalFlowButton(XpathText.ADD_MAINTENANCE_EXPENSE.getText());
        return new AddFinancialMovementSection();
    }

    private AddFinancialMovementSection clickOnAddBenefitsButton() {
        clickOnButton(XpathText.ADD_BENEFITS_BUTTON.getText());
        return new AddFinancialMovementSection();
    }

    private void setPopulationGrowthRate(String populationGrowthRate) {
        setInputTextBox(populationGrowthRate, XpathText.POPULATION_GROWTH_RATE.getText());
    }

    private void setCountryLossAnswer(String countryLoss) {
        setAnswer(countryLoss, XpathText.COUNTRY_LOSS_QUESTION.getText());
    }

    private void setResultsImpactAnswer(String resultsImpact) {
        setAnswer(resultsImpact, XpathText.RESULTS_IMPACTS_QUESTION.getText());
    }

    private void setDirectMaleBeneficiaries(String directMaleBeneficiaries) {
        setInputTextBox(directMaleBeneficiaries, XpathText.DIRECT_MALE_BENEFICIARIES.getText());
    }

    private void setIndirectBeneficiaries(String indirectBeneficiaries) {
        setInputTextBox(indirectBeneficiaries, XpathText.INDIRECT_BENEFICIARIES.getText());
    }

    private void setMaleAmount(String maleAmount) {
        setGenderAmount(maleAmount, XpathText.MALE_AMOUNT_TEXT_BOX.getText());
    }

    private void setFemaleAmount(String femaleAmount) {
        setGenderAmount(femaleAmount, XpathText.FEMALE_AMOUNT_TEXT_BOX.getText());
    }

    private void setFinancialIncome(IndicatorsData indicatorsData) {
        financialSection = clickOnAddIncomeButton();
        financialSection.addMovement(indicatorsData.getIncomeDescription(), indicatorsData.getIncomeValue());
    }

    private void setFinancialExpenses(IndicatorsData indicatorsData) {
        financialSection = clickOnAddFinancialOperatingExpenseButton();
        financialSection.addMovement(indicatorsData.getFinancialOperatingExpenseDescription(), indicatorsData.getFinancialOperatingExpenseValue());
        financialSection = clickOnAddFinancialCapitalExpenseButton();
        financialSection.addMovement(indicatorsData.getFinancialCapitalExpenseDescription(), indicatorsData.getFinancialCapitalExpenseValue());
        financialSection = clickOnAddFinancialAdministrativeExpenseButton();
        financialSection.addMovement(indicatorsData.getFinancialAdministrativeExpenseDescription(), indicatorsData.getFinancialAdministrativeExpenseValue());
        financialSection = clickOnAddFinancialMaintenanceExpenseButton();
        financialSection.addMovement(indicatorsData.getFinancialMaintenanceExpenseDescription(), indicatorsData.getFinancialMaintenanceExpenseValue());
        //This two following lines are duplicated, this is just a workaround
        financialSection = clickOnAddFinancialOperatingExpenseButton();
        financialSection.addMovement(indicatorsData.getFinancialOperatingExpenseDescription(), indicatorsData.getFinancialOperatingExpenseValue());
    }

    private void setEconomicalBenefits(IndicatorsData indicatorsData) {
        financialSection = clickOnAddBenefitsButton();
        financialSection.addMovement(indicatorsData.getBenefitDescription(), indicatorsData.getBenefitValue());
    }

    private void setEconomicalExpenses(IndicatorsData indicatorsData) {
        financialSection = clickOnAddEconomicalCapitalExpenseButton();
        financialSection.addMovement(indicatorsData.getEconomicalCapitalExpenseDescription(), indicatorsData.getEconomicalCapitalExpenseValue());
        financialSection = clickOnAddEconomicalOperatingExpenseButton();
        financialSection.addMovement(indicatorsData.getEconomicalOperatingExpenseDescription(), indicatorsData.getEconomicalOperatingExpenseValue());
        financialSection = clickOnAddEconomicalAdministrativeExpenseButton();
        financialSection.addMovement(indicatorsData.getEconomicalAdministrativeExpenseDescription(), indicatorsData.getEconomicalAdministrativeExpenseValue());
        financialSection = clickOnAddEconomicalMaintenanceExpenseButton();
        financialSection.addMovement(indicatorsData.getEconomicalMaintenanceExpenseDescription(), indicatorsData.getEconomicalMaintenanceExpenseValue());
    }

    private void selectPriorityGroup(String group) {
        UIMethods.clickOnElement(dropdownPriorityGroup);
        selectDropdownOption(group);
    }

    /**
     * Sets the discounts for financial and economical flows based on the provided IndicatorsData.
     *
     * @param indicatorsData The data containing information about the indicators.
     */
    private void setDiscounts(IndicatorsData indicatorsData) {
        setFinancialFlowDiscount(indicatorsData.getFinancialFlowDiscount());
        setEconomicalFlowDiscount(indicatorsData.getEconomicalFlowDiscount());
    }

    /**
     * Sets the financial flow data based on the provided IndicatorsData.
     *
     * @param indicatorsData The data containing information about the indicators.
     */
    private void setFinancialFlow(IndicatorsData indicatorsData) {
        setFinancialExpenses(indicatorsData);
        setFinancialIncome(indicatorsData);
        setInterestGrowthRate(indicatorsData.getInterestGrowthRate());
    }

    /**
     * Sets the economical flow data based on the provided IndicatorsData.
     *
     * @param indicatorsData The data containing information about the indicators.
     */
    private void setEconomicalFlow(IndicatorsData indicatorsData) {
        setEconomicalExpenses(indicatorsData);
        setEconomicalBenefits(indicatorsData);
        setPopulationGrowthRate(indicatorsData.getPopulationGrowthRate());
    }

    /**
     * Answers questions related to indicators based on the provided IndicatorsData.
     *
     * @param indicatorsData The data containing information about the indicators.
     */
    private void answerQuestions(IndicatorsData indicatorsData) {
        setCountryLossAnswer(indicatorsData.getCountryLoss());
        setResultsImpactAnswer(indicatorsData.getResultsImpact());
        selectMethodologyAnswer(indicatorsData.getMethodology());
    }

    /**
     * Sets the beneficiaries data based on the provided IndicatorsData.
     *
     * @param indicatorsData The data containing information about the indicators.
     */
    private void setBeneficiaries(IndicatorsData indicatorsData) {
        setDirectMaleBeneficiaries(indicatorsData.getDirectMaleBeneficiaries());
        setIndirectBeneficiaries(indicatorsData.getIndirectBeneficiaries());
    }

    /**
     * Sets the priority groups data based on the provided IndicatorsData.
     *
     * @param indicatorsData The data containing information about the indicators.
     */
    private void setPriorityGroups(IndicatorsData indicatorsData) {
        selectPriorityGroup(indicatorsData.getGroup().toUpperCase());
        setMaleAmount(indicatorsData.getMaleAmount());
        setFemaleAmount(indicatorsData.getFemaleAmount());
        UIMethods.clickOnElement(addGroupButton);
    }

    /**
     * Sets the indicators data on the indicators page.
     *
     * @param indicatorsData The data containing information about the indicators.
     */
    public void setIndicatorsData(IndicatorsData indicatorsData) {
        setFinancialFlow(indicatorsData);
        setEconomicalFlow(indicatorsData);
        setDiscounts(indicatorsData);
        answerQuestions(indicatorsData);
        setBeneficiaries(indicatorsData);
        setPriorityGroups(indicatorsData);
        saveData();
    }

    /**
     * Checks if the saved indicators notification is displayed.
     *
     * @return true if the saved indicators notification is displayed, false otherwise.
     */
    public boolean isSavedIndicatorsNotificationDisplayed() {
        return UIMethods.isElementDisplayed(saveIndicatorsNotification);
    }

}
