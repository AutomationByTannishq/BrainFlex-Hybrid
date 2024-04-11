package pages.Web_Pages.Admin;

import abstracts.WebLocators.AdminLocators;
import config.Web_Common;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

public class Content_Tab_Page extends AdminLocators {
    public WebDriver driver;
    public Content_Tab_Page(WebDriver driver) {
        this.driver = driver;
    }
    Web_Common webCommon = new Web_Common(driver);
    public void Search_Question() throws InterruptedException, IOException, ParseException, AWTException {
        int que_id = 499777;
        webCommon.WaitForElementAndClick(driver,QuestionBankTab);
        webCommon.log("Clicked On Question Bank Tab");
        webCommon.WaitForElementAndType(driver, Search_Questions_Field,""+que_id);
        webCommon.log("Searched Question :- "+ que_id);
        webCommon.Hit_Keyboard_Key(driver ,10);
        webCommon.waitUntilElementPresent(driver, "//tbody");
        webCommon.isDisplayed(driver,"//*[contains(text(),'"+que_id+"')]");
        webCommon.log("Searched element is present");
    }

}

