package com.kruger.utils.builders;

import com.kruger.entitys.DictumRequestData;

import java.util.Map;

/**
 * The DictumRequestBuilder class is responsible for building DictumRequestData objects.
 */
public class DictumRequestBuilder {
    private String justificationReportFormat;
    private String otherDocumentFormat;

    public String getJustificationReportFormat() {
        return justificationReportFormat;
    }


    public String getOtherDocumentFormat() {
        return otherDocumentFormat;
    }

    public DictumRequestBuilder withJustificationReportFormat(String justificationReportFormat) {
        this.justificationReportFormat = justificationReportFormat;
        return this;
    }

    public DictumRequestBuilder withOtherDocumentFormat(String otherDocumentFormat) {
        this.otherDocumentFormat = otherDocumentFormat;
        return this;
    }

    /**
     * Sets the values from a map of data.
     *
     * @param data The map containing data.
     * @return The DictumRequestBuilder instance.
     */
    public DictumRequestBuilder fromMap(Map<String, String> data) {
        justificationReportFormat = data.get("justificationReportFormat");
        otherDocumentFormat = data.getOrDefault("otherDocumentFormat", "");
        return this;
    }

    /**
     * Builds a DictumRequestData object with the set values.
     *
     * @return The built DictumRequestData object.
     */
    public DictumRequestData build() {
        return new DictumRequestData(this);
    }


}
