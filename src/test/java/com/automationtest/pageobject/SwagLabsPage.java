package com.automationtest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class SwagLabsPage {
	WebDriver driver;
	Wait<WebDriver> wait;
	
	@FindBy(xpath="//input[@name='user-name']")
	WebElement usernameBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item']//child::button")
	WebElement addBackpackToKart;
	
	@FindBy(xpath="//a[@href='./cart.html']")
	WebElement openKart;
	
	@FindBy(xpath="//a[text()='CHECKOUT']")
	WebElement checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalCode;
	
	@FindBy(xpath="//input[@value='CONTINUE']")
	WebElement continueBtn;
	
	@FindBy(xpath="//a[text()='FINISH']")
	WebElement finishBtn;
	
	
	
	public SwagLabsPage (WebDriver driver, Wait<WebDriver> wait){
		this.driver=driver;
		this.wait=wait;

		PageFactory.initElements(driver, this);
	}
	
	public void waitForVisibilityOfElement(String element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	}

	public void waitForPresenceOfElement(String element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
	}

	public void waitForInvisibilityOfElement(String element) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
	}

	public void waitForVisibilityOfAllElements(String element) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(element)));
	}

	public void waitForVisibilityOf(String element) {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element))));
	}


	
	
	public void setUsername (String username) {
		usernameBox.sendKeys(username);
	}
	
	public void setPassword (String password) {
		passwordBox.sendKeys(password);

	}
	
	public void submit() {
		submitBtn.click();
	}
	
	public void addBackpackToKart() {
		addBackpackToKart.click();
	}
	
	public void openKart() {
		openKart.click();
	}
	
	public void checkout() {
		checkout.click();
	}
	
	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void setPostalCode(String postalcode) {
		postalCode.sendKeys(postalcode);
	}
	
	public void continueTransaction() {
		continueBtn.click();
	}
	
	public void finishTransaction() {
		finishBtn.click();
	}
}
