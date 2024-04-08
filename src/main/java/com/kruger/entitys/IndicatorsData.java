package com.kruger.entitys;

import com.kruger.utils.builders.IndicatorsDataBuilder;

/**
 * The IndicatorsData class represents indicators data, used in conjunction with its builder class.
 * It encapsulates various attributes related to project indicators.
 */
public class IndicatorsData {
    private final String financialFlowDiscount;
    private final String economicalFlowDiscount;
    private final String interestGrowthRate;
    private final String incomeDescription;
    private final String incomeValue;
    private final String financialCapitalExpenseDescription;
    private final String financialCapitalExpenseValue;
    private final String financialOperatingExpenseDescription;
    private final String financialOperatingExpenseValue;
    private final String financialAdministrativeExpenseDescription;
    private final String financialAdministrativeExpenseValue;
    private final String financialMaintenanceExpenseDescription;
    private final String financialMaintenanceExpenseValue;
    private final String populationGrowthRate;
    private final String benefitDescription;
    private final String benefitValue;
    private final String economicalCapitalExpenseDescription;
    private final String economicalCapitalExpenseValue;
    private final String economicalOperatingExpenseDescription;
    private final String economicalOperatingExpenseValue;
    private final String economicalAdministrativeExpenseDescription;
    private final String economicalAdministrativeExpenseValue;
    private final String economicalMaintenanceExpenseDescription;
    private final String economicalMaintenanceExpenseValue;
    private final String countryLoss;
    private final String resultsImpact;
    private final String methodology;
    private final String directMaleBeneficiaries;
    private final String indirectBeneficiaries;
    private final String group;
    private final String maleAmount;
    private final String femaleAmount;

    /**
     * Constructs a new IndicatorsData instance with the provided builder.
     *
     * @param builder The builder containing indicators data.
     */
    public IndicatorsData(IndicatorsDataBuilder builder) {
        financialFlowDiscount = builder.getFinancialFlowDiscount();
        economicalFlowDiscount = builder.getEconomicalFlowDiscount();
        interestGrowthRate = builder.getInterestGrowthRate();
        incomeDescription = builder.getIncomeDescription();
        incomeValue = builder.getIncomeValue();
        financialCapitalExpenseDescription = builder.getFinancialCapitalExpenseDescription();
        financialCapitalExpenseValue = builder.getFinancialCapitalExpenseValue();
        financialOperatingExpenseDescription = builder.getFinancialOperatingExpenseDescription();
        financialOperatingExpenseValue = builder.getFinancialOperatingExpenseValue();
        financialAdministrativeExpenseDescription = builder.getFinancialAdministrativeExpenseDescription();
        financialAdministrativeExpenseValue = builder.getFinancialAdministrativeExpenseValue();
        financialMaintenanceExpenseDescription = builder.getFinancialMaintenanceExpenseDescription();
        financialMaintenanceExpenseValue = builder.getFinancialMaintenanceExpenseValue();
        populationGrowthRate = builder.getPopulationGrowthRate();
        benefitDescription = builder.getBenefitDescription();
        benefitValue = builder.getBenefitValue();
        economicalCapitalExpenseDescription = builder.getEconomicalCapitalExpenseDescription();
        economicalCapitalExpenseValue = builder.getEconomicalCapitalExpenseValue();
        economicalOperatingExpenseDescription = builder.getEconomicalOperatingExpenseDescription();
        economicalOperatingExpenseValue = builder.getEconomicalOperatingExpenseValue();
        economicalAdministrativeExpenseDescription = builder.getEconomicalAdministrativeExpenseDescription();
        economicalAdministrativeExpenseValue = builder.getEconomicalAdministrativeExpenseValue();
        economicalMaintenanceExpenseDescription = builder.getEconomicalMaintenanceExpenseDescription();
        economicalMaintenanceExpenseValue = builder.getEconomicalMaintenanceExpenseValue();
        countryLoss = builder.getCountryLoss();
        resultsImpact = builder.getResultsImpact();
        methodology = builder.getMethodology();
        directMaleBeneficiaries = builder.getDirectMaleBeneficiaries();
        indirectBeneficiaries = builder.getIndirectBeneficiaries();
        group = builder.getGroup();
        maleAmount = builder.getMaleAmount();
        femaleAmount = builder.getFemaleAmount();
    }

    /**
     * Gets a new instance of IndicatorsDataBuilder to facilitate object construction.
     *
     * @return A new instance of IndicatorsDataBuilder.
     */
    public static IndicatorsDataBuilder builder() {
        return new IndicatorsDataBuilder();
    }

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

}
