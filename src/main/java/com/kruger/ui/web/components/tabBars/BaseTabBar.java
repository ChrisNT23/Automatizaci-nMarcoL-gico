package com.kruger.ui.web.components.tabBars;

import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * The BaseTabBar class represents the base tab bar functionality in a Selenium framework.
 * It extends the BasePageObject class and provides methods for interacting with tab options.
 */
public abstract class BaseTabBar extends BasePageObject {
    private static final String TAB_OPTION_XPATH = "//a[contains(span,'%s')]/parent::li";

    /**
     * Clicks on the tab option with the given title.
     *
     * @param tabTitle The title of the tab option to click.
     */
    protected void clickOnTabOption(String tabTitle) {
        WebElement tabOptionElement = getTabOptionElement(tabTitle);
        waitUntilTabOptionIsEnabled(tabTitle);
        UIMethods.clickOnElement(tabOptionElement);
    }

    /**
     * Checks if the tab option with the given title is enabled.
     *
     * @param tabTitle The title of the tab option to check.
     * @return True if the tab option is enabled, false otherwise.
     */
    protected boolean isTabOptionEnabled(String tabTitle) {
        return UIMethods.isButtonEnabled(getTabOptionElement(tabTitle));
    }

    /**
     * Retrieves the WebElement representing the tab option with the given title.
     *
     * @param tabTitle The title of the tab option.
     * @return The WebElement representing the tab option.
     */
    protected WebElement getTabOptionElement(String tabTitle) {
        return UIMethods.getElementFromDynamicXpath(TAB_OPTION_XPATH, tabTitle);
    }

    /**
     * Waits until the tab option with the given title is enabled.
     *
     * @param tabTitle The title of the tab option to wait for.
     */
    protected void waitUntilTabOptionIsEnabled(String tabTitle) {
        driverWait.until((ExpectedCondition<Boolean>) driver ->
                isTabOptionEnabled(tabTitle));
    }
}
