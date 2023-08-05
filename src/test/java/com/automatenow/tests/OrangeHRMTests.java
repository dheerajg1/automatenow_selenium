package com.automatenow.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automatenow.listeners.RetryFailedTests;
import com.automatenow.pages.OrangeHRMHomePage;
import com.automatenow.pages.OrangeHRMLoginPage;
import com.automatenow.reports.ExtentReport;
import com.automatenow.utils.DataProviderUtils;

public final class OrangeHRMTests extends BaseTest{
	
	private OrangeHRMTests() {
		
	}
	

	@Test
	public void loginLogoutTest(Map<String, String> data) throws InterruptedException {
		/*
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		ohlp.enterUsername("Admin").enterPassword("admin123").clickLogin();
		Thread.sleep(5000);
		
		
		OrangeHRMHomePage ohhp = new OrangeHRMHomePage();
		ohhp.clickUsername().clickLogout();
		*/
		
		//ExtentReport.createTest("loginLogoutTest");
		
		String title = new OrangeHRMLoginPage().enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin()
				.clickUsername().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}
	

	@Test
	public void newTest(Map<String, String> data) throws InterruptedException {
		/*
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		ohlp.enterUsername("Admin").enterPassword("admin123").clickLogin();
		Thread.sleep(5000);
		
		
		OrangeHRMHomePage ohhp = new OrangeHRMHomePage();
		ohhp.clickUsername().clickLogout();
		*/
		
		//ExtentReport.createTest("loginLogoutTest");
		
		String title = new OrangeHRMLoginPage().enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin()
				.clickUsername().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}
	
}

