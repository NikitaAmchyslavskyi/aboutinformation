package pages;

import helpers.Wrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nikita on 03.04.2018.
 */
public abstract class BasePage {

    public WebDriver webDriver;
    public Wrapper wrapperAction;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wrapperAction = new Wrapper(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}
