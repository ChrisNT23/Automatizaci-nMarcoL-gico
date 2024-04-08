package com.kruger.ui.web.components.tabBars;

import com.kruger.constants.XpathText;
import com.kruger.ui.web.pages.inversion.newProject.geographicLocation.GeographicLocationsCoordinatesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * The GeographicLocationTabBar class represents the tab bar specific to geographic location in a Selenium framework.
 * It extends the BaseTabBar class and provides methods for interacting with geographic location-related tab options.
 */
public class GeographicLocationTabBar extends BaseTabBar {

    public GeographicLocationTabBar() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        WebElement selectedLocationsTabOption = getTabOptionElement(XpathText.SELECTED_GEOGRAPHIC_LOCATION_TAB.getText());
        driverWait.until(ExpectedConditions.elementToBeClickable(selectedLocationsTabOption));
    }

    /**
     * Clicks on the "Coordinates" tab option.
     *
     * @return The GeographicLocationsCoordinatesPage object representing the page after clicking the tab.
     */
    public GeographicLocationsCoordinatesPage clickOnCoordinatesTab() {
        clickOnTabOption(XpathText.GEOGRAPHIC_LOCATION_COORDINATES.getText());
        return new GeographicLocationsCoordinatesPage();
    }
}
