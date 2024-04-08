package com.kruger.ui.web.sections;

import com.kruger.config.FileManager;
import com.kruger.config.selenium.UIMethods;
import com.kruger.ui.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

/**
 * Represents a section for uploading files.
 * This class provides methods to select and upload files.
 */
public class UploadFilesSection extends BasePageObject {
    @FindBy(xpath = "//span[contains(text(),'Arrastra y suelta el documento aquí')]")
    WebElement uploadDocumentLabel;
    @FindBy(xpath = "//input[@type='file']")
    WebElement fileInput;
    @FindBy(xpath = "//button[contains(@class,'custom-upload')]")
    WebElement uploadButton;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        uploadDocumentLabel = driverWait.until(ExpectedConditions.visibilityOf(uploadDocumentLabel));
    }

    /**
     * Selects a file to upload based on the provided file type.
     *
     * @param fileType The type of file to be uploaded.
     */
    private void selectFile(String fileType) {
        File file = new File(FileManager.getInstance().getFilePath(fileType));
        fileInput.sendKeys(file.getAbsolutePath());
    }

    private void clickOnUploadButton() {
        UIMethods.clickOnElement(uploadButton);
    }

    /**
     * Uploads a file of the specified file type.
     *
     * @param fileType The type of file to be uploaded.
     */
    public void uploadFile(String fileType) {
        selectFile(fileType);
        clickOnUploadButton();
    }
}
