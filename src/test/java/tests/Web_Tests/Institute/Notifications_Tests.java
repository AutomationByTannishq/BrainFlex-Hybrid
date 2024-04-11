package tests.Web_Tests.Institute;

import config.Initialization;
import org.testng.annotations.Test;

public class Notifications_Tests extends Initialization {


    @Test
    public void Create_New_Notification_To_send_Test_Report_On_Mail() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Test_Report_On_Mail();
    }

    @Test
    public void Create_New_Notification_To_send_Progress_Report_On_Mail() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Progress_Report_On_Mail();
    }
    @Test
    public void Create_New_Notification_To_send_Absent_Mail() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Absent_Mail();
    }

    @Test
    public void Create_New_Notification_To_send_Custom_Mail() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Custom_Mail();
    }

    @Test
    public void Create_New_Notification_To_send_Test_Report_On_WhatsApp() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Test_Report_On_WhatsApp();
    }

    @Test
    public void Create_New_Notification_To_send_Progress_Report_On_WhatsApp() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Progress_Report_On_WhatsApp();
    }

    @Test
    public void Create_New_Notification_To_send_Absent_Notification_On_WhatsApp() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Absent_Notification_On_WhatsApp();
    }

    @Test
    public void Create_New_Notification_To_send_Custom_Text_On_WhatsApp() throws Exception {
        login.Login_with_Valid_Institute_Credentials();
        notificationsPage.Go_To_Notifications_Page();
        notificationsPage.Create_New_Notification_To_send_Custom_Text_On_WhatsApp();
    }


}