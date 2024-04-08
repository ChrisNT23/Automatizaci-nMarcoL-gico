package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.entitys.LocationData;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for selecting coordinates in a project.
 * This class provides methods to set latitude, longitude, and observation for the coordinates,
 * and to add the coordinates to the project.
 */
public class CoordinatesSelectionSection extends BasePageObject {
    @FindBy(xpath = "//div[contains(text(),'de Coordenadas')]")
    WebElement coordinatesSelectionLabel;
    @FindBy(xpath = "//div[contains(@class,'p-fluid formgrid grid justify-content-start')]//input[@id='coordenadaX']")
    WebElement latitudeTextBox;
    @FindBy(xpath = "//div[contains(@class,'p-fluid formgrid grid justify-content-start')]//input[@id='coordenadaY']")
    WebElement longitudeTextBox;
    @FindBy(xpath = "//div[contains(@class,'p-fluid formgrid grid justify-content-start')]//textarea")
    WebElement observationTextBox;
    @FindBy(xpath = "//div[contains(text(),'de Coordenadas')]/following::button[contains(@class,'p-button-rounded')]")
    WebElement addCoordinatesButton;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        coordinatesSelectionLabel = driverWait.until(ExpectedConditions.visibilityOf(coordinatesSelectionLabel));
    }

    private void setLatitude(String latitude) {
        UIMethods.enterText(latitudeTextBox, latitude);
    }

    private void setLongitude(String longitude) {
        UIMethods.enterText(longitudeTextBox, longitude);
    }

    private void setObservation(String observation) {
        UIMethods.enterText(observationTextBox, observation);
    }

    /**
     * Sets the coordinates using the data from the provided LocationData object.
     *
     * @param locationData the LocationData object containing coordinate information
     */
    public void setCoordinates(LocationData locationData) {
        setLatitude(locationData.getLatitude());
        setLongitude(locationData.getLongitude());
        setObservation(locationData.getObservation());
        UIMethods.clickOnElement(addCoordinatesButton);
        clickOnYesOption();
        driverWait.until(ExpectedConditions.invisibilityOf(coordinatesSelectionLabel));
    }

}
