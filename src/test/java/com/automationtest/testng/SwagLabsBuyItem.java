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

import com.automationtest.pageobject.SwagLabsPage;
import com.automationtest.tools.TestValuesReader;

public class SwagLabsBuyItem {

	WebDriver driver;
	Wait<WebDriver> wait;
	TestValuesReader testValuesReader;
	

	@BeforeClass
	public void openBrowser() {
		testValuesReader = new TestValuesReader();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testValuesReader.getValue("url2"));
		
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class);

		SwagLabsPage SwagLabsPage = new SwagLabsPage(driver, wait);
		SwagLabsPage.waitForPresenceOfElement("//input[@type='submit']");
		
		SwagLabsPage.setUsername(testValuesReader.getValue("user2"));
		SwagLabsPage.setPassword(testValuesReader.getValue("password2"));
		SwagLabsPage.submit();
		
		SwagLabsPage.waitForPresenceOfElement("//div[@class='inventory_container']");
	}


	@Test
	public void login() throws InterruptedException {
		SwagLabsPage SwagLabsPage = new SwagLabsPage(driver, wait);
		SwagLabsPage.addBackpackToKart();
		SwagLabsPage.openKart();
		SwagLabsPage.checkout();
		SwagLabsPage.setFirstName(testValuesReader.getValue("firstName"));
		SwagLabsPage.setLastName(testValuesReader.getValue("lastName"));
		SwagLabsPage.setPostalCode(testValuesReader.getValue("postalCode"));
		SwagLabsPage.continueTransaction();
		SwagLabsPage.finishTransaction();
		
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("Test Screenshots\\SwagLabsBuyItemScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean expectedValue = true;
		boolean realValue = driver.findElement(By.xpath("//img[@class='pony_express']")).isDisplayed();
		Assert.assertEquals(expectedValue, realValue);
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
