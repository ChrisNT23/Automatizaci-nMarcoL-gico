package com.kruger.ui.web.pages;

import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.BasePageObject;
import com.kruger.ui.web.components.TopBar;

/**
 * Abstract class representing a base page in the SIPeIP application.
 * This class extends the BasePageObject class and provides common functionality for all page objects.
 */
public abstract class BasePage extends BasePageObject {
    private static final String ERROR_NOTIFICATION_XPATH = "//div[span='Error']";
    public TopBar topBar;

    public BasePage() {
        topBar = new TopBar();
    }

    /**
     * Checks if the error notification is displayed on the page.
     *
     * @return true if the error notification is displayed, false otherwise.
     */
    public boolean isErrorNotificationDisplayed() {
        return UIMethods.isElementDisplayed(ERROR_NOTIFICATION_XPATH);
    }

}
