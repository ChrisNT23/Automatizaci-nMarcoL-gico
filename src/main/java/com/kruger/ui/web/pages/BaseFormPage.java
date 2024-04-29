package com.kruger.ui.web.pages;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.utils.DateManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Abstract class representing a base form page in the SIPeIP application.
 * This class extends the BasePage class and provides common functionality for form-based page objects.
 */
public abstract class BaseFormPage extends BasePage {
    private static final String DROPDOWN_OPTION_XPATH = "//li[contains(text(),'%s')]";
    private static final String QUESTIONS_ANSWER_XPATH = "//div[contains(h4,'%s')]//div[@aria-label='%s']";
    private static final String TEXT_BOX_XPATH = "//label[contains(text(),'%s')]/preceding-sibling::input";
    private static final String DROPDOWN_MENU_XPATH = "//label[contains(text(),'%s')]/preceding-sibling::div";
    private static final String SELECT_OPTION_XPATH = "//div[@aria-label='%s']";
    private static final String CURRENT_DATE_INFO_XPATH = "//button[contains(text(),'%s')]";
    private static final String SELECT_DATE_XPATH = "//span[text()='%s']";
    private static final String CURRENT_YEAR_XPATH = "//button[contains(@class,'p-datepicker-year')]";
    private static final String CURRENT_MONTH_XPATH = "//button[contains(@class,'p-datepicker-month')]";
    

    /**
     * Selects an option from a dropdown menu.
     *
     * @param dropdownOption The option to be selected.
     */
    protected void selectDropdownOption(String dropdownOption) {
        WebElement dropdownOptionElement = UIMethods.getElementFromDynamicXpath(DROPDOWN_OPTION_XPATH, dropdownOption);
        UIMethods.clickOnElement(dropdownOptionElement);
    }

    /**
     * Answers yes/no questions on the form.
     *
     * @param question The question being answered.
     * @param answer   The answer to the question (Yes or No).
     */
    protected void answerYesNoQuestions(String question, String answer) {
        WebElement answerElement = UIMethods.getElementFromDynamicXpath(QUESTIONS_ANSWER_XPATH, question, answer);
        UIMethods.clickOnElement(answerElement);
    }

    /**
     * Sets text in a text box field.
     *
     * @param titleTextBox The title of the text box field.
     * @param text         The text to be entered.
     */
    protected void setTextBox(String titleTextBox, String text) {
        WebElement textBoxElement = UIMethods.getElementFromDynamicXpath(TEXT_BOX_XPATH, titleTextBox);
        UIMethods.enterText(textBoxElement, text);
    }

    /**
     * Clicks on a dropdown menu to open its options.
     *
     * @param dropdownTitle The title of the dropdown menu.
     */
    protected void clickOnDropdownMenu(String dropdownTitle) {
        WebElement dropdownElement = UIMethods.getElementFromDynamicXpath(DROPDOWN_MENU_XPATH, dropdownTitle);
        UIMethods.clickOnElement(dropdownElement);
    }

    /**
     * Saves the data entered or selected in the form.
     */
    protected void saveData() {
        clickOnButton(XpathText.SAVE_BUTTON.getText());
    }


      /**
     * Selects an option from a dropdown menu.
     *
     * @param option The option to be selected.
     */
    protected void selectOption(String option) {
        WebElement optionSelected = UIMethods.getElementFromDynamicXpath(SELECT_OPTION_XPATH, option);
        UIMethods.clickOnElement(optionSelected);
    }

    /**
     * Selects a date on the date picker.
     *
     * @param dateInfo The date to be selected.
     */
    private void selectDate(String dateInfo) {
        String datesXpath = String.format(SELECT_DATE_XPATH, dateInfo);
        List<WebElement> dates = driver.findElements(By.xpath(datesXpath));
        for (WebElement date : dates) {
            if (UIMethods.isButtonEnabled(date)) {
                UIMethods.clickOnElement(date);
                break;
            }
        }
    }

    /**
     * Checks if a specific date info is selected.
     *
     * @param dateInfo The date info to be checked.
     * @return True if the date info is selected, false otherwise.
     */
    private boolean isDateInfoSelected(String dateInfo) {
        String currentDateXpath = String.format(CURRENT_DATE_INFO_XPATH, dateInfo);
        return UIMethods.isWebElementPresent(currentDateXpath);
    }

    /**
     * Changes the value of the date (year, month, or day).
     *
     * @param xpath The xpath of the date element.
     * @param value The new value to be selected.
     */
    private void changeValue(String xpath, String value) {
        WebElement currentValue = driver.findElement(By.xpath(xpath));
        UIMethods.clickOnElement(currentValue);
        selectDate(value);
    }

    /**
     * Changes the year in the date picker.
     *
     * @param year The new year to be selected.
     */
    private void changeYear(String year) {
        changeValue(CURRENT_YEAR_XPATH, year);
    }

    /**
     * Changes the month in the date picker.
     *
     * @param month The new month to be selected.
     */
    private void changeMonth(String month) {
        changeValue(CURRENT_MONTH_XPATH, month);
    }

    /**
     * Checks if the current year is selected.
     *
     * @param year The year to be checked.
     * @return True if the year is selected, false otherwise.
     */
    private boolean isCurrentYearSelected(String year) {
        return isDateInfoSelected(year);
    }

    /**
     * Selects a specific year in the date picker.
     *
     * @param year The year to be selected.
     */
    private void selectYear(String year) {
        if (!isCurrentYearSelected(year)) {
            changeYear(year);
        }
    }

    /**
     * Selects a specific month in the date picker.
     *
     * @param monthName The full name of the month.
     * @param monthAbbr The abbreviation of the month.
     */
    private void selectMonth(String monthName, String monthAbbr) {
        if (!isDateInfoSelected(monthName)) {
            changeMonth(monthAbbr);
        }
    }

    /**
     * Selects a specific month in the date picker.
     *
     * @param monthAbbr The abbreviation of the month.
     */
    private void selectMonth(String monthAbbr) {
        selectDate(monthAbbr);
    }

    /**
     * Selects a specific day in the date picker.
     *
     * @param day The day to be selected.
     */
    private void selectDay(String day) {
        selectDate(day);
    }

    /**
     * Sets the date in the date picker when the year is the current year.
     *
     * @param dateFormatted The DateManager object containing the formatted date information.
     */
    private void setWithCurrentYear(DateManager dateFormatted) {
        selectMonth(dateFormatted.getMonthName(), dateFormatted.getMonthAbbreviation());
        selectDay(dateFormatted.getDay());
    }

    /**
     * Sets the date in the date picker when the year is different from the current year.
     *
     * @param dateFormatted The DateManager object containing the formatted date information.
     */
    private void setWithDifferentYear(DateManager dateFormatted) {
        changeYear(dateFormatted.getYear());
        selectMonth(dateFormatted.getMonthAbbreviation());
        selectDay(dateFormatted.getDay());
    }

    /**
     * Sets the date in a date picker input field.
     *
     * @param dateElement The WebElement corresponding to the date input field.
     * @param date        The date to be set (in the format "MM/YYYY" or "MM/YYYY/DD").
     */
    public void setDate(WebElement dateElement, String date) {
        DateManager dateFormatted = new DateManager(date);
        UIMethods.clickOnElement(dateElement);
        if (isCurrentYearSelected(dateFormatted.getYear())) {
            setWithCurrentYear(dateFormatted);
        } else {
            setWithDifferentYear(dateFormatted);
        }
    }

    /**
     * Sets the date in a date picker input field without selecting a day.
     *
     * @param dateElement The WebElement corresponding to the date input field.
     * @param date        The date to be set (in the format "MM/YYYY").
     */
    public void setDateWithoutDay(WebElement dateElement, String date) {
        DateManager dateFormatted = new DateManager(date + "/1");
        UIMethods.clickOnElement(dateElement);
        selectYear(dateFormatted.getYear());
        selectMonth(dateFormatted.getMonthAbbreviation());
    }
}
