package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.config.ConfigProperties;
import com.driver.DriverManager;

public class BaseTest {

	private static final String APP_URL = ConfigProperties.PROPS.getProperty("app.url");

	@BeforeMethod
	public void launchApp() {
		DriverManager.getDriver().get(APP_URL);
	}

	@AfterMethod
	public void killDriver() {
		DriverManager.teardownDriver();
	}

}
