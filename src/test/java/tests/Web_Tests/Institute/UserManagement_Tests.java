package tests.Web_Tests.Institute;

import config.Initialization;
import config.JiraCreateIssue;
import org.testng.annotations.Test;

public class UserManagement_Tests extends Initialization {

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Add_New_Student() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        usrMgmt.Go_To_User_Management_Page();
        usrMgmt.Add_New_Student();
    }

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Add_And_Delete_New_Created_Student() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        usrMgmt.Go_To_User_Management_Page();
        String StuName = usrMgmt.Add_New_Student();
        usrMgmt.Remove_Student(StuName);
    }

}