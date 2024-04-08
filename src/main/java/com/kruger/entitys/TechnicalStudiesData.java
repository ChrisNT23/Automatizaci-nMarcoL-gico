package com.kruger.entitys;

import com.kruger.utils.builders.TechnicalStudiesDataBuilder;

/**
 * The TechnicalStudiesData class represents data related to technical studies, used with its builder class.
 * It encapsulates attributes such as document type, observation, and format.
 */
public class TechnicalStudiesData {
    private final String documentType;
    private final String documentObservation;
    private final String documentFormat;

    /**
     * Constructs a new TechnicalStudiesData instance with the provided builder.
     *
     * @param builder The builder containing technical studies-related data.
     */
    public TechnicalStudiesData(TechnicalStudiesDataBuilder builder) {
        documentType = builder.getDocumentType();
        documentObservation = builder.getDocumentObservation();
        documentFormat = builder.getDocumentFormat();
    }

    /**
     * Gets a new instance of TechnicalStudiesDataBuilder to facilitate object construction.
     *
     * @return A new instance of TechnicalStudiesDataBuilder.
     */
    public static TechnicalStudiesDataBuilder builder() {
        return new TechnicalStudiesDataBuilder();
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentObservation() {
        return documentObservation;
    }

    public String getDocumentFormat() {
        return documentFormat;
    }
}
