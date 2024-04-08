package com.kruger.ui.web.pages.login;

import com.kruger.config.CredentialsManager;
import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.BasePageObject;
import com.kruger.ui.web.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class represents the login page of the application.
 * It provides methods to interact with the login form, including entering credentials,
 * completing captcha, and logging in with defined or provided credentials.
 */
public class LoginPage extends BasePageObject {
    private static final String ENTITY_XPATH = "//option[contains(text(),'%s')]";
    @FindBy(id = "entidad")
    WebElement entitySelector;
    @FindBy(id = "ruc")
    WebElement rucTextBox;
    @FindBy(id = "cedula")
    WebElement documentTextBox;
    @FindBy(id = "username")
    WebElement usernameTextBox;
    @FindBy(id = "password")
    WebElement passwordTextBox;
    @FindBy(id = "image")
    WebElement captcha;
    @FindBy(id = "submit")
    WebElement captchaTextBox;
    @FindBy(id = "btn")
    WebElement validateButton;
    @FindBy(id = "login")
    WebElement loginButton;
    @FindBy(xpath = "//button[contains(span, 'Sign in with Keycloak')]")
    WebElement keycloakButton;


    public LoginPage() {
        PageFactory.initElements(driver, this);
        clickOnKeycloakButton();
        waitUntilPageObjectIsLoaded();
    }

    public void waitUntilPageObjectIsLoaded() {
        entitySelector = driverWait.until(ExpectedConditions.elementToBeClickable(entitySelector));
    }

    private void clickOnKeycloakButton() {
        if (UIMethods.isWebElementPresent(keycloakButton)) {
            UIMethods.clickOnElement(keycloakButton);
        }
    }

    private void clickOnEntity(String entity) {
        entity = entity.toUpperCase().replace("L", "");
        String entityXpath = String.format(ENTITY_XPATH, entity);
        WebElement entityOption = driver.findElement(By.xpath(entityXpath));
        UIMethods.clickOnElement(entityOption);

    }

    /**
     * Selects the entity from the entity selector dropdown.
     *
     * @param entity The entity to be selected.
     */
    private void selectEntity(String entity) {
        UIMethods.clickOnElement(entitySelector);
        clickOnEntity(entity);
    }

    private void setRuc(String ruc) {
        UIMethods.enterText(rucTextBox, ruc);
    }

    private void setDocument(String document) {
        UIMethods.enterText(documentTextBox, document);
    }

    private void setUsername(String username) {
        UIMethods.enterText(usernameTextBox, username);
    }

    private void setPassword(String password) {
        UIMethods.enterText(passwordTextBox, password);
    }

    private String getCaptchaText() {
        captcha = driverWait.until(ExpectedConditions.visibilityOf(captcha));
        return captcha.getText();
    }

    private void setCaptcha(String captchaText) {
        UIMethods.enterText(captchaTextBox, captchaText);
    }

    private void completeCaptcha() {
        String captchaText = getCaptchaText();
        setCaptcha(captchaText);
        UIMethods.clickOnElement(validateButton);
    }

    private void loginExternalUser(String entity, String ruc, String document, String password) {
        selectEntity(entity);
        setRuc(ruc);
        setDocument(document);
        setPassword(password);
        completeCaptcha();
        UIMethods.clickOnElement(loginButton);
    }

    private void loginInternalUser(String entity, String username, String password) {
        selectEntity(entity);
        setUsername(username);
        setPassword(password);
        completeCaptcha();
        UIMethods.clickOnElement(loginButton);
    }

    /**
     * Logs in with defined credentials based on the provided user entity, area, and role.
     *
     * @param userEntity The type of user entity (internal or external).
     * @param area       The area of the user.
     * @param role       The role of the user.
     * @return The HomePage object after successful login.
     */
    public HomePage loginWithDefinedCredentials(String userEntity, String area, String role) {
        if (userEntity.equals("internal")) {
            loginInternalUser(userEntity, CredentialsManager.getInstance().getUsername(userEntity, area, role),
                    CredentialsManager.getInstance().getPassword(userEntity, area, role));
        } else {
            loginExternalUser(userEntity, CredentialsManager.getInstance().getRuc(userEntity, area, role),
                    CredentialsManager.getInstance().getDocument(userEntity, area, role),
                    CredentialsManager.getInstance().getPassword(userEntity, area, role));
        }
        return new HomePage();
    }

    /**
     * Logs in with provided internal user credentials.
     *
     * @param userEntity The type of user entity (internal or external).
     * @param username   The username of the user.
     * @param password   The password of the user.
     * @return The HomePage object after successful login.
     */
    public HomePage loginWithProvidedCredentials(String userEntity, String username, String password) {
        loginInternalUser(userEntity, username, password);
        return new HomePage();
    }

    /**
     * Logs in with provided external user credentials.
     *
     * @param userEntity The type of user entity (internal or external).
     * @param ruc        The RUC of the user.
     * @param document   The document of the user.
     * @param password   The password of the user.
     * @return The HomePage object after successful login.
     */
    public HomePage loginWithProvidedCredentials(String userEntity, String ruc, String document, String password) {
        loginExternalUser(userEntity, ruc, document, password);
        return new HomePage();
    }

}
