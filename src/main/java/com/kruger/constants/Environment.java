package com.kruger.constants;

/**
 * The Environment enum represents different environments where the application can be deployed.
 */
public enum Environment {
    DEV("dev"),
    PRE("pre"),
    QA("qa");

    private final String value;

    /**
     * Constructs a new Environment enum with the specified environment value.
     *
     * @param value The value representing the environment.
     */
    Environment(String value) {
        this.value = value;
    }

    /**
     * Gets the string value associated with the environment.
     *
     * @return The string value of the environment.
     */
    public String getValue() {
        return value;
    }

}
