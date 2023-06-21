package com.automatenow.tests;

import org.testng.annotations.Test;

import com.automatenow.pages.OrangeHRMHomePage;
import com.automatenow.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest{
	
	private OrangeHRMTests() {
		
	}
	
	@Test
	public void loginLogoutTest() throws InterruptedException {
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		ohlp.enterUsername("Admin").enterPassword("admin123").clickLogin();
		Thread.sleep(5000);
		
		
		OrangeHRMHomePage ohhp = new OrangeHRMHomePage();
		ohhp.clickUsername().clickLogout();
	}
}

