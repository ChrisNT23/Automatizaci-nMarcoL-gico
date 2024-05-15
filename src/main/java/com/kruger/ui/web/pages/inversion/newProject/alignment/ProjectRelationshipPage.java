package com.kruger.ui.web.pages.inversion.newProject.alignment;

import com.kruger.config.selenium.UIMethods;
import com.kruger.entitys.AlignmentData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page class for managing project relationships.
 * Extends AlignmentBasePage.
 */
public class ProjectRelationshipPage extends AlignmentBasePage {
    private static final String ADD_BUTTON_XPATH = "//div[text()='%s']/ancestor::tr//button";
    @FindBy(xpath = "//button[text()='1']")
    WebElement firstPageButton;
    @FindBy(xpath = "//div[text()='Seleccione tipo de proyecto:']/div/div[contains(@class,'p-dropdown')]")
    WebElement selectProjectTypeDropdown;
    @FindBy(xpath = "//thead/tr[2]/th[2]//input")
    WebElement searchProjectInput;

    public ProjectRelationshipPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        firstPageButton = driverWait.until(ExpectedConditions.elementToBeClickable(firstPageButton));
    }

    private void searchProject(String projectName) {
        UIMethods.enterText(searchProjectInput, projectName);
    }

    private void clickOnAddProjectButton(String projectName) {
        WebElement addProjectButton = UIMethods.getElementFromDynamicXpath(ADD_BUTTON_XPATH, projectName);
        UIMethods.clickOnElement(addProjectButton);
    }

    private void selectProjectType(String projectType) {
        UIMethods.clickOnElement(selectProjectTypeDropdown);
        selectDropdownOption(projectType);
    }

    private void addProject(String projectName) {
        searchProject(projectName);
        clickOnAddProjectButton(projectName);
    }

    /**
     * Adds a project relationship based on the provided alignment data.
     *
     * @param alignmentData AlignmentData object containing project relationship details.
     */
    public void addProjectRelationship(AlignmentData alignmentData) {
        /*if (!alignmentData.getProjectRelatedName().isEmpty()) {
            selectProjectType(alignmentData.getProjectType().toUpperCase());
            addProject(alignmentData.getProjectRelatedName());
        }*/
        saveData();
    }

}
