package config;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.Reporter;
import java.awt.*;
import java.io.*;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Web_Common {
	public WebDriver driver;
	public Web_Common(WebDriver driver) {
		this.driver = driver;
	}
	public void log(String msg) {
		Reporter.log("Step:- " +msg+ "<br>");
		System.out.println("Step:- " +msg);
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

	private String getParameter(String name) {
		String value = System.getProperty(name);
		if (value == null)
			throw new RuntimeException(name + " is not a parameter!");
		if (value.isEmpty())
			throw new RuntimeException(name + " is empty!");
		return value;
	}

	public String read_json(String Json_Key) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("src/test/java/Resources/User.json");
		Object obj = jsonParser.parse(reader);
		JSONArray usersList = (JSONArray) obj;
		JSONObject user = (JSONObject) usersList.get(0);
		String Name = (String)user.get(Json_Key);
		return Name;
	}
	public boolean waitUntilElementPresent(WebDriver driver, String locator){
		try{Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50L)).ignoring(NoSuchElementException.class);
	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		  return true;
		}catch(Exception e){
			return false;
		}
	}

	public boolean isDisplayed(WebDriver driver, String locator){
		try{
			driver.findElement(By.xpath(locator)).isDisplayed();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	public void WaitForElementAndType(WebDriver driver, String locator, String text) {
		waitUntilElementPresent(driver, locator);
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}
	public void WaitForElementAndClick(WebDriver driver, String locator) {
		waitUntilElementPresent(driver, locator);
		driver.findElement(By.xpath(locator)).click();
	}

	public void WaitForElementToBeClickableAndClick(WebDriver driver, String locator) {
		waitUntilElementPresent(driver, locator);
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60L));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		driver.findElement(By.xpath(locator)).click();
	}

	public String getLocatorText(WebDriver driver, String locator){
		waitUntilElementPresent(driver, locator);
		String Text = driver.findElement(By.xpath(locator)).getText();
		return Text;
	}

	public void Assert_And_Verify(WebDriver driver, String locator, String ExpectedText){
		String ActualText = getLocatorText(driver,locator);
		Assert.assertEquals(ExpectedText, ActualText);
	}

	public int GenerateRandomNumber(int length) {
		Random rand = new Random();
		int num = rand.nextInt(length);
		return num;
	}

	public int GenerateRandomPhoneNumber(){
		int min = 999999999;
		long max = -9999999999L;
		int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		return random_int;
	}

	public static int getRandomElement(int[] arr){
		return arr[ThreadLocalRandom.current().nextInt(arr.length)];
	}
	public int Select_random_Number(){
		int[] nums = {1, 2, 3, 4};
		int randNum = getRandomElement(nums);
		return randNum;
	}

	public void Hit_Keyboard_Key(WebDriver driver, int Key) throws AWTException, InterruptedException {
		Robot robo = new Robot();
		Thread.sleep(2000);
		robo.keyPress(Key);
//		Actions a = new Actions(driver);
//		a.sendKeys(Keys.ESCAPE);
	}

	public void makeScreenshot(WebDriver driver, String name) throws IOException {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		String nameWithExtention = name + ".png";
		String reportFolder = "target" + File.separator + "surefire-reports" + File.separator;
		String screenshotsFolder = "failed-test-screenshots";
		File screenshotFolder = new File(reportFolder + screenshotsFolder);
		if(!screenshotFolder.getAbsoluteFile().exists())
		{
			screenshotFolder.mkdir();
		}
		FileUtils.copyFile(screenshot, new File(screenshotFolder + File.separator + nameWithExtention).getAbsoluteFile());
		this.log("<img src='"+ screenshotFolder + File.separator + nameWithExtention +"' height='600' width='600'/>");
		Reporter.log(""+ getScreenshotLink(name,name),true);
		log(getScreenshotLink(nameWithExtention, nameWithExtention));
	}
	public String getScreenshotLink(String screenshot_name, String link_text) {
		Reporter.log("<br><Strong><font color=#FF0000>--Failed</font></strong>");
		Reporter.log("<br><Strong><font color=#FF0000>--Failed</font></strong>", true);
		return "<a href='./target/surefire-reports/failed-test-screenshots/" + screenshot_name + "'>" + link_text + "</a>";
	}

	public void Click_X_Y_Coordinates(WebDriver driver,int x, int y){

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//body")), 0, 0);
		actions.moveByOffset(x, y).click().build().perform();
	}

	public void moveToElementAndClick(WebDriver driver, String element) throws InterruptedException {
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(element))).click().perform();
	}


}