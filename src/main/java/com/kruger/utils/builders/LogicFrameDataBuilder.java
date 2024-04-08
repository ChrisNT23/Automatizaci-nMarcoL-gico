package com.kruger.utils.builders;

import com.kruger.entitys.LogicFrameData;

import java.util.Map;

/**
 * The LogicFrameDataBuilder class is responsible for building LogicFrameData objects.
 */
public class LogicFrameDataBuilder {
    private String coreProblem;
    private String cause;
    private String effect;
    private String generalObjective;
    private String component;
    private String activity;
    private String endProject;
    private String endDetails;
    private String endIndicators;
    private String endVerificationMethods;
    private String endAssumptions;
    private String purpose;
    private String purposeDetails;
    private String purposeIndicators;
    private String quantitativeIndicator;
    private String qualitativeIndicator;
    private String measuringUnit;
    private String indicatorWeighting;
    private String otherUnits;
    private String quantity;
    private String horizonDate;
    private String purposeVerificationMethods;
    private String purposeAssumptions;
    private String componentDetail;
    private String componentVerificationMethods;
    private String activityDetail;
    private String activityVerificationMethods;
    private String activityAssumptions;
    private String financingSource;
    private String spendingGroup;
    private String budgetItem;
    private String unitCost;
    private String quantityUnit;
    private String fiscalPeriod;
    private String componentAssumptions;
    private String indicator;
    private String measuringUnitIndicator;
    private String baseLine;
    private String goal;
    private String weighting;
    private String yearValue;

    public String getCoreProblem() {
        return coreProblem;
    }

    public String getCause() {
        return cause;
    }

    public String getEffect() {
        return effect;
    }

    public String getGeneralObjective() {
        return generalObjective;
    }

    public String getComponent() {
        return component;
    }

    public String getActivity() {
        return activity;
    }

    public String getEndProject() {
        return endProject;
    }

    public String getEndDetails() {
        return endDetails;
    }

    public String getEndIndicators() {
        return endIndicators;
    }

    public String getEndVerificationMethods() {
        return endVerificationMethods;
    }

    public String getEndAssumptions() {
        return endAssumptions;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getPurposeDetails() {
        return purposeDetails;
    }

    public String getPurposeIndicators() {
        return purposeIndicators;
    }

    public String getQuantitativeIndicator() {
        return quantitativeIndicator;
    }

    public String getQualitativeIndicator() {
        return qualitativeIndicator;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public String getIndicatorWeighting() {
        return indicatorWeighting;
    }

    public String getOtherUnits() {
        return otherUnits;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getHorizonDate() {
        return horizonDate;
    }

    public String getPurposeVerificationMethods() {
        return purposeVerificationMethods;
    }

    public String getPurposeAssumptions() {
        return purposeAssumptions;
    }

    public String getComponentDetail() {
        return componentDetail;
    }

    public String getComponentVerificationMethods() {
        return componentVerificationMethods;
    }

    public String getActivityDetail() {
        return activityDetail;
    }

    public String getActivityVerificationMethods() {
        return activityVerificationMethods;
    }

    public String getActivityAssumptions() {
        return activityAssumptions;
    }

    public String getFinancingSource() {
        return financingSource;
    }

    public String getSpendingGroup() {
        return spendingGroup;
    }

    public String getBudgetItem() {
        return budgetItem;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public String getFiscalPeriod() {
        return fiscalPeriod;
    }

    public String getComponentAssumptions() {
        return componentAssumptions;
    }

    public String getIndicator() {
        return indicator;
    }

    public String getMeasuringUnitIndicator() {
        return measuringUnitIndicator;
    }

    public String getBaseLine() {
        return baseLine;
    }

    public String getGoal() {
        return goal;
    }

    public String getWeighting() {
        return weighting;
    }

    public String getYearValue() {
        return yearValue;
    }

    public LogicFrameDataBuilder withCoreProblem(String coreProblem) {
        this.coreProblem = coreProblem;
        return this;
    }

    public LogicFrameDataBuilder withCause(String cause) {
        this.cause = cause;
        return this;
    }

    public LogicFrameDataBuilder withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    public LogicFrameDataBuilder withGeneralObjective(String generalObjective) {
        this.generalObjective = generalObjective;
        return this;
    }

    public LogicFrameDataBuilder withComponent(String component) {
        this.component = component;
        return this;
    }

    public LogicFrameDataBuilder withActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public LogicFrameDataBuilder withEndProject(String endProject) {
        this.endProject = endProject;
        return this;
    }

    public LogicFrameDataBuilder withEndDetails(String endDetails) {
        this.endDetails = endDetails;
        return this;
    }

    public LogicFrameDataBuilder withEndIndicators(String endIndicators) {
        this.endIndicators = endIndicators;
        return this;
    }

    public LogicFrameDataBuilder withEndVerificationMethods(String endVerificationMethods) {
        this.endVerificationMethods = endVerificationMethods;
        return this;
    }

    public LogicFrameDataBuilder withEndAssumptions(String endAssumptions) {
        this.endAssumptions = endAssumptions;
        return this;
    }

    public LogicFrameDataBuilder withPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    public LogicFrameDataBuilder withPurposeDetails(String purposeDetails) {
        this.purposeDetails = purposeDetails;
        return this;
    }

    public LogicFrameDataBuilder withPurposeIndicators(String purposeIndicators) {
        this.purposeIndicators = purposeIndicators;
        return this;
    }

    public LogicFrameDataBuilder withQuantitativeIndicator(String quantitativeIndicator) {
        this.quantitativeIndicator = quantitativeIndicator;
        return this;
    }

    public LogicFrameDataBuilder withQualitativeIndicator(String qualitativeIndicator) {
        this.qualitativeIndicator = qualitativeIndicator;
        return this;
    }

    public LogicFrameDataBuilder withMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit;
        return this;
    }

    public LogicFrameDataBuilder withIndicatorWeighting(String indicatorWeighting) {
        this.indicatorWeighting = indicatorWeighting;
        return this;
    }

    public LogicFrameDataBuilder withOtherUnits(String otherUnits) {
        this.otherUnits = otherUnits;
        return this;
    }

    public LogicFrameDataBuilder withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public LogicFrameDataBuilder withHorizonDate(String horizonDate) {
        this.horizonDate = horizonDate;
        return this;
    }

    public LogicFrameDataBuilder withPurposeVerificationMethods(String purposeVerificationMethods) {
        this.purposeVerificationMethods = purposeVerificationMethods;
        return this;
    }

    public LogicFrameDataBuilder withPurposeAssumptions(String purposeAssumptions) {
        this.purposeAssumptions = purposeAssumptions;
        return this;
    }

    public LogicFrameDataBuilder withComponentDetail(String componentDetail) {
        this.componentDetail = componentDetail;
        return this;
    }

    public LogicFrameDataBuilder withComponentVerificationMethods(String componentVerificationMethods) {
        this.componentVerificationMethods = componentVerificationMethods;
        return this;
    }

    public LogicFrameDataBuilder withActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
        return this;
    }

    public LogicFrameDataBuilder withActivityVerificationMethods(String activityVerificationMethods) {
        this.activityVerificationMethods = activityVerificationMethods;
        return this;
    }

    public LogicFrameDataBuilder withActivityAssumptions(String activityAssumptions) {
        this.activityAssumptions = activityAssumptions;
        return this;
    }

    public LogicFrameDataBuilder withFinancingSource(String financingSource) {
        this.financingSource = financingSource;
        return this;
    }

    public LogicFrameDataBuilder withSpendingGroup(String spendingGroup) {
        this.spendingGroup = spendingGroup;
        return this;
    }

    public LogicFrameDataBuilder withBudgetItem(String budgetItem) {
        this.budgetItem = budgetItem;
        return this;
    }

    public LogicFrameDataBuilder withUnitCost(String unitCost) {
        this.unitCost = unitCost;
        return this;
    }

    public LogicFrameDataBuilder withQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
        return this;
    }

    public LogicFrameDataBuilder withFiscalPeriod(String fiscalPeriod) {
        this.fiscalPeriod = fiscalPeriod;
        return this;
    }

    public LogicFrameDataBuilder withComponentAssumptions(String componentAssumptions) {
        this.componentAssumptions = componentAssumptions;
        return this;
    }

    public LogicFrameDataBuilder withIndicator(String indicator) {
        this.indicator = indicator;
        return this;
    }

    public LogicFrameDataBuilder withMeasuringUnitIndicator(String measuringUnitIndicator) {
        this.measuringUnitIndicator = measuringUnitIndicator;
        return this;
    }

    public LogicFrameDataBuilder withBaseLine(String baseLine) {
        this.baseLine = baseLine;
        return this;
    }

    public LogicFrameDataBuilder withGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public LogicFrameDataBuilder withWeighting(String weighting) {
        this.weighting = weighting;
        return this;
    }

    public LogicFrameDataBuilder withYearValue(String yearValue) {
        this.yearValue = yearValue;
        return this;
    }

    /**
     * Sets the values of the builder from a map of data.
     *
     * @param data The map containing data.
     * @return The LogicFrameDataBuilder instance.
     */
    public LogicFrameDataBuilder fromMap(Map<String, String> data) {
        coreProblem = data.get("coreProblem");
        cause = data.get("cause");
        effect = data.get("effect");
        generalObjective = data.get("generalObjective");
        component = data.get("component");
        activity = data.get("activity");
        endProject = data.get("endProject");
        endDetails = data.get("endDetails");
        endIndicators = data.get("endIndicators");
        endVerificationMethods = data.get("endVerificationMethods");
        endAssumptions = data.get("endAssumptions");
        purpose = data.get("purpose");
        purposeDetails = data.get("purposeDetails");
        purposeIndicators = data.get("purposeIndicators");
        quantitativeIndicator = data.get("quantitativeIndicator");
        qualitativeIndicator = data.get("qualitativeIndicator");
        measuringUnit = data.get("measuringUnit");
        indicatorWeighting = data.get("indicatorWeighting");
        otherUnits = data.get("otherUnits");
        quantity = data.get("quantity");
        horizonDate = data.get("horizonDate");
        purposeVerificationMethods = data.get("purposeVerificationMethods");
        purposeAssumptions = data.get("purposeAssumptions");
        componentDetail = data.get("componentDetail");
        componentVerificationMethods = data.get("componentVerificationMethods");
        activityDetail = data.get("activityDetail");
        activityVerificationMethods = data.get("activityVerificationMethods");
        activityAssumptions = data.get("activityAssumptions");
        financingSource = data.get("financingSource");
        spendingGroup = data.get("spendingGroup");
        budgetItem = data.get("budgetItem");
        unitCost = data.get("unitCost");
        quantityUnit = data.get("quantityUnit");
        fiscalPeriod = data.get("fiscalPeriod");
        componentAssumptions = data.get("componentAssumptions");
        indicator = data.get("indicator");
        measuringUnitIndicator = data.get("measuringUnitIndicator");
        baseLine = data.get("baseLine");
        goal = data.get("goal");
        weighting = data.get("weighting");
        yearValue = data.get("yearValue");
        return this;
    }

    /**
     * Builds a LogicFrameData object with the set values.
     *
     * @return The built LogicFrameData object.
     */
    public LogicFrameData build() {
        return new LogicFrameData(this);
    }

}
