package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.LogicFrameData;
import com.kruger.ui.web.pages.BaseFormPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for setting baseline information in a project.
 * This class provides methods to set quantitative and qualitative indicators,
 * measuring units, indicator weighting, other units, quantity, and horizon date.
 */
public class BaseLineSection extends BaseFormPage {
    @FindBy(className = "p-dialog-title")
    WebElement baseLineLabel;
    @FindBy(name = "cuantitativo")
    WebElement quantitativeIndicatorTextBox;
    @FindBy(id = "cualitativo")
    WebElement qualitativeIndicatorTextBox;
    @FindBy(xpath = "//input[@id='ponderacion']")
    WebElement indicatorWeightingTextBox;
    @FindBy(id = "cantidad")
    WebElement quantityTextBox;
    @FindBy(id = "horizonte")
    WebElement horizonDate;

    public BaseLineSection() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        baseLineLabel = driverWait.until(ExpectedConditions.visibilityOf(baseLineLabel));
    }

    private void setQuantitativeIndicatorTextBox(String quantitativeIndicator) {
        UIMethods.enterText(quantitativeIndicatorTextBox, quantitativeIndicator);
    }

    private void setQualitativeIndicatorTextBox(String qualitativeIndicator) {
        UIMethods.enterText(qualitativeIndicatorTextBox, qualitativeIndicator);
    }

    private void selectMeasuringUnit(String measuringUnit) {
        clickOnDropdownMenu(XpathText.MEASURING_UNIT_DROPDOWN.getText());
        selectDropdownOption(measuringUnit.toUpperCase());
    }

    private void setIndicatorWeightingTextBox(String indicatorWeighting) {
        UIMethods.enterText(indicatorWeightingTextBox, indicatorWeighting);
    }

    private void setOtherUnits(String otherUnits) {
        setTextBox(XpathText.OTHER_UNITS_TEXT_BOX.getText(), otherUnits);
    }

    private void setQuantityTextBox(String quantity) {
        UIMethods.enterText(quantityTextBox, quantity);
    }

    private void setHorizonDate(String date) {
        setDate(horizonDate, date);
    }

    private void clickOnAcceptButton() {
        clickOnButton(XpathText.ACCEPT_BUTTON.getText());
    }

    /**
     * Sets the baseline information using the data from the provided LogicFrameData object.
     *
     * @param logicFrameData the LogicFrameData object containing baseline information
     */
    public void setBaseLineInformation(LogicFrameData logicFrameData) {
        setQuantitativeIndicatorTextBox(logicFrameData.getQuantitativeIndicator());
        setQualitativeIndicatorTextBox(logicFrameData.getQualitativeIndicator());
        selectMeasuringUnit(logicFrameData.getMeasuringUnit().toUpperCase());
        setIndicatorWeightingTextBox(logicFrameData.getIndicatorWeighting());
        setOtherUnits(logicFrameData.getOtherUnits());
        setQuantityTextBox(logicFrameData.getQuantity());
        setHorizonDate(logicFrameData.getHorizonDate());        
        clickOnAcceptButton();
        
    }
}
