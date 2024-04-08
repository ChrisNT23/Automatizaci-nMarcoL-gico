package com.kruger.entitys;

import com.kruger.utils.builders.DictumRequestBuilder;

/**
 * The DictumRequestData class represents data related to a dictum request, used in conjunction with its builder class.
 * It encapsulates information about the justification report format and other document format.
 */
public class DictumRequestData {
    private final String justificationReportFormat;
    private final String otherDocumentFormat;

    /**
     * Constructs a new DictumRequestData instance with the provided builder.
     *
     * @param builder The builder containing dictum request data.
     */
    public DictumRequestData(DictumRequestBuilder builder) {
        this.justificationReportFormat = builder.getJustificationReportFormat();
        this.otherDocumentFormat = builder.getOtherDocumentFormat();
    }

    /**
     * Retrieves a new instance of DictumRequestBuilder to facilitate object construction.
     *
     * @return A new instance of DictumRequestBuilder.
     */
    public static DictumRequestBuilder builder() {
        return new DictumRequestBuilder();
    }

    public String getJustificationReportFormat() {
        return justificationReportFormat;
    }

    public String getOtherDocumentFormat() {
        return otherDocumentFormat;
    }
}
