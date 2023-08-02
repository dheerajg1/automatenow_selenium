package com.automatenow.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automatenow.pages.OrangeHRMHomePage;
import com.automatenow.pages.OrangeHRMLoginPage;
import com.automatenow.reports.ExtentReport;

public final class OrangeHRMTests extends BaseTest{
	
	private OrangeHRMTests() {
		
	}
	

	@Test(dataProvider="LoginTestDataProvider")
	public void loginLogoutTest(String username, String password) throws InterruptedException {
		/*
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		ohlp.enterUsername("Admin").enterPassword("admin123").clickLogin();
		Thread.sleep(5000);
		
		
		OrangeHRMHomePage ohhp = new OrangeHRMHomePage();
		ohhp.clickUsername().clickLogout();
		*/
		
		//ExtentReport.createTest("loginLogoutTest");
		
		String title = new OrangeHRMLoginPage().enterUsername(username).enterPassword(password).clickLogin()
				.clickUsername().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}
	

	@Test(dataProvider="LoginTestDataProvider")
	public void newTest(String username, String password) throws InterruptedException {
		/*
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		ohlp.enterUsername("Admin").enterPassword("admin123").clickLogin();
		Thread.sleep(5000);
		
		
		OrangeHRMHomePage ohhp = new OrangeHRMHomePage();
		ohhp.clickUsername().clickLogout();
		*/
		
		//ExtentReport.createTest("loginLogoutTest");
		
		String title = new OrangeHRMLoginPage().enterUsername(username).enterPassword(password).clickLogin()
				.clickUsername().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}
	
	@DataProvider(name="LoginTestDataProvider", parallel = true)
	public Object[][] getData(){
		return new Object[][] {
			{"Admin", "admin123"},
//			{"Admin1", "admin123"},
//			{"Admin", "admin123"},
//			{"Admin123", "admin123"}
		};
	}
}

