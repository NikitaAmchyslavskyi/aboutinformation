package pages;

import helpers.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nikita on 04.04.2018.
 */
public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "email")
    private WebElement loginField;

    @FindBy(id = "pass")
    private WebElement passField;

    @FindBy(id = "loginbutton")
    private  WebElement loginButton;


    public NewsFeedPage login(String usserLogin,String usserPassword){
        webDriver.get(FileUtils.baseURL +"login.php");
        loginField.sendKeys(usserLogin);
        passField.sendKeys(usserPassword);
        loginButton.click();
        return new NewsFeedPage(webDriver);
    }

}
