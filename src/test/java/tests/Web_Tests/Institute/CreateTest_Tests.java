package tests.Web_Tests.Institute;

import config.Initialization;
import config.JiraCreateIssue;
import org.testng.annotations.Test;

public class CreateTest_Tests extends Initialization {

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Verify_Test_Is_Created_With_BrainFlex_Question_Bank_And_Displayed_On_Student_Dashboard() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        createTest.OpenCreateTestPage();
        createTest.Enter_Details_And_Select_Source_As_Brainflex_Question_Bank();
        createTest.Select_Test_Template();
        createTest.Choose_Difficulty_Level_As_Difficult();
        createTest.Choose_Full_Test_Syllabus();
        createTest.Click_On_Next_Button();
        createTest.Save_And_Next_For_Full_Syllabus_Test();
        createTest.Shuffle_Questions();
        createTest.Click_Publish_Button();
        createTest.Schedule_Timing_For_Test();
        createTest.Verify_Test_Created();
        String TestName = createTest.Get_Test_Name();
        createTest.Verify_Test_Displays_In_Student(TestName);
    }

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Create_Test_With_Sample_Institute_Question_Bank() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        createTest.OpenCreateTestPage();
        createTest.Enter_Details_And_Select_Source_As_Sample_Institute_Question_Bank();
        createTest.Select_All_Questions_And_View_Test_Summary();
        createTest.Shuffle_Questions();
        createTest.Click_Publish_Button();
        createTest.Schedule_Timing_For_Test();
        createTest.Verify_Test_Created();
        String TestName = createTest.Get_Test_Name();
        createTest.Verify_Test_Displays_In_Student(TestName);
    }

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Create_Test_With_Previous_Year_Or_Preset_Paper() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        createTest.OpenCreateTestPage();
        createTest.Enter_Details_And_Select_Source_As_Previous_Year_Or_Preset_Paper();
        createTest.Select_Random_Presets();
        createTest.Select_Random_Paper();
        createTest.Click_On_Next_Button();
        createTest.Save_Presets_Paper_Questions_And_View_Summary();
        createTest.Shuffle_Questions();
        createTest.Click_Publish_Button();
        createTest.Schedule_Timing_For_Test();
        createTest.Verify_Test_Created();
        String TestName = createTest.Get_Test_Name();
        createTest.Verify_Test_Displays_In_Student(TestName);
    }
//
    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Create_Test_With_Brainflex_Plus_Sample_Institute_Question_Bank() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        createTest.OpenCreateTestPage();
        createTest.Enter_Details_And_Select_Source_As_Brainflex_Plus_Sample_Institute_Question_Bank();
        createTest.Select_Test_Template();
        createTest.Select_Al_Difficulty_Level();
        createTest.Choose_Full_Test_Syllabus();
        createTest.Click_On_Next_Button();
        createTest.Save_And_Next_For_Full_Syllabus_Test();
        createTest.Shuffle_Questions();
        createTest.Click_Publish_Button();
        createTest.Schedule_Timing_For_Test();
        createTest.Verify_Test_Created();
        String TestName = createTest.Get_Test_Name();
        createTest.Verify_Test_Displays_In_Student(TestName);
    }

    //@JiraCreateIssue(isCreateIssue=true)
@Test
    public void Delete_Created_Test() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        createTest.OpenCreateTestPage();
        createTest.Enter_Details_And_Select_Source_As_Brainflex_Question_Bank();
        createTest.Select_Test_Template();
        createTest.Choose_Difficulty_Level_As_Difficult();
        createTest.Choose_Full_Test_Syllabus();
        createTest.Click_On_Next_Button();
        createTest.Save_And_Next_For_Full_Syllabus_Test();
        createTest.Shuffle_Questions();
        createTest.Click_Publish_Button();
        createTest.Schedule_Timing_For_Test();
        createTest.Verify_Test_Created();
        createTest.Get_Test_Name();
        createTest.Delete_Created_Test();
    }


//    //@JiraCreateIssue(isCreateIssue=true)
//    @Test
//    public void Create_Test_By_Adding_Questions_Manually() throws Exception {
//        login.Login_with_Valid_Credentials();
//        createTest.OpenCreateTestPage();
//        createTest.Enter_Details_And_Select_Source_As_Add_Manually_For_One_Subject();
//        createTest.Select_Test_Template();
//        createTest.Choose_Difficulty_Level_As_Difficult();
//        createTest.Click_On_Next_Button();
//    }

}