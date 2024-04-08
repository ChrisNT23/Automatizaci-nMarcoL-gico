package com.kruger.ui.steps.inversion;

import com.kruger.entitys.LocationData;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.newProject.LogicFramePage;
import com.kruger.ui.web.pages.inversion.newProject.geographicLocation.GeographicLocationsCoordinatesPage;
import com.kruger.ui.web.pages.inversion.newProject.geographicLocation.SelectedGeographicLocationsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class GeographicLocationSteps {
    private SelectedGeographicLocationsPage selectedGeographicLocationsPage;
    private GeographicLocationsCoordinatesPage coordinatesPage;

    @When("the user navigates to the geographic location page from the general data page")
    public void navigateGeographicLocationPageFromGeneralData() {
        GeneralDataPage generalDataPage = new GeneralDataPage();
        selectedGeographicLocationsPage = generalDataPage.projectTabBar.navigateToGeographicLocationTab();
    }
    @When("the user navigates to the geographic location page from the logic frame page")
    public void navigateGeographicLocationPageFromLogicFrame() {
        LogicFramePage logicFramePage = new LogicFramePage();
        selectedGeographicLocationsPage = logicFramePage.projectTabBar.navigateToGeographicLocationTab();
    }

    @When("the user saves the geographic location information with the following data")
    public void saveGeographicLocationData(DataTable table) {
        List<Map<String, String>> paramsList = table.asMaps(String.class, String.class);
        Map<String, String> values = paramsList.get(0);
        LocationData locationData = LocationData.builder().fromMap(values).build();
        selectedGeographicLocationsPage.setSelectedGeographicLocationData(locationData);
        coordinatesPage = selectedGeographicLocationsPage.geographicLocationTabBar.clickOnCoordinatesTab();
        coordinatesPage.setCoordinatesByMap(locationData);
    }

    @Then("the geographic location information should be saved")
    public void verifyGeographicLocationSaved() {
        boolean isIndicatorsTabOptionEnabled = coordinatesPage.projectTabBar.isIndicatorTabOptionEnabled();

        Assert.assertTrue(isIndicatorsTabOptionEnabled, "The Indicators tab is not enabled");
    }
}
