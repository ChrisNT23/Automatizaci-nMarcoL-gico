package com.kruger.ui.steps.inversion;

import com.kruger.ui.PageTransporter;
import com.kruger.ui.web.pages.inversion.newProject.GeneralDataPage;
import com.kruger.ui.web.pages.inversion.projectsVisualization.ProjectsVisualizationPage;
import io.cucumber.java.en.Given;

public class InversionSteps {
    private final PageTransporter pageTransporter;
    private ProjectsVisualizationPage projectsVisualizationPage;
    public InversionSteps() {
        pageTransporter = PageTransporter.getInstance();
    }

    @Given("the user navigates to the projects visualization page via url link")
    public void navigateVisualizationPageWithUrl() {
        projectsVisualizationPage = pageTransporter.navigateToProjectsVisualizationPage();
    }
    @Given("the user enters to the project with the name {string}")
    public void theUserEntersToTheProjectWithTheName(String projectName) {
        projectsVisualizationPage.enterToProject(projectName);
    }
}
