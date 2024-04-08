package com.kruger.config.selenium;

import com.kruger.constants.Browser;
import com.kruger.utils.LoggerManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.service.DriverService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The DriverFactory class is responsible for creating WebDriver instances based on the specified browser type.
 */
public class DriverFactory {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final DriverConfig DRIVER_CONFIG = DriverConfig.getInstance();

    /**
     * Creates a WebDriver instance based on the specified browser type.
     *
     * @param browser The browser type.
     * @return A WebDriver instance.
     */
    public static WebDriver createDriver(Browser browser) {
        LOG.info("Initializing the Driver Factory");
        switch (browser) {
            case CHROME -> {
                return createChromeDriver();
            }
            case EDGE -> {
                return createEdgeDriver();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * Configures common options for Chrome and Edge browsers.
     *
     * @return A map of preferences.
     */
    private static Map<String, Object> configureCommonOptions() {
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        return prefs;
    }

    /**
     * Configures options specific to the Chrome browser.
     *
     * @return ChromeOptions instance.
     */
    private static ChromeOptions configureChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        chromeOptions.addArguments("--password-store-basic");
        chromeOptions.addArguments("--remote-allow-origins=*");
        Map<String, Object> prefs = configureCommonOptions();
        chromeOptions.setExperimentalOption("prefs", prefs);
        if (DRIVER_CONFIG.getHeadlessMode()) {
            LOG.info("Headless mode enabled");
            chromeOptions.addArguments("--headless=new");
        }
        return chromeOptions;
    }

    /**
     * Configures options specific to the Edge browser.
     *
     * @return EdgeOptions instance.
     */
    private static EdgeOptions configureEdgeOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        edgeOptions.addArguments("--password-store-basic");
        edgeOptions.addArguments("--remote-allow-origins=*");
        Map<String, Object> prefs = configureCommonOptions();
        edgeOptions.setExperimentalOption("prefs", prefs);
        if (DRIVER_CONFIG.getHeadlessMode()) {
            LOG.info("Headless mode enabled");
            edgeOptions.addArguments("--headless=new");
        }
        return edgeOptions;
    }

    /**
     * Creates a ChromeDriver instance.
     *
     * @return ChromeDriver instance.
     */
    private static ChromeDriver createChromeDriver() {
        try {
            DriverService.Builder<ChromeDriverService, ChromeDriverService.Builder> builder = new ChromeDriverService.Builder().withSilent(true);
            ChromeDriverService service = builder.build();
            ChromeOptions chromeOptions = configureChromeOptions();
            LOG.info("ChromeWebDriver initialized");
            return new ChromeDriver(service, chromeOptions);
        } catch (WebDriverException e) {
            LOG.error("Error creating the ChromeDriver");
            throw new RuntimeException("Error creating the ChromeDriver " + e.getMessage());
        }
    }

    /**
     * Creates an EdgeDriver instance.
     *
     * @return EdgeDriver instance.
     */
    private static EdgeDriver createEdgeDriver() {
        try {
            DriverService.Builder<EdgeDriverService, EdgeDriverService.Builder> builder = new EdgeDriverService.Builder().withSilent(true);
            EdgeDriverService service = builder.build();
            EdgeOptions edgeOptions = configureEdgeOptions();
            LOG.info("EdgeWebDriver initialized");
            return new EdgeDriver(service, edgeOptions);
        } catch (WebDriverException e) {
            LOG.error("Error creating the EdgeDriver");
            throw new RuntimeException("Error creating the EdgeDriver " + e.getMessage());
        }
    }

}
