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

public class EditEmployeePersonalDetailsTest {

	WebDriver driver;
	Wait<WebDriver> wait;


	@BeforeClass
	public void loginAndAddEmployee() {
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

		orangeHRMPage.selectPimTab();
		orangeHRMPage.selectAddEmployeeTab();
		orangeHRMPage.setfirstName("John");
		orangeHRMPage.setMiddleName("Adrian");
		orangeHRMPage.setlastName("Shepard");
		orangeHRMPage.setEmployeeId("5923-AC");
		orangeHRMPage.save();

		orangeHRMPage.waitForPresenceOfElement("//h6[text()='Personal Details']");
	}


	@Test
	public void editEmployeePersonalDetails() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.setEmployeeId("5923-AC");
		orangeHRMPage.selectNationalityOptions();
		orangeHRMPage.selectNationalityAmerican();
		orangeHRMPage.setNickname("Skipper");
		orangeHRMPage.selectMaritalStatusOptions();
		orangeHRMPage.selectMaritalStatusSingle();
		orangeHRMPage.setDateOfBirth("2154-04-11");
		orangeHRMPage.selectMaleGender();
		orangeHRMPage.setMilitaryService("Commander");
		orangeHRMPage.savePersonalDetails();
		orangeHRMPage.selectBloodTypeOptions();
		orangeHRMPage.selectBloodTypeAPositive();
		orangeHRMPage.saveCustomFields();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-form-loader']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\PersonalDetailsScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//p[text()='Successfully Saved']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
