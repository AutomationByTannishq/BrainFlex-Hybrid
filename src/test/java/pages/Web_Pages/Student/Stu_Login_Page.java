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
    public void Login_with_Cheat_Code() throws InterruptedException, IOException, ParseException {
        webCommon.log("Launched URL");
        String Stu_Mob = webCommon.read_json("StudentNumber");
        String Stu_Pass = webCommon.read_json("StudentNumber");
        webCommon.WaitForElementAndClick(driver, StudentLocators.ToLetter);
        webCommon.WaitForElementAndType(driver, StudentLocators.MobileNumberField, Stu_Mob);
        webCommon.log("Entered Student Mobile Number");
        webCommon.WaitForElementAndType(driver, StudentLocators.CheatCodeField+"[1]", "3");
        webCommon.WaitForElementAndType(driver, StudentLocators.CheatCodeField+"[2]", "4");
        webCommon.WaitForElementAndType(driver, StudentLocators.CheatCodeField+"[3]", "1");
        webCommon.WaitForElementAndType(driver, StudentLocators.CheatCodeField+"[4]", "6");
        webCommon.WaitForElementAndType(driver, StudentLocators.CheatCodeField+"[5]", "9");
        webCommon.WaitForElementAndType(driver, StudentLocators.CheatCodeField+"[6]", "9");
        webCommon.log("Entered Cheat Code");
        webCommon.WaitForElementAndClick(driver, StudentLocators.VerifyButton);
        webCommon.waitUntilElementPresent(driver, Dashboard_Heading);
        webCommon.log("Login Successful Student Dashboard is Displayed");
    }



}
