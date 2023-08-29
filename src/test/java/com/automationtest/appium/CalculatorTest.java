package com.automationtest.appium;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import com.automationtest.pageobject.MobileLocators;
import com.automationtest.util.AppiumHandler;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class CalculatorTest {

	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "example";
	protected AndroidDriver driver = null;
	DesiredCapabilities dc = new DesiredCapabilities();

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		AppiumHandler.startAppiumServer();
		dc.setCapability("reportDirectory", reportDirectory);
		dc.setCapability("reportFormat", reportFormat);
		dc.setCapability("testName", testName);
		dc.setCapability(MobileCapabilityType.UDID, "5210a713529ac445");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Calculator");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), dc);
		driver.setLogLevel(Level.INFO);
	}

	@Test
	public void testexample() {
		MobileLocators MobileLocators = new MobileLocators(driver);
		MobileLocators.setNumber2();
		MobileLocators.setMultiply();
		MobileLocators.setNumber2();
		MobileLocators.getResult();
		MobileLocators.getCalcText();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		AppiumHandler.stopAppiumServer();
	}

}