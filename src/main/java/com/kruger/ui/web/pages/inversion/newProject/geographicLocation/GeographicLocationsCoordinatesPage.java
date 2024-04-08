package com.kruger.ui.web.pages.inversion.newProject.geographicLocation;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.LocationData;
import com.kruger.ui.web.sections.CoordinatesSelectionSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page class for managing geographic locations' coordinates.
 * Extends GeographicLocationBasePage.
 */
public class GeographicLocationsCoordinatesPage extends GeographicLocationBasePage {
    @FindBy(xpath = "//div[text()='Coordenadas']")
    WebElement coordinatesLabel;
    @FindBy(id = "coordenadaX")
    WebElement latitudeTextBox;
    @FindBy(id = "coordenadaY")
    WebElement longitudeTextBox;
    @FindBy(id = "observacion")
    WebElement observationTextBox;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        coordinatesLabel = driverWait.until(ExpectedConditions.visibilityOf(coordinatesLabel));
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

    private void clickOnAddCoordinatesButton() {
        clickOnButton(XpathText.ADD_COORDINATES_BUTTON.getText());
    }

    private CoordinatesSelectionSection clickOnAddCoordinatesFromMap() {
        clickOnButton(XpathText.ADD_COORDINATES_FROM_MAP_BUTTON.getText());
        return new CoordinatesSelectionSection();
    }

    /**
     * Sets the coordinates based on the provided LocationData.
     *
     * @param locationData The LocationData object containing latitude, longitude, and observation.
     */
    public void setCoordinates(LocationData locationData) {
        setLatitude(locationData.getLatitude());
        setLongitude(locationData.getLongitude());
        setObservation(locationData.getObservation());
        clickOnAddCoordinatesButton();
    }

    /**
     * Sets the coordinates by selecting them from the map based on the provided LocationData.
     *
     * @param locationData The LocationData object containing latitude and longitude.
     */
    public void setCoordinatesByMap(LocationData locationData) {
        CoordinatesSelectionSection coordinatesSelectionSection = clickOnAddCoordinatesFromMap();
        coordinatesSelectionSection.setCoordinates(locationData);
    }

}
