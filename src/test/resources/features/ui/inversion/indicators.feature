@UI @Inversion @Indicators
Feature: Indicators

  @CreateProjectWithIndicators
  Scenario Outline: A user with proper role should be able to save data in the Indicators page from a new project
    Given the user navigates to the login page
    And the "external" user with the "<User Role>" role and the "<User Area>" area logs in with defined credentials
    And the user navigates to the new project page via url link
    And the user creates a project with the following data
      | name   | investmentPhase    | management   | coverage   | investmentType    | interventionSubSector    | totalInvestment    | investmentGuideline    | startDate    | endDate    | requestType    | participants   | emblematic   | endorsement   | environmentalSheet    | binationalCooperation    | manager   | responsible   | responsiblePosition    | email   | additionalEmail    | phoneNumber    | extension   | highestAuthorityResponsible     | highestAuthorityEmail     | product   | productDetail    |
      | <Name> | <Investment Phase> | <Management> | <Coverage> | <Investment Type> | <Intervention SubSector> | <Total Investment> | <Investment Guideline> | <Start Date> | <End Date> | <Request Type> | <Participants> | <Emblematic> | <Endorsement> | <Environmental Sheet> | <Binational Cooperation> | <Manager> | <Responsible> | <Responsible Position> | <Email> | <Additional Email> | <Phone Number> | <Extension> | <Highest Authority Responsible> | <Highest Authority Email> | <Product> | <Product Detail> |
    And the user navigates to the logic frame page
    And the user saves the logic frame information with the following data
      | coreProblem    | cause   | effect   | generalObjective    | component   | activity   | endProject    | endDetails    | endIndicators    | endVerificationMethods     | endAssumptions    | purpose   | purposeDetails    | purposeIndicators    | quantitativeIndicator    | qualitativeIndicator    | measuringUnit    | indicatorWeighting    | otherUnits    | quantity   | horizonDate    | purposeVerificationMethods     | purposeAssumptions    | componentDetail    | componentVerificationMethods     | activityDetail    | activityVerificationMethods     | activityAssumptions    | financingSource    | spendingGroup    | budgetItem    | unitCost    | quantityUnit    | fiscalPeriod    | componentAssumptions    | indicator   | measuringUnitIndicator     | baseLine    | goal   | weighting   | yearValue    |
      | <Core Problem> | <Cause> | <Effect> | <General Objective> | <Component> | <Activity> | <End Project> | <End Details> | <End Indicators> | <End Verification Methods> | <End Assumptions> | <Purpose> | <Purpose Details> | <Purpose Indicators> | <Quantitative Indicator> | <Qualitative Indicator> | <Measuring Unit> | <Indicator Weighting> | <Other Units> | <Quantity> | <Horizon Date> | <Purpose Verification Methods> | <Purpose Assumptions> | <Component Detail> | <Component Verification Methods> | <Activity Detail> | <Activity Verification Methods> | <Activity Assumptions> | <Financing Source> | <Spending Group> | <Budget Item> | <Unit Cost> | <Quantity Unit> | <Fiscal Period> | <Component Assumptions> | <Indicator> | <Measuring Unit Indicator> | <Base Line> | <Goal> | <Weighting> | <Year Value> |
    And the user navigates to the geographic location page from the logic frame page
    And the user saves the geographic location information with the following data
      | provinceName    | provinceAmount    | provinceBeneficiaries    | cantonName    | cantonAmount    | cantonBeneficiaries    | parishName    | parishAmount    | parishBeneficiaries    | latitude   | longitude   | observation   |
      | <Province Name> | <Province Amount> | <Province Beneficiaries> | <Canton Name> | <Canton Amount> | <Canton Beneficiaries> | <Parish Name> | <Parish Amount> | <Parish Beneficiaries> | <Latitude> | <Longitude> | <Observation> |
    When the user navigates to the indicators page from the geographic location page
    And the user saves the indicators information with the following data
      | financialFlowDiscount     | economicalFlowDiscount     | interestGrowthRate     | incomeDescription    | incomeValue    | financialCapitalExpenseDescription      | financialCapitalExpenseValue      | financialOperatingExpenseDescription      | financialOperatingExpenseValue      | financialAdministrativeExpenseDescription      | financialAdministrativeExpenseValue      | financialMaintenanceExpenseDescription      | financialMaintenanceExpenseValue      | populationGrowthRate     | benefitDescription    | benefitValue    | economicalCapitalExpenseDescription      | economicalCapitalExpenseValue      | economicalOperatingExpenseDescription      | economicalOperatingExpenseValue      | economicalAdministrativeExpenseDescription      | economicalAdministrativeExpenseValue      | economicalMaintenanceExpenseDescription      | economicalMaintenanceExpenseValue      | countryLoss    | resultsImpact    | methodology   | directMaleBeneficiaries     | indirectBeneficiaries    | group   | maleAmount    | femaleAmount    |
      | <Financial Flow Discount> | <Economical Flow Discount> | <Interest Growth Rate> | <Income Description> | <Income Value> | <Financial Capital Expense Description> | <Financial Capital Expense Value> | <Financial Operating Expense Description> | <Financial Operating Expense Value> | <Financial Administrative Expense Description> | <Financial Administrative Expense Value> | <Financial Maintenance Expense Description> | <Financial Maintenance Expense Value> | <Population Growth Rate> | <Benefit Description> | <Benefit Value> | <Economical Capital Expense Description> | <Economical Capital Expense Value> | <Economical Operating Expense Description> | <Economical Operating Expense Value> | <Economical Administrative Expense Description> | <Economical Administrative Expense Value> | <Economical Maintenance Expense Description> | <Economical Maintenance Expense Value> | <Country Loss> | <Results Impact> | <Methodology> | <Direct Male Beneficiaries> | <Indirect Beneficiaries> | <Group> | <Male Amount> | <Female Amount> |
    Then the indicators information should be saved
    Examples:
      | User Role | User Area  | Name                     | Investment Phase | Management | Coverage | Investment Type | Intervention SubSector | Total Investment | Investment Guideline                          | Start Date | End Date   | Request Type | Participants | Emblematic | Endorsement | Environmental Sheet | Binational Cooperation | Manager | Responsible  | Responsible Position | Email              | Additional Email    | Phone Number | Extension | Highest Authority Responsible | Highest Authority Email | Product  | Product Detail    | Core Problem | Cause        | Effect   | General Objective | Component      | Activity      | End Project      | End Details      | End Indicators  | End Verification Methods    | End Assumptions   | Purpose   | Purpose Details        | Purpose Indicators | Quantitative Indicator | Qualitative Indicator | Measuring Unit | Indicator Weighting | Other Units    | Quantity | Horizon Date | Purpose Verification Methods | Purpose Assumptions | Component Detail   | Component Verification Methods | Activity Detail   | Activity Verification Methods | Activity Assumptions | Financing Source  | Spending Group | Budget Item  | Unit Cost | Quantity Unit | Fiscal Period | Component Assumptions | Indicator | Measuring Unit Indicator | Base Line | Goal | Weighting | Year Value | Province Name | Province Amount | Province Beneficiaries | Canton Name | Canton Amount | Canton Beneficiaries | Parish Name | Parish Amount | Parish Beneficiaries | Latitude | Longitude | Observation      | Financial Flow Discount | Economical Flow Discount | Interest Growth Rate | Income Description  | Income Value | Financial Capital Expense Description | Financial Capital Expense Value | Financial Operating Expense Description | Financial Operating Expense Value | Financial Administrative Expense Description | Financial Administrative Expense Value | Financial Maintenance Expense Description | Financial Maintenance Expense Value | Population Growth Rate | Benefit Description   | Benefit Value | Economical Capital Expense Description | Economical Capital Expense Value | Economical Operating Expense Description | Economical Operating Expense Value | Economical Administrative Expense Description | Economical Administrative Expense Value | Economical Maintenance Expense Description | Economical Maintenance Expense Value | Country Loss             | Results Impact          | Methodology | Direct Male Beneficiaries | Indirect Beneficiaries | Group        | Male Amount | Female Amount |
      | admin     | presidency | Prueba indicadores final | Programa         | Estado     | Cantonal | Servicios       | Administración Deporte | 200              | Infraestructura y equipamiento de uso militar | 2024/01/09 | 2025/02/01 | Prioridad    | No           | No         | No          | No                  | No                     | No      | Lionel Messi | Tester               | liomessi@gmail.com | liomessi2@gmail.com | 123456789    | 00000     | Andres Lopez                  | anderslopez@gmail.com   | Cereales | Cereales Chocapic | Falta de luz | Corte de luz | Poca luz | Mejorar la luz    | Componente uno | Actividad uno | Fin del Proyecto | Detalles del fin | Indicadores fin | Metodos de verificacion fin | Supuestos del fin | Proposito | Detalles del proposito | indicador uno      | 10                     | Indicador cualitativo | Contrato       | 2                   | Otras unidades | 2        | 2024/1/12    | Medios proposito             | Supuestos proposito | Detalle componente | Medios componente              | Detalle Actividad | Medios actividad              | Supuestos actividad  | Recursos Fiscales | Obras Publicas | Agua Potable | 10        | 20            | 2024/1        | Supuesto componente   | Indic one | Unidad                   | 122       | 12   | 10        | 120        | Napo          | 100             | 10                     | Tena        | 50            | 5                    | Pano        | 20            | 2                    | -0,54    | -79,52    | Observacion test | 20                      | 25                       | 10                   | Descripcion Ingreso | 200          | Descripcion gasto de capital          | 20                              | Descripcion gastos operativos           | 15                                | Descripcion gasto administrativo             | 10                                     | Descripcion gasto mantenimiento           | 30                                  | 15                     | Descripcion beneficio | 100           | Descripcion gasto de capital           | 20                               | Descripcion gastos operativos            | 15                                 | Descripcion gasto administrativo              | 10                                      | Descripcion gasto mantenimiento            | 30                                   | Perdida si no se ejecuta | Resultados del proyecto | No          | 10                        | 5                      | Adolescentes | 10          | 10            |


  @SaveIndicatorsFromProjectCreated
  Scenario Outline: A user with proper role should be able to save data in the Indicators page from a project already created
    Given the user navigates to the login page
    And the "external" user with the "<User Role>" role and the "<User Area>" area logs in with defined credentials
    And the user navigates to the projects visualization page via url link
    And the user enters to the project with the name "<Project Name>"
    When the user navigates to the indicators page from the general data page
    And the user saves the indicators information with the following data
      | financialFlowDiscount     | economicalFlowDiscount     | interestGrowthRate     | incomeDescription    | incomeValue    | financialCapitalExpenseDescription      | financialCapitalExpenseValue      | financialOperatingExpenseDescription      | financialOperatingExpenseValue      | financialAdministrativeExpenseDescription      | financialAdministrativeExpenseValue      | financialMaintenanceExpenseDescription      | financialMaintenanceExpenseValue      | populationGrowthRate     | benefitDescription    | benefitValue    | economicalCapitalExpenseDescription      | economicalCapitalExpenseValue      | economicalOperatingExpenseDescription      | economicalOperatingExpenseValue      | economicalAdministrativeExpenseDescription      | economicalAdministrativeExpenseValue      | economicalMaintenanceExpenseDescription      | economicalMaintenanceExpenseValue      | countryLoss    | resultsImpact    | methodology   | directMaleBeneficiaries     | indirectBeneficiaries    | group   | maleAmount    | femaleAmount    |
      | <Financial Flow Discount> | <Economical Flow Discount> | <Interest Growth Rate> | <Income Description> | <Income Value> | <Financial Capital Expense Description> | <Financial Capital Expense Value> | <Financial Operating Expense Description> | <Financial Operating Expense Value> | <Financial Administrative Expense Description> | <Financial Administrative Expense Value> | <Financial Maintenance Expense Description> | <Financial Maintenance Expense Value> | <Population Growth Rate> | <Benefit Description> | <Benefit Value> | <Economical Capital Expense Description> | <Economical Capital Expense Value> | <Economical Operating Expense Description> | <Economical Operating Expense Value> | <Economical Administrative Expense Description> | <Economical Administrative Expense Value> | <Economical Maintenance Expense Description> | <Economical Maintenance Expense Value> | <Country Loss> | <Results Impact> | <Methodology> | <Direct Male Beneficiaries> | <Indirect Beneficiaries> | <Group> | <Male Amount> | <Female Amount> |
    Then the indicators information should be saved
    Examples:
      | User Role | User Area  | Project Name              | Financial Flow Discount | Economical Flow Discount | Interest Growth Rate | Income Description  | Income Value | Financial Capital Expense Description | Financial Capital Expense Value | Financial Operating Expense Description | Financial Operating Expense Value | Financial Administrative Expense Description | Financial Administrative Expense Value | Financial Maintenance Expense Description | Financial Maintenance Expense Value | Population Growth Rate | Benefit Description   | Benefit Value | Economical Capital Expense Description | Economical Capital Expense Value | Economical Operating Expense Description | Economical Operating Expense Value | Economical Administrative Expense Description | Economical Administrative Expense Value | Economical Maintenance Expense Description | Economical Maintenance Expense Value | Country Loss             | Results Impact          | Methodology | Direct Male Beneficiaries | Indirect Beneficiaries | Group        | Male Amount | Female Amount |
      | admin     | presidency | Prueba creacion solicitud | 20                      | 25                       | 10                   | Descripcion Ingreso | 200          | Descripcion gasto de capital          | 20                              | Descripcion gastos operativos           | 15                                | Descripcion gasto administrativo             | 10                                     | Descripcion gasto mantenimiento           | 30                                  | 15                     | Descripcion beneficio | 100           | Descripcion gasto de capital           | 20                               | Descripcion gastos operativos            | 15                                 | Descripcion gasto administrativo              | 10                                      | Descripcion gasto mantenimiento            | 30                                   | Perdida si no se ejecuta | Resultados del proyecto | No          | 10                        | 5                      | Adolescentes | 10          | 10            |
