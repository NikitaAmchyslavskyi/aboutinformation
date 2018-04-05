package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by nikita on 03.04.2018.
 */
public class Wrapper {

    WebDriver webDriver;
    public WebDriverWait webDriverWait;

    public Wrapper(WebDriver webDriver) {

        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 20);
    }

    public void enterText(WebElement element, String text) {
        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
            element.sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Can`t work with element " + element);
        }
    }

    public void clickOnElement(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        element.click();

    }

    public boolean isElementPresent(WebElement element) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("element is not present ->" + element);
            return false;
        }
    }
}
