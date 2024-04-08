package com.kruger.ui.steps.inversion;

import com.kruger.entitys.AlignmentData;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.newProject.IndicatorsPage;
import com.kruger.ui.web.pages.inversion.newProject.alignment.PNDAlignmentPage;
import com.kruger.ui.web.pages.inversion.newProject.alignment.ProjectRelationshipPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class AlignmentSteps {

    private ProjectRelationshipPage projectRelationshipPage;
    private PNDAlignmentPage pndAlignmentPage;


    @When("the user navigates to the alignment page from the indicators page")
    public void navigateAlignmentPageFromIndicatorsPage() {
        IndicatorsPage indicatorsPage = new IndicatorsPage();
        pndAlignmentPage = indicatorsPage.projectTabBar.navigateToAlignmentTab();
    }

    @When("the user navigates to the alignment page from the general data page")
    public void navigateAlignmentPageFromGeneralDataPage() {
        GeneralDataPage generalDataPage = new GeneralDataPage();
        pndAlignmentPage = generalDataPage.projectTabBar.navigateToAlignmentTab();
    }

    @When("the user saves the alignment information with the following data")
    public void saveAlignmentData(DataTable table) {
        List<Map<String, String>> paramsList = table.asMaps(String.class, String.class);
        Map<String, String> values = paramsList.get(0);
        AlignmentData alignmentData = AlignmentData.builder().fromMap(values).build();
        pndAlignmentPage.setPNDGoal(alignmentData);
        projectRelationshipPage = pndAlignmentPage.alignmentTabBar.clickOnProjectRelationshipTab();
        projectRelationshipPage.addProjectRelationship(alignmentData);
    }

    @Then("the alignment information should be saved")
    public void verifyAlignmentInformationSaved() {
        boolean isSavedAlignmentNotificationDisplayed = projectRelationshipPage.isSavedAlignmentNotificationDisplayed();
        boolean isTechnicalStudiesTabOptionEnabled = projectRelationshipPage.projectTabBar.isTechnicalStudiesTabOptionEnabled();

        Assert.assertTrue(isSavedAlignmentNotificationDisplayed, "The saved alignment notification is not displayed");
        Assert.assertTrue(isTechnicalStudiesTabOptionEnabled, "The technical studies tab is not enabled");
    }
}
