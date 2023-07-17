package com.automatenow.pages;

import org.openqa.selenium.By;

import com.automatenow.enums.WaitStrategy;
import com.automatenow.reports.ExtentManager;
import com.automatenow.reports.ExtentReport;

public final class OrangeHRMHomePage extends BasePage{

	private final By linkUsername = By.xpath("//*[contains(@class, 'oxd-userdropdown-name')]");
	private final By linkLogout = By.xpath("//*[text()='Logout']");
	
	
	public OrangeHRMHomePage clickUsername() {
		click(linkUsername, WaitStrategy.CLICKABLE);
		ExtentManager.getExtTest().pass("Username clicked");
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		click(linkLogout, WaitStrategy.CLICKABLE);
		ExtentManager.getExtTest().pass("Logout button clicked");
		return new OrangeHRMLoginPage();
	}
}
