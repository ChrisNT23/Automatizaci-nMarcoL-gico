package com.kruger.utils.builders;

import com.kruger.entitys.TechnicalStudiesData;

import java.util.Map;

/**
 * The TechnicalStudiesDataBuilder class is responsible for building TechnicalStudiesData objects.
 */
public class TechnicalStudiesDataBuilder {
    private String documentType;
    private String documentObservation;
    private String documentFormat;

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentObservation() {
        return documentObservation;
    }

    public String getDocumentFormat() {
        return documentFormat;
    }

    public TechnicalStudiesDataBuilder withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    public TechnicalStudiesDataBuilder withDocumentObservation(String documentObservation) {
        this.documentObservation = documentObservation;
        return this;
    }

    public TechnicalStudiesDataBuilder withDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
        return this;
    }

    /**
     * Sets the values of the builder from a map of data.
     *
     * @param data The map containing data.
     * @return The TechnicalStudiesDataBuilder instance.
     */
    public TechnicalStudiesDataBuilder fromMap(Map<String, String> data) {
        documentType = data.get("documentType");
        documentObservation = data.get("documentObservation");
        documentFormat = data.get("documentFormat");
        return this;
    }

    /**
     * Builds a TechnicalStudiesData object with the set values.
     *
     * @return The built TechnicalStudiesData object.
     */
    public TechnicalStudiesData build() {
        return new TechnicalStudiesData(this);
    }

}
