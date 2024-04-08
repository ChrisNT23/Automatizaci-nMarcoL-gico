package com.kruger.config.selenium;

import com.kruger.constants.Browser;
import com.kruger.constants.PropertyKey;
import com.kruger.utils.LoggerManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Properties;

/**
 * The DriverConfig class manages the configuration properties related to WebDriver settings
 * stored in the web-driver.properties file
 */
public class DriverConfig {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final Path DRIVER_PATH_FILE = Paths.get(System.getProperty("user.dir"), "web-driver.properties");
    private static DriverConfig instance;
    private Properties properties;
    private Browser browser;

    /**
     * Private constructor to initialize the DriverConfig instance.
     */
    private DriverConfig() {
        initialize();
    }

    /**
     * Gets the singleton instance of the DriverConfig class.
     *
     * @return The DriverConfig instance.
     */
    public static DriverConfig getInstance() {
        if (instance == null || instance.properties == null) {
            instance = new DriverConfig();
        }
        return instance;
    }

    /**
     * Initializes the DriverConfig instance by reading driver configuration properties.
     */
    private void initialize() {
        LOG.info("Reading driver config...");
        readBrowserProperty();
        loadDriverProperties();
    }

    /**
     * Reads the browser property from system properties.
     */
    private void readBrowserProperty() {
        try {
            browser = Browser.valueOf(System.getProperty("browser", Browser.CHROME.getValue()).toUpperCase());
            LOG.info("Browser selected -> " + browser);
        } catch (IllegalArgumentException e) {
            LOG.error("Browser selected -> " + browser + " is not valid");
            throw new IllegalArgumentException("Browser selected is not valid: " + e.getMessage());
        }
    }

    /**
     * Loads the driver properties from the properties file.
     */
    private void loadDriverProperties() {
        properties = new Properties();
        Properties driverProperties = new Properties();
        try {
            driverProperties.load(Files.newInputStream(DRIVER_PATH_FILE));
        } catch (IOException e) {
            LOG.error("Unable to load driver properties file " + e.getMessage());
            throw new RuntimeException(e);
        }
        properties.putAll(driverProperties);
    }

    /**
     * Gets the configured browser.
     *
     * @return The configured browser.
     */
    public Browser getBrowser() {
        return browser;
    }

    /**
     * Gets the value of the specified file property.
     *
     * @param property The key of the file property.
     * @return The value of the specified property.
     */
    private String getDriverProperty(String property) {
        return properties.getProperty(property);
    }

    /**
     * Gets the implicit wait time for WebDriver.
     *
     * @return The implicit wait time.
     */
    public Duration getImplicitTime() {
        long milliseconds = Long.parseLong(getDriverProperty(PropertyKey.WEB_DRIVER_IMPLICIT_WAIT_TIME.getKey()));
        return Duration.ofMillis(milliseconds);
    }

    /**
     * Gets the timeout for WebDriver operations.
     *
     * @return The timeout duration.
     */
    public Duration getTimeout() {
        long milliseconds = Long.parseLong(getDriverProperty(PropertyKey.WEB_DRIVER_TIMEOUT.getKey()));
        return Duration.ofMillis(milliseconds);
    }

    /**
     * Gets the polling time for WebDriver waits.
     *
     * @return The polling time duration.
     */
    public Duration getPollingTime() {
        long milliseconds = Long.parseLong(getDriverProperty(PropertyKey.WEB_DRIVER_POLLING_TIME.getKey()));
        return Duration.ofMillis(milliseconds);
    }

    /**
     * Gets the headless mode setting for WebDriver.
     *
     * @return True if headless mode is enabled, otherwise false.
     */
    public Boolean getHeadlessMode() {
        return Boolean.parseBoolean(getDriverProperty(PropertyKey.WEB_DRIVER_HEADLESS_MODE.getKey()));
    }

}
