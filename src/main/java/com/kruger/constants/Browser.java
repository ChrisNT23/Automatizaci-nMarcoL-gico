package com.kruger.constants;

/**
 * The Browser enum represents different web browsers supported by the automation framework.
 */
public enum Browser {
    CHROME("chrome"),
    EDGE("edge"),
    FIREFOX("firefox");

    private final String value;

    /**
     * Constructs a new Browser enum with the specified browser value.
     *
     * @param value The value representing the browser.
     */
    Browser(String value) {
        this.value = value;
    }

    /**
     * Gets the string value associated with the browser.
     *
     * @return The string value of the browser.
     */
    public String getValue() {
        return value;
    }

}
