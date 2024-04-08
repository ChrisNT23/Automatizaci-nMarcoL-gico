package com.kruger.ui.web.pages.inversion.newProject.geographicLocation;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.LocationData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page class for managing selected geographic locations.
 * Extends GeographicLocationBasePage.
 */
public class SelectedGeographicLocationsPage extends GeographicLocationBasePage {
    private static final String TEXT_BOX_TABLES_XPATH = "//td[contains(div,'%s')]/following-sibling::td[%s]//input";
    private static final String DEPLOY_BUTTON_TABLES_XPATH = "//td[contains(div,'%s')]/following-sibling::td[3]//button[@aria-label='Desplegar']";
    @FindBy(xpath = "//div[text()='Ubicaciones seleccionadas']")
    WebElement selectedLocationsTitle;
    @FindBy(xpath = "//button[contains(@aria-label,'Guardar pesta')]")
    WebElement saveTabButton;

    public SelectedGeographicLocationsPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        selectedLocationsTitle = driverWait.until(ExpectedConditions.visibilityOf(selectedLocationsTitle));
    }

    private void setAmount(String location, String amount) {
        WebElement amountTextBox = UIMethods.getElementFromDynamicXpath(TEXT_BOX_TABLES_XPATH, location, XpathText.AMOUNT_INDEX.getText());
        UIMethods.enterText(amountTextBox, amount);
    }

    private void setBeneficiaries(String location, String beneficiaries) {
        WebElement beneficiariesTextBox = UIMethods.getElementFromDynamicXpath(TEXT_BOX_TABLES_XPATH, location, XpathText.BENEFICIARIES_INDEX.getText());
        UIMethods.enterText(beneficiariesTextBox, beneficiaries);
    }

    private void clickOnDeployButton(String location) {
        WebElement deployButton = UIMethods.getElementFromDynamicXpath(DEPLOY_BUTTON_TABLES_XPATH, location);
        UIMethods.clickOnElement(deployButton);
    }

    private void clickOnSaveTabButton() {
        UIMethods.clickOnElement(saveTabButton);
    }
    /**
     * Sets the data for provinces based on the provided LocationData.
     * @param locationData The LocationData object containing province information.
     */
    private void setProvincesData(LocationData locationData) {
        setAmount(locationData.getProvinceName().toUpperCase(), locationData.getProvinceAmount());
        setBeneficiaries(locationData.getProvinceName().toUpperCase(), locationData.getProvinceBeneficiaries());
    }
    /**
     * Sets the data for cantons based on the provided LocationData.
     * @param locationData The LocationData object containing canton information.
     */
    private void setCantons(LocationData locationData) {
        setAmount(locationData.getCantonName().toUpperCase(), locationData.getCantonAmount());
        setBeneficiaries(locationData.getCantonName().toUpperCase(), locationData.getCantonBeneficiaries());
    }
    /**
     * Sets the data for parishes based on the provided LocationData.
     * @param locationData The LocationData object containing parish information.
     */
    private void setParishes(LocationData locationData) {
        setAmount(locationData.getParishName().toUpperCase(), locationData.getParishAmount());
        setBeneficiaries(locationData.getParishName().toUpperCase(), locationData.getParishBeneficiaries());
    }
    /**
     * Sets the selected geographic location data based on the provided LocationData.
     * @param locationData The LocationData object containing location information.
     */
    public void setSelectedGeographicLocationData(LocationData locationData) {
        setProvincesData(locationData);
        if (!locationData.getCantonName().isEmpty()) {
            clickOnDeployButton(locationData.getProvinceName().toUpperCase());
            setCantons(locationData);
            if (!locationData.getParishName().isEmpty()) {
                clickOnDeployButton(locationData.getCantonName().toUpperCase());
                setParishes(locationData);
            }
        }
        clickOnSaveTabButton();
    }
}
