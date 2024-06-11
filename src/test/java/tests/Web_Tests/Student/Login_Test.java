package tests.Web_Tests.Student;

import config.Initialization;
import config.JiraCreateIssue;
import org.testng.annotations.Test;

public class Login_Test extends Initialization {

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Verify_BrainFlex_Tutor_Login() throws Exception {
        stu_login.Login_with_Cheat_Code();
    }

}