package com.automationtest.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class OrangeHRMPage {

	WebDriver driver;
	Wait<WebDriver> wait;


	@FindBy(xpath="//input[@name='username']")
	WebElement usernameBox;

	@FindBy(xpath="//input[@name='password']")
	WebElement passwordBox;

	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;



	@FindBy(xpath="//span[text()='PIM']")
	WebElement pimTab;

	@FindBy(xpath="//a[text()='Add Employee']")
	WebElement addEmployeeTab;

	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstNameField;

	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastNameField;

	@FindBy(xpath="//label[text()='Employee Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement employeeIdField;



	@FindBy(xpath="//button[text()=' Save ']")
	WebElement saveBtn;

	@FindBy(xpath="//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//child::button[text()=' Save ']")
	WebElement savePersonalDetails;

	@FindBy(xpath="//h6[text()='Custom Fields']//ancestor::div[@class='orangehrm-custom-fields']//child::button")
	WebElement saveCustomFieldsBtn;



	@FindBy(xpath="//a[text()='Personal Details']")
	WebElement personalDetailsTab;

	@FindBy(xpath="//input[@name='middleName']")
	WebElement middleNameField;

	@FindBy(xpath="//label[text()='Nickname']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement nicknameField;

	@FindBy(xpath="//label[text()='Nationality']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement selectNationalityOptions;

	@FindBy(xpath="//span[text()='American']//parent::div")
	WebElement selectNationalityAmerican;

	@FindBy(xpath="//label[text()='Marital Status']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement selectMaritalStatusOptions;

	@FindBy(xpath="//span[text()='Single']//parent::div")
	WebElement selectMaritalStatusSingle;

	@FindBy(xpath="//span[text()='Married']//parent::div")
	WebElement selectMaritalStatusMarried;

	@FindBy(xpath="//label[text()='Date of Birth']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement dateOfBirthField;

	@FindBy(xpath="//input[@value='1']//following-sibling::span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")
	WebElement selectMaleGender;

	@FindBy(xpath="//label[text()='Military Service']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement militaryServiceField;

	@FindBy(xpath="//label[text()='Blood Type']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::i")
	WebElement selectBloodTypeOptions;

	@FindBy(xpath="//span[text()='A+']//parent::div")
	WebElement selectBloodTypeAPositive;

	@FindBy(xpath="//div[text()='-- Select --']")
	WebElement selectNoBloodType;



	@FindBy(xpath="//a[text()='Contact Details']")
	WebElement contactDetailsTab;

	@FindBy(xpath="//label[text()='Country']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement selectCountryOptions;

	@FindBy(xpath="//span[text()='United States']//parent::div")
	WebElement selectUnitedStates;

	@FindBy(xpath="//label[text()='Street 1']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement street1Field;

	@FindBy(xpath="//label[text()='City']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement cityField;

	@FindBy(xpath="//label[text()='State/Province']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement stateOrProvinceField;



	@FindBy(xpath="//a[text()='Emergency Contacts']")
	WebElement emergencyContactsTab;

	@FindBy(xpath="//h6[text()='Assigned Emergency Contacts']//ancestor::div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//child::button")
	WebElement addEmergencyContact;

	@FindBy(xpath="//label[text()='Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement contactNameField;

	@FindBy(xpath="//label[text()='Relationship']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement relationshipField;

	@FindBy(xpath="//label[text()='Home Telephone']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement homeTelephoneField;



	@FindBy(xpath="//a[text()='Dependents']//parent::div")
	WebElement dependentsTab;

	@FindBy(xpath="//h6[text()='Assigned Dependents']//ancestor::div[@class='orangehrm-action-header']//child::button")
	WebElement addDependent;

	@FindBy(xpath="//label[text()='Relationship']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement selectRelationshipOptions;

	@FindBy(xpath="//span[text()='Child']//parent::div")
	WebElement selectChild;

	@FindBy(xpath="//label[text()='Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement dependentNameField;



	@FindBy(xpath="//a[text()='Job']")
	WebElement jobTab;

	@FindBy(xpath="//input[@placeholder='yyyy-mm-dd']")
	WebElement joinedDateField;

	@FindBy(xpath="//label[text()='Job Title']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement selectJobTitleOptions;

	@FindBy(xpath="//span[text()='Software Engineer']//parent::div")
	WebElement selectSoftwareEngineer;

	@FindBy(xpath="//label[text()='Job Category']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement selectJobCategoryOptions;

	@FindBy(xpath="//span[text()='Technicians']//parent::div")
	WebElement selectTechnicians;

	@FindBy(xpath="//label[text()='Sub Unit']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement selectSubUnitOptions;

	@FindBy(xpath="//span[text()='Engineering']//parent::div")
	WebElement selectEngineering;

	@FindBy(xpath="//label[text()='Employment Status']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement selectEmploymentStatusOptions;

	@FindBy(xpath="//span[text()='Full-Time Permanent']//parent::div")
	WebElement selectFullTimePermanent;



	@FindBy(xpath="//span[text()='Buzz']")
	WebElement buzzTab;

	@FindBy(xpath="//textarea[@class='oxd-buzz-post-input']")
	WebElement writePost;

	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main']")
	WebElement submitPost;



	@FindBy(xpath="//p[contains(.,'2023')]//ancestor::div[@class='orangehrm-buzz-post-header']//child::button")
	WebElement postConfig;

	@FindBy(xpath="//p[text()='Delete Post']")
	WebElement deletePost;



	@FindBy(xpath="//button[text()=' Search ']")
	WebElement searchBtn;

	@FindBy(xpath="//div[text()='5923-AC']//ancestor::div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//child::i[@class='oxd-icon bi-trash']")
	WebElement deleteBtn;

	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement confirmDeleteBtn;

	@FindBy(xpath="//button[@class='oxd-icon-button']")
	WebElement employeeInformationDropDown;



	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
	WebElement myInfoTab;

	@FindBy(xpath="//label[text()='Other Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement otherIdField;

	@FindBy(xpath="//label[contains(text(),'License Number')]//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement driverLicenseNumberField;

	@FindBy(xpath="//label[text()='License Expiry Date']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement licenseExpiryDateField;

	@FindBy(xpath="//label[text()='SSN Number']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement ssnNumberField;

	@FindBy(xpath="//label[text()='SIN Number']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement sinNumberField;

	@FindBy(xpath="//label[text()='Yes']")
	WebElement setSmokerYes;





	public OrangeHRMPage (WebDriver driver, Wait<WebDriver> wait){
		this.driver=driver;
		this.wait=wait;

		PageFactory.initElements(driver, this);
	}




	public void waitForVisibilityOfElement(String element) {
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	}

	public void waitForPresenceOfElement(String element) {
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
	}

	public void waitForInvisibilityOfElement(String element) {
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
	}

	public void waitForVisibilityOfAllElements(String element) {
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(element)));
	}

	public void waitForVisibilityOf(String element) {
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element))));
	}
	
	

	public void setUsername(String username) {
		usernameBox.sendKeys(username);
	}

	public void setPassword(String password) {
		passwordBox.sendKeys(password);
	}

	public void submit() {
		submitBtn.click();
	}




	public void selectPimTab() {
		pimTab.click();
	}

	public void selectAddEmployeeTab() {
		waitForPresenceOfElement("//a[text()='Add Employee']");
		addEmployeeTab.click();
	}

	public void setfirstName(String firstName) {
		waitForPresenceOfElement("//input[@name='firstName']");
		firstNameField.sendKeys(Keys.CONTROL + "a");
		firstNameField.sendKeys(Keys.DELETE);
		firstNameField.sendKeys(firstName);
	}

	public void setlastName(String lastName) {
		lastNameField.sendKeys(Keys.CONTROL + "a");
		lastNameField.sendKeys(Keys.DELETE);
		lastNameField.sendKeys(lastName);
	}

	public void setEmployeeId(String id) {
		waitForVisibilityOfElement("//label[text()='Employee Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input");
		employeeIdField.sendKeys(Keys.CONTROL + "a");
		employeeIdField.sendKeys(Keys.DELETE);
		employeeIdField.sendKeys(id);
	}

	public void save() {
		waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		saveBtn.click();
	}




	public void selectPersonalDetailsTab() {
		personalDetailsTab.click();
	}

	public void setMiddleName(String middleName) {
		middleNameField.sendKeys(Keys.CONTROL + "a");
		middleNameField.sendKeys(Keys.DELETE);
		middleNameField.sendKeys(middleName);
	}

	public void setNickname(String nickname) {
		waitForVisibilityOfElement("//label[text()='Nickname']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input");
		nicknameField.sendKeys(Keys.CONTROL + "a");
		nicknameField.sendKeys(Keys.DELETE);
		nicknameField.sendKeys(nickname);
	}

	public void selectNationalityOptions() {
		waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		selectNationalityOptions.click();
	}

	public void selectNationalityAmerican() {
		selectNationalityAmerican.click();
	}

	public void selectMaritalStatusOptions() {
		selectMaritalStatusOptions.click();
	}

	public void selectMaritalStatusSingle() {
		selectMaritalStatusSingle.click();
	}

	public void setDateOfBirth(String dateOfBirth) {
		dateOfBirthField.sendKeys(Keys.CONTROL + "a");
		dateOfBirthField.sendKeys(Keys.DELETE);
		dateOfBirthField.sendKeys(dateOfBirth);
	}

	public void selectMaleGender() {
		selectMaleGender.click();
	}

	public void setMilitaryService(String militaryService) {
		militaryServiceField.sendKeys(Keys.CONTROL + "a");
		militaryServiceField.sendKeys(Keys.DELETE);
		militaryServiceField.sendKeys(militaryService);
	}

	public void savePersonalDetails() {
		savePersonalDetails.click();
	}

	public void selectBloodTypeOptions() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBloodTypeOptions);
		selectBloodTypeOptions.click();
	}

	public void selectBloodTypeAPositive() {
		selectBloodTypeAPositive.click();
	}

	public void selectNoBloodType() {
		selectNoBloodType.click();
	}

	public void saveCustomFields() {
		saveCustomFieldsBtn.click();
	}




	public void selectContactDetailsTab() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		contactDetailsTab.click();
	}

	public void selectCountryOptions() {
		waitForVisibilityOfElement("//label[text()='Country']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']");
		waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		selectCountryOptions.click();
	}

	public void selectUnitedStates() {
		selectUnitedStates.click();
	}

	public void setStreet1(String street1) {
		waitForVisibilityOfElement("//label[text()='Street 1']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input");
		street1Field.sendKeys(Keys.CONTROL + "a");
		street1Field.sendKeys(Keys.DELETE);
		street1Field.sendKeys(street1);
	}

	public void setCity(String city) {
		cityField.sendKeys(Keys.CONTROL + "a");
		cityField.sendKeys(Keys.DELETE);
		cityField.sendKeys(city);
	}

	public void setStateOrProvince(String stateProvince) {
		stateOrProvinceField.sendKeys(stateProvince);
	}




	public void selectDependentsTab() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		dependentsTab.click();
	}

	public void addDependent() {
		waitForVisibilityOfElement("//h6[text()='Assigned Dependents']//ancestor::div[@class='orangehrm-action-header']//child::button");
		addDependent.click();
	}

	public void selectRepationshipOptions() {
		selectRelationshipOptions.click();
	}

	public void selectChild() {
		selectChild.click();
	}

	public void setDependentName(String dependentName) {
		dependentNameField.sendKeys(Keys.CONTROL + "a");
		dependentNameField.sendKeys(Keys.DELETE);
		dependentNameField.sendKeys(dependentName);
	}




	public void selectEmergencyContactsTab() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		emergencyContactsTab.click();
	}

	public void addEmergencyContact() {
		waitForVisibilityOfElement("//h6[text()='Assigned Emergency Contacts']//ancestor::div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//child::button");
		addEmergencyContact.click();
	}

	public void setContactName(String contactName) {
		contactNameField.sendKeys(contactName);
	}

	public void setRelationship(String relationship) {
		relationshipField.sendKeys(relationship);
	}

	public void setHomeTelephone(String telephone) {
		homeTelephoneField.sendKeys(telephone);
	}




	public void selectJobTab() {
		jobTab.click();
	}

	public void setJoinedDate(String joinedDate) {
		waitForVisibilityOfElement("//input[@placeholder='yyyy-mm-dd']");
		joinedDateField.sendKeys(joinedDate);
	}

	public void selectJobTitleOptions() {
		waitForVisibilityOfElement("//label[text()='Job Title']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']");
		waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		selectJobTitleOptions.click();
	}

	public void selectSoftwareEngineer() {
		selectSoftwareEngineer.click();
	}

	public void selectJobCategoryOptions() {
		selectJobCategoryOptions.click();
	}

	public void selectTechnicians() {
		selectTechnicians.click();
	}

	public void selectSubUnitOptions() {
		selectSubUnitOptions.click();
	}

	public void selectEngineering() {
		selectEngineering.click();
	}

	public void selectEmploymentStatusOptions() {
		selectEmploymentStatusOptions.click();
	}

	public void selectFullTimePermanent() {
		selectFullTimePermanent.click();
	}




	public void selectBuzzTab() {
		buzzTab.click();
	}

	public void writePost(String post) {
		waitForVisibilityOfElement("//textarea[@class='oxd-buzz-post-input']");
		waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		writePost.sendKeys(post);
	}

	public void submitPost() {
		waitForVisibilityOfElement("//button[@class='oxd-button oxd-button--medium oxd-button--main']");
		submitPost.click();
	}

	public void selectPostConfig() {
		waitForVisibilityOfElement("//p[contains(.,'2023')]//ancestor::div[@class='orangehrm-buzz-post-header']//child::button");
		postConfig.click();
	}

	public void selectDeletePostOption() {
		waitForVisibilityOfElement("//p[text()='Delete Post']");
		deletePost.click();
	}




	public void selectMyInfoTab() {
		myInfoTab.click();
	}

	public void setOtherId() {
		waitForVisibilityOfElement("//label[text()='Other Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input");
		otherIdField.clear();
	}

	public void setDriverLicenseNumber() {
		driverLicenseNumberField.clear();
	}

	public void setLicenseExpiryDate() {
		waitForVisibilityOfElement("//label[text()='License Expiry Date']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input");
		licenseExpiryDateField.clear();
	}

	public void setSsnNumber() {
		ssnNumberField.clear();
	}

	public void setSinNumber() {
		sinNumberField.clear();
	}

	public void selectMaritalStatusMarried() {
		selectMaritalStatusMarried.click();
	}

	public void setSmokerYes() {
		setSmokerYes.click();
	}




	public void search() {
		searchBtn.click();
	}

	public void delete() {
		waitForVisibilityOfElement("//div[text()='5923-AC']//ancestor::div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//child::i[@class='oxd-icon bi-trash']");
		deleteBtn.click();
	}

	public void confirmDelete() {
		waitForVisibilityOfElement("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
		confirmDeleteBtn.click();
	}

	public void employeeSearch() {
		waitForVisibilityOfElement("//button[@class='oxd-icon-button']");
		employeeInformationDropDown.click();
	}

}
