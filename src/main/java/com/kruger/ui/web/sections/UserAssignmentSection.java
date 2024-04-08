package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for assigning users to a task or project.
 * This class provides methods to search for users, select them, and assign them to the task or project.
 */
public class UserAssignmentSection extends BasePageObject {
    @FindBy(xpath = "//button[contains(@class,'icon-search')]")
    WebElement searchButton;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        searchButton = driverWait.until(ExpectedConditions.elementToBeClickable(searchButton));
    }

    /**
     * Clicks on the search button to search for users.
     * @return An instance of UserSelectorSection to select users.
     */
    private UserSelectorSection clickOnSearchButton() {
        UIMethods.clickOnElement(searchButton);
        return new UserSelectorSection();
    }

    private void clickOnAssignUserButton() {
        clickOnButton(XpathText.ASSIGN_USER_BUTTON.getText());
    }

    /**
     * Assigns a user to the task or project.
     * This method searches for a user, selects them, and then assigns them to the task or project.
     */
    public void assignUser() {
        UserSelectorSection userSelectorSection = clickOnSearchButton();
        userSelectorSection.selectUser();
        clickOnAssignUserButton();
        clickOnYesOption();
    }
}
