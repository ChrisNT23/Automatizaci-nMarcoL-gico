package com.kruger.ui;

import com.kruger.config.selenium.DriverManager;
import com.kruger.config.selenium.UIMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

/**
 * The BasePageObject class serves as the base class for all page objects in the Selenium framework.
 * It provides common functionality and initialization for page objects.
 */
public abstract class BasePageObject {
    private static final String BUTTON_XPATH = "//button[@aria-label='%s']";
    private static final String YES_BUTTON_XPATH = "//div[contains(@class,'p-confirm')]//button[2]";
    protected WebDriver driver;
    protected Wait<WebDriver> driverWait;

    /**
     * Constructor to initialize the WebDriver and WebDriverWait instances.
     * It also initializes the page elements using PageFactory.
     */
    public BasePageObject() {
        this.driver = DriverManager.getInstance().getDriver();
        this.driverWait = DriverManager.getInstance().getDriverWait();
        PageFactory.initElements(driver, this);
    }

    /**
     * Abstract method to wait until the page object is loaded.
     * Subclasses must implement this method to define how the page object's loading is verified.
     */
    public abstract void waitUntilPageObjectIsLoaded();

    /**
     * Clicks on a button with the specified label.
     *
     * @param buttonLabel The label of the button to click.
     */
    protected void clickOnButton(String buttonLabel) {
        WebElement button = UIMethods.getElementFromDynamicXpath(BUTTON_XPATH, buttonLabel);
        UIMethods.clickOnElement(button);
    }

    /**
     * Clicks on the 'Yes' option in confirmation dialogs.
     */
    protected void clickOnYesOption() {
        WebElement yesOption = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(YES_BUTTON_XPATH)));
        UIMethods.clickOnElement(yesOption);
    }
}
