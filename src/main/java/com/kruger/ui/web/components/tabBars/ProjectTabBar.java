package com.kruger.ui.web.components.tabBars;

import com.kruger.constants.XpathText;
import com.kruger.ui.web.pages.inversion.newProject.DictumRequestPage;
import com.kruger.ui.web.pages.inversion.newProject.IndicatorsPage;
import com.kruger.ui.web.pages.inversion.newProject.LogicFramePage;
import com.kruger.ui.web.pages.inversion.newProject.TechnicalStudiesPage;
import com.kruger.ui.web.pages.inversion.newProject.alignment.PNDAlignmentPage;
import com.kruger.ui.web.pages.inversion.newProject.geographicLocation.SelectedGeographicLocationsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * The ProjectTabBar class represents the tab bar specific to a project
 * It extends the BaseTabBar class and provides methods for navigating to different tabs related to a project.
 */
public class ProjectTabBar extends BaseTabBar {

    public ProjectTabBar() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        WebElement generalDataTabOption = getTabOptionElement(XpathText.GENERAL_DATA_TAB.getText());
        driverWait.until(ExpectedConditions.elementToBeClickable(generalDataTabOption));
    }

    /**
     * Navigates to the Logic Frame tab.
     * @return A LogicFramePage object representing the Logic Frame tab.
     */
    public LogicFramePage navigateToLogicFrameTab() {
        clickOnTabOption(XpathText.LOGIC_FRAME_TAB.getText());
        return new LogicFramePage();
    }

    /**
     * Navigates to the Geographic Location tab.
     * @return A SelectedGeographicLocationsPage object representing the Geographic Location tab.
     */
    public SelectedGeographicLocationsPage navigateToGeographicLocationTab() {
        clickOnTabOption(XpathText.GEOGRAPHIC_LOCATION_TAB.getText());
        return new SelectedGeographicLocationsPage();
    }

    /**
     * Navigates to the Indicators tab.
     * @return An IndicatorsPage object representing the Indicators tab.
     */
    public IndicatorsPage navigateToIndicatorsTab() {
        clickOnTabOption(XpathText.INDICATORS_TAB.getText());
        return new IndicatorsPage();
    }

    /**
     * Navigates to the Alignment tab.
     * @return A PNDAlignmentPage object representing the Alignment tab.
     */
    public PNDAlignmentPage navigateToAlignmentTab() {
        clickOnTabOption(XpathText.ALIGNMENT_TAB.getText());
        return new PNDAlignmentPage();
    }

    /**
     * Navigates to the Technical Studies tab.
     * @return A TechnicalStudiesPage object representing the Technical Studies tab.
     */
    public TechnicalStudiesPage navigateToTechnicalStudiesTab() {
        clickOnTabOption(XpathText.TECHNICAL_STUDIES_TAB.getText());
        return new TechnicalStudiesPage();
    }

    /**
     * Navigates to the Dictum Request tab.
     * @return A DictumRequestPage object representing the Dictum Request tab.
     */
    public DictumRequestPage navigateToDictumRequestTab() {
        clickOnTabOption(XpathText.DICTUM_REQUEST_TAB.getText());
        return new DictumRequestPage();
    }

    public boolean isLogicFrameTabOptionEnabled() {
        return isTabOptionEnabled(XpathText.LOGIC_FRAME_TAB.getText());
    }

    public boolean isValuedScheduleTabOptionEnabled() {
        return isTabOptionEnabled(XpathText.VALUED_SCHEDULE_TAB.getText());
    }

    public boolean isFinancingTabOptionEnabled() {
        return isTabOptionEnabled(XpathText.FINANCING_TAB.getText());
    }

    public boolean isGeographicLocationTabOptionEnabled() {
        return isTabOptionEnabled(XpathText.GEOGRAPHIC_LOCATION_TAB.getText());
    }

    public boolean isIndicatorTabOptionEnabled() {
        return isTabOptionEnabled(XpathText.INDICATORS_TAB.getText());
    }

    public boolean isAlignmentTabOptionEnabled() {
        return isTabOptionEnabled(XpathText.ALIGNMENT_TAB.getText());
    }

    public boolean isTechnicalStudiesTabOptionEnabled() {
        return isTabOptionEnabled(XpathText.TECHNICAL_STUDIES_TAB.getText());
    }

}
