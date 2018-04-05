package tests;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static helpers.FileUtils.getConfig;

/**
 * Created by nikita on 03.04.2018.
 */
public abstract class SetupTest {

    public WebDriver driver;

    @BeforeSuite
    public void readProperty() throws IOException {
        getConfig();
    }


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers" + File.separator + "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        options.addArguments("--disable-popup-blocking");


        driver = new ChromeDriver(options);

    }


    @AfterMethod()
    public void tearDown() throws Exception {
        driver.quit();

    }
}
