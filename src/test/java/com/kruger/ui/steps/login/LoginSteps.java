package com.kruger.ui.steps.login;

import com.kruger.ui.PageTransporter;
import com.kruger.ui.web.pages.HomePage;
import com.kruger.ui.web.pages.login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private final PageTransporter pageTransporter;
    private LoginPage loginPage;
    private HomePage homePage;

    public LoginSteps() {
        pageTransporter = PageTransporter.getInstance();
    }

    @Given("the user navigates to the login page")
    public void navigateLoginPage() {
        loginPage = pageTransporter.navigateToLoginPage();
    }

    @When("the {string} user with the {string} role and the {string} area logs in with defined credentials")
    public void loginDefinedCredentials(String userType, String userArea, String userRole) {
        homePage = loginPage.loginWithDefinedCredentials(userType, userArea, userRole);
    }

    @Then("the user should be logged in successfully")
    public void verifyLoginSuccessfully() {
        boolean isOnHomePage = pageTransporter.isOnHomePageUrl();
        boolean isAccountButtonDisplayed = homePage.topBar.isAccountButtonDisplayed();

        Assert.assertTrue(isAccountButtonDisplayed, "the account button is not displayed");
        Assert.assertTrue(isOnHomePage, "the user is not in the Home Page");
    }
}
