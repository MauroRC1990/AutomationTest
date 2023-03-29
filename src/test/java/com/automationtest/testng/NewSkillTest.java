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

public class NewSkillTest {

	WebDriver driver;
	Wait<WebDriver> wait;

	
	@BeforeClass
	public void login() {
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
	public void newSkill() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.selectAdminTab();
		orangeHRMPage.selectAdminQualificationsTab();
		orangeHRMPage.selectSkillsTab();
		orangeHRMPage.addSkill();
		orangeHRMPage.setSkillName("N7");
		orangeHRMPage.setSkillDescription("Elite training program");
		orangeHRMPage.save();

		orangeHRMPage.waitForVisibilityOfElement("//h6[text()='Skills']");
		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\SkillsScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//h6[text()='Skills']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
