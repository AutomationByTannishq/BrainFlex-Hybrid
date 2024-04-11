package pages.Web_Pages.Institute;

import abstracts.WebLocators.InstituteLocators;
import config.Web_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class Notifications_Page extends InstituteLocators {
    public WebDriver driver;
    public Notifications_Page(WebDriver driver) {
        this.driver = driver;
    }
    Web_Common webCommon = new Web_Common(driver);

    public void Go_To_Notifications_Page() throws InterruptedException {
        Thread.sleep(3000);
        webCommon.WaitForElementAndClick(driver, SideBarBurgerButton);
        webCommon.log("Clicked On Burger Menu Button On Dashboard");
        webCommon.WaitForElementAndClick(driver, NotificationsTabMenu);
        webCommon.log("Clicked On Notifications in the Menu");
        Thread.sleep(3000);
    }
    
    public void Click_On_Create_New_notification_Button() throws InterruptedException {
        webCommon.WaitForElementAndClick(driver, CreateNewNotificationButton);
        webCommon.log("Clicked On Create New Notification Button");
        Thread.sleep(1000);
    }

    public void Select_QA_Test_Batch() throws InterruptedException, AWTException {
        webCommon.WaitForElementAndClick(driver, SelectBatchesDropdown);
        webCommon.log("Select Batch Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, QA_Test_Batch);
        webCommon.log("Selected QA-Test Batch from Dropdown");
        Thread.sleep(2000);
        webCommon.moveToElementAndClick(driver, SaveNotificationButton);
        Thread.sleep(2000);
    }

    public void Select_Test() throws InterruptedException, AWTException {
        webCommon.WaitForElementAndClick(driver, TestNameDropdown);
        webCommon.log("Select Test Name Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, FirstTestOption);
        webCommon.log("Selected First Test from Dropdown");
        Thread.sleep(5000);
        webCommon.moveToElementAndClick(driver, SelectBatchDropdown);
        Thread.sleep(2000);
    }

    public void Select_Send_Via_Option_As_WhatsApp() throws InterruptedException {
        webCommon.WaitForElementAndClick(driver, SendViaDropdown);
        webCommon.log("Send Via Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, SendVia_WhatsApp);
        webCommon.log("Selected WhatsApp as Option");
        Thread.sleep(2000);
    }
    
    public void SaveNotification(){
        webCommon.WaitForElementAndClick(driver, SaveNotificationButton);
        webCommon.waitUntilElementPresent(driver, "//div[@id='toast-container']");
        String AlertMsg = webCommon.getLocatorText(driver, Alert);
        webCommon.log(AlertMsg);
    }
    
    public void Send_Notification_To_Both_Student_And_Parent(){
        webCommon.WaitForElementAndClick(driver, SendToDropdown);
        webCommon.log("Send To Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, SendToBothOption);
        webCommon.log("Selected Both from Dropdown");
    }
    
    public void Create_New_Notification_To_send_Test_Report_On_Mail() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        this.Select_Test();
        this.Send_Notification_To_Both_Student_And_Parent();
        this.SaveNotification();
    }
    
    
    public void Create_New_Notification_To_send_Progress_Report_On_Mail() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        webCommon.WaitForElementAndClick(driver, NotificationTypeDropdown);
        webCommon.log("Select Notification Type Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, ProgressReportOption);
        webCommon.log("Selected Progress Report from Dropdown");
        this.Send_Notification_To_Both_Student_And_Parent();
        this.SaveNotification();
    }

    public void Create_New_Notification_To_send_Absent_Mail() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        webCommon.WaitForElementAndClick(driver, NotificationTypeDropdown);
        webCommon.log("Select Notification Type Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, AbsentEmailOption);
        webCommon.log("Selected Absent Email from Dropdown");
        this.Select_Test();
        Thread.sleep(2000);
        this.Send_Notification_To_Both_Student_And_Parent();
        this.SaveNotification();
    }

    public void Enter_mail_Subject_And_Context() throws InterruptedException, AWTException {
        webCommon.WaitForElementAndType(driver, SubjectFieldEmail,"This is a test Mail By Brainflex");
        webCommon.log("Entered Mail Subject");
        WebElement frame = driver.findElement(By.xpath(ContextFrame));
        driver.switchTo().frame(frame);
        webCommon.log("Switched to Mail Context IFrame");
        webCommon.WaitForElementAndType(driver, "//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]","This is a test mail from Brainflex automation.");
        driver.switchTo().defaultContent();
    }

    public void Create_New_Notification_To_send_Custom_Mail() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        webCommon.WaitForElementAndClick(driver, NotificationTypeDropdown);
        webCommon.log("Select Notification Type Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, CustomEmailOption);
        webCommon.log("Selected Email/Attach from Dropdown");
        Thread.sleep(2000);
        this.Send_Notification_To_Both_Student_And_Parent();
        webCommon.WaitForElementAndClick(driver, SaveNotificationButton);
        webCommon.log("Clicked On Save Button to Open Mail Formatter");
        this.Enter_mail_Subject_And_Context();
        this.SaveNotification();
    }

    public void Create_New_Notification_To_send_Test_Report_On_WhatsApp() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        this.Select_Send_Via_Option_As_WhatsApp();
        this.Select_Test();
        this.Send_Notification_To_Both_Student_And_Parent();
        this.SaveNotification();
    }

    public void Create_New_Notification_To_send_Progress_Report_On_WhatsApp() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        this.Select_Send_Via_Option_As_WhatsApp();
        webCommon.WaitForElementAndClick(driver, NotificationTypeDropdown);
        webCommon.log("Select Notification Type Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, ProgressReportOption);
        webCommon.log("Selected Progress Report from Dropdown");
        this.Send_Notification_To_Both_Student_And_Parent();
        this.SaveNotification();
    }

    public void Create_New_Notification_To_send_Absent_Notification_On_WhatsApp() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        this.Select_Send_Via_Option_As_WhatsApp();
        webCommon.WaitForElementAndClick(driver, NotificationTypeDropdown);
        webCommon.log("Select Notification Type Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, AbsentEmailOption);
        webCommon.log("Selected Absent Email from Dropdown");
        this.Select_Test();
        this.Send_Notification_To_Both_Student_And_Parent();
        this.SaveNotification();
    }

    public void Create_New_Notification_To_send_Custom_Text_On_WhatsApp() throws InterruptedException, AWTException {
        this.Click_On_Create_New_notification_Button();
        this.Select_QA_Test_Batch();
        this.Select_Send_Via_Option_As_WhatsApp();
        webCommon.WaitForElementAndClick(driver, NotificationTypeDropdown);
        webCommon.log("Select Notification Type Dropdown Opened");
        webCommon.WaitForElementAndClick(driver, CustomTextOption);
        webCommon.log("Selected Custom Text from Dropdown");
        this.Send_Notification_To_Both_Student_And_Parent();
        webCommon.WaitForElementAndClick(driver, SaveNotificationButton);
        webCommon.log("Clicked On Save Button to Enter Custom text");
        webCommon.WaitForElementAndType(driver, TextAreaCustomText, "This is a Test Notification from BrainFlex with Custom Text");
        Thread.sleep(2000);
        String s = driver.findElement(By.xpath(TextAreaCustomText)).getText();
        webCommon.log("Entered Custom text as :- " + s);
        this.SaveNotification();
    }

}
