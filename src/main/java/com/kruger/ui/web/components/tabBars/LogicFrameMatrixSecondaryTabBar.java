package com.kruger.ui.web.components.tabBars;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.ui.web.sections.FinancingSourcesSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * The LogicFrameMatrixSecondaryTabBar class represents the secondary tab bar specific to logic frame matrix
 * It extends the BaseTabBar class and provides methods for interacting with logic frame matrix secondary tab options.
 */
public class LogicFrameMatrixSecondaryTabBar extends BaseTabBar {
    private static final String SECOND_TAB_OPTION_XPATH = "(//a[contains(span,'%s')]/parent::li)[2]";

    public LogicFrameMatrixSecondaryTabBar() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        WebElement assumptionsTabOption = getTabOptionElement(XpathText.ASSUMPTIONS_TAB.getText());
        driverWait.until(ExpectedConditions.elementToBeClickable(assumptionsTabOption));
    }

    /**
     * Clicks on the second tab option based on the given tab title.
     *
     * @param tabTitle The title of the tab option to click.
     */
    private void clickOnSecondTabOption(String tabTitle) {
        WebElement tabOptionElement = UIMethods.getElementFromDynamicXpath(SECOND_TAB_OPTION_XPATH, tabTitle);
        waitUntilTabOptionIsEnabled(tabTitle);
        UIMethods.clickOnElement(tabOptionElement);
    }

    /**
     * Clicks on the "Verification Methods" tab option.
     */
    public void clickOnVerificationMethodsTab() {
        clickOnTabOption(XpathText.VERIFICATION_METHODS_TAB.getText());
    }

    /**
     * Clicks on the "Assumptions" tab option.
     */
    public void clickOnAssumptionsTab() {
        clickOnTabOption(XpathText.ASSUMPTIONS_TAB.getText());
    }

    /**
     * Clicks on the second "Assumptions" tab option.
     */
    public void clickOnSecondAssumptionsTab() {
        clickOnSecondTabOption(XpathText.ASSUMPTIONS_TAB.getText());
    }

    /**
     * Clicks on the "Activities" tab option.
     */
    public void clickOnActivitiesTab() {
        clickOnTabOption(XpathText.ACTIVITIES_TAB.getText());
    }

    /**
     * Clicks on the "Financing Sources" tab option.
     * Returns a FinancingSourcesSection object representing the financing sources section.
     */
    public FinancingSourcesSection clickOnFinancingSourcesTab() {
        clickOnSecondTabOption(XpathText.FINANCING_SOURCES_TAB.getText());
        return new FinancingSourcesSection();
    }

}
