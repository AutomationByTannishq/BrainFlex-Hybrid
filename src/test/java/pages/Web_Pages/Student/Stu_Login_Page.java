package pages.Web_Pages.Student;

import abstracts.WebLocators.StudentLocators;
import config.Web_Common;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Stu_Login_Page extends StudentLocators {
    public WebDriver driver;
    public Stu_Login_Page(WebDriver driver) {
        this.driver = driver;
    }
    Web_Common webCommon = new Web_Common(driver);
    public void Login_with_Valid_Student_Credentials() throws InterruptedException, IOException, ParseException {
        webCommon.log("Launched URL");
        String Stu_Mob = webCommon.read_json("StudentNumber");
        String Stu_Pass = webCommon.read_json("StudentNumber");
        webCommon.WaitForElementAndType(driver, StudentLocators.MobileNumberField, Stu_Mob);
        webCommon.log("Entered Student Mobile Number");
        webCommon.WaitForElementAndClick(driver, LoginViaPassword);
        webCommon.log("Clicked On Login Via Password");
        webCommon.WaitForElementAndType(driver, StudentLocators.LoginPasswordField, Stu_Pass);
        webCommon.log("Entered Student Password");
        webCommon.WaitForElementAndClick(driver, StudentLocators.LoginButton);
        webCommon.waitUntilElementPresent(driver, Dashboard_Heading);
        webCommon.log("Login Successful Student Dashboard is Displayed");
    }

}
