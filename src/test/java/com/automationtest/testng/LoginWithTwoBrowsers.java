package com.automationtest.testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationtest.pom.OrangeHRMPage;
import com.automationtest.tools.TestValuesReader;

public class LoginWithTwoBrowsers {

	WebDriver driver;
	Wait<WebDriver> wait;
	TestValuesReader testValuesReader;

	@Parameters("Browser")

	@BeforeTest
	public void openBrowser(String browser) {
		testValuesReader = new TestValuesReader();
		if(browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();	
			driver.manage().window().maximize();
			driver.get(testValuesReader.getValue("url"));

		}else if (browser.equalsIgnoreCase("Chrome")) { 

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(testValuesReader.getValue("url"));

		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
		
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class);
		
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.waitForPresenceOfElement("//button[@type='submit']");
	}


	@Test
	public void login() throws InterruptedException {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.setUsername(testValuesReader.getValue("user"));
		orangeHRMPage.setPassword(testValuesReader.getValue("password"));
		orangeHRMPage.submit();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		orangeHRMPage.waitForVisibilityOfAllElements("//div[@class='oxd-pie-chart']");
		orangeHRMPage.waitForVisibilityOf("//img[@alt='client brand banner']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("Test Screenshots\\LoginWithBothBrowsersScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
