package com.kruger.entitys;

import com.kruger.utils.builders.LogicFrameDataBuilder;

/**
 * The LogicFrameData class represents data related to a project's logic frame, used with its builder class.
 * It encapsulates attributes such as core problem, cause, effect, objectives, indicators, and assumptions.
 */
public class LogicFrameData {
    private final String coreProblem;
    private final String cause;
    private final String effect;
    private final String generalObjective;
    private final String component;
    private final String activity;
    private final String endProject;
    private final String endDetails;
    private final String endIndicators;
    private final String endVerificationMethods;
    private final String endAssumptions;
    private final String purpose;
    private final String purposeDetails;
    private final String purposeIndicators;
    private final String quantitativeIndicator;
    private final String qualitativeIndicator;
    private final String measuringUnit;
    private final String indicatorWeighting;
    private final String otherUnits;
    private final String quantity;
    private final String horizonDate;
    private final String purposeVerificationMethods;
    private final String purposeAssumptions;
    private final String componentDetail;
    private final String componentVerificationMethods;
    private final String activityDetail;
    private final String activityVerificationMethods;
    private final String activityAssumptions;
    private final String financingSource;
    private final String spendingGroup;
    private final String budgetItem;
    private final String unitCost;
    private final String quantityUnit;
    private final String fiscalPeriod;
    private final String componentAssumptions;
    private final String indicator;
    private final String measuringUnitIndicator;
    private final String baseLine;
    private final String goal;
    private final String weighting;
    private final String yearValue;
    private String componentSelector;
    private String componentName;
    private String indicatorP;
    private String measureUnit;
    private String baseLineP;
    private String goalPurpose;
    private String ponderacion;
    private String year;



    /**
     * Constructs a new LogicFrameData instance with the provided builder.
     *
     * @param builder The builder containing logic frame-related data.
     */
    public LogicFrameData(LogicFrameDataBuilder builder) {
        this.coreProblem = builder.getCoreProblem();
        this.cause = builder.getCause();
        this.effect = builder.getEffect();
        this.generalObjective = builder.getGeneralObjective();
        this.component = builder.getComponent();
        this.activity = builder.getActivity();
        this.endProject = builder.getEndProject();
        this.endDetails = builder.getEndDetails();
        this.endIndicators = builder.getEndIndicators();
        this.endVerificationMethods = builder.getEndVerificationMethods();
        this.endAssumptions = builder.getEndAssumptions();
        this.purpose = builder.getPurpose();
        this.purposeDetails = builder.getPurposeDetails();
        this.purposeIndicators = builder.getPurposeIndicators();
        this.quantitativeIndicator = builder.getQuantitativeIndicator();
        this.qualitativeIndicator = builder.getQualitativeIndicator();
        this.measuringUnit = builder.getMeasuringUnit();
        this.indicatorWeighting = builder.getIndicatorWeighting();
        this.otherUnits = builder.getOtherUnits();
        this.quantity = builder.getQuantity();
        this.horizonDate = builder.getHorizonDate();
        this.purposeVerificationMethods = builder.getPurposeVerificationMethods();
        this.purposeAssumptions = builder.getPurposeAssumptions();
        this.componentDetail = builder.getComponentDetail();
        this.componentVerificationMethods = builder.getComponentVerificationMethods();
        this.activityDetail = builder.getActivityDetail();
        this.activityVerificationMethods = builder.getActivityVerificationMethods();
        this.activityAssumptions = builder.getActivityAssumptions();
        this.financingSource = builder.getFinancingSource();
        this.spendingGroup = builder.getSpendingGroup();
        this.budgetItem = builder.getBudgetItem();
        this.unitCost = builder.getUnitCost();
        this.quantityUnit = builder.getQuantityUnit();
        this.fiscalPeriod = builder.getFiscalPeriod();
        this.componentAssumptions = builder.getComponentAssumptions();
        this.indicator = builder.getIndicator();
        this.measuringUnitIndicator = builder.getMeasuringUnitIndicator();
        this.baseLine = builder.getBaseLine();
        this.goal = builder.getGoal();
        this.weighting = builder.getWeighting();
        this.yearValue = builder.getYearValue();
        this.componentSelector = builder.getcomponentSelector();
        this.componentName = builder.getcomponentName();
        this.indicatorP = builder.getindicatorP();
        this.measureUnit = builder.getMeasuringUnit();
        this.baseLineP = builder.getbaseLineP();
        this.goalPurpose = builder.getgoalPurpose();
        this.ponderacion = builder.getponderacion();
        this.year = builder.getyear();

    }

    /**
     * Gets a new instance of LogicFrameDataBuilder to facilitate object construction.
     *
     * @return A new instance of LogicFrameDataBuilder.
     */
    public static LogicFrameDataBuilder builder() {
        return new LogicFrameDataBuilder();
    }

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

    public String getcomponentSelector() {
        return componentSelector;
    }
    public String getcomponentName() {
        return componentName;
    }

    public String getindicatorP() {
        return indicatorP;
    }
    public String getmeasureUnit() {
        return measureUnit;
    }
    public String getbaseLineP() {
        return baseLineP;
    }
    public String getgoalPurpose() {
        return goalPurpose;
    }

    public String getponderacion() {
        return ponderacion;
    }
    public String getyear() {
        return year;
    }
}
