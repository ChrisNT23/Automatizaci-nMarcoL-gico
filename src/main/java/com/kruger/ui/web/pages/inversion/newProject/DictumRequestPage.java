package com.kruger.ui.web.pages.inversion.newProject;


import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.DictumRequestData;
import com.kruger.ui.web.sections.UploadFilesSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * DictumRequestPage class represents the page for creating dictum requests in a project.
 * It extends the BaseProjectPage class and provides methods to interact with various elements of the dictum request page.
 */
public class DictumRequestPage extends BaseProjectPage {
    private static final String SELECT_ANNEXES_CHECKBOX_XPATH = "//label[contains(text(),'%s')]/parent::div/div";
    @FindBy(xpath = "//label[contains(text(),'INFORME JUSTIFICATIVO')]")
    WebElement justificationReportLabel;
    @FindBy(xpath = "//div[text()='Se ha creado la solicitud']")
    WebElement requestCreatedNotification;
    private UploadFilesSection uploadFilesSection;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        justificationReportLabel = driverWait.until(ExpectedConditions.visibilityOf(justificationReportLabel));
    }

    /**
     * Clicks on the annexes checkbox based on the provided annexe and returns an instance of UploadFilesSection.
     *
     * @param annexe The annexe for which the checkbox is clicked.
     * @return An instance of UploadFilesSection.
     */
    private UploadFilesSection clickOnAnnexesCheckBox(String annexe) {
        WebElement annexeCheckBox = UIMethods.getElementFromDynamicXpath(SELECT_ANNEXES_CHECKBOX_XPATH, annexe);
        UIMethods.clickOnElement(annexeCheckBox);
        return new UploadFilesSection();
    }

    private void clickOnSendRequestButton() {
        clickOnButton(XpathText.SEND_REQUEST_BUTTON.getText());
    }

    private UploadFilesSection selectJustificationReportCheckbox() {
        return clickOnAnnexesCheckBox(XpathText.JUSTIFICATION_REPORT_CHECKBOX.getText());
    }

    private UploadFilesSection selectOtherCheckbox() {
        return clickOnAnnexesCheckBox(XpathText.OTHER_CHECKBOX.getText());
    }

    private void uploadJustificationReport(String fileType) {
        uploadFilesSection = selectJustificationReportCheckbox();
        uploadFilesSection.uploadFile(fileType);
    }

    private void uploadOther(String fileType) {
        uploadFilesSection = selectOtherCheckbox();
        uploadFilesSection.uploadFile(fileType);
    }

    /**
     * Sends a dictum request based on the provided dictum request data.
     *
     * @param dictumRequestData The data containing information about the dictum request.
     */
    public void sendDictumRequest(DictumRequestData dictumRequestData) {
        uploadJustificationReport(dictumRequestData.getJustificationReportFormat());
        if (!dictumRequestData.getOtherDocumentFormat().isEmpty()) {
            uploadOther(dictumRequestData.getOtherDocumentFormat());
        }
        clickOnSendRequestButton();
    }

    /**
     * Checks if the request created notification is displayed.
     *
     * @return true if the request created notification is displayed, false otherwise.
     */
    public boolean isRequestCreatedNotificationDisplayed() {
        return UIMethods.isElementDisplayed(requestCreatedNotification);
    }
}
