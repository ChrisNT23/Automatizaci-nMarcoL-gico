package com.kruger.ui.web.sections;

import com.kruger.constants.XpathText;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for selecting users from a list.
 * This class provides methods to select users from the list displayed.
 */
public class UserSelectorSection extends BasePageObject {
    @FindBy(xpath = "//button[text()='1']")
    WebElement firstPageButton;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        firstPageButton = driverWait.until(ExpectedConditions.elementToBeClickable(firstPageButton));
    }

    private void clickOnSelectButton() {
        clickOnButton(XpathText.SELECT_BUTTON.getText());
    }

    /**
     * Selects a user from the list.
     * This method clicks on the select button to choose the user.
     */
    public void selectUser() {
        clickOnSelectButton();
    }
}
