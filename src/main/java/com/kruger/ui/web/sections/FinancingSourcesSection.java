package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.LogicFrameData;
import com.kruger.ui.web.pages.BaseFormPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for managing financing sources.
 * This class provides methods to set financing sources information.
 */
public class FinancingSourcesSection extends BaseFormPage {
    @FindBy(xpath = "//span[@id='costoUnitario']/input")
    WebElement unitCostTextBox;
    @FindBy(xpath = "//span[@id='cantidad']/input")
    WebElement quantityTextBox;
    @FindBy(id = "periodoFiscal")
    WebElement fiscalPeriodDate;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        unitCostTextBox = driverWait.until(ExpectedConditions.elementToBeClickable(unitCostTextBox));
    }

    private void selectFinancingSource(String financingSource) {
        clickOnDropdownMenu(XpathText.FINANCING_SOURCE_DROPDOWN.getText());
        selectDropdownOption(financingSource.toUpperCase());
    }

    private void selectSpendingGroup(String spendingGroup) {
        clickOnDropdownMenu(XpathText.SPENDING_GROUP_DROPDOWN.getText());
        selectDropdownOption(spendingGroup.toUpperCase());
    }

    private void selectBudgetItem(String budgetItem) {
        clickOnDropdownMenu(XpathText.BUDGET_ITEM_DROPDOWN.getText());
        selectDropdownOption(budgetItem.toUpperCase());
    }

    private void setUnitCost(String unitCost) {
        UIMethods.enterText(unitCostTextBox, unitCost);
    }

    private void setQuantity(String quantity) {
        UIMethods.enterText(quantityTextBox, quantity);
    }

    private void setFiscalPeriodDate(String date) {
        setDateWithoutDay(fiscalPeriodDate, date);
    }

    private void clickOnAddButton() {
        clickOnButton(XpathText.ADD_BUTTON.getText());
    }

    /**
     * Sets the financing sources information.
     */
    public void setFinancingSourcesInformation(LogicFrameData logicFrameData) {
        selectFinancingSource(logicFrameData.getFinancingSource().toUpperCase());
        selectSpendingGroup(logicFrameData.getSpendingGroup().toUpperCase());
        selectBudgetItem(logicFrameData.getBudgetItem().toUpperCase());
        setUnitCost(logicFrameData.getUnitCost());
        setQuantity(logicFrameData.getQuantityUnit());
        setFiscalPeriodDate(logicFrameData.getFiscalPeriod());
        clickOnAddButton();
    }
}
