package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

/**
 * Created by nikita on 04.04.2018.
 */
public class EditProfileArea extends BasePage {


    @FindBy(xpath = "//span[text()='Edit Your About Info']")
    private WebElement editAboutInfoLink;

    public EditProfileArea(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public EditAboutInfoPage clickOnEditAboutInfo(){
        wrapperAction.clickOnElement(editAboutInfoLink);
        return new EditAboutInfoPage(webDriver);
    }

}
