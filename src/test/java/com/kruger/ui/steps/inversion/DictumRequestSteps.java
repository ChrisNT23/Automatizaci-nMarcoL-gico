package com.kruger.ui.steps.inversion;

import com.kruger.entitys.DictumRequestData;
import com.kruger.ui.PageTransporter;
import com.kruger.ui.web.pages.inversion.newProject.DictumRequestPage;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.newProject.TechnicalStudiesPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class DictumRequestSteps {
    private final PageTransporter pageTransporter;
    private DictumRequestPage dictumRequestPage;

    public DictumRequestSteps() {
        pageTransporter = PageTransporter.getInstance();
    }


    @When("the user navigates to the dictum request page from the techinical studies page")
    public void navigateAlignmentPageFromIndicatorsPage() {
        TechnicalStudiesPage technicalStudiesPage = new TechnicalStudiesPage();
        dictumRequestPage = technicalStudiesPage.projectTabBar.navigateToDictumRequestTab();
    }

    @When("the user navigates to the dictum request page from the general data page")
    public void navigateAlignmentPageFromGeneralDataPage() {
        GeneralDataPage generalDataPage = new GeneralDataPage();
        dictumRequestPage = generalDataPage.projectTabBar.navigateToDictumRequestTab();
    }

    @When("the user saves the dictum request information with the following data")
    public void saveAlignmentData(DataTable table) {
        List<Map<String, String>> paramsList = table.asMaps(String.class, String.class);
        Map<String, String> values = paramsList.get(0);
        DictumRequestData dictumRequestData = DictumRequestData.builder().fromMap(values).build();
        dictumRequestPage.sendDictumRequest(dictumRequestData);

    }

    @Then("the dictum request should be sent")
    public void verifyAlignmentInformationSaved() {
        boolean isRequestCreatedNotificationDisplayed = dictumRequestPage.isRequestCreatedNotificationDisplayed();
        boolean isOnProjectsVisualizationPage = pageTransporter.isOnProjectsVisualizationPageUrl();

        //Assert.assertTrue(isRequestCreatedNotificationDisplayed, "The request created notification is not displayed");
        Assert.assertTrue(isOnProjectsVisualizationPage, "The user is not on the Projects Visualization Page");
    }
}
