package com.kruger.ui.hooks;

import com.kruger.config.selenium.DriverManager;
import com.kruger.ui.methods.CommonMethods;
import com.kruger.utils.LoggerManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ScenarioHooks {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final DriverManager DRIVER_MANAGER = DriverManager.getInstance();

    @AfterAll
    public static void afterAll() {
        DRIVER_MANAGER.quitWebDriver();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        LOG.info("Scenario: --> " + scenario.getName());
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        LOG.info("Scenario: --> " + scenario.getName() + " : " + scenario.getStatus());
    }

    @After(order = 2, value = "not @LogoutNotNecessary")
    public void logout() {
        CommonMethods.logout();
    }


}
