package com.kruger.utils.builders;

import com.kruger.entitys.LocationData;

import java.util.Map;

/**
 * The LocationDataBuilder class is responsible for building LocationData objects.
 */
public class LocationDataBuilder {
    private String provinceName;
    private String provinceAmount;
    private String provinceBeneficiaries;
    private String cantonName;
    private String cantonAmount;
    private String cantonBeneficiaries;
    private String parishName;
    private String parishAmount;
    private String parishBeneficiaries;
    private String latitude;
    private String longitude;
    private String observation;

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

    public LocationDataBuilder withProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    public LocationDataBuilder withProvinceAmount(String provinceAmount) {
        this.provinceAmount = provinceAmount;
        return this;
    }

    public LocationDataBuilder withProvinceBeneficiaries(String provinceBeneficiaries) {
        this.provinceBeneficiaries = provinceBeneficiaries;
        return this;
    }

    public LocationDataBuilder withCantonName(String cantonName) {
        this.cantonName = cantonName;
        return this;
    }

    public LocationDataBuilder withCantonAmount(String cantonAmount) {
        this.cantonAmount = cantonAmount;
        return this;
    }

    public LocationDataBuilder withCantonBeneficiaries(String cantonBeneficiaries) {
        this.cantonBeneficiaries = cantonBeneficiaries;
        return this;
    }

    public LocationDataBuilder withParishName(String parishName) {
        this.parishName = parishName;
        return this;
    }

    public LocationDataBuilder withParishAmount(String parishAmount) {
        this.parishAmount = parishAmount;
        return this;
    }

    public LocationDataBuilder withParishBeneficiaries(String parishBeneficiaries) {
        this.parishBeneficiaries = parishBeneficiaries;
        return this;
    }

    public LocationDataBuilder withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public LocationDataBuilder withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public LocationDataBuilder withObservation(String observation) {
        this.observation = observation;
        return this;
    }

    /**
     * Sets the values of the builder from a map of data.
     *
     * @param data The map containing data.
     * @return The LocationDataBuilder instance.
     */
    public LocationDataBuilder fromMap(Map<String, String> data) {
        provinceName = data.get("provinceName");
        provinceAmount = data.get("provinceAmount");
        provinceBeneficiaries = data.get("provinceBeneficiaries");
        cantonName = data.getOrDefault("cantonName", "");
        cantonAmount = data.getOrDefault("cantonAmount", "");
        cantonBeneficiaries = data.getOrDefault("cantonBeneficiaries", "");
        parishName = data.getOrDefault("parishName", "");
        parishAmount = data.getOrDefault("parishAmount", "");
        parishBeneficiaries = data.getOrDefault("parishBeneficiaries", "");
        latitude = data.get("latitude");
        longitude = data.get("longitude");
        observation = data.get("observation");
        return this;
    }

    /**
     * Builds a LocationData object with the set values.
     *
     * @return The built LocationData object.
     */
    public LocationData build() {
        return new LocationData(this);
    }
}
