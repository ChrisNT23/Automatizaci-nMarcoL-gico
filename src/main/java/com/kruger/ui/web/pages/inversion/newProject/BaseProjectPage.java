package com.kruger.ui.web.pages.inversion.newProject;

import com.kruger.ui.web.components.tabBars.ProjectTabBar;
import com.kruger.ui.web.pages.BaseFormPage;

/**
 * This abstract class represents the base page for project-related pages.
 * It extends BaseFormPage and contains a ProjectTabBar element.
 */
public abstract class BaseProjectPage extends BaseFormPage {

    public ProjectTabBar projectTabBar;

    public BaseProjectPage() {
        projectTabBar = new ProjectTabBar();
    }
}
