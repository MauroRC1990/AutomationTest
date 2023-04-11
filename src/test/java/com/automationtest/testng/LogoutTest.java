package com.automationtest.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationtest.pom.OrangeHRMPage;
import com.automationtest.tools.TestValuesReader;

public class LogoutTest {

	WebDriver driver;
	Wait<WebDriver> wait;
	TestValuesReader testValuesReader;

	
	@BeforeClass
	public void openBrowser() {
		testValuesReader = new TestValuesReader();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testValuesReader.getValue("url"));

		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.waitForPresenceOfElement("//button[@type='submit']");
	}


	@Test
	public void loginAndLogout() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.setUsername(testValuesReader.getValue("user"));
		orangeHRMPage.setPassword(testValuesReader.getValue("password"));
		orangeHRMPage.submit();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		
		orangeHRMPage.selectUserDropdownOptions();
		orangeHRMPage.selectLogoutOption();
		
		orangeHRMPage.waitForVisibilityOfElement("//div[@class='orangehrm-login-branding']");

		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("Test Screenshots\\LogoutScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}