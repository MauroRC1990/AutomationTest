package com.automationtest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileLocators {
	WebDriver driver;
	
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_02']")
	WebElement number2;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_mul']")
	WebElement multiply;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_equal']")
	WebElement result;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='com.sec.android.app.popupcalculator:id/txtCalc']")
	WebElement calcText;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_div']")
	WebElement division;
	
	
	
	
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']")
	WebElement chromeSearch;
	
	
	
	
	public MobileLocators (WebDriver driver){
		this.driver=driver;
		

		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void setNumber2() {
		number2.click();
	}
	
	public void setMultiply() {
		multiply.click();
	}
	
	public void setDivision() {
		division.click();
	}
	
	public void getResult() {
		result.click();
	}
	
	public void getCalcText() {
      String text = calcText.getText();
      System.out.println("The result is " + text);
	}
	
	
	
	
	
	public void setSearch(String text) {
		chromeSearch.sendKeys(text);
	}
}
