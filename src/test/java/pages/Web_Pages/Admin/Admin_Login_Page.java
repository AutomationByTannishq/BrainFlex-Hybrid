package pages.Web_Pages.Admin;

import abstracts.WebLocators.AdminLocators;
import abstracts.WebLocators.InstituteLocators;
import config.Web_Common;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Admin_Login_Page extends AdminLocators {
    public WebDriver driver;
    public Admin_Login_Page(WebDriver driver) {
        this.driver = driver;
    }
    Web_Common webCommon = new Web_Common(driver);
    public void Login_with_Valid_Admin_Credentials() throws InterruptedException, IOException, ParseException {
        webCommon.log("Launched URL");
        String Email = webCommon.read_json("AdminEmail");
        String Password = webCommon.read_json("AdminPassword");
        webCommon.WaitForElementAndType(driver, LoginEmailField, Email);
        webCommon.log("Entered Email :- " + Email);
        webCommon.WaitForElementAndType(driver, LoginPasswordField, Password);
        webCommon.log("Entered Password :- " + Password);
        webCommon.WaitForElementAndClick(driver,LoginButton);
        webCommon.log("Clicked On Login Button");
        webCommon.waitUntilElementPresent(driver, Dashboard);
        webCommon.log("Login Successful");
    }

}
