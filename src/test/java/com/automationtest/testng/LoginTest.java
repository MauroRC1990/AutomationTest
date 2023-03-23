package com.automationtest.testng;

import org.testng.annotations.Test;


import com.automationtest.pom.OrangeHRMPage;

import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

public class LoginTest {

	WebDriver driver;
	Wait<WebDriver> wait;

	@BeforeClass
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.waitForPresenceOfElement("//button[@type='submit']");
	}


	@Test
	public void login() throws InterruptedException {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.setUsername("Admin");
		orangeHRMPage.setPassword("admin123");
		orangeHRMPage.submit();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		orangeHRMPage.waitForVisibilityOfAllElements("//div[@class='oxd-pie-chart']");
		orangeHRMPage.waitForVisibilityOf("//img[@alt='client brand banner']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\LoginScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
