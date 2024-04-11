package tests.Mobile_Tests;

import config.Initialization;
import config.JiraCreateIssue;
import org.testng.annotations.Test;

public class Mob_Login_Test extends Initialization {
    //@JiraCreateIssue(isCreateIssue=true)
@Test
    public void Verify_BrainFlex_Tutor_Login() throws Exception {
        login_scr.Login_with_Valid_Credentials_In_Mobile();
    }

}