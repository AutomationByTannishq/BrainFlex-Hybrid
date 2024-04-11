package abstracts.WebLocators;

public class InstituteLocators {

    //Global_Locators
    public static String Alert = "//div[@id='toast-container']";
    public static String AlertMessage = "//div[@class='toast-message ng-star-inserted']";
    public static String LoaderSpinner = "//mat-spinner[@role='progressbar']";


    // Login Page Locators
    public static String LoginEmailField = "//input[@id='userName']";
    public static String LoginPasswordField = "//input[@id='password']";
    public static String LoginButton = "//button[@type=\"submit\"]";
    public static String Dashboard_Heading = "//div[@class=\"dashborad-label heading-label ng-star-inserted\"]";
    public static String Next_Button_Login_Page = "//button[starts-with(@class,\"btn next-button\")]";
    public static String CreateTestButton = "//div[@class=\"btn-section\"]";

    // Test Creation Page Locators
    public static String TestCreationLabel = "//label[text()='Test Creation ']";
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
    public static String Calendar_Done_Button_Disabled = "//mat-icon[text()='done']//..//..//..//button[contains(@disabled,'true')]";

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


    //Add Student

    public static String SideBarBurgerButton = "//div[@class='show-hamburger kt-header-mobile__toolbar']";
    public static String UserManagementMenu = "//a[@href='/institute/user-master/user']";
    public static String AddStudentButton = "//span[@class='new-user-add']";
    public static String AddStudentPageLabel = "//label[normalize-space()='Add New Student']";
    public static String FullNameField = "//input[@name='studentName']";
    public static String RollNumberField = "//input[@name='currentRollNo']";
    public static String EmailField = "//input[@name='email']";
    public static String StudentMobileNumberField = "//input[@formcontrolname='mobileNo']";
    public static String ParentNameField = "//input[@name='parentName']";
    public static String ParentEmailField = "//input[@name='parentEmail']";
    public static String ParentMobileNumberField = "//input[@formcontrolname='parentMobileNo']";
    public static String NewStudentChooseCourseDropdown = "//mat-select[@formcontrolname=\"courseID\"]";
    public static String NewStudentJEECourse = "//span[@class='mat-option-text'][normalize-space()='JEE Advanced']";
    public static String NewStudentSelectGroupDropdown = "//mat-select[@formcontrolname=\"groupID\"]";
    public static String NewStudentQATestBatch = "//span[@class='mat-option-text'][normalize-space()='0QA-Test']";
    public static String SaveAndCloseButton = "//button[normalize-space()='Save & Close']";
    public static String SearchBar = "//input";
    public static String UserOptionsDots = "//div//tbody//tr[1]//td//a//mat-icon";
    public static String RemoveButton = "//button//span[contains(.,'Remove')]";
    public static String YesButton_RemoveDialogBox = "//button[normalize-space()='Yes']";
    public static String EditStudentButton = "//div[@class=\"mat-menu-content\"]//button[2]";
    public static String EditStudentHeader = "//div[@class='width-100 text-center usr_heading']//label[@class='main-label'][normalize-space()='Edit Student']";
    public static String SaveButtonEditPage = "//button[normalize-space()='Save']";

    //Notifications Tab

    public static String BurgerMenuDashboard = "//button[@id=\"kt_aside_mobile_toggler\"]";
    public static String NotificationsTabMenu = "//span[text()=\"Notifications\"]//..//..//a";
    public static String CreateNewNotificationButton = "//span[text()='Create New Notification']";
    public static String SelectBatchesDropdown = "//mat-select[@formcontrolname='groupIDs']";
    public static String QA_Test_Batch = "//mat-option[1]";
    public static String SendViaDropdown = "//mat-select[@formcontrolname=\"notificationMedium\"]";
    public static String SendVia_WhatsApp = "//mat-option[@value=\"WHATSAPP\"]";
    public static String NotificationTypeDropdown = "//mat-select[@formcontrolname=\"notificationType\"]";
    public static String ProgressReportOption = "//mat-option[@value=\"PROGRESS\"]";
    public static String AbsentEmailOption = "//mat-option[@value=\"ABSENT\"]";
    public static String CustomEmailOption = "//mat-option[@value=\"EMAIL\"]";
    public static String SubjectFieldEmail = "//input[@formcontrolname=\"subject\"]";
    public static String ContextFrame = "//iframe[@title='Rich Text Editor, editor_Email']";
    public static String ContextTextArea = "//div[@id='cke_editor_Email']";
    public static String CustomTextOption = "//mat-option[@value=\"WHATSAPP\"]";
    public static String TextAreaCustomText = "//textarea";
    public static String TestNameDropdown = "//mat-select[@formcontrolname=\"testIDs\"]";
    public static String FirstTestOption = "//mat-option[1]";
    public static String SendToDropdown = "//mat-select[@formcontrolname=\"sendTo\"]";
    public static String SendToStudentOption = "//mat-option[@value=\"STUDENT\"]";
    public static String SendToParentOption = "//mat-option[@value=\"PARENT\"]";
    public static String SendToBothOption = "//mat-option[@value=\"BOTH\"]";
    public static String SaveNotificationButton = "//button[contains(@class,\"save-btn\")]";
    public static String CancelNotificationButton = "//button[contains(@class,\"close-btn\")]";










}