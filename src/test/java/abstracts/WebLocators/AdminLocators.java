package abstracts.WebLocators;

public class AdminLocators {

    //Global_Locators
    public static String Alert = "//div[@id='toast-container']";
    public static String AlertMessage = "//div[@class='toast-message ng-star-inserted']";
    public static String LoaderSpinner = "//mat-spinner[@role='progressbar']";


    // Login Page Locators
    public static String LoginEmailField = "//input[@type='email']";
    public static String LoginPasswordField = "//input[@type='password']";
    public static String LoginButton = "//button[@type='submit']";
    public static String Dashboard = "//a[@href='/dashboard']";
    public static String Next_Button_Login_Page = "//button[starts-with(@class,\"btn next-button\")]";
    public static String CreateTestButton = "//div[@class=\"btn-section\"]";
    public static String QuestionBankTab = "//a[@href='/question']";
    public static String Search_Questions_Field = "//input[@placeholder=\"Search for the question...\"]";

    public static String QuestionBankFileTab = "//a[@href='/question/question-file-list']";
    public static String QuestionCompareTab = "//a[@href='/question/question-compare']";
    public static String SubjectTab = "//a[@href='/subject']";
    public static String ChapterTab = "//a[@href='/lesson']";
    public static String ConceptTab = "//a[@href='/topic']";
    public static String TagsTab = "//a[@href='/tags']";
}