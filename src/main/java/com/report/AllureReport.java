package com.report;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class AllureReport {

	@Step
	public static void allureStep(String msg) {
		Allure.step(msg);
	}

}
