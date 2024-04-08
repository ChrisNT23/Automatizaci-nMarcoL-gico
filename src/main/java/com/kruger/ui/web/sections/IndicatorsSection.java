package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.entitys.LogicFrameData;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for managing indicators.
 * This class provides methods to set indicator information.
 */
public class IndicatorsSection extends BasePageObject {
    @FindBy(name = "indicador")
    WebElement indicatorTextBox;
    @FindBy(name = "unidadMedida")
    WebElement measuringUnitTextBox;
    @FindBy(name = "lineaBase")
    WebElement baseLineTextBox;
    @FindBy(name = "meta")
    WebElement goalTextBox;
    @FindBy(name = "ponderacion")
    WebElement weightingTextBox;
    @FindBy(name = "valor")
    WebElement yearValueTextBox;

    public IndicatorsSection() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        indicatorTextBox = driverWait.until(ExpectedConditions.elementToBeClickable(indicatorTextBox));
    }

    private void setIndicator(String indicator) {
        UIMethods.enterText(indicatorTextBox, indicator);
    }

    private void setMeasuringUnit(String measuringUnit) {
        UIMethods.clickOnElement(measuringUnitTextBox);
        UIMethods.enterText(measuringUnitTextBox, measuringUnit);
    }

    private void setBaseLine(String baseLine) {
        UIMethods.enterText(baseLineTextBox, baseLine);
    }

    private void setGoal(String goal) {
        UIMethods.enterText(goalTextBox, goal);
    }

    private void setWeighting(String weighting) {
        UIMethods.enterText(weightingTextBox, weighting);
    }

    private void setYearValue(String yearValue) {
        UIMethods.enterText(yearValueTextBox, yearValue);
    }

    /**
     * Sets the indicator information based on the provided logic frame data.
     */
    public void setIndicatorInformation(LogicFrameData logicFrameData) {
        setIndicator(logicFrameData.getIndicator());
        setMeasuringUnit(logicFrameData.getMeasuringUnitIndicator());
        setBaseLine(logicFrameData.getBaseLine());
        setGoal(logicFrameData.getGoal());
        setWeighting(logicFrameData.getWeighting());
        setYearValue(logicFrameData.getYearValue());
    }
}
