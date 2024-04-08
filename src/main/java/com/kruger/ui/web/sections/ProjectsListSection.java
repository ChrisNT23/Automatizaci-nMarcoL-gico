package com.kruger.ui.web.sections;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents a section for managing projects list.
 * This class provides methods to check project requests and close the section.
 */
public class ProjectsListSection extends BasePageObject {
    private static final String PROJECT_TITLE_XPATH = "//td[text()='%s']";
    @FindBy(xpath = "//div[text()='Listado de Proyectos']")
    WebElement projectsListLabel;

    public ProjectsListSection() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        projectsListLabel = driverWait.until(ExpectedConditions.visibilityOf(projectsListLabel));
    }

    private void clickOnCloseButton() {
        clickOnButton(XpathText.CLOSE_BUTTON.getText());
    }

    /**
     * Checks if the project title is present in the projects list.
     */
    private boolean isProjectTitlePresent(String projectTitle) {
        String projectTitleXpath = String.format(PROJECT_TITLE_XPATH, projectTitle);
        return UIMethods.isWebElementPresent(projectTitleXpath);
    }

    /**
     * Checks if the project request is present and closes the projects list section.
     */
    public boolean isProjectRequest(String projectTitle) {
        boolean isProjectTitlePresent = isProjectTitlePresent(projectTitle);
        clickOnCloseButton();
        return isProjectTitlePresent;
    }
}
