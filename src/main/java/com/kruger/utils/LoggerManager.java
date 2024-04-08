package com.kruger.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;
import java.nio.file.FileSystemNotFoundException;

/**
 * The LoggerManager class manages logging functionality using Log4j2.
 * It provides methods to log messages at different levels such as INFO, DEBUG, ERROR, and WARN.
 */
public class LoggerManager {
    private static LoggerManager instance;
    private Logger logger;

    /**
     * Constructs a new LoggerManager instance and initializes the logger.
     * It is private to enforce the singleton pattern.
     */
    private LoggerManager() {
        initialize();
    }

    /**
     * Retrieves the singleton instance of LoggerManager.
     *
     * @return The singleton instance of LoggerManager.
     */
    public static LoggerManager getInstance() {
        if (instance == null || instance.logger == null) {
            instance = new LoggerManager();
        }
        return instance;
    }

    /**
     * Initializes the logger using Log4j2 configuration.
     */
    private void initialize() {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        try {
            File loggerConfig = new File("log4j2.properties");
            context.setConfigLocation(loggerConfig.toURI());
            logger = LogManager.getLogger(LogManager.class);
        } catch (Exception e) {
            throw new FileSystemNotFoundException("Error loading the logger: " + e.getMessage());
        }

    }

    /**
     * Logs a message at the specified level.
     *
     * @param level   The logging level.
     * @param message The message to log.
     */
    private void log(Level level, String message) {
        logger.log(level, message);
    }

    /**
     * Logs a message at the INFO level.
     *
     * @param message The message to log.
     */
    public void info(String message) {
        log(Level.INFO, message);
    }

    /**
     * Logs a message at the DEBUG level.
     *
     * @param message The message to log.
     */
    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    /**
     * Logs a message at the ERROR level.
     *
     * @param message The message to log.
     */
    public void error(String message) {
        log(Level.ERROR, message);
    }

    /**
     * Logs a message at the WARN level.
     *
     * @param message The message to log.
     */
    public void warn(String message) {
        log(Level.WARN, message);
    }

}
