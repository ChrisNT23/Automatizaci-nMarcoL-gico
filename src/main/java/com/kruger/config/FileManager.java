package com.kruger.config;

import com.kruger.constants.PropertyKey;
import com.kruger.utils.LoggerManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * The FileManager class is responsible for managing file properties and retrieving file paths
 * from the file.properties configuration file.
 */
public class FileManager {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final Path FILE_PROPERTIES_PATH = Paths.get(System.getProperty("user.dir"), "file.properties");
    private static FileManager instance;
    private Properties properties;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private FileManager() {
        initialize();
    }

    /**
     * Returns the singleton instance of the FileManager class.
     *
     * @return The singleton instance of FileManager.
     */
    public static FileManager getInstance() {
        if (instance == null || instance.properties == null) {
            instance = new FileManager();
        }
        return instance;
    }

    /**
     * Initializes the FileManager by loading file properties.
     */
    private void initialize() {
        LOG.info("Reading file properties...");
        loadFileProperty();
    }

    /**
     * Loads file properties from the file.properties file.
     */
    private void loadFileProperty() {
        properties = new Properties();
        Properties fileProperties = new Properties();
        try {
            fileProperties.load(Files.newInputStream(FILE_PROPERTIES_PATH));
        } catch (IOException e) {
            LOG.error("Unable to load properties file " + e.getMessage());
            throw new RuntimeException(e);
        }
        properties.putAll(fileProperties);
    }

    /**
     * Gets the value of the specified file property.
     *
     * @param propertyKey The key of the file property.
     * @return The value of the specified property.
     */
    private String getFileProperty(String propertyKey) {
        return properties.getProperty(propertyKey);
    }

    /**
     * Gets the file path for the specified file type.
     *
     * @param fileType The type of the file.
     * @return The file path.
     */
    public String getFilePath(String fileType) {
        return getFileProperty(fileType.toLowerCase() + PropertyKey.FILE_PATH.getKey());
    }

}
