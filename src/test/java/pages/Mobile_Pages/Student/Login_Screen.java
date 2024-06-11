package pages.Mobile_Pages.Student;

import abstracts.WebLocators.InstituteLocators;
import config.Mobile_Common;
import io.appium.java_client.AppiumDriver;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Login_Screen extends InstituteLocators {
    public AppiumDriver driver;
    public Login_Screen(AppiumDriver driver) {
        this.driver = driver;
    }
    Mobile_Common mobCommon = new Mobile_Common(driver);
    public void Login_with_Valid_Credentials_In_Mobile() throws InterruptedException, IOException, ParseException {
        mobCommon.log("Launched APP");
        String MobNumber = mobCommon.read_json("StudentNumber");
        String Password = mobCommon.read_json("StudentPassword");
        mobCommon.WaitForElementAndType(driver, LoginEmailField, MobNumber);
        mobCommon.log("Entered Mobile Number :- " + MobNumber);
        mobCommon.WaitForElementAndClick(driver, Next_Button_Login_Page);
        mobCommon.log("Clicked On Next Button");
        mobCommon.WaitForElementAndType(driver, LoginPasswordField, Password);
        mobCommon.log("Entered Password :- " + Password);
        mobCommon.WaitForElementAndClick(driver,LoginButton);
        mobCommon.log("Clicked On Login Button");
        mobCommon.waitUntilElementPresent(driver, Dashboard_Heading);
        mobCommon.log("Login Successful");
    }
}