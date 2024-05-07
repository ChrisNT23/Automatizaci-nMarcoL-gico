package com.kruger.ui.steps.inversion;

import com.kruger.entitys.LogicFrameData;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.newProject.LogicFramePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;|

import java.util.List;
import java.util.Map;

public class LogicFrameSteps {
    private GeneralDataPage generalDataPage;
    private LogicFramePage logicFramePage;

    public LogicFrameSteps(GeneralDataPage generalDataPage) {
        this.generalDataPage = generalDataPage;
    }

    @When("the user navigates to the logic frame page")
    public void navigateLogicFramePage() {
        logicFramePage = generalDataPage.projectTabBar.navigateToLogicFrameTab();
    }

    @When("the user saves the logic frame information with the following data")
    public void saveLogicFrameData(DataTable table) {
        List<Map<String, String>> paramsList = table.asMaps(String.class, String.class);
        Map<String, String> values = paramsList.get(0);
        LogicFrameData logicFrameData = LogicFrameData.builder().fromMap(values).build();
        logicFramePage = logicFramePage.saveLogicFrameData(logicFrameData);
    }

    @Then("the logic frame information should be saved")
    public void verifyLogicFrameDataSaved() {
        /*boolean isValuedScheduleTabOptionEnabled = logicFramePage.projectTabBar.isValuedScheduleTabOptionEnabled();
        boolean isFinancingTabOptionEnabled = logicFramePage.projectTabBar.isFinancingTabOptionEnabled();
        boolean isGeographicLocationTabOptionEnabled = logicFramePage.projectTabBar.isGeographicLocationTabOptionEnabled();

        /*Assert.assertTrue(isValuedScheduleTabOptionEnabled, "The Valued Schedule tab is not enabled");
        Assert.assertTrue(isFinancingTabOptionEnabled, "The Financing tab is not enabled");
        Assert.assertTrue(isGeographicLocationTabOptionEnabled, "The Geographic Location tab is not enabled");*/
        
    }
}
