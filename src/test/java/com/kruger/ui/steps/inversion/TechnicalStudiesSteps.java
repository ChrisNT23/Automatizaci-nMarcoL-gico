package com.kruger.ui.steps.inversion;

import com.kruger.entitys.TechnicalStudiesData;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.newProject.TechnicalStudiesPage;
import com.kruger.ui.web.pages.inversion.newProject.alignment.ProjectRelationshipPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class TechnicalStudiesSteps {
    private TechnicalStudiesPage technicalStudiesPage;

    @When("the user navigates to the technical studies page from the alignment page")
    public void navigateToTechnicalStudiesPageFromAlignmentPage() {
        ProjectRelationshipPage projectRelationshipPage = new ProjectRelationshipPage();
        technicalStudiesPage = projectRelationshipPage.projectTabBar.navigateToTechnicalStudiesTab();
    }

    @When("the user navigates to the technical studies page from the general data page")
    public void navigateToTechnicalStudiesPageFromGeneralDataPage() {
        GeneralDataPage generalDataPage = new GeneralDataPage();
        technicalStudiesPage = generalDataPage.projectTabBar.navigateToTechnicalStudiesTab();
    }

    @When("the user saves the technical studies information with the following data")
    public void saveTechnicalStudiesData(DataTable table) {
        List<Map<String, String>> paramsList = table.asMaps(String.class, String.class);
        Map<String, String> values = paramsList.get(0);
        TechnicalStudiesData technicalStudiesData = TechnicalStudiesData.builder().fromMap(values).build();
        technicalStudiesPage.setTechnicalStudiesData(technicalStudiesData);
    }

    @Then("the technical studies information should be saved")
    public void verifyTechnicalInformationSaved() {
        boolean isFileUploadedNotificationDisplayed = technicalStudiesPage.isFileUploadedNotificationDisplayed();

        Assert.assertTrue(isFileUploadedNotificationDisplayed, "The file uploaded notification is not displayed");
    }

}
