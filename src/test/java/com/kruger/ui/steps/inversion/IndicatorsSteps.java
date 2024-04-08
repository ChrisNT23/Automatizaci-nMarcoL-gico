package com.kruger.ui.steps.inversion;

import com.kruger.entitys.IndicatorsData;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.newProject.IndicatorsPage;
import com.kruger.ui.web.pages.inversion.newProject.geographicLocation.GeographicLocationsCoordinatesPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class IndicatorsSteps {
    private IndicatorsPage indicatorsPage;

    @When("the user navigates to the indicators page from the general data page")
    public void navigateToIndicatorsPageFromGeneralDataPage() {
        GeneralDataPage generalDataPage = new GeneralDataPage();
        indicatorsPage = generalDataPage.projectTabBar.navigateToIndicatorsTab();
    }

    @When("the user navigates to the indicators page from the geographic location page")
    public void navigateToIndicatorsPageFromGeographicLocationPage() {
        GeographicLocationsCoordinatesPage coordinatesPage = new GeographicLocationsCoordinatesPage();
        indicatorsPage = coordinatesPage.projectTabBar.navigateToIndicatorsTab();
    }

    @When("the user saves the indicators information with the following data")
    public void saveIndicatorsData(DataTable table) {
        List<Map<String, String>> paramsList = table.asMaps(String.class, String.class);
        Map<String, String> values = paramsList.get(0);
        IndicatorsData indicatorsData = IndicatorsData.builder().fromMap(values).build();
        indicatorsPage.setIndicatorsData(indicatorsData);
    }

    @Then("the indicators information should be saved")
    public void verifyIndicatorsInformationSaved() {
        boolean isSavedIndicatorsNotificationDisplayed = indicatorsPage.isSavedIndicatorsNotificationDisplayed();
        boolean isAlignmentTabEnabled = indicatorsPage.projectTabBar.isAlignmentTabOptionEnabled();

        Assert.assertTrue(isSavedIndicatorsNotificationDisplayed, "The saved indicators notification is not displayed");
        Assert.assertTrue(isAlignmentTabEnabled, "The Alignment tab is not enabled");
    }

}
