package com.kruger.ui.web.pages.inversion.newProject.alignment;

import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.web.components.tabBars.AlignmentTabBar;
import com.kruger.ui.web.pages.inversion.newProject.BaseProjectPage;

/**
 * Abstract base page class for alignment-related pages.
 * Extends BaseProjectPage.
 */
public abstract class AlignmentBasePage extends BaseProjectPage {
    private static final String ALIGNMENT_SAVED_NOTIFICATION_XPATH = "//div[contains(text(),'n al PND se guard')]";
    public AlignmentTabBar alignmentTabBar;

    public AlignmentBasePage() {
        alignmentTabBar = new AlignmentTabBar();
    }

    /**
     * Checks if the saved alignment notification is displayed.
     *
     * @return true if the notification is displayed, false otherwise.
     */
    public boolean isSavedAlignmentNotificationDisplayed() {
        return UIMethods.isElementDisplayed(ALIGNMENT_SAVED_NOTIFICATION_XPATH);
    }
}
