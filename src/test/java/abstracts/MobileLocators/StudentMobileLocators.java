package abstracts.MobileLocators;

public class StudentMobileLocators {

    public static String Join_Now_Button = "com.brainflex360.lms:id/btnTopJoinNow";
    public static String MobileNumberField = "com.brainflex360.lms:id/textinput_placeholder";
    public static String PasswordField = "com.brainflex360.lms:id/edtPassword";
    public static String LoginPasswordField = "//input[@id='password']";
    public static String LoginButton = "//button[@type=\"submit\"]";
    public static String Dashboard_Heading = "//div[@class=\"dashborad-label heading-label ng-star-inserted\"]";
    public static String Next_Button_Login_Page = "//button[starts-with(@class,\"btn next-button\")]";
    public static String CreateTestButton = "//div[@class=\"btn-section\"]";

    public static String TestCreationLabel = "//label[@class=\"main-label\"][text()='Test Creation ']";
    public static String TestNameField = "//input[@formcontrolname=\"testName\"]";
    public static String SelectCourseDropdown = "//mat-select[@formcontrolname=\"courseID\"]";
    public static String SelectBatchDropdown = "//mat-select[@formcontrolname=\"groupIDs\"]";
    public static String SelectFirstBatch = "(//mat-option)[1]";
    public static String SelectSourceDropdown = "//mat-select[@formcontrolname=\"source\"]";
    public static String SelectBrainflexQuestionBank = "(//mat-option//span[@class=\"mat-option-text\"])[1] | //mat-option//span[@class=\"mat-option-text\"][contains(text(),'BrainFlex Question')]";
    public static String TestTemplateDropdown = "//mat-select[@formcontrolname=\"testTemplateID\"]";
    public static String SelectTestTemplate = "(//mat-option//span[@class=\"mat-option-text\"])[4]";
    public static String BasicDifficultyLevelCheck = "//h4[text()=\"Basic\"]";
    public static String IntermediateDifficultyLevelCheck = "//h4[text()=\"Intermediate\"]";
    public static String DifficultLevelCheck = "//h4[text()=\"Difficult\"]";
    public static String VeryDifficultLevelCheck = "//h4[text()=\"Very Difficult\"]";
    public static String TestSubjectsDropdown = "//mat-select[@formcontrolname=\"testSubjectIDs\"]";
    public static String CustomSyllabusRadioButton = "(//div[@class=\"mat-radio-container\"])[1]";
    public static String FullSyllabusRadioButton = "(//div[@class=\"mat-radio-container\"])[2]";
    public static String NextButtonTestCreation = "//button[@class=\"view_que_button\"]";


    // Select Chapters Pages
    public static String SelectAllButton = "//a[@title='Select All']";
    public static String ViewQuestionsButton = "//button[@class='view_que_button']";
    public static String SaveAndNextButton = "//button[normalize-space()='Save & Next']";

    // Summary Page
    public static String SummaryPageLabel = "//label[text()='Summary']";
    public static String ShuffleQuestionsToggle = "//span[text()='Shuffle']//..//div[@class='mat-slide-toggle-bar']";
    public static String PublishTestButton = "//button[starts-with(@class,'publish')]";
    public static String ExamStart_Calendar_Icon = "//div[@class='row'][1]//mat-datepicker-toggle";
    public static String Increase_Hour_UpArrow = "(//button[@aria-label='expand_less icon']//span//mat-icon)[1]";
    public static String ExamEnd_Calendar_Icon = "(//div[@class='row'][2]//mat-datepicker-toggle)[1]";
    public static String Meridian_select_Button = "//span[normalize-space()='PM'] | //span[normalize-space()='AM']";
    public static String Calendar_Done_Button = "//mat-icon[text()='done']";
    public static String Calculate_result_Immediately_Radio_Button = "(//div[@class=\"mat-radio-container\"])[1]";
    public static String Time_Scheduling_Save_Button = "(//button[starts-with(@class,'save-btn')])[2]";
    public static String Created_Test_Name = "(//td[@class=\"testName_min_width\"])[1]//span";
    public static String AddNewQuestionFisrt = "(//a[@href=\"javascript:void(0)\"]//span)[1]";
    public static String SelectChapterDropdown = "//mat-select[@name=\"lessonID\"]";
    public static String SelectConceptDropdown = "//mat-select[@name=\"topicID\"]";
    public static String SelectComplexityLevel = "//mat-select[@name=\"complexityLevelTerm\"]";
    public static String QuestionFrame = "//iframe[contains(@title,'editor_QuestionTitle')]";

    // Manage Test Locators

    public static String OptionMenuDotsForCreatedTest = "(//span//..//..//mat-icon)[1]";
    public static String DeleteOptionMenu = "(//button[@class=\"mat-menu-item ng-star-inserted\"])[3]";
    public static String YesButtonDeleteDialog = "(//div[@role='dialog'])//button[text()=\"Yes\"]";
    public static String NoButtonDeleteDialog = "(//div[@role='dialog'])//button[text()=\"No\"]";

}
