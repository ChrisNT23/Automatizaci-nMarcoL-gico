package com.kruger.config.selenium;

import com.kruger.utils.LoggerManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

/**
 * The UIMethods class provides utility methods for interacting with the user interface.
 * It includes methods for clicking on elements, entering text, checking element visibility, and more.
 */
public class UIMethods {
    private static final Wait<WebDriver> DRIVER_WAIT = DriverManager.getInstance().getDriverWait();
    private static final LoggerManager LOG = LoggerManager.getInstance();
    private static final WebDriver DRIVER = DriverManager.getInstance().getDriver();
    private static final JavascriptExecutor JAVASCRIPT_EXECUTOR = (JavascriptExecutor) DRIVER;

    /**
     * Scrolls the page until the specified element is in view.
     *
     * @param element The WebElement to scroll to.
     */
    private static void scrollUntilElement(WebElement element) {
        LOG.info("Scrolling to find element..");
        JAVASCRIPT_EXECUTOR.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * Clicks on the specified WebElement.
     *
     * @param element The WebElement to click.
     */
    public static void clickOnElement(WebElement element) {
        try {
            scrollUntilElement(element);
            element = DRIVER_WAIT.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            LOG.info("Clicking on the element ->" + element);
        } catch (Exception e) {
            LOG.error("Error clicking on the element -> " + element.toString());
            throw new RuntimeException("Error clicking on the element " + e);
        }

    }

    /**
     * Enters text into the specified WebElement.
     *
     * @param element The WebElement to enter text into.
     * @param text    The text to enter.
     */
    public static void enterText(WebElement element, String text) {
        try {
            clickOnElement(element);
            element.clear();
            element.sendKeys(text);
            LOG.info("Entering the text -> " + text + " in the element -> " + element);
        } catch (Exception e) {
            LOG.error("Error entering the text -> " + text + " in the element -> " + element);
            throw new RuntimeException("Error entering the text " + e);
        }
    }

    /**
     * Checks if the specified WebElement is displayed on the page.
     *
     * @param element The WebElement to check.
     * @return True if the element is displayed, false otherwise.
     */
    public static boolean isElementDisplayed(WebElement element) {
        try {
            DRIVER_WAIT.until(ExpectedConditions.visibilityOf(element));
            LOG.info("The element -> " + element + " is displayed");
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            LOG.info("The element -> " + element + " is not displayed");
            return false;
        }
    }

    /**
     * Checks if the element with the specified XPath is displayed on the page.
     *
     * @param xpath The XPath of the element to check.
     * @return True if the element is displayed, false otherwise.
     */
    public static boolean isElementDisplayed(String xpath) {
        try {
            DRIVER_WAIT.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            LOG.info("The element with the xpath-> " + xpath + " is displayed");
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            LOG.info("The element with the xpath-> " + xpath + " is not displayed");
            return false;
        }
    }

    /**
     * Checks if a WebElement with the same class as the specified element is present on the page.
     *
     * @param element The WebElement to check.
     * @return True if a matching element is present, false otherwise.
     */
    public static boolean isWebElementPresent(WebElement element) {
        try {
            List<WebElement> elements = DRIVER.findElements(By.className(element.getAttribute("class")));
            LOG.info("The element -> " + element + " is present");
            return !elements.isEmpty();
        } catch (NoSuchElementException e) {
            LOG.info("The element -> " + element + " is not present");
            return false;
        }
    }

    /**
     * Checks if an element with the specified XPath is present on the page.
     *
     * @param xpath The XPath of the element to check.
     * @return True if an element is present, false otherwise.
     */
    public static boolean isWebElementPresent(String xpath) {
        try {
            List<WebElement> elements = DRIVER.findElements(By.xpath(xpath));
            LOG.info("The element with the xpath-> " + xpath + " is present");
            return !elements.isEmpty();
        } catch (NoSuchElementException e) {
            LOG.info("The element with the xpath-> " + xpath + " is not present");
            return false;
        }
    }

    /**
     * Checks if a button WebElement is enabled.
     *
     * @param element The button WebElement to check.
     * @return True if the button is enabled, false otherwise.
     */
    public static boolean isButtonEnabled(WebElement element) {
        element = DRIVER_WAIT.until(ExpectedConditions.visibilityOf(element));
        return !element.getAttribute("class").contains("disabled");
    }

    /**
     * Retrieves a WebElement using a dynamic XPath expression and optional arguments.
     *
     * @param dynamicXpath The dynamic XPath expression.
     * @param args         Optional arguments for formatting the XPath.
     * @return The located WebElement.
     */
    public static WebElement getElementFromDynamicXpath(String dynamicXpath, Object... args) {
        String xpath = String.format(dynamicXpath, args);
        return DRIVER_WAIT.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    /**
     * Retrieves the XPath expression of the specified WebElement.
     *
     * @param element The WebElement to get the XPath for.
     * @return The XPath expression of the WebElement.
     */
    public static String getXpath(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) DRIVER;
        String xpath = (String) jsExecutor.executeScript(
                "function getXPath(node) {" +
                        "if (node.id !== '')" +
                        "    return 'id(\"' + node.id + '\")';" +
                        "if (node === document.body)" +
                        "    return node.tagName;" +
                        "var nodeCount = 0;" +
                        "var childNodes = node.parentNode.childNodes;" +
                        "for (var i = 0; i < childNodes.length; i++) {" +
                        "    var currentNode = childNodes[i];" +
                        "    if (currentNode === node)" +
                        "        return getXPath(node.parentNode) + '/' + node.tagName + '[' + (nodeCount + 1) + ']';" +
                        "    if (currentNode.nodeType === 1 && currentNode.tagName === node.tagName)" +
                        "        nodeCount++;" +
                        "}" +
                        "}" +
                        "return getXPath(arguments[0]);", element);
        LOG.info("This is the xpath -> " + xpath + " from the WebElement -> " + element);
        return xpath;
    }
}
