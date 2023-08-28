package com.automationtest.util;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumHandler {

	private static AppiumDriverLocalService server;

	public static void startAppiumServer() {
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		// Use any port, in case the default 4723 is already taken (maybe by another
		// Appium server)
		serviceBuilder.usingPort(4723);
		serviceBuilder.withIPAddress("127.0.0.1");
		serviceBuilder.withTimeout(Duration.ofSeconds(30));
		// Tell serviceBuilder where node is installed. Or set this path in an
		// environment variable named NODE_PATH
		serviceBuilder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));
		// Tell serviceBuilder where Appium is installed. Or set this path in an
		// environment variable named APPIUM_PATH
		serviceBuilder.withAppiumJS(new File("C:\\Users\\Solidus\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"));
		// The XCUITest driver requires that a path to the Carthage binary is in the
		// PATH variable. I have this set for my shell, but the Java process does not
		// see it. It can be inserted here.
		HashMap<String, String> environment = new HashMap<String, String>();
		environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
		serviceBuilder.withEnvironment(environment);

		server = AppiumDriverLocalService.buildService(serviceBuilder);
		server.start();
	}

	public static void stopAppiumServer() {
		server.stop();
	}
}
