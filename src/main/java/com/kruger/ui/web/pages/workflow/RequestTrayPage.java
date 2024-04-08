package com.kruger.ui.web.pages.workflow;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.ui.web.pages.BasePage;
import com.kruger.ui.web.sections.ProjectsListSection;
import com.kruger.ui.web.sections.UserAssignmentSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * This class represents the request tray page where users can view project requests,
 * perform actions like assigning users or conducting analysis.
 * It provides methods to interact with project requests and perform actions such as assigning users.
 */
public class RequestTrayPage extends BasePage {
    private static final String ASSIGN_USER_XPATH = "%s/following-sibling::button[@aria-label='Asignar a Usuario']";
    private static final String ANALYSIS_XPATH = "%s/following-sibling::button[contains(@aria-label,'lisis')]";
    @FindBy(xpath = "//button[text()='1']")
    WebElement firstPageButton;
    @FindAll({
            @FindBy(xpath = "//button[@aria-label='Ver Proyectos']")
    })
    List<WebElement> seeProjectButtons;
    private String seeProjectButtonXpath;

    public RequestTrayPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        firstPageButton = driverWait.until(ExpectedConditions.elementToBeClickable(firstPageButton));
    }

    private ProjectsListSection clickOnSeeProjectButton(WebElement seeProjectButton) {
        UIMethods.clickOnElement(seeProjectButton);
        return new ProjectsListSection();
    }

    /**
     * Searches for a project request by its title.
     *
     * @param projectTitle The title of the project request to search for.
     */
    private void searchProjectRequest(String projectTitle) {
        for (WebElement seeProjectButton : seeProjectButtons) {
            ProjectsListSection projectsListSection = clickOnSeeProjectButton(seeProjectButton);
            if (projectsListSection.isProjectRequest(projectTitle)) {
                seeProjectButtonXpath = UIMethods.getXpath(seeProjectButton);
                break;
            }
        }
    }

    private UserAssignmentSection clickOnAssignUserButton() {
        WebElement assignUserButton = UIMethods.getElementFromDynamicXpath(ASSIGN_USER_XPATH, seeProjectButtonXpath);
        UIMethods.clickOnElement(assignUserButton);
        return new UserAssignmentSection();
    }

    private AnalysisPage clickOnAnalysisButton() {
        WebElement analysisButton = UIMethods.getElementFromDynamicXpath(ANALYSIS_XPATH, seeProjectButtonXpath);
        UIMethods.clickOnElement(analysisButton);
        return new AnalysisPage();
    }

    private void clickOnApproveRequestButton() {
        clickOnButton(XpathText.APPROVE_REQUEST_BUTTON.getText());
    }

    /*
    TODO: Create the DictumRequestWorkflow entity and its builder in order to represent all the data needed for the
     dictum request workflow like the projectTitle, documentsCompliance, analysisType, analysis, recommendations and conclusions
     */

    /**
     * Assigns a user to the project request with the specified title.
     *
     * @param projectTitle The title of the project request to which the user will be assigned.
     */
    public void assignUser(String projectTitle) {
        searchProjectRequest(projectTitle);
        UserAssignmentSection userAssignmentSection = clickOnAssignUserButton();
        userAssignmentSection.assignUser();
    }

    /**
     * Creates an analysis for the specified project.
     *
     * @param projectTitle        The title of the project.
     * @param documentsCompliance The compliance status of documents.
     * @param analysisType        The type of analysis.
     * @param analysis            The analysis content.
     * @param recommendations     The recommendations provided.
     * @param conclusions         The conclusions drawn.
     */
    public void createAnalysis(String projectTitle, String documentsCompliance, String analysisType, String analysis,
                               String recommendations, String conclusions) {
        searchProjectRequest(projectTitle);
        AnalysisPage analysisPage = clickOnAnalysisButton();
        analysisPage.createAnalysis(documentsCompliance, analysisType, analysis, recommendations, conclusions);
    }

    /**
     * Accepts the analysis for the specified project.
     *
     * @param projectTitle The title of the project.
     * @return The RequestTrayPage after accepting the analysis.
     */
    public RequestTrayPage acceptAnalysis(String projectTitle) {
        searchProjectRequest(projectTitle);
        AnalysisPage analysisPage = clickOnAnalysisButton();
        return analysisPage.acceptAnalysis();
    }

    /**
     * Approves the request for the specified project.
     *
     * @param projectTitle The title of the project.
     * @return The RequestTrayPage after approving the request.
     */
    public RequestTrayPage approveRequest(String projectTitle) {
        searchProjectRequest(projectTitle);
        clickOnApproveRequestButton();
        return new RequestTrayPage();
    }
}
