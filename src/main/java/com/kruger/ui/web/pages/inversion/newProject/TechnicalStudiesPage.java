package com.kruger.ui.web.pages.inversion.newProject;

import com.kruger.config.FileManager;
import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.TechnicalStudiesData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

/**
 * TechnicalStudiesPage class represents the page for managing technical studies in a project.
 * It extends the BaseProjectPage class and provides methods to interact with various elements of the technical studies page.
 */
public class TechnicalStudiesPage extends BaseProjectPage {
    @FindBy(xpath = "//td[text()='No se encontraron registros']")
    WebElement noRecordsFoundLabel;
    @FindBy(xpath = "//span[text()='Seleccione un tipo de documento']/parent::div")
    WebElement selectDocumentTypeDropdown;
    @FindBy(xpath = "//label[contains(text(),'Observaciones')]/following-sibling::input")
    WebElement observationsTextBox;
    @FindBy(xpath = "//input[@type='file']")
    WebElement fileInput;
    @FindBy(xpath = "//div[text()='Se ha enviado el archivo']")
    WebElement fileUploadedNotification;

    public TechnicalStudiesPage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        noRecordsFoundLabel = driverWait.until(ExpectedConditions.visibilityOf(noRecordsFoundLabel));
    }

    private void clickOnSelectDocumentTypeDropdown() {
        UIMethods.clickOnElement(selectDocumentTypeDropdown);
    }

    private void selectDocumentTypeOption(String documentType) {
        selectDropdownOption(documentType);
    }

    private void setObservationsTextBox(String observation) {
        UIMethods.enterText(observationsTextBox, observation);
    }

    /**
     * Selects a file to upload.
     *
     * @param fileType The type of file to be uploaded.
     */
    private void selectFile(String fileType) {
        File file = new File(FileManager.getInstance().getFilePath(fileType));
        fileInput.sendKeys(file.getAbsolutePath());
    }

    private void clickOnUploadButton() {
        clickOnButton(XpathText.UPLOAD_FILE_BUTTON.getText());
    }

    private void selectDocumentType(String documentType) {
        clickOnSelectDocumentTypeDropdown();
        selectDocumentTypeOption(documentType);
    }

    private void uploadFile(String fileType) {
        selectFile(fileType);
        clickOnUploadButton();
    }

    /**
     * Selects a document type, sets observations, and uploads a file based on the provided technical studies data.
     *
     * @param technicalStudiesData The data containing information about technical studies.
     */
    public void setTechnicalStudiesData(TechnicalStudiesData technicalStudiesData) {
        selectDocumentType(technicalStudiesData.getDocumentType());
        setObservationsTextBox(technicalStudiesData.getDocumentObservation());
        uploadFile(technicalStudiesData.getDocumentFormat());
    }

    /**
     * Checks if the file uploaded notification is displayed.
     *
     * @return true if the file uploaded notification is displayed, false otherwise.
     */
    public boolean isFileUploadedNotificationDisplayed() {
        return UIMethods.isElementDisplayed(fileUploadedNotification);
    }

}
