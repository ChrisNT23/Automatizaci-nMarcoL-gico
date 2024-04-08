@UI @Login
Feature: Login

  @LoginAdminCredentials
  Scenario Outline: A user with valid defined credentials should be able to login
    Given the user navigates to the login page
    When the "<User Type>" user with the "<User Role>" role and the "<User Area>" area logs in with defined credentials
    Then the user should be logged in successfully
    Examples:
      | User Type | User Role | User Area  |
      | external  | admin     | presidency |
