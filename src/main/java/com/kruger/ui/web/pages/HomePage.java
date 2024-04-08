package com.kruger.ui.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents the home page of the SIPeIP application.
 * This class provides methods to interact with elements on the home page.
 */
public class HomePage extends BasePage {
    @FindBy(xpath = "//div[text()='Bienvenido a SIPeIP']")
    WebElement welcomeLabel;

    public HomePage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        welcomeLabel = driverWait.until(ExpectedConditions.visibilityOf(welcomeLabel));
    }
}
