package pages.Web_Pages.Institute;

import abstracts.WebLocators.InstituteLocators;
import config.Web_Common;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Notification_Page extends InstituteLocators {
    public WebDriver driver;
    public Notification_Page(WebDriver driver) {
        this.driver = driver;
    }
    Web_Common webCommon = new Web_Common(driver);
    public void Login_with_Valid_Institute_Credentials() throws InterruptedException, IOException, ParseException {
        webCommon.log("Launched URL");
        String Email = webCommon.read_json("Email");
        String Password = webCommon.read_json("Password");
        webCommon.WaitForElementAndType(driver, LoginEmailField, Email);
        webCommon.log("Entered Email :- " + Email);
        webCommon.WaitForElementAndClick(driver, Next_Button_Login_Page);
        webCommon.log("Clicked On Next Button");
        webCommon.WaitForElementAndType(driver, LoginPasswordField, Password);
        webCommon.log("Entered Password :- " + Password);
        webCommon.WaitForElementAndClick(driver,LoginButton);
        webCommon.log("Clicked On Login Button");
        webCommon.waitUntilElementPresent(driver, Dashboard_Heading);
        webCommon.log("Login Successful");
    }

}
