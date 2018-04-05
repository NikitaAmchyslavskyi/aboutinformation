package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static java.lang.Thread.sleep;

/**
 * Created by nikita on 04.04.2018.
 */
public class NewsFeedPage extends BasePage {


    public NewsFeedPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(xpath = "//a[@title='Profile']")
    private WebElement profileButton;



    public ProfilePage click_on_profile() {
        wrapperAction.clickOnElement(profileButton);
        return new ProfilePage(webDriver);
    }

}
