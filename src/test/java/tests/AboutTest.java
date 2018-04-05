package tests;

import helpers.FileUtils;
import org.testng.annotations.Test;
import pages.EditAboutInfoPage;
import pages.LoginPage;

/**
 * Created by nikita on 04.04.2018.
 */
public class AboutTest extends SetupTest {

    /**
     *******************************************************************
     * This tests check filling in information about the workplace
     *******************************************************************
     */

    @Test
    public void addWorkplaceTest() {
        driver.get(FileUtils.baseURL);
        LoginPage page = new LoginPage(driver);
        EditAboutInfoPage editPage = new EditAboutInfoPage(driver);
        page.login(FileUtils.userLogin,FileUtils.userPassword)
                .click_on_profile()
                .clickOnProfile().
                clickOnEditAboutInfo().chooseWorkPlase();
        editPage.addWorkPlase("Facebook","Kiev");
        editPage.submitWorkPlase();
        editPage.assertWorkspase("Facebook");
    }
    /**
     *******************************************************************
     * This tests check is element present on WorkPlace Option
     *******************************************************************
     */

    @Test
    public void checkElementPresent(){
        driver.get(FileUtils.baseURL);
        LoginPage page = new LoginPage(driver);
        EditAboutInfoPage editPage = new EditAboutInfoPage(driver);
        page.login(FileUtils.userLogin,FileUtils.userPassword)
                .click_on_profile()
                .clickOnProfile().
                clickOnEditAboutInfo().chooseWorkPlase();
        editPage.asserElementsPresent();

    }

}
