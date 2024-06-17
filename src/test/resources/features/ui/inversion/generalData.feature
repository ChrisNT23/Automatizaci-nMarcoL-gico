@UI @Inversion @GeneralData
Feature: General Data Project

  @CreateProject
  Scenario Outline: A user with proper role should be able to create a project
    Given the user navigates to the login page
    And the "external" user with the "<User Role>" role and the "<User Area>" area logs in with defined credentials
    When the user navigates to the new project page via url link
    And the user creates a project with the following data
      | name   | investmentPhase    | management   | coverage   | investmentType    | interventionSubSector    | totalInvestment    | investmentGuideline    | startDate    | endDate    | requestType    | participants   | emblematic   | endorsement   | environmentalSheet    | binationalCooperation    | manager   | responsible   | responsiblePosition    | email   | additionalEmail    | phoneNumber    | extension   | highestAuthorityResponsible     | highestAuthorityEmail     | product   | productDetail    |
      | <Name> | <Investment Phase> | <Management> | <Coverage> | <Investment Type> | <Intervention SubSector> | <Total Investment> | <Investment Guideline> | <Start Date> | <End Date> | <Request Type> | <Participants> | <Emblematic> | <Endorsement> | <Environmental Sheet> | <Binational Cooperation> | <Manager> | <Responsible> | <Responsible Position> | <Email> | <Additional Email> | <Phone Number> | <Extension> | <Highest Authority Responsible> | <Highest Authority Email> | <Product> | <Product Detail> |
    Then the project should be created
    Examples:
      | User Role | User Area  | Name             | Investment Phase | Management | Coverage | Investment Type | Intervention SubSector | Total Investment | Investment Guideline                          | Start Date | End Date   | Request Type | Participants | Emblematic | Endorsement | Environmental Sheet | Binational Cooperation | Manager | Responsible  | Responsible Position | Email              | Additional Email    | Phone Number | Extension | Highest Authority Responsible | Highest Authority Email | Product  | Product Detail    |
      | admin     | presidency | Prueba Proyecto 10/Junio | Programa         | Estado     | Cantonal | Servicios       | Administración Deporte | 200              | Infraestructura y equipamiento de uso militar | 2024/6/10 | 2024/9/30 | Prioridad    | No           | No         | No          | No                  | No                     | No      | Lionel Messi | Tester               | liomessi@gmail.com | liomessi2@gmail.com | 123456789    | 00000     | Andres Lopez                  | anderslopez@gmail.com   | Cereales | Cereales Chocapic |
