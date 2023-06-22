package com.automatenow.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.automatenow.pages.OrangeHRMHomePage;
import com.automatenow.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest{
	
	private OrangeHRMTests() {
		
	}
	
	@Test
	public void loginLogoutTest() throws InterruptedException {
		/*
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		ohlp.enterUsername("Admin").enterPassword("admin123").clickLogin();
		Thread.sleep(5000);
		
		
		OrangeHRMHomePage ohhp = new OrangeHRMHomePage();
		ohhp.clickUsername().clickLogout();
		*/
		
		String title = new OrangeHRMLoginPage().enterUsername("Admin").enterPassword("admin123").clickLogin()
				.clickUsername().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}
}

