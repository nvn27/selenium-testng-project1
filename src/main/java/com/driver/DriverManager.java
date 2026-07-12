package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.config.ConfigProperties;

public class DriverManager {

	private static ThreadLocal<WebDriver> tDriver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		if (tDriver.get() == null || tDriver == null)
			setDriver();

		if (ConfigProperties.PROPS.getProperty("maximize.browser").equalsIgnoreCase("true"))
			tDriver.get().manage().window().maximize();

		return tDriver.get();
	}

	private static void setDriver() {
		String browser = ConfigProperties.PROPS.getProperty("browser");
		switch (browser) {
		case "chrome":
			tDriver.set(new ChromeDriver());
			break;
		case "edge":
			tDriver.set(new EdgeDriver());
			break;
		case "firefox":
			tDriver.set(new FirefoxDriver());
			break;
		default:
			tDriver.set(new ChromeDriver());
			break;
		}
	}

	public static void closeBrowsertab() {
		tDriver.get().close();
	}

	public static void teardownDriver() {
		tDriver.get().quit();
		tDriver.set(null);
		tDriver.remove();
	}
}
