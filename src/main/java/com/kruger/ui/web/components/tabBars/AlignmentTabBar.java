package com.kruger.ui.web.components.tabBars;

import com.kruger.constants.XpathText;
import com.kruger.ui.web.pages.inversion.newProject.alignment.ProjectRelationshipPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * The AlignmentTabBar class represents the tab bar specific to alignment in a Selenium framework.
 * It extends the BaseTabBar class and provides methods for interacting with alignment-related tab options.
 */
public class AlignmentTabBar extends BaseTabBar {

    public AlignmentTabBar() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        WebElement pndAlignmentTabOption = getTabOptionElement(XpathText.PND_ALIGNMENT_TAB_OPTION.getText());
        driverWait.until(ExpectedConditions.elementToBeClickable(pndAlignmentTabOption));
    }

    /**
     * Clicks on the "Project Relationship" tab option.
     *
     * @return The ProjectRelationshipPage object representing the page after clicking the tab.
     */
    public ProjectRelationshipPage clickOnProjectRelationshipTab() {
        clickOnTabOption(XpathText.PROJECT_RELATIONSHIP_TAB_OPTION.getText());
        return new ProjectRelationshipPage();
    }
}
