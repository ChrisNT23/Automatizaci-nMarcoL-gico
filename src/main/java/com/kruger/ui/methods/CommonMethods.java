package com.kruger.ui.methods;

import com.kruger.ui.PageTransporter;
import com.kruger.ui.web.components.TopBar;
import com.kruger.ui.web.pages.login.LoginPage;
import com.kruger.utils.LoggerManager;

/**
 * The CommonMethods class contains common utility methods.
 */
public class CommonMethods {
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final PageTransporter TRANSPORTER = PageTransporter.getInstance();

    private static TopBar topBar;

    /**
     * Logs out from the application.
     *
     * @return The LoginPage object after logout.
     */
    public static LoginPage logout() {
        LOG.info("Verifying if logged in....");
        if (!TRANSPORTER.isOnLoginPageUrl()) {
            LOG.info("Login out of the page....");
            topBar = new TopBar();
            topBar.logout();
        }
        return new LoginPage();
    }
}
