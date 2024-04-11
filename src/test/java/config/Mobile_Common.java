package config;

import io.appium.java_client.AppiumDriver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
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

public class Mobile_Common {
	public AppiumDriver driver;
	public Mobile_Common(AppiumDriver driver) {
		this.driver = driver;
	}
	public void log(String msg) {
		Reporter.log("Step:- " +msg+ "<br>");
		System.out.println("Step:- " +msg);
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
	public boolean waitUntilElementPresent(AppiumDriver driver, String locator){
		try{Wait<AppiumDriver> wait =new FluentWait<AppiumDriver>(driver) .withTimeout(Duration.ofSeconds(50L))
	  .pollingEvery(Duration.ofSeconds(10L))
	  .ignoring(NoSuchElementException.class);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
			return true;
		}catch(Exception e){
			return false;
		}
	}

	public void WaitForElementAndType(AppiumDriver driver, String locator, String text) {
		waitUntilElementPresent(driver, locator);
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}

	public void WaitForElementAndClick(AppiumDriver driver, String locator) {
		waitUntilElementPresent(driver, locator);
		driver.findElement(By.xpath(locator)).click();
	}

	public String getLocatorText(AppiumDriver driver, String locator){
		waitUntilElementPresent(driver, locator);
		String Text = driver.findElement(By.xpath(locator)).getText();
		return Text;
	}

	public void Assert_And_Verify(AppiumDriver driver, String locator, String ExpectedText){
		String ActualText = getLocatorText(driver,locator);
		Assert.assertEquals(ExpectedText, ActualText);
	}

	public int GenerateRandomNumber(int length) {
		Random rand = new Random();
		int num = rand.nextInt(length);
		int numNoRange = rand.nextInt();
		return numNoRange;
	}

	public static int getRandomElement(int[] arr){
		return arr[ThreadLocalRandom.current().nextInt(arr.length)];
	}
	public int Select_random_Number(){
		int[] nums = {1, 2, 3, 4};
		int randNum = getRandomElement(nums);
		return randNum;
	}

	public void Hit_Keyboard_Key(AppiumDriver driver, int Key) throws AWTException, InterruptedException {
		Robot robo = new Robot();
		Thread.sleep(2000);
		new Actions(driver).moveByOffset(1364, 40).click().perform();
		robo.keyPress(Key);

	}



}