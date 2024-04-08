package com.kruger.config.selenium;

import com.kruger.utils.LoggerManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 * The DriverManager class manages the creation and configuration of the WebDriver instance.
 */
public class DriverManager {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final DriverConfig DRIVER_CONFIG = DriverConfig.getInstance();
    private static DriverManager instance;

    private WebDriver driver;
    private Wait<WebDriver> driverWait;

    /**
     * Private constructor to initialize the DriverManager instance.
     */
    private DriverManager() {
        initialize();
    }

    /**
     * Gets the singleton instance of the DriverManager class.
     * @return The DriverManager instance.
     */
    public static DriverManager getInstance() {
        if (instance == null || instance.driver == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    /**
     * Initializes the WebDriver instance with the specified configuration.
     */
    private void initialize() {
        LOG.info("Initializing Selenium Web Driver Manager...");
        driver = DriverFactory.createDriver(DRIVER_CONFIG.getBrowser());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(DRIVER_CONFIG.getImplicitTime());
        driverWait = new FluentWait<>(driver)
                .withTimeout(DRIVER_CONFIG.getTimeout())
                .pollingEvery(DRIVER_CONFIG.getPollingTime())
                .ignoring(NoSuchElementException.class)
                .ignoring(NotFoundException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    /**
     * Gets the WebDriver instance.
     * @return The WebDriver instance.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Gets the WebDriverWait instance associated with the WebDriver.
     * @return The WebDriverWait instance.
     */
    public Wait<WebDriver> getDriverWait() {
        return driverWait;
    }

    /**
     * Quits the WebDriver instance and releases associated resources.
     */
    public void quitWebDriver() {
        try {
            driver.quit();
            LOG.info("Closing WebDriver");

        } catch (Exception e) {
            LOG.error("Error closing WebDriver: " + e.getMessage());
        } finally {
            driver = null;
        }

    }

}
