package tests.Web_Tests.Institute;

import config.Initialization;
import config.JiraCreateIssue;
import org.testng.annotations.Test;

public class Login_Test extends Initialization {

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Verify_BrainFlex_Tutor_Login() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
    }

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Verify_BrainFlex_Tutor_Login_With_Invalid_MailID() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
    }

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Verify_BrainFlex_Tutor_Login_With_Invalid_Password() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
    }

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Verify_BrainFlex_Tutor_Login_With_Invalid_Mail_And_Password() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
    }


}