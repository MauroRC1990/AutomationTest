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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationtest.pom.OrangeHRMPage;
import com.automationtest.tools.TestValuesReader;

public class NewTerminationReasonTest {

	WebDriver driver;
	Wait<WebDriver> wait;
	TestValuesReader testValuesReader;

	
	@BeforeClass
	public void login() {
		testValuesReader = new TestValuesReader();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testValuesReader.getValue("url"));
		
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class);

		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.waitForPresenceOfElement("//button[@type='submit']");

		orangeHRMPage.setUsername(testValuesReader.getValue("user"));
		orangeHRMPage.setPassword(testValuesReader.getValue("password"));
		orangeHRMPage.submit();

		orangeHRMPage.waitForPresenceOfElement("//span[@class='oxd-userdropdown-tab']");
	}


	@Test
	public void newTerminationReason() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.selectPimTab();
		orangeHRMPage.selectConfigurationTab();
		orangeHRMPage.selectTerminationReasonsTab();
		orangeHRMPage.addTerminationReason();
		orangeHRMPage.setTerminationName(testValuesReader.getValue("terminationName"));
		orangeHRMPage.save();

		orangeHRMPage.waitForVisibilityOfElement("//p[text()='Termination Reasons']");
		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("Test Screenshots\\NewTerminationReasonScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//p[text()='Termination Reasons']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
