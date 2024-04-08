package com.kruger.ui.web.pages.inversion.projectsVisualization;

import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.web.pages.BasePage;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class represents the page for visualizing projects.
 * Users can search for projects and enter a specific project from this page.
 */
public class ProjectsVisualizationPage extends BasePage {
    private static final String ENTER_PROJECT_XPATH = "//tr[descendant::div[text()='%s']]//button";
    @FindBy(xpath = "//button[text()='1']")
    WebElement firstPageButton;
    @FindBy(xpath = "//thead/tr[2]/th[2]//input")
    WebElement searchProjectInput;

    public ProjectsVisualizationPage() {
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

    private void clickOnEnterProject(String projectName) {
        WebElement enterProjectButton = UIMethods.getElementFromDynamicXpath(ENTER_PROJECT_XPATH, projectName);
        UIMethods.clickOnElement(enterProjectButton);
    }

    /**
     * Enters a specific project.
     *
     * @param projectName The name of the project to enter.
     * @return A GeneralDataPage object representing the general data page of the entered project.
     */
    public GeneralDataPage enterToProject(String projectName) {
        searchProject(projectName);
        clickOnEnterProject(projectName);
        return new GeneralDataPage();
    }
}
