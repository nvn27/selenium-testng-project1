package com.tests;

import org.testng.annotations.Test;

import com.driver.DriverManager;
import com.logs.Logger;
import com.report.AllureReport;

import io.qameta.allure.Allure;

public class Test1 extends BaseTest {

	@Test
	public void test1() {
		System.out.println(DriverManager.getDriver().getTitle());
		Logger.logInfo(DriverManager.getDriver().getTitle());
		AllureReport.allureStep("Browser title: " + DriverManager.getDriver().getTitle());
	}
}
