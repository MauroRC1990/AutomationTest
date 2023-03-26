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

	
	
	@FindBy(xpath="//span[text()='Configuration ']")
	WebElement configurationTab;
	
	@FindBy(xpath="//a[text()='Custom Fields']")
	WebElement customFieldsOption;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addCustomFieldBtn;
	
	@FindBy(xpath="//label[text()='Field Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement fieldNameInput;
	
	@FindBy(xpath="//label[text()='Screen']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[text()='-- Select --']")
	WebElement screenOptions;
	
	@FindBy(xpath="//span[text()='Personal Details']")
	WebElement personalDetailsOption;
	
	@FindBy(xpath="//label[text()='Type']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[text()='-- Select --']")
	WebElement typeOptions;
	
	@FindBy(xpath="//span[text()='Text or Number']")
	WebElement textOrNumberOption;
	
	@FindBy(xpath="//span[text()='Drop Down']")
	WebElement dropDownOption;
	
	@FindBy(xpath="//label[text()='Select Options']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement optionsField;
	
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement saveBtn;

	@FindBy(xpath="//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//child::button[text()=' Save ']")
	WebElement savePersonalDetailsBtn;

	@FindBy(xpath="//h6[text()='Custom Fields']//ancestor::div[@class='orangehrm-custom-fields']//child::button")
	WebElement saveCustomFieldsBtn;



	@FindBy(xpath="//a[text()='Personal Details']")
	WebElement personalDetailsTab;

	@FindBy(xpath="//input[@name='middleName']")
	WebElement middleNameField;

	@FindBy(xpath="//label[text()='Nickname']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement nicknameField;

	@FindBy(xpath="//label[text()='Nationality']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement nationalityOptions;

	@FindBy(xpath="//span[text()='American']//parent::div")
	WebElement nationalityAmerican;

	@FindBy(xpath="//label[text()='Marital Status']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement maritalStatusOptions;

	@FindBy(xpath="//span[text()='Single']//parent::div")
	WebElement maritalStatusSingle;

	@FindBy(xpath="//span[text()='Married']//parent::div")
	WebElement maritalStatusMarried;

	@FindBy(xpath="//label[text()='Date of Birth']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement dateOfBirthField;

	@FindBy(xpath="//label[text()='Male']")
	WebElement maleGenderOption;
	
	@FindBy(xpath="//label[text()='Female']")
	WebElement femaleGenderOption;

	@FindBy(xpath="//label[text()='Military Service']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement militaryServiceField;

	@FindBy(xpath="//label[text()='Blood Type']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::i")
	WebElement bloodTypeOptions;

	@FindBy(xpath="//span[text()='A+']//parent::div")
	WebElement bloodTypeAPositive;

	@FindBy(xpath="//div[text()='-- Select --']")
	WebElement noBloodType;



	@FindBy(xpath="//a[text()='Contact Details']")
	WebElement contactDetailsTab;

	@FindBy(xpath="//label[text()='Country']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement countryOptions;

	@FindBy(xpath="//span[text()='United States']//parent::div")
	WebElement unitedStatesOption;

	@FindBy(xpath="//label[text()='Street 1']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement street1Field;

	@FindBy(xpath="//label[text()='City']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement cityField;

	@FindBy(xpath="//label[text()='State/Province']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement stateOrProvinceField;



	@FindBy(xpath="//a[text()='Emergency Contacts']")
	WebElement emergencyContactsTab;

	@FindBy(xpath="//h6[text()='Assigned Emergency Contacts']//ancestor::div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//child::button")
	WebElement addEmergencyContactBtn;

	@FindBy(xpath="//label[text()='Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement contactNameField;

	@FindBy(xpath="//label[text()='Relationship']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement relationshipField;

	@FindBy(xpath="//label[text()='Home Telephone']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement homeTelephoneField;



	@FindBy(xpath="//a[text()='Dependents']//parent::div")
	WebElement dependentsTab;

	@FindBy(xpath="//h6[text()='Assigned Dependents']//ancestor::div[@class='orangehrm-action-header']//child::button")
	WebElement addDependentBtn;

	@FindBy(xpath="//label[text()='Relationship']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement relationshipOptions;

	@FindBy(xpath="//span[text()='Child']//parent::div")
	WebElement childOption;

	@FindBy(xpath="//label[text()='Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement dependentNameField;



	@FindBy(xpath="//a[text()='Job']")
	WebElement jobTab;

	@FindBy(xpath="//input[@placeholder='yyyy-mm-dd']")
	WebElement joinedDateField;

	@FindBy(xpath="//label[text()='Job Title']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement jobTitleOptions;

	@FindBy(xpath="//span[text()='Software Engineer']//parent::div")
	WebElement softwareEngineerOption;

	@FindBy(xpath="//label[text()='Job Category']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement jobCategoryOptions;

	@FindBy(xpath="//span[text()='Technicians']//parent::div")
	WebElement techniciansOption;

	@FindBy(xpath="//label[text()='Sub Unit']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement subUnitOptions;

	@FindBy(xpath="//span[text()='Engineering']//parent::div")
	WebElement engineeringOption;

	@FindBy(xpath="//label[text()='Employment Status']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement employmentStatusOptions;

	@FindBy(xpath="//span[text()='Full-Time Permanent']//parent::div")
	WebElement fullTimePermanentOption;



	@FindBy(xpath="//span[text()='Buzz']")
	WebElement buzzTab;

	@FindBy(xpath="//textarea[@class='oxd-buzz-post-input']")
	WebElement postField;

	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main']")
	WebElement submitPostBtn;



	@FindBy(xpath="//p[contains(.,'2023')]//ancestor::div[@class='orangehrm-buzz-post-header']//child::button")
	WebElement postConfig;

	@FindBy(xpath="//p[text()='Delete Post']")
	WebElement deletePostBtn;


	@FindBy(xpath="//label[text()='Employee Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input")
	WebElement employeeNameSearch;
	
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
	WebElement smokerYesOption;





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

	
	
	
	public void selectConfigurationTab() {
		waitForVisibilityOfElement("//span[text()='Configuration ']");
		configurationTab.click();
	}
	
	public void selectCustomFieldsOption() {
		customFieldsOption.click();
	}
	
	public void addCustomField() {
		waitForVisibilityOfElement("//button[text()=' Add ']");
		addCustomFieldBtn.click();
	}
	
	public void setfieldName(String fieldName) {
		waitForVisibilityOfElement("//label[text()='Field Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input");
		fieldNameInput.sendKeys(fieldName);
	}
	
	public void selectScreenOptions() {
		screenOptions.click();
	}
	
	public void selectPersonalDetailsOption() {
		personalDetailsOption.click();
	}
	
	public void selectTypeOptions() {
		typeOptions.click();
	}
	
	public void selectTextOrNumberOption() {
		textOrNumberOption.click();
	}
	
	public void selectDropDownOption() {
		dropDownOption.click();
	}
	
	public void setOptionsField(String options) {
		optionsField.sendKeys(options);
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
		nationalityOptions.click();
	}

	public void selectNationalityAmerican() {
		nationalityAmerican.click();
	}

	public void selectMaritalStatusOptions() {
		maritalStatusOptions.click();
	}

	public void selectMaritalStatusSingle() {
		maritalStatusSingle.click();
	}

	public void setDateOfBirth(String dateOfBirth) {
		dateOfBirthField.sendKeys(Keys.CONTROL + "a");
		dateOfBirthField.sendKeys(Keys.DELETE);
		dateOfBirthField.sendKeys(dateOfBirth);
	}

	public void selectMaleGender() {
		maleGenderOption.click();
	}
	
	public void selectFemaleGender() {
		femaleGenderOption.click();
	}

	public void setMilitaryService(String militaryService) {
		militaryServiceField.sendKeys(Keys.CONTROL + "a");
		militaryServiceField.sendKeys(Keys.DELETE);
		militaryServiceField.sendKeys(militaryService);
	}

	public void savePersonalDetails() {
		savePersonalDetailsBtn.click();
	}

	public void selectBloodTypeOptions() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bloodTypeOptions);
		bloodTypeOptions.click();
	}

	public void selectBloodTypeAPositive() {
		bloodTypeAPositive.click();
	}

	public void selectNoBloodType() {
		noBloodType.click();
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
		countryOptions.click();
	}

	public void selectUnitedStates() {
		unitedStatesOption.click();
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
		addDependentBtn.click();
	}

	public void selectRepationshipOptions() {
		relationshipOptions.click();
	}

	public void selectChild() {
		childOption.click();
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
		addEmergencyContactBtn.click();
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
		jobTitleOptions.click();
	}

	public void selectSoftwareEngineer() {
		softwareEngineerOption.click();
	}

	public void selectJobCategoryOptions() {
		jobCategoryOptions.click();
	}

	public void selectTechnicians() {
		techniciansOption.click();
	}

	public void selectSubUnitOptions() {
		subUnitOptions.click();
	}

	public void selectEngineering() {
		engineeringOption.click();
	}

	public void selectEmploymentStatusOptions() {
		employmentStatusOptions.click();
	}

	public void selectFullTimePermanent() {
		fullTimePermanentOption.click();
	}




	public void selectBuzzTab() {
		buzzTab.click();
	}

	public void writePost(String post) {
		waitForVisibilityOfElement("//textarea[@class='oxd-buzz-post-input']");
		waitForInvisibilityOfElement("//div[@class='oxd-loading-spinner']");
		postField.sendKeys(post);
	}

	public void submitPost() {
		waitForVisibilityOfElement("//button[@class='oxd-button oxd-button--medium oxd-button--main']");
		submitPostBtn.click();
	}

	public void selectPostConfig() {
		waitForVisibilityOfElement("//p[contains(.,'2023')]//ancestor::div[@class='orangehrm-buzz-post-header']//child::button");
		postConfig.click();
	}

	public void selectDeletePostOption() {
		waitForVisibilityOfElement("//p[text()='Delete Post']");
		deletePostBtn.click();
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
		maritalStatusMarried.click();
	}

	public void setSmokerYes() {
		smokerYesOption.click();
	}



	public void setEmployeeNameSearch(String employeeName) {
		waitForVisibilityOfElement("//label[text()='Employee Name']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::input");
		employeeNameSearch.sendKeys(employeeName);
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
