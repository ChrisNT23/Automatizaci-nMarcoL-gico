package com.kruger.ui;

import com.kruger.config.CredentialsManager;
import com.kruger.config.selenium.DriverManager;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.projectsVisualization.ProjectsVisualizationPage;
import com.kruger.ui.web.pages.login.LoginPage;
import com.kruger.ui.web.pages.workflow.RequestTrayPage;
import com.kruger.utils.LoggerManager;
import org.openqa.selenium.WebDriver;

/**
 * The PageTransporter class manages navigation between different pages of the application.
 * It provides methods to check the current URL and navigate to specific pages if needed.
 */
public class PageTransporter {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final CredentialsManager CREDENTIALS_MANAGER = CredentialsManager.getInstance();
    private static PageTransporter instance;
    private WebDriver driver;
    private String homeUrl;
    private String loginUrl;
    private String baseUrl;
    private String newProjectUrl;
    private String projectsVisualizationUrl;
    private String requestTrayUrl;

    /**
     * Private constructor to prevent direct instantiation.
     * Initializes the PageTransporter instance.
     */
    private PageTransporter() {
        initialize();
    }

    /**
     * Gets the singleton instance of PageTransporter.
     * Lazy initialization is used to create the instance on the first call.
     *
     * @return The singleton instance of PageTransporter.
     */
    public static PageTransporter getInstance() {
        if (instance == null) {
            instance = new PageTransporter();
        }
        return instance;
    }

    /**
     * Initializes the PageTransporter by retrieving URL configurations and WebDriver instance.
     */
    private void initialize() {
        LOG.info("Initializing page transporter");
        homeUrl = CREDENTIALS_MANAGER.getHomeUrl();
        loginUrl = CREDENTIALS_MANAGER.getLoginUrl();
        baseUrl = CREDENTIALS_MANAGER.getBaseUrl();
        newProjectUrl = CREDENTIALS_MANAGER.getNewProjectUrl();
        projectsVisualizationUrl = CREDENTIALS_MANAGER.getProjectsVisualizationUrl();
        requestTrayUrl = CREDENTIALS_MANAGER.getRequestTrayUrl();
        driver = DriverManager.getInstance().getDriver();
    }

    /**
     * Navigates to the specified URL.
     *
     * @param url The URL to navigate to.
     */
    private void navigateToUrl(String url) {
        driver.navigate().to(url);
        LOG.info("Navigating to URL: " + url);
    }

    /**
     * Checks if the current URL corresponds to the login page URL.
     *
     * @return True if the current URL contains the login URL, false otherwise.
     */
    public boolean isOnLoginPageUrl() {
        return driver.getCurrentUrl().contains(loginUrl);
    }

    /**
     * Checks if the current URL corresponds to the home page URL.
     *
     * @return True if the current URL contains the home URL, false otherwise.
     */
    public boolean isOnHomePageUrl() {
        return driver.getCurrentUrl().contains(homeUrl);
    }

    /**
     * Checks if the current URL corresponds to the new project page URL.
     *
     * @return True if the current URL contains the new project URL, false otherwise.
     */
    public boolean isOnNewProjectPageUrl() {
        return driver.getCurrentUrl().contains(newProjectUrl);
    }

    /**
     * Checks if the current URL corresponds to the projects visualization page URL.
     *
     * @return True if the current URL equals the projects visualization URL, false otherwise.
     */
    public boolean isOnProjectsVisualizationPageUrl() {
        return driver.getCurrentUrl().equals(projectsVisualizationUrl);
    }

    /**
     * Checks if the current URL corresponds to the request tray page URL.
     *
     * @return True if the current URL contains the request tray URL, false otherwise.
     */
    public boolean isOnRequestTrayPageUrl() {
        return driver.getCurrentUrl().contains(requestTrayUrl);
    }

    /**
     * Navigates to the login page if the current URL is not the login page URL.
     *
     * @return The LoginPage object after navigation.
     */
    public LoginPage navigateToLoginPage() {
        if (!isOnLoginPageUrl()) {
            navigateToUrl(baseUrl);
        }
        return new LoginPage();
    }

    /**
     * Navigates to the new project page if the current URL is not the new project page URL.
     *
     * @return The GeneralDataPage object after navigation.
     */
    public GeneralDataPage navigateToGeneralDataPage() {
        if (!isOnNewProjectPageUrl()) {
            navigateToUrl(newProjectUrl);
        }
        return new GeneralDataPage();
    }

    /**
     * Navigates to the projects visualization page if the current URL is not the projects visualization page URL.
     *
     * @return The ProjectsVisualizationPage object after navigation.
     */
    public ProjectsVisualizationPage navigateToProjectsVisualizationPage() {
        if (!isOnProjectsVisualizationPageUrl()) {
            navigateToUrl(projectsVisualizationUrl);
        }
        return new ProjectsVisualizationPage();
    }

    /**
     * Navigates to the request tray page if the current URL is not the request tray page URL.
     *
     * @return The RequestTrayPage object after navigation.
     */
    public RequestTrayPage navigateToRequestTrayPage() {
        if (!isOnRequestTrayPageUrl()) {
            navigateToUrl(requestTrayUrl);
        }
        return new RequestTrayPage();
    }
}
