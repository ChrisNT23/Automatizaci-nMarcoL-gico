package com.kruger.ui.steps.inversion;

import com.kruger.entitys.GeneralProjectData;
import com.kruger.ui.PageTransporter;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class GeneralDataSteps {
    private final PageTransporter pageTransporter;
    private GeneralDataPage generalDataPage;

    public GeneralDataSteps() {
        pageTransporter = PageTransporter.getInstance();
    }

    @When("the user navigates to the new project page via url link")
    public void navigateNewProjectPageWithUrl() {
        generalDataPage = pageTransporter.navigateToGeneralDataPage();
    }

    @When("the user creates a project with the following data")
    public void createProjectWithValidData(DataTable table) {
        List<Map<String, String>> paramsList = table.asMaps(String.class, String.class);
        Map<String, String> values = paramsList.get(0);
        GeneralProjectData projectData = GeneralProjectData.builder().fromMap(values).build();
        generalDataPage = generalDataPage.createProject(projectData);
    }

    @Then("the project should be created")
    public void verifyProjectCreated() {
        boolean isErrorNotificationDisplayed = generalDataPage.isErrorNotificationDisplayed();
        boolean isLogicFrameTabOptionEnabled = generalDataPage.projectTabBar.isLogicFrameTabOptionEnabled();

        Assert.assertFalse(isErrorNotificationDisplayed, "A notification error is displayed");
        Assert.assertTrue(isLogicFrameTabOptionEnabled, "The logic frame tab option is not enabled");
    }
}
