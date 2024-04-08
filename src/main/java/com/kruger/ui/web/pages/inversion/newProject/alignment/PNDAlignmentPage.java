package com.kruger.ui.web.pages.inversion.newProject.alignment;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.AlignmentData;
import com.kruger.ui.web.sections.SelectGoalSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page class for aligning with the Plan Nacional de Desarrollo (PND).
 * Extends AlignmentBasePage.
 */
public class PNDAlignmentPage extends AlignmentBasePage {
    @FindBy(xpath = "//button[contains(@aria-label,'NOTIFICAR A PLANIFICACI')]")
    WebElement notifyPNDButton;
    @FindBy(xpath = "//span[text()='PLAN NACIONAL DE DESARROLLO']")
    WebElement pndDropdown;
    @FindBy(xpath = "//div[text()='Seleccione una Meta :']//button")
    WebElement selectGoalButton;

    public PNDAlignmentPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        pndDropdown = driverWait.until(ExpectedConditions.elementToBeClickable(pndDropdown));
    }

    private void clickOnAlignmentPNDButton() {
        clickOnButton(XpathText.PND_ALIGNMENT_BUTTON.getText());
    }

    private SelectGoalSection clickOnSelectGoalButton() {
        UIMethods.clickOnElement(selectGoalButton);
        return new SelectGoalSection();
    }

    /**
     * Sets the PND alignment by clicking on the alignment PND button and notifying PND.
     */
    private void setPNDAlignment() {
        clickOnAlignmentPNDButton();
        UIMethods.clickOnElement(notifyPNDButton);
    }

    /**
     * Sets the PND goal by selecting the goal from the dropdown.
     *
     * @param alignmentData AlignmentData object containing the goal name.
     */
    public void setPNDGoal(AlignmentData alignmentData) {
        setPNDAlignment();
        UIMethods.clickOnElement(pndDropdown);
        SelectGoalSection goalSection = clickOnSelectGoalButton();
        goalSection.selectGoal(alignmentData.getGoalName());
    }
}
