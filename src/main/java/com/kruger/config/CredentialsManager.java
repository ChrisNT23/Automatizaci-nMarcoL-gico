package com.kruger.config;

import com.kruger.constants.Environment;
import com.kruger.constants.PropertyKey;
import com.kruger.utils.LoggerManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * The CredentialsManager class is responsible for managing the environment credentials and properties
 * stored in the environment.properties file.
 */
public class CredentialsManager {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final Path ENV_PATH_FILE = Paths.get(System.getProperty("user.dir"), "environment.properties");
    private static CredentialsManager instance;
    private Properties properties;
    private Environment environment;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private CredentialsManager() {
        initialize();
    }

    /**
     * Returns the singleton instance of the CredentialsManager class.
     *
     * @return The singleton instance of CredentialsManager.
     */
    public static CredentialsManager getInstance() {
        if (instance == null || instance.properties == null) {
            instance = new CredentialsManager();
        }
        return instance;
    }

    /**
     * Initializes the CredentialsManager by reading and loading environment properties.
     */
    private void initialize() {
        LOG.info("Reading environment properties...");
        readEnvironmentProperty();
        loadEnvironmentProperty();
    }

    /**
     * Reads the environment property and sets the environment accordingly.
     */
    private void readEnvironmentProperty() {
        try {
            environment = Environment.valueOf(System.getProperty("envId", Environment.DEV.getValue()).toUpperCase());
            LOG.info("Environment selected -> " + environment);
        } catch (IllegalArgumentException e) {
            LOG.error("Environment selected -> " + environment + " is not valid");
            throw new IllegalArgumentException("Environment selected is not valid: " + e.getMessage());
        }
    }

    /**
     * Loads environment properties from the environment.properties file.
     */
    private void loadEnvironmentProperty() {
        properties = new Properties();
        Properties envProperties = new Properties();
        try {
            envProperties.load(Files.newInputStream(ENV_PATH_FILE));
        } catch (IOException e) {
            LOG.error("Unable to load properties file " + e.getMessage());
            throw new RuntimeException(e);
        }
        properties.putAll(envProperties);
    }

    /**
     * Gets the value of the specified environment property.
     *
     * @param propertyKey The key of the environment property.
     * @return The value of the specified property.
     */
    private String getEnvProperty(String propertyKey) {
        return properties.getProperty(propertyKey);
    }

    /**
     * Gets the base URL for the current environment.
     *
     * @return The base URL.
     */
    public String getBaseUrl() {
        return getEnvProperty(environment.getValue() + PropertyKey.BASE_URL.getKey());
    }

    /**
     * Gets the RUC for the specified user entity, role, and area.
     *
     * @param userEntity The user entity.
     * @param role       The role of the user.
     * @param area       The area of the user.
     * @return The RUC.
     */
    public String getRuc(String userEntity, String role, String area) {
        return getEnvProperty(environment.getValue() + "." + userEntity + "." + area + "." + role + PropertyKey.USER_RUC.getKey());
    }

    /**
     * Gets the Document for the specified user entity, role, and area.
     *
     * @param userEntity The user entity.
     * @param role       The role of the user.
     * @param area       The area of the user.
     * @return The document.
     */
    public String getDocument(String userEntity, String role, String area) {
        return getEnvProperty(environment.getValue() + "." + userEntity + "." + area + "." + role + PropertyKey.USER_DOCUMENT.getKey());
    }

    /**
     * Gets the Username for the specified user entity, role, and area.
     *
     * @param userEntity The user entity.
     * @param role       The role of the user.
     * @param area       The area of the user.
     * @return The username.
     */
    public String getUsername(String userEntity, String role, String area) {
        return getEnvProperty(environment.getValue() + "." + userEntity + "." + area + "." + role + PropertyKey.USER_USERNAME.getKey());
    }

    /**
     * Gets the Password for the specified user entity, role, and area.
     *
     * @param userEntity The user entity.
     * @param role       The role of the user.
     * @param area       The area of the user.
     * @return The password.
     */
    public String getPassword(String userEntity, String role, String area) {
        return getEnvProperty(environment.getValue() + "." + userEntity + "." + area + "." + role + PropertyKey.USER_PASSWORD.getKey());
    }

    /**
     * Gets the home page URL for the current environment.
     *
     * @return The home page URL.
     */
    public String getHomeUrl() {
        return getBaseUrl() + getEnvProperty(PropertyKey.HOME_URL.getKey());
    }

    /**
     * Gets the login page URL for the current environment.
     *
     * @return The login page URL.
     */
    public String getLoginUrl() {
        return getEnvProperty(PropertyKey.LOGIN_URL.getKey());
    }

    /**
     * Gets the new project page URL for the current environment.
     *
     * @return The new project page URL.
     */
    public String getNewProjectUrl() {
        return getBaseUrl() + getEnvProperty(PropertyKey.NEW_PROJECT_URL.getKey());
    }

    /**
     * Gets the projects visualization page URL for the current environment.
     *
     * @return The projects visualization page URL.
     */
    public String getProjectsVisualizationUrl() {
        return getBaseUrl() + getEnvProperty(PropertyKey.PROJECTS_VISUALIZATION_URL.getKey());
    }

    /**
     * Gets the request tray page URL for the current environment.
     *
     * @return The request tray page URL.
     */
    public String getRequestTrayUrl() {
        return getBaseUrl() + getEnvProperty(PropertyKey.REQUEST_TRAY_URL.getKey());
    }

}
