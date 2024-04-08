package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for selecting goals.
 * This class provides methods to search for a goal and select it.
 */
public class SelectGoalSection extends BasePageObject {
    private static final String SELECT_GOAL_BUTTON_XPATH = "//tr[td/div[text()='%s']]//button";
    @FindBy(xpath = "//button[text()='1']")
    WebElement firstPageButton;
    @FindBy(xpath = "//thead/tr[2]/th[2]//input")
    WebElement searchGoalInput;

    public SelectGoalSection() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        firstPageButton = driverWait.until(ExpectedConditions.elementToBeClickable(firstPageButton));
    }

    private void searchGoal(String goal) {
        UIMethods.enterText(searchGoalInput, goal);
    }

    private void clickOnSelectGoalButton(String goal) {
        WebElement selectGoalButton = UIMethods.getElementFromDynamicXpath(SELECT_GOAL_BUTTON_XPATH, goal);
        UIMethods.clickOnElement(selectGoalButton);
    }

    /**
     * Selects a goal by searching for it and clicking on the corresponding select button.
     */
    public void selectGoal(String goal) {
        searchGoal(goal);
        clickOnSelectGoalButton(goal);
    }
}
