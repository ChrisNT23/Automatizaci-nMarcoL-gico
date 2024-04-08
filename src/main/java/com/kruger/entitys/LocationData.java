package com.kruger.entitys;

import com.kruger.utils.builders.LocationDataBuilder;

/**
 * The LocationData class represents location-related data for a project, used in conjunction with its builder class.
 * It encapsulates attributes such as province, canton, parish, latitude, and longitude.
 */
public class LocationData {
    private final String provinceName;
    private final String provinceAmount;
    private final String provinceBeneficiaries;
    private final String cantonName;
    private final String cantonAmount;
    private final String cantonBeneficiaries;
    private final String parishName;
    private final String parishAmount;
    private final String parishBeneficiaries;
    private final String latitude;
    private final String longitude;
    private final String observation;

    /**
     * Constructs a new LocationData instance with the provided builder.
     *
     * @param builder The builder containing location-related data.
     */
    public LocationData(LocationDataBuilder builder) {
        provinceName = builder.getProvinceName();
        provinceAmount = builder.getProvinceAmount();
        provinceBeneficiaries = builder.getProvinceBeneficiaries();
        cantonName = builder.getCantonName();
        cantonAmount = builder.getCantonAmount();
        cantonBeneficiaries = builder.getCantonBeneficiaries();
        parishName = builder.getParishName();
        parishAmount = builder.getParishAmount();
        parishBeneficiaries = builder.getParishBeneficiaries();
        latitude = builder.getLatitude();
        longitude = builder.getLongitude();
        observation = builder.getObservation();
    }

    /**
     * Gets a new instance of LocationDataBuilder to facilitate object construction.
     *
     * @return A new instance of LocationDataBuilder.
     */
    public static LocationDataBuilder builder() {
        return new LocationDataBuilder();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getProvinceAmount() {
        return provinceAmount;
    }

    public String getProvinceBeneficiaries() {
        return provinceBeneficiaries;
    }

    public String getCantonName() {
        return cantonName;
    }

    public String getCantonAmount() {
        return cantonAmount;
    }

    public String getCantonBeneficiaries() {
        return cantonBeneficiaries;
    }

    public String getParishName() {
        return parishName;
    }

    public String getParishAmount() {
        return parishAmount;
    }

    public String getParishBeneficiaries() {
        return parishBeneficiaries;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getObservation() {
        return observation;
    }
}
