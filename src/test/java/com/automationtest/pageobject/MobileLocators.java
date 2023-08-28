package com.automationtest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class MobileLocators {
	WebDriver driver;
	
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_02']")
	WebElement number2;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_mul']")
	WebElement multiply;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_equal']")
	WebElement result;
	
	
	
	
	public MobileLocators (WebDriver driver, Wait<WebDriver> wait){
		this.driver=driver;
		

		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void setNumber2() {
		number2.click();
	}
	
	public void setMultiply() {
		multiply.click();
	}
	
	public void getResult() {
		result.click();
	}
	
}
