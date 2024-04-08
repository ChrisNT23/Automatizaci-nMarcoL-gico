package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * The AddFinancialMovementSection class represents a section for adding financial movements
 * It extends the BasePageObject class.
 */
public class AddFinancialMovementSection extends BasePageObject {
    @FindBy(id = "descripcion")
    WebElement descriptionTextBox;
    @FindBy(xpath = "//span[@id='valor']/input")
    WebElement valueTextBox;

    public AddFinancialMovementSection() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        descriptionTextBox = driverWait.until(ExpectedConditions.visibilityOf(descriptionTextBox));
    }

    private void setDescription(String description) {
        UIMethods.enterText(descriptionTextBox, description);
    }

    private void setValue(String value) {
        UIMethods.enterText(valueTextBox, value);
    }

    private void clickOnAcceptButton() {
        clickOnButton(XpathText.ACCEPT_BUTTON.getText());
    }

    /**
     * Adds a financial movement with the given description and value.
     *
     * @param description The description of the financial movement.
     * @param value       The value of the financial movement.
     */
    public void addMovement(String description, String value) {
        setDescription(description);
        setValue(value);
        clickOnAcceptButton();
    }
}
