package com.kruger.ui.web.components.tabBars;

import com.kruger.constants.XpathText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * The LogicFrameMatrixMainTabBar class represents the main tab bar specific to logic frame matrix
 * It extends the BaseTabBar class and provides methods for interacting with logic frame matrix main tab options.
 */
public class LogicFrameMatrixMainTabBar extends BaseTabBar {

    public LogicFrameMatrixMainTabBar() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        WebElement endTabOption = getTabOptionElement(XpathText.END_TAB.getText());
        driverWait.until(ExpectedConditions.elementToBeClickable(endTabOption));
    }

    /**
     * Clicks on the "Purpose" tab option.
     */
    public void clickOnPurposeTab() {
        clickOnTabOption(XpathText.PURPOSE_TAB.getText());
    }

    /**
     * Clicks on the "Components" tab option.
     */
    public void clickOnComponentsTab() {
        clickOnTabOption(XpathText.COMPONENTS_TAB.getText());
    }
}
