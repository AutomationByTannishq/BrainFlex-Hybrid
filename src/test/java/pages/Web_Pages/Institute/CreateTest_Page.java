package pages.Web_Pages.Institute;

import abstracts.WebLocators.InstituteLocators;

import config.Web_Common;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import abstracts.WebLocators.StudentLocators;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static abstracts.WebLocators.StudentLocators.*;

public class CreateTest_Page  extends InstituteLocators {
    public WebDriver driver;
    public CreateTest_Page (WebDriver driver) {
        this.driver = driver;
    }
    Web_Common webCommon = new Web_Common(driver);
    public void OpenCreateTestPage() throws InterruptedException, IOException, ParseException {
        webCommon.WaitForElementAndClick(driver, CreateTestButton);
        webCommon.log("Clicked On Create New Test Button");
        webCommon.waitUntilElementPresent(driver, TestCreationLabel);
        webCommon.log("Test Creation Page Opened");
    }

    public void Enter_Test_Name(){
        String TestName = "QaTest-"+ webCommon.GenerateRandomNumber(2);
        webCommon.WaitForElementAndType(driver, TestNameField, TestName);
        webCommon.log("entered Test Name as :- "+TestName);
    }

    public void Select_Course() throws IOException, ParseException {
        String CourseName = webCommon.read_json("Course");
        webCommon.WaitForElementAndClick(driver, SelectCourseDropdown);
        webCommon.log("Clicked On Select Course Dropdown");
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+CourseName+"')]");
        webCommon.log("Selected course as :- "+CourseName);
    }

    public void Select_Batch() throws IOException, ParseException, InterruptedException {
        String BatchName = webCommon.read_json("Batch");
        webCommon.WaitForElementAndClick(driver, SelectBatchDropdown);
        webCommon.log("Clicked On Select Batch Dropdown");
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+BatchName+"')]");
        webCommon.moveToElementAndClick(driver, "//mat-select[@formcontrolname='groupIDs']//div//div[2]");
        webCommon.log("Selected "+ BatchName +" Batch");
    }
    public void Select_Test_Template() throws IOException, ParseException {
        String TemplateName = webCommon.read_json("Template");
        webCommon.WaitForElementAndClick(driver, TestTemplateDropdown);
        webCommon.log("Clicked On Select Test Template Dropdown");
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+TemplateName+"')]");
        webCommon.log("Selected Test Template :- "+TemplateName);
    }
    public void Choose_Difficulty_Level_As_Basic(){
        webCommon.WaitForElementAndClick(driver, BasicDifficultyLevelCheck);
        webCommon.log("Selected Difficulty Level as Basic");
    }
    public void Choose_Difficulty_Level_As_Intermediate(){
        webCommon.WaitForElementAndClick(driver, IntermediateDifficultyLevelCheck);
        webCommon.log("Selected Difficulty Level as Intermediate");
    }
    public void Choose_Difficulty_Level_As_Difficult(){
        webCommon.WaitForElementAndClick(driver, DifficultLevelCheck);
        webCommon.log("Selected Difficulty Level as Difficult");
    }
    public void Choose_Difficulty_Level_As_Very_Difficult(){
        webCommon.WaitForElementAndClick(driver, VeryDifficultLevelCheck);
        webCommon.log("Selected Difficulty Level as Very Difficult");
    }


    public void Choose_Random_Difficulty_Level(){
        int rand = webCommon.Select_random_Number();

        if(rand==1)
        {
            webCommon.WaitForElementAndClick(driver, BasicDifficultyLevelCheck);
            webCommon.log("Selected Difficulty Level as Basic");
        }

        else if(rand==2)
        {
            webCommon.WaitForElementAndClick(driver, IntermediateDifficultyLevelCheck);
            webCommon.log("Selected Difficulty Level as Intermediate");
        }

        else if(rand==3)
        {
            webCommon.WaitForElementAndClick(driver, DifficultLevelCheck);
            webCommon.log("Selected Difficulty Level as Difficult");
        }

        else if(rand==4)
        {
            webCommon.WaitForElementAndClick(driver, VeryDifficultLevelCheck);
            webCommon.log("Selected Difficulty Level as Very Difficult");
        }
    }

    public void Select_Al_Difficulty_Level(){
        webCommon.WaitForElementAndClick(driver, BasicDifficultyLevelCheck);
        webCommon.WaitForElementAndClick(driver, IntermediateDifficultyLevelCheck);
        webCommon.WaitForElementAndClick(driver, DifficultLevelCheck);
        webCommon.WaitForElementAndClick(driver, VeryDifficultLevelCheck);
        webCommon.log("Selected All Levels Of Difficulty");
    }

    public void Choose_Custom_Test_Syllabus(){
        webCommon.WaitForElementAndClick(driver, CustomSyllabusRadioButton);
        webCommon.log("Selected Test Syllabus as Custom");
    }
    public void Choose_Full_Test_Syllabus(){
        webCommon.WaitForElementAndClick(driver, FullSyllabusRadioButton);
        webCommon.log("Selected Test Syllabus as Full");
    }
    public void Click_On_Next_Button(){
        webCommon.WaitForElementAndClick(driver, NextButtonTestCreation);
        webCommon.log("Clicked On Next Button");
    }
    public void Select_All_Chapters(){
        webCommon.WaitForElementAndClick(driver, SelectAllButton);
        webCommon.log("Clicked On Select All Button");
    }

    public void Click_View_Questions_Button(){
        webCommon.WaitForElementAndClick(driver, ViewQuestionsButton);
        webCommon.log("Clicked On View Question Button");
    }

    public void Select_Random_Presets(){
        int rand = webCommon.Select_random_Number();
        webCommon.WaitForElementAndClick(driver, "//mat-chip["+rand+"]");
        webCommon.log("Selected Random Preset");
    }

    public void Select_Random_Paper(){
        int rand = webCommon.Select_random_Number();
        webCommon.WaitForElementAndClick(driver, "(//div[@class=\"mat-radio-container\"])["+rand+"]");
        webCommon.log("Selected Random Paper");
    }

    public void Select_All_Questions_And_View_Test_Summary() throws InterruptedException {
        for (int i = 1; i <= 6; i++)
        {
            if(webCommon.waitUntilElementPresent(driver, SelectAllButton) && webCommon.waitUntilElementPresent(driver, ViewQuestionsButton)) {
                webCommon.WaitForElementAndClick(driver, SelectAllButton);
                webCommon.log("Selected All Chapters");
                webCommon.WaitForElementAndClick(driver, ViewQuestionsButton);
                webCommon.log("Clicked On View Questions Button");
                webCommon.WaitForElementAndClick(driver, SaveAndNextButton);
                webCommon.log("Clicked On Save And Next Button");
                Thread.sleep(10000);
                continue;
            }
            else if (webCommon.isDisplayed(driver, SummaryPageLabel)) {
                break;
            }
        }
    }

    public void Save_And_Next_For_Full_Syllabus_Test() throws InterruptedException {
        for (int i = 1; i <= 6; i++)
        {
            if(webCommon.waitUntilElementPresent(driver, SaveAndNextButton) && webCommon.waitUntilElementPresent(driver, SaveAndCloseButton) )
            {
                new FluentWait(driver).withTimeout(Duration.ofSeconds(80L)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LoaderSpinner)));
                Thread.sleep(5000);
                webCommon.WaitForElementToBeClickableAndClick(driver, SaveAndNextButton);
                webCommon.log("Clicked On Save And Next Button");
                new FluentWait(driver).withTimeout(Duration.ofSeconds(80L)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LoaderSpinner)));
            }
            else if (webCommon.isDisplayed(driver, SummaryPageLabel)) {
                break;
            }
        }
    }

    public void Shuffle_Questions(){
        webCommon.WaitForElementAndClick(driver, ShuffleQuestionsToggle);
//        common.waitUntilElementPresent(driver, ShuffleQuestionsToggle);
        driver.findElement(By.xpath(ShuffleQuestionsToggle)).click();
        webCommon.log("Clicked On Shuffle Questions for students toggle");
    }
    public void Click_Publish_Button(){
        webCommon.WaitForElementAndClick(driver, PublishTestButton);
        webCommon.log("Clicked On Publish Button");
    }
    public void Schedule_Timing_For_Test() throws InterruptedException {
        Thread.sleep(2000);
        webCommon.WaitForElementAndClick(driver, ExamStart_Calendar_Icon);
        webCommon.log("Clicked On Calender Icon Of Exam Start Date");
        Thread.sleep(2000);
        webCommon.WaitForElementAndClick(driver, Increase_Hour_UpArrow);
        webCommon.WaitForElementAndClick(driver, Increase_Hour_UpArrow);
        webCommon.log("Increased time from current Hour to 2 hours up for the test");
        if(webCommon.isDisplayed(driver,Calendar_Done_Button_Disabled)==true){
            webCommon.WaitForElementAndClick(driver, Meridian_select_Button);
            Thread.sleep(2000);
            webCommon.WaitForElementAndClick(driver, Calendar_Done_Button);
            webCommon.log("Clicked On Calender Done icon");
            Thread.sleep(2000);
        }
        else{
            webCommon.WaitForElementAndClick(driver, Calendar_Done_Button);
            webCommon.log("Clicked On Calender Done icon");
            Thread.sleep(2000);
        }
//        webCommon.WaitForElementAndClick(driver, Meridian_select_Button);
//        Thread.sleep(2000);
//        webCommon.WaitForElementAndClick(driver, Calendar_Done_Button);
//        webCommon.log("Clicked On Calender Done icon");
//        Thread.sleep(2000);
        webCommon.WaitForElementAndClick(driver, Calculate_result_Immediately_Radio_Button);
        webCommon.log("Clicked On Calculate Test Result Immediately");
        webCommon.WaitForElementAndClick(driver, Time_Scheduling_Save_Button);
        webCommon.log("Clicked On Save Button On Time Scheduling Popup");
    }
    public void Verify_Test_Created(){
        webCommon.isDisplayed(driver,AlertMessage);
        webCommon.log("Alert is Displayed");
    }


    public void Enter_Details_And_Select_Source_As_Brainflex_Question_Bank() throws IOException, ParseException, AWTException, InterruptedException {
        Enter_Test_Name();
        Select_Course();
        Select_Batch();
        webCommon.WaitForElementAndClick(driver, SelectSourceDropdown);
        String Source = webCommon.read_json("BrainflexSource");
        webCommon.log("Clicked On Select Source Dropdown");
        Thread.sleep(3000);
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+Source+"')]");
        webCommon.log("Selected Source As :- " + Source );

    }

    public void Enter_Details_And_Select_Source_As_Previous_Year_Or_Preset_Paper() throws IOException, ParseException, AWTException, InterruptedException {
        Enter_Test_Name();
        Select_Course();
        Select_Batch();
        webCommon.WaitForElementAndClick(driver, SelectSourceDropdown);
        String Source = webCommon.read_json("PreviousOrPresetPaperSource");
        webCommon.log("Clicked On Select Source Dropdown");
        Thread.sleep(3000);
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+Source+"')]");
        webCommon.log("Selected Source As :- " + Source );
    }

    public void Enter_Details_And_Select_Source_As_Brainflex_Plus_Sample_Institute_Question_Bank() throws IOException, ParseException, AWTException, InterruptedException {
        Enter_Test_Name();
        Select_Course();
        Select_Batch();
        webCommon.WaitForElementAndClick(driver, SelectSourceDropdown);
        String Source = webCommon.read_json("BrainflexAndSampleSource");
        webCommon.log("Clicked On Select Source Dropdown");
        Thread.sleep(3000);
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+Source+"')]");
        webCommon.log("Selected Source As :- " + Source );
    }

    public void Save_Presets_Paper_Questions_And_View_Summary(){
        for (int i = 1; i <= 6; i++)
        {
            if(webCommon.waitUntilElementPresent(driver, SaveAndNextButton)) {
                webCommon.WaitForElementAndClick(driver, SaveAndNextButton);
                webCommon.log("Clicked On Save And Next Button");
                continue;
            }
            else if (webCommon.isDisplayed(driver, SummaryPageLabel)) {
                break;
            }
        }

    }

    public void Enter_Details_And_Select_Source_As_Add_Manually_For_One_Subject() throws IOException, ParseException, AWTException, InterruptedException {
        Enter_Test_Name();
        Select_Course();
        Select_Batch();
        webCommon.WaitForElementAndClick(driver, SelectSourceDropdown);
        String Source = webCommon.read_json("AddQuestionsManuallySource");
        webCommon.log("Clicked On Select Source Dropdown");
        Thread.sleep(3000);
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+Source+"')]");
        webCommon.log("Selected Source As :- " + Source );
        webCommon.WaitForElementAndClick(driver, "//mat-select[@formcontrolname=\"testSubjectIDs\"]");
        webCommon.WaitForElementAndClick(driver, "//mat-option[2]");
        webCommon.WaitForElementAndClick(driver, "//mat-option[3]");
        Thread.sleep(1000);
        webCommon.Hit_Keyboard_Key(driver, 27);
        webCommon.log("Clicked On Escape Key to hide dropdown");
    }
    public void Select_Random_Chapter(){
        int rand = webCommon.Select_random_Number();
        webCommon.WaitForElementAndClick(driver, SelectChapterDropdown);
        webCommon.WaitForElementAndClick(driver, "//mat-chip["+rand+"]");
        webCommon.log("Selected Random Preset");
    }


    public void Enter_Details_And_Select_Source_As_Sample_Institute_Question_Bank() throws IOException, ParseException, AWTException, InterruptedException {
        Enter_Test_Name();
        Select_Course();
        Select_Batch();
        webCommon.WaitForElementAndClick(driver, SelectSourceDropdown);
        String Source = webCommon.read_json("SampleInstituteSource");
        webCommon.log("Clicked On Select Source Dropdown");
        Thread.sleep(3000);
        webCommon.WaitForElementAndClick(driver, "//mat-option//span[@class=\"mat-option-text\"][contains(text(),'"+Source+"')]");
        webCommon.log("Selected Source As :- " + Source );
        Select_Test_Template();
        Choose_Difficulty_Level_As_Basic();
        Choose_Full_Test_Syllabus();
        Click_On_Next_Button();
    }

    public String Get_Test_Name(){
        webCommon.waitUntilElementPresent(driver, Created_Test_Name);
        String Text = webCommon.getLocatorText(driver, Created_Test_Name);
        webCommon.log("Test Created - " + Text);
        return Text;
    }

    public void Delete_Created_Test(){
        webCommon.WaitForElementAndClick(driver, OptionMenuDotsForCreatedTest);
        webCommon.log("Clicked ON Options Menu in Test List ");
        webCommon.WaitForElementAndClick(driver, DeleteOptionMenu);
        webCommon.log("Clicked ON Delete");
        webCommon.WaitForElementAndClick(driver, YesButtonDeleteDialog);
        webCommon.log("Clicked ON Yes Button Of Delete Popup");
    }

    public void Verify_Test_Displays_In_Student(String TestName) throws IOException, ParseException {
        webCommon.log("Verifying Test On Student Dashboard");
        URL url = new URL("https://student.brainflex360.com/student/login");
        driver.navigate().to(url);
        webCommon.log("Launched Student URL");
        String Stu_Mob = webCommon.read_json("StudentNumber");
        String Stu_Pass = webCommon.read_json("StudentNumber");
        webCommon.WaitForElementAndType(driver, StudentLocators.MobileNumberField, Stu_Mob);
        webCommon.log("Entered Student Mobile Number");
//        webCommon.WaitForElementAndClick(driver, LoginViaPassword);
//        webCommon.log("Clicked On Login Via Password");
//        webCommon.WaitForElementAndType(driver, StudentLocators.LoginPasswordField, Stu_Pass);
//        webCommon.log("Entered Student Password");
//        webCommon.WaitForElementAndClick(driver, StudentLocators.LoginButton);
        webCommon.waitUntilElementPresent(driver, TestName);
        webCommon.log("Test is Displayed On Student Dashboard");
    }

}