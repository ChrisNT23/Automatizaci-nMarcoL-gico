package com.kruger.ui.web.pages.inversion.newProject.geographicLocation;

import com.kruger.ui.web.components.tabBars.GeographicLocationTabBar;
import com.kruger.ui.web.pages.inversion.newProject.BaseProjectPage;

/**
 * Abstract base page class for geographic location-related pages.
 * Extends BaseProjectPage.
 */
public abstract class GeographicLocationBasePage extends BaseProjectPage {
    public GeographicLocationTabBar geographicLocationTabBar;

    public GeographicLocationBasePage() {
        geographicLocationTabBar = new GeographicLocationTabBar();
    }
}
