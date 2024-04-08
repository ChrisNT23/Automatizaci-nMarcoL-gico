package com.kruger.ui.web.components;

import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.BasePageObject;
import com.kruger.ui.web.pages.login.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * The TopBar class represents the top navigation bar of the application.
 * It extends the BasePageObject class and contains elements and methods specific to the top bar.
 */
public class TopBar extends BasePageObject {
    @FindBy(xpath = "//div[@class='flex flex-row justify-content-center']/button")
    WebElement accountButton;
    @FindBy(xpath = "//div[@class='col-md-12']//descendant::button[3]")
    WebElement logoutButton;

    public TopBar() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        accountButton = driverWait.until(ExpectedConditions.elementToBeClickable(accountButton));
    }

    /**
     * Logs out from the application by clicking on the account button and then the logout button.
     */
    public void logout() {
        UIMethods.clickOnElement(accountButton);
        UIMethods.clickOnElement(logoutButton);
    }

    /**
     * Checks if the account button is displayed in the top bar.
     * @return True if the account button is displayed, false otherwise.
     */
    public boolean isAccountButtonDisplayed() {
        return UIMethods.isElementDisplayed(accountButton);
    }
}