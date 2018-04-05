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
public class ProfilePage extends BasePage {



    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    @FindBy(xpath = "//div[@id='pagelet_timeline_profile_actions']/a")
    private WebElement editProfileButton;

    public EditProfileArea clickOnProfile() {
        wrapperAction.clickOnElement(editProfileButton);
        return new EditProfileArea(webDriver);

    }





}
