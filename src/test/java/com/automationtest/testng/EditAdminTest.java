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

public class EditAdminTest {

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
	public void editAdmin() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.selectMyInfoTab();
		orangeHRMPage.setOtherId();
		orangeHRMPage.setLicenseExpiryDate();
		orangeHRMPage.selectNationalityOptions();
		orangeHRMPage.selectNationalityAmerican();
		orangeHRMPage.setfirstName("Paul");
		orangeHRMPage.setMiddleName("");
		orangeHRMPage.setlastName("Collings");
		orangeHRMPage.setNickname("");
		orangeHRMPage.setDriverLicenseNumber();
		orangeHRMPage.setSsnNumber();
		orangeHRMPage.setSinNumber();
		orangeHRMPage.selectMaritalStatusOptions();
		orangeHRMPage.selectMaritalStatusMarried();
		orangeHRMPage.setDateOfBirth("1975-10-15");
		orangeHRMPage.selectMaleGender();
		orangeHRMPage.setMilitaryService("");
		//orangeHRMPage.setSmokerYes();
		orangeHRMPage.savePersonalDetails();
		orangeHRMPage.selectBloodTypeOptions();
		orangeHRMPage.selectNoBloodType();
		orangeHRMPage.saveCustomFields();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-form-loader']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\AdminEditingScreenshot.png"));
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
