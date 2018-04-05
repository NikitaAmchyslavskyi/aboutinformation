package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

/**
 * Created by nikita on 04.04.2018.
 */
public class EditAboutInfoPage extends BasePage {

    public WebDriverWait webDriverWait;


    public EditAboutInfoPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
        webDriverWait = new WebDriverWait(webDriver, 15);
    }

    @FindBy(xpath = "//span[text()='Add a workplace']")
    private WebElement worckSpaceLink;



    @FindBy(xpath = "//input[@name='employer_name']")
    private WebElement emploerName;

    @FindBy(xpath = "//input[@name='position_text']")
    private WebElement position;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement discription;

    @FindBy(xpath = "//label[@class='uiInputLabelLabel']")
    private WebElement checkCurrentWork;

    @FindBy(xpath = "//select[@name='date_start[year]']")
    private WebElement yearBegin;

    @FindBy(xpath = "//button[@name='__cancel__']")
    private WebElement cancelButton;

    @FindBy(xpath = "//a[@data-tooltip-content='Public']")
    private WebElement publicButton;

    @FindBy(xpath = "//input[@name='location_text']")
    private WebElement locationInput;

    @FindBy(xpath = "//span[@class='text']")
    private WebElement locationDropdown;

    @FindBy(xpath = "(//button[@name='__submit__'])[1]")
    private WebElement submitworckSpace;


    @FindBy(xpath = "(//div[@id='pagelet_edit_eduwork']//div[@class='clearfix']//a)[2]")
    private WebElement nameOfCompany;

    String choosenDropDownItem = "//span[@class='text' and text()='%s']";

    public void chooseWorkPlase(){
        wrapperAction.clickOnElement(worckSpaceLink);
    }


    public void addWorkPlase(String emploer, String city) {
        wrapperAction.enterText(emploerName, emploer);
        webDriverWait.until(ExpectedConditions.elementToBeClickable
                (By.xpath(String.format(choosenDropDownItem, emploer))));
        webDriver.findElement(By.xpath(String.format(choosenDropDownItem, emploer))).click();
        wrapperAction.enterText(locationInput, city);
        wrapperAction.clickOnElement(locationDropdown);
    }

    public void submitWorkPlase(){
        wrapperAction.clickOnElement(submitworckSpace);
    }

    public void assertWorkspase(String emploer) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(nameOfCompany));
        Assert.assertEquals(emploer, nameOfCompany.getText());
    }

    public void asserElementsPresent(){
        SoftAssert asert = new SoftAssert();
        asert.assertTrue(wrapperAction.isElementPresent(position));
        asert.assertTrue(wrapperAction.isElementPresent(position));
        asert.assertTrue(wrapperAction.isElementPresent(discription));
        asert.assertTrue(wrapperAction.isElementPresent(checkCurrentWork));
        asert.assertTrue(wrapperAction.isElementPresent(yearBegin));
        asert.assertTrue(wrapperAction.isElementPresent(cancelButton));
        asert.assertTrue(wrapperAction.isElementPresent(publicButton));
        asert.assertAll();
    }


}
