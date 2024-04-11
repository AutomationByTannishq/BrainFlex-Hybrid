package tests.Web_Tests.Admin;

import config.Initialization;
import config.JiraCreateIssue;
import org.testng.annotations.Test;

public class Login_Test extends Initialization {

    //@JiraCreateIssue(isCreateIssue=true)
    @Test
    public void Verify_Admin_Login() throws Exception {
        admin_login.Login_with_Valid_Admin_Credentials();
    }


}