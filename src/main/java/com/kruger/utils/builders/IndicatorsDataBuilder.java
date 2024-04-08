package com.kruger.utils.builders;

import com.kruger.entitys.IndicatorsData;

import java.util.Map;

/**
 * The IndicatorsDataBuilder class is responsible for building IndicatorsData objects.
 */
public class IndicatorsDataBuilder {
    private String financialFlowDiscount;
    private String economicalFlowDiscount;
    private String interestGrowthRate;
    private String incomeDescription;
    private String incomeValue;
    private String financialCapitalExpenseDescription;
    private String financialCapitalExpenseValue;
    private String financialOperatingExpenseDescription;
    private String financialOperatingExpenseValue;
    private String financialAdministrativeExpenseDescription;
    private String financialAdministrativeExpenseValue;
    private String financialMaintenanceExpenseDescription;
    private String financialMaintenanceExpenseValue;
    private String populationGrowthRate;
    private String benefitDescription;
    private String benefitValue;
    private String economicalCapitalExpenseDescription;
    private String economicalCapitalExpenseValue;
    private String economicalOperatingExpenseDescription;
    private String economicalOperatingExpenseValue;
    private String economicalAdministrativeExpenseDescription;
    private String economicalAdministrativeExpenseValue;
    private String economicalMaintenanceExpenseDescription;
    private String economicalMaintenanceExpenseValue;
    private String countryLoss;
    private String resultsImpact;
    private String methodology;
    private String directMaleBeneficiaries;
    private String indirectBeneficiaries;
    private String group;
    private String maleAmount;
    private String femaleAmount;

    public String getFinancialFlowDiscount() {
        return financialFlowDiscount;
    }

    public String getEconomicalFlowDiscount() {
        return economicalFlowDiscount;
    }

    public String getInterestGrowthRate() {
        return interestGrowthRate;
    }

    public String getIncomeDescription() {
        return incomeDescription;
    }

    public String getIncomeValue() {
        return incomeValue;
    }

    public String getFinancialCapitalExpenseDescription() {
        return financialCapitalExpenseDescription;
    }

    public String getFinancialCapitalExpenseValue() {
        return financialCapitalExpenseValue;
    }

    public String getFinancialOperatingExpenseDescription() {
        return financialOperatingExpenseDescription;
    }

    public String getFinancialOperatingExpenseValue() {
        return financialOperatingExpenseValue;
    }

    public String getFinancialAdministrativeExpenseDescription() {
        return financialAdministrativeExpenseDescription;
    }

    public String getFinancialAdministrativeExpenseValue() {
        return financialAdministrativeExpenseValue;
    }

    public String getFinancialMaintenanceExpenseDescription() {
        return financialMaintenanceExpenseDescription;
    }

    public String getFinancialMaintenanceExpenseValue() {
        return financialMaintenanceExpenseValue;
    }

    public String getPopulationGrowthRate() {
        return populationGrowthRate;
    }

    public String getBenefitDescription() {
        return benefitDescription;
    }

    public String getBenefitValue() {
        return benefitValue;
    }

    public String getEconomicalCapitalExpenseDescription() {
        return economicalCapitalExpenseDescription;
    }

    public String getEconomicalCapitalExpenseValue() {
        return economicalCapitalExpenseValue;
    }

    public String getEconomicalOperatingExpenseDescription() {
        return economicalOperatingExpenseDescription;
    }

    public String getEconomicalOperatingExpenseValue() {
        return economicalOperatingExpenseValue;
    }

    public String getEconomicalAdministrativeExpenseDescription() {
        return economicalAdministrativeExpenseDescription;
    }

    public String getEconomicalAdministrativeExpenseValue() {
        return economicalAdministrativeExpenseValue;
    }

    public String getEconomicalMaintenanceExpenseDescription() {
        return economicalMaintenanceExpenseDescription;
    }

    public String getEconomicalMaintenanceExpenseValue() {
        return economicalMaintenanceExpenseValue;
    }

    public String getCountryLoss() {
        return countryLoss;
    }

    public String getResultsImpact() {
        return resultsImpact;
    }

    public String getMethodology() {
        return methodology;
    }

    public String getDirectMaleBeneficiaries() {
        return directMaleBeneficiaries;
    }

    public String getIndirectBeneficiaries() {
        return indirectBeneficiaries;
    }

    public String getGroup() {
        return group;
    }

    public String getMaleAmount() {
        return maleAmount;
    }

    public String getFemaleAmount() {
        return femaleAmount;
    }

    public IndicatorsDataBuilder withFinancialFlowDiscount(String financialFlowDiscount) {
        this.financialFlowDiscount = financialFlowDiscount;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalFlowDiscount(String economicalFlowDiscount) {
        this.economicalFlowDiscount = economicalFlowDiscount;
        return this;
    }

    public IndicatorsDataBuilder withInterestGrowthRate(String interestGrowthRate) {
        this.interestGrowthRate = interestGrowthRate;
        return this;
    }

    public IndicatorsDataBuilder withIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
        return this;
    }

    public IndicatorsDataBuilder withIncomeValue(String incomeValue) {
        this.incomeValue = incomeValue;
        return this;
    }

    public IndicatorsDataBuilder withFinancialCapitalExpenditureDescription(String financialCapitalExpenditureDescription) {
        this.financialCapitalExpenseDescription = financialCapitalExpenditureDescription;
        return this;
    }

    public IndicatorsDataBuilder withFinancialCapitalExpenditureValue(String financialCapitalExpenditureValue) {
        this.financialCapitalExpenseValue = financialCapitalExpenditureValue;
        return this;
    }

    public IndicatorsDataBuilder withFinancialOperatingExpenseDescription(String financialOperatingExpenseDescription) {
        this.financialOperatingExpenseDescription = financialOperatingExpenseDescription;
        return this;
    }

    public IndicatorsDataBuilder withFinancialOperatingExpenseValue(String financialOperatingExpenseValue) {
        this.financialOperatingExpenseValue = financialOperatingExpenseValue;
        return this;
    }

    public IndicatorsDataBuilder withFinancialAdministrativeExpenseDescription(String financialAdministrativeExpenseDescription) {
        this.financialAdministrativeExpenseDescription = financialAdministrativeExpenseDescription;
        return this;
    }

    public IndicatorsDataBuilder withFinancialAdministrativeExpenseValue(String financialAdministrativeExpenseValue) {
        this.financialAdministrativeExpenseValue = financialAdministrativeExpenseValue;
        return this;
    }

    public IndicatorsDataBuilder withFinancialMaintenanceExpenseDescription(String financialMaintenanceExpenseDescription) {
        this.financialMaintenanceExpenseDescription = financialMaintenanceExpenseDescription;
        return this;
    }

    public IndicatorsDataBuilder withFinancialMaintenanceExpenseValue(String financialMaintenanceExpenseValue) {
        this.financialMaintenanceExpenseValue = financialMaintenanceExpenseValue;
        return this;
    }

    public IndicatorsDataBuilder withPopulationGrowthRate(String populationGrowthRate) {
        this.populationGrowthRate = populationGrowthRate;
        return this;
    }

    public IndicatorsDataBuilder withBenefitDescription(String benefitDescription) {
        this.benefitDescription = benefitDescription;
        return this;
    }

    public IndicatorsDataBuilder withBenefitValue(String benefitValue) {
        this.benefitValue = benefitValue;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalCapitalExpenditureDescription(String economicalCapitalExpenditureDescription) {
        this.economicalCapitalExpenseDescription = economicalCapitalExpenditureDescription;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalCapitalExpenditureValue(String economicalCapitalExpenditureValue) {
        this.economicalCapitalExpenseValue = economicalCapitalExpenditureValue;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalOperatingExpenseDescription(String economicalOperatingExpenseDescription) {
        this.economicalOperatingExpenseDescription = economicalOperatingExpenseDescription;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalOperatingExpenseValue(String economicalOperatingExpenseValue) {
        this.economicalOperatingExpenseValue = economicalOperatingExpenseValue;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalAdministrativeExpenseDescription(String economicalAdministrativeExpenseDescription) {
        this.economicalAdministrativeExpenseDescription = economicalAdministrativeExpenseDescription;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalAdministrativeExpenseValue(String economicalAdministrativeExpenseValue) {
        this.economicalAdministrativeExpenseValue = economicalAdministrativeExpenseValue;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalMaintenanceExpenseDescription(String economicalMaintenanceExpenseDescription) {
        this.economicalMaintenanceExpenseDescription = economicalMaintenanceExpenseDescription;
        return this;
    }

    public IndicatorsDataBuilder withEconomicalMaintenanceExpenseValue(String economicalMaintenanceExpenseValue) {
        this.economicalMaintenanceExpenseValue = economicalMaintenanceExpenseValue;
        return this;
    }

    public IndicatorsDataBuilder withCountryLoss(String countryLoss) {
        this.countryLoss = countryLoss;
        return this;
    }

    public IndicatorsDataBuilder withResultsImpact(String resultsImpact) {
        this.resultsImpact = resultsImpact;
        return this;
    }

    public IndicatorsDataBuilder withMethodology(String methodology) {
        this.methodology = methodology;
        return this;
    }

    public IndicatorsDataBuilder withDirectMaleBeneficiaries(String directMaleBeneficiaries) {
        this.directMaleBeneficiaries = directMaleBeneficiaries;
        return this;
    }

    public IndicatorsDataBuilder withIndirectBeneficiaries(String indirectBeneficiaries) {
        this.indirectBeneficiaries = indirectBeneficiaries;
        return this;
    }

    public IndicatorsDataBuilder withGroup(String group) {
        this.group = group;
        return this;
    }

    public IndicatorsDataBuilder withMaleAmount(String maleAmount) {
        this.maleAmount = maleAmount;
        return this;
    }

    public IndicatorsDataBuilder withFemaleAmount(String femaleAmount) {
        this.femaleAmount = femaleAmount;
        return this;
    }

    /**
     * Sets the values of the builder from a map of data.
     *
     * @param data The map containing data.
     * @return The IndicatorsDataBuilder instance.
     */
    public IndicatorsDataBuilder fromMap(Map<String, String> data) {
        financialFlowDiscount = data.get("financialFlowDiscount");
        economicalFlowDiscount = data.get("economicalFlowDiscount");
        interestGrowthRate = data.get("interestGrowthRate");
        incomeDescription = data.get("incomeDescription");
        incomeValue = data.get("incomeValue");
        financialCapitalExpenseDescription = data.get("financialCapitalExpenseDescription");
        financialCapitalExpenseValue = data.get("financialOperatingExpenseValue");
        financialOperatingExpenseDescription = data.get("financialOperatingExpenseDescription");
        financialOperatingExpenseValue = data.get("financialOperatingExpenseValue");
        financialAdministrativeExpenseDescription = data.get("financialAdministrativeExpenseDescription");
        financialAdministrativeExpenseValue = data.get("financialAdministrativeExpenseValue");
        financialMaintenanceExpenseDescription = data.get("financialMaintenanceExpenseDescription");
        financialMaintenanceExpenseValue = data.get("financialMaintenanceExpenseValue");
        populationGrowthRate = data.get("populationGrowthRate");
        benefitDescription = data.get("benefitDescription");
        benefitValue = data.get("benefitValue");
        economicalCapitalExpenseDescription = data.get("economicalCapitalExpenseDescription");
        economicalCapitalExpenseValue = data.get("economicalCapitalExpenseValue");
        economicalOperatingExpenseDescription = data.get("economicalOperatingExpenseDescription");
        economicalOperatingExpenseValue = data.get("economicalOperatingExpenseValue");
        economicalAdministrativeExpenseDescription = data.get("economicalAdministrativeExpenseDescription");
        economicalAdministrativeExpenseValue = data.get("economicalAdministrativeExpenseValue");
        economicalMaintenanceExpenseDescription = data.get("economicalMaintenanceExpenseDescription");
        economicalMaintenanceExpenseValue = data.get("economicalMaintenanceExpenseValue");
        countryLoss = data.get("countryLoss");
        resultsImpact = data.get("resultsImpact");
        methodology = data.get("methodology");
        directMaleBeneficiaries = data.get("directMaleBeneficiaries");
        indirectBeneficiaries = data.get("indirectBeneficiaries");
        group = data.get("group");
        maleAmount = data.get("maleAmount");
        femaleAmount = data.get("femaleAmount");
        return this;
    }

    /**
     * Builds an IndicatorsData object with the set values.
     *
     * @return The built IndicatorsData object.
     */
    public IndicatorsData build() {
        return new IndicatorsData(this);
    }
}
