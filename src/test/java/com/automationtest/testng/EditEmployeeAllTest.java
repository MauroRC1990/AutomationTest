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

import com.automationtest.pageobject.OrangeHRMPage;
import com.automationtest.tools.TestValuesReader;

public class EditEmployeeAllTest {

	WebDriver driver;
	Wait<WebDriver> wait;
	TestValuesReader testValuesReader;


	@BeforeClass
	public void loginAndAddEmployee() {
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

		orangeHRMPage.selectPimTab();
		orangeHRMPage.selectAddEmployeeTab();
		orangeHRMPage.setfirstName(testValuesReader.getValue("employee1FirstName"));
		orangeHRMPage.setMiddleName(testValuesReader.getValue("employee1MiddleName"));
		orangeHRMPage.setlastName(testValuesReader.getValue("employee1LastName"));
		orangeHRMPage.setEmployeeId(testValuesReader.getValue("employee1Id"));
		orangeHRMPage.save();

		orangeHRMPage.waitForPresenceOfElement("//h6[text()='Personal Details']");
	}


	@Test
	public void editEmployee() {
		OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver, wait);
		orangeHRMPage.selectNationalityOptions();
		orangeHRMPage.selectNationalityAmerican();
		orangeHRMPage.setNickname(testValuesReader.getValue("employee1Nickname"));
		orangeHRMPage.selectMaritalStatusOptions();
		orangeHRMPage.selectMaritalStatusSingle();
		orangeHRMPage.setDateOfBirth(testValuesReader.getValue("employee1DateOfBirth"));
		orangeHRMPage.selectMaleGender();
		orangeHRMPage.setMilitaryService(testValuesReader.getValue("employee1MilitaryService"));
		orangeHRMPage.savePersonalDetails();
		orangeHRMPage.selectBloodTypeOptions();
		orangeHRMPage.selectBloodTypeAPositive();
		orangeHRMPage.selectCareerPathOptions();
		orangeHRMPage.selectEngineerOption();
		orangeHRMPage.saveCustomFields();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("Test Screenshots\\PersonalDetailsScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectContactDetailsTab();
		orangeHRMPage.selectCountryOptions();
		orangeHRMPage.selectUnitedStates();
		orangeHRMPage.setStreet1(testValuesReader.getValue("employeeStreet1"));
		orangeHRMPage.setCity(testValuesReader.getValue("employeeCity"));
		orangeHRMPage.setStateOrProvince(testValuesReader.getValue("employeeStateOrProvince"));
		orangeHRMPage.save();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file1, new File("Test Screenshots\\ContactDetailsScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectEmergencyContactsTab();
		orangeHRMPage.addEmergencyContact();
		orangeHRMPage.setContactName(testValuesReader.getValue("employeeEmergencyContactName"));
		orangeHRMPage.setRelationship(testValuesReader.getValue("employeeEmergencyContactRelationship"));
		orangeHRMPage.setHomeTelephone(testValuesReader.getValue("employeeEmergencyContactHomeTelephone"));
		orangeHRMPage.save();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file2, new File("Test Screenshots\\EmergencyContactsScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectDependentsTab();
		orangeHRMPage.addDependent();
		orangeHRMPage.selectRepationshipOptions();
		orangeHRMPage.selectChild();
		orangeHRMPage.setDateOfBirth(testValuesReader.getValue("employeeDependentDateOfBirth"));
		orangeHRMPage.setDependentName(testValuesReader.getValue("employeeDependentName"));
		orangeHRMPage.save();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		
		File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file3, new File("Test Screenshots\\DependentsScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectJobTab();
		orangeHRMPage.setJoinedDate(testValuesReader.getValue("employeeJobJoinedDate"));
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
			FileUtils.copyFile(file4, new File("Test Screenshots\\JobScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		orangeHRMPage.selectQualificationsTab();
		orangeHRMPage.selectAddWorkExperience();
		orangeHRMPage.setCompany(testValuesReader.getValue("employeeQualificationsCompany"));
		orangeHRMPage.setJobTitle(testValuesReader.getValue("employeeQualificationsJobTitle"));
		orangeHRMPage.setDateFrom(testValuesReader.getValue("employeeQualificationsDateFrom"));
		orangeHRMPage.setDateTo(testValuesReader.getValue("employeeQualificationsDateTo"));
		orangeHRMPage.setWorkExperienceComment(testValuesReader.getValue("employeeQualificationsWorkExperienceComment"));
		orangeHRMPage.save();
		orangeHRMPage.selectAddSkills();
		orangeHRMPage.selectSkillOptions();
		orangeHRMPage.selectN7Option();
		orangeHRMPage.setYearsOfExperience(testValuesReader.getValue("employeeQualificationsYearsOfExperience"));
		orangeHRMPage.setSkillComment(testValuesReader.getValue("employeeQualificationsSkillComments"));
		orangeHRMPage.selectSaveSkill();

		orangeHRMPage.waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");

		File file5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file5, new File("Test Screenshots\\QualificationsScreenshot.png"));
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
