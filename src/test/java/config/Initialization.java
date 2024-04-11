package config;
import org.testng.Reporter;
import pages.Mobile_Pages.Login_Screen;
import pages.Web_Pages.Admin.Admin_Login_Page;
import pages.Web_Pages.Admin.Content_Tab_Page;
import pages.Web_Pages.Institute.CreateTest_Page;
import pages.Web_Pages.Institute.Login_Page;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.Web_Pages.Institute.Notifications_Page;
import pages.Web_Pages.Institute.UserManagement_Page;
import pages.Web_Pages.Student.Stu_Login_Page;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import static java.lang.System.setProperty;

public class Initialization{
    protected WebDriver web_driver;
    protected AppiumDriver mob_driver;
    protected String targetEnvironment;
    protected String targetUrl;

    public Login_Page login;
    public Stu_Login_Page stu_login;
    public Admin_Login_Page admin_login;
    public Content_Tab_Page admin_content;
    public Login_Screen login_scr;
    public CreateTest_Page createTest;
    public Notifications_Page notificationsPage;
    public UserManagement_Page usrMgmt;
    public Web_Common web_com;
    public Mobile_Common mob_com;

    @BeforeTest(alwaysRun = true)
    public void fetchSuiteConfiguration(ITestContext testContext) {
        targetEnvironment = testContext.getCurrentXmlTest().getParameter("targetEnvironment");
        targetUrl = testContext.getCurrentXmlTest().getParameter("targetURL");
    }
    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method) throws Exception {
        URL url = new URL(targetUrl);
        if (targetEnvironment.equalsIgnoreCase("institute") || targetEnvironment.equalsIgnoreCase("admin") || targetEnvironment.equalsIgnoreCase("student"))
        {
            setProperty("webdriver.chrome.driver", "/Users/apple/Documents/BFX_2-11-2023/BFX-Hybrid/Driver/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--ignore-ssl-errors=yes");
            options.addArguments("--ignore-certificate-errors");
            web_driver = new ChromeDriver(options);
            web_driver.get(String.valueOf(url));
            web_driver.manage().window().maximize();
            web_com = new Web_Common(web_driver);
            login = new Login_Page(web_driver);
            createTest = new CreateTest_Page(web_driver);
            usrMgmt = new UserManagement_Page(web_driver);
            admin_login = new Admin_Login_Page(web_driver);
            admin_content = new Content_Tab_Page(web_driver);
            notificationsPage = new Notifications_Page(web_driver);
        }
        else if (targetEnvironment.equalsIgnoreCase("mobile"))
        {
            Properties config = readConfigFile("runConfig");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", config.getProperty("platformName"));
            capabilities.setCapability("platformVersion", config.getProperty("platformVersion"));
            capabilities.setCapability("deviceName", config.getProperty("deviceName"));
            capabilities.setCapability("app", config.getProperty("appPath"));
            capabilities.setCapability("fullReset",true);
            capabilities.setCapability("automationName", config.getProperty("automationName"));
            mob_driver = new AppiumDriver<MobileElement>(url, capabilities);
            mob_driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            mob_com = new Mobile_Common(mob_driver);
            login_scr = new Login_Screen(mob_driver);
        }
        else {
            throw new Exception("Undefined Environment");
        }
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) throws IOException, AWTException {
        String testName = testResult.getName();
        if (targetEnvironment.equalsIgnoreCase("institute") || targetEnvironment.equalsIgnoreCase("admin") || targetEnvironment.equalsIgnoreCase("student"))
        {
            if (testResult.getStatus()==1)
            {
                Reporter.log("PASS : " + testName + "<br>"+ "<br>");
//                web_com.log("PASS : " + testName + "<br>"+ "<br>");
		    }
		    else
            {
                web_com.log("Failed : " + testName + "<br>"+ "<br>");
			    web_com.makeScreenshot(web_driver,testName);
//			    Reporter.log("This test is failed at the above screen"+ "<br>"+ "<br>");
		    }
            web_driver.close();
            web_driver.quit();
        }
        else if (targetEnvironment.equalsIgnoreCase("mobile"))
        {
            if (testResult.getStatus()==1)
            {
//                Reporter.log("PASS : " + testResult.getName()+ "<br>"+ "<br>");
            }
            else
            {
                //web_com.makeScreenshot(web_driver,testName);
                Reporter.log("Failed : This test is failed at the above screen"+ "<br>"+ "<br>");
            }
            mob_driver.quit();
        }
    }
    public Properties readConfigFile(String configFile) {
        Properties prop = null;
        try (InputStream input = new FileInputStream(new File("src/test/java/resources/" + configFile + ".properties").getAbsolutePath())) {
            prop = new Properties();
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}