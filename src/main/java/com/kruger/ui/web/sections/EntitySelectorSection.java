package com.kruger.ui.web.sections;

import com.kruger.constants.XpathText;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for selecting an entity.
 * This class provides a method to select an entity from a dropdown.
 */
public class EntitySelectorSection extends BasePageObject {
    @FindBy(xpath = "//div[text()='Seleccione una entidad *']")
    WebElement selectEntityLabel;

    public EntitySelectorSection() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        selectEntityLabel = driverWait.until(ExpectedConditions.visibilityOf(selectEntityLabel));
    }

    /**
     * Selects the entity displayed
     */
    public void selectEntity() {
        clickOnButton(XpathText.SELECT_BUTTON.getText());
    }
}
