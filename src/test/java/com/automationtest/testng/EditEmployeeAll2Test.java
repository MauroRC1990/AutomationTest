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

public class EditEmployeeAll2Test {

	WebDriver driver;
	Wait<WebDriver> wait;


	@BeforeClass
	public void loginAndAddEmployee2() {
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
		orangeHRMPage.setfirstName("Jane");
		orangeHRMPage.setMiddleName("Elizabeth");
		orangeHRMPage.setlastName("Shepard");
		orangeHRMPage.setEmployeeId("5922-AC");
		orangeHRMPage.save();

		orangeHRMPage.waitForPresenceOfElement("//h6[text()='Personal Details']");
	}


	@Test
	public void editEmployee2() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.setEmployeeId("5922-AC");
		orangeHRMPage.selectNationalityOptions();
		orangeHRMPage.selectNationalityAmerican();
		orangeHRMPage.setNickname("Skipper");
		orangeHRMPage.selectMaritalStatusOptions();
		orangeHRMPage.selectMaritalStatusSingle();
		orangeHRMPage.setDateOfBirth("2154-04-11");
		orangeHRMPage.selectFemaleGender();
		orangeHRMPage.setMilitaryService("Commander");
		orangeHRMPage.savePersonalDetails();
		orangeHRMPage.selectBloodTypeOptions();
		orangeHRMPage.selectBloodTypeAPositive();
		orangeHRMPage.saveCustomFields();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\PersonalDetailsScreenshot2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectContactDetailsTab();
		orangeHRMPage.selectCountryOptions();
		orangeHRMPage.selectUnitedStates();
		orangeHRMPage.setStreet1("Silversun Strip");
		orangeHRMPage.setCity("Tiberius Towers");
		orangeHRMPage.setStateOrProvince("Citadel");
		orangeHRMPage.save();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file1, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\ContactDetailsScreenshot2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectEmergencyContactsTab();
		orangeHRMPage.addEmergencyContact();
		orangeHRMPage.setContactName("Jeff Moreau");
		orangeHRMPage.setRelationship("Pilot");
		orangeHRMPage.setHomeTelephone("628-2002");
		orangeHRMPage.save();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file2, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\EmergencyContactsScreenshot2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectDependentsTab();
		orangeHRMPage.addDependent();
		orangeHRMPage.selectRepationshipOptions();
		orangeHRMPage.selectChild();
		orangeHRMPage.setDateOfBirth("2187-11-18");
		orangeHRMPage.setDependentName("Kaidan");
		orangeHRMPage.save();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		
		File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file3, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\DependentsScreenshot2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectJobTab();
		orangeHRMPage.setJoinedDate("2172-04-11");
		orangeHRMPage.selectJobTitleOptions();
		orangeHRMPage.selectSoftwareEngineer();
		orangeHRMPage.selectJobCategoryOptions();
		orangeHRMPage.selectTechnicians();
		orangeHRMPage.selectSubUnitOptions();
		orangeHRMPage.selectEngineering();
		orangeHRMPage.selectEmploymentStatusOptions();
		orangeHRMPage.selectFullTimePermanent();
		orangeHRMPage.save();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file4, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\JobScreenshot2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		orangeHRMPage.selectQualificationsTab();
		orangeHRMPage.selectAddWorkExperience();
		orangeHRMPage.setCompany("Alliance Military");
		orangeHRMPage.setJobTitle("Commanding Officer");
		orangeHRMPage.setDateFrom("2172-04-11");
		orangeHRMPage.setDateTo("2187-04-11");
		orangeHRMPage.setWorkExperienceComment("Retired from active service with honors");
		orangeHRMPage.save();
		orangeHRMPage.selectAddSkills();
		orangeHRMPage.selectSkillOptions();
		orangeHRMPage.selectN7Option();
		orangeHRMPage.setYearsOfExperience("6");
		orangeHRMPage.setSkillComment("One of 300 out of 750 to graduate");
		orangeHRMPage.selectSaveSkill();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file5, new File("C:\\Users\\Solidus\\Documents\\Mis trabajos\\Trabajo QA\\Test Screenshots\\QualificationsScreenshot2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//div[text()='N7']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
