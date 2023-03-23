package com.automationtest.testng;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationtest.pom.OrangeHRMPage;

public class PostOnNewsfeedTest {

	WebDriver driver;
	Wait<WebDriver> wait;


	@BeforeClass
	public void login(String browser) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.waitForPresenceOfElement("//button[@type='submit']");

		orangeHRMPage.setUsername("Admin");
		orangeHRMPage.setPassword("admin123");
		orangeHRMPage.submit();

		orangeHRMPage.waitForPresenceOfElement("//span[@class='oxd-userdropdown-tab']");
	}


	@Test
	public void postBuzzNewsfeed() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.selectBuzzTab();
		orangeHRMPage.writePost("Hello, this post is part of an automation test, we apologize for the inconvenience");
		orangeHRMPage.submitPost();

		orangeHRMPage.waitForVisibilityOfElement("//p[text()='Successfully Saved']");
		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-form-loader']");
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\NewsfeedPostScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//p[text()[contains(., '2023')]]")).isDisplayed();
        Assert.assertEquals(expectedValue, realValue);		
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}


}
