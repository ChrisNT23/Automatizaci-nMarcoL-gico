package com.kruger.constants;

/**
 * The PropertyKey enum represents the keys used to retrieve properties from configuration files.
 * It provides a set of predefined keys for accessing various properties.
 */
public enum PropertyKey {
    BASE_URL(".base.url"),
    USER_RUC(".ruc"),
    USER_DOCUMENT(".document"),
    USER_USERNAME(".username"),
    USER_PASSWORD(".password"),
    WEB_DRIVER_IMPLICIT_WAIT_TIME("web.driver.implicit.wait.time"),
    WEB_DRIVER_TIMEOUT("web.driver.timeout"),
    WEB_DRIVER_POLLING_TIME("web.driver.polling.time"),
    WEB_DRIVER_HEADLESS_MODE("web.driver.headless.mode"),
    HOME_URL("homeUrl"),
    LOGIN_URL("loginUrl"),
    NEW_PROJECT_URL("newProjectUrl"),
    PROJECTS_VISUALIZATION_URL("projectsVisualizationUrl"),
    FILE_PATH(".file.path"),
    REQUEST_TRAY_URL("requestTrayUrl");

    private final String key;

    /**
     * Constructs a new PropertyKey enum with the specified key.
     * @param key The property key.
     */
    PropertyKey(String key) {
        this.key = key;
    }

    /**
     * Gets the property key string.
     * @return The property key.
     */
    public String getKey() {
        return key;
    }
}
