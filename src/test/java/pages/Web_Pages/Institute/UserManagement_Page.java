package pages.Web_Pages.Institute;

import abstracts.WebLocators.InstituteLocators;
import config.Web_Common;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class UserManagement_Page extends InstituteLocators {
    public WebDriver driver;
    public UserManagement_Page(WebDriver driver) {
        this.driver = driver;
    }
    Web_Common webCommon = new Web_Common(driver);

    public void Go_To_User_Management_Page(){
        webCommon.WaitForElementAndClick(driver, SideBarBurgerButton);
        webCommon.log("Clicked On Burger Menu Button On Dashboard");
        webCommon.WaitForElementAndClick(driver, UserManagementMenu);
        webCommon.log("Clicked On User Management in the Menu");
    }
    public String Add_New_Student() {
        webCommon.WaitForElementAndClick(driver,AddStudentButton);
        webCommon.log("Clicked On Add Student Button");
        webCommon.waitUntilElementPresent(driver, AddStudentPageLabel);
        webCommon.log("Add New Student Page Opened");
        webCommon.WaitForElementAndClick(driver,FullNameField);
        String Name = "New Test Student "+webCommon.GenerateRandomNumber(2);
        webCommon.WaitForElementAndType(driver, FullNameField,Name);
        String NewStudentName = webCommon.getLocatorText(driver,FullNameField);
        webCommon.WaitForElementAndType(driver, RollNumberField,""+webCommon.GenerateRandomNumber(5));
        webCommon.WaitForElementAndType(driver, EmailField,"NewTestStudent"+webCommon.GenerateRandomNumber(2)+"@mailinator.com");
        webCommon.WaitForElementAndClick(driver,StudentMobileNumberField);
        webCommon.WaitForElementAndType(driver, StudentMobileNumberField,""+webCommon.GenerateRandomPhoneNumber());
        webCommon.WaitForElementAndClick(driver, NewStudentChooseCourseDropdown);
        webCommon.WaitForElementAndClick(driver, NewStudentJEECourse);
        webCommon.log("Selected JEE as Course");
        webCommon.WaitForElementAndClick(driver, NewStudentSelectGroupDropdown);
        webCommon.WaitForElementAndClick(driver, NewStudentQATestBatch);
        webCommon.log("Selected QA Test as Batch");
        webCommon.WaitForElementAndClick(driver, SaveAndCloseButton);
        webCommon.log("Clicked On Save and Close Button");
        if(webCommon.waitUntilElementPresent(driver, Alert)==true) {
            webCommon.log("New User Created with Name :- " + Name);
        }
        return Name;
    }

    public void Remove_Student(String Name) throws InterruptedException {
        webCommon.WaitForElementAndType(driver, SearchBar, Name);
        webCommon.log("Searched User");
        Thread.sleep(3000);
        webCommon.WaitForElementAndClick(driver, UserOptionsDots);
        webCommon.log("Clicked On User Options 3 dots icon Button");
        webCommon.WaitForElementAndClick(driver, RemoveButton);
        webCommon.log("Clicked On Remove Button");
        webCommon.WaitForElementAndClick(driver, YesButton_RemoveDialogBox);
        webCommon.log("Clicked On Yes Button");
        webCommon.waitUntilElementPresent(driver, Alert);
    }

    public void Edit_Student_Details_And_Verify(String Name){
        webCommon.WaitForElementAndType(driver, SearchBar, Name);
        webCommon.log("Searched User");
        webCommon.WaitForElementAndClick(driver, UserOptionsDots);
        webCommon.log("Clicked On User Options 3 dots icon Button");
        webCommon.WaitForElementAndClick(driver, EditStudentButton);
        webCommon.log("Clicked On Edit Button");
        webCommon.waitUntilElementPresent(driver, EditStudentHeader);
        webCommon.log("Navigated to Edit Screen");
        webCommon.WaitForElementAndType(driver, RollNumberField,"NewRollNumber"+webCommon.GenerateRandomNumber(2));
        webCommon.log("Roll Number Edited");
        String NewRollNum = webCommon.getLocatorText(driver, RollNumberField);
        webCommon.WaitForElementAndClick(driver, SaveAndCloseButton);
        webCommon.log("Clicked On Save and Close Button");
        webCommon.waitUntilElementPresent(driver, Alert);
        webCommon.log("User Edited");
        webCommon.WaitForElementAndType(driver, SearchBar, Name);
        webCommon.log("Searched User");
        webCommon.WaitForElementAndClick(driver, UserOptionsDots);
        webCommon.log("Clicked On User Options 3 dots icon Button");
        webCommon.WaitForElementAndClick(driver, EditStudentButton);
        webCommon.log("Clicked On Edit Button");
        webCommon.waitUntilElementPresent(driver, EditStudentHeader);
        webCommon.log("Navigated to Edit Screen");
        String VerifyNewRollNum = webCommon.getLocatorText(driver, RollNumberField);

        if(NewRollNum.equalsIgnoreCase(VerifyNewRollNum))
        {
          webCommon.log("Edited Details Verified");
        }
        else{
            webCommon.log("Student details not edited");
        }
    }

}
