package com.automatenow.pages;

import org.openqa.selenium.By;

import com.automatenow.driver.DriverManager;

public final class OrangeHRMHomePage {

	private final By link_username = By.xpath("//*[contains(@class, 'oxd-userdropdown-name')]");
	private final By link_logout = By.xpath("//*[text()='Logout']");

	public OrangeHRMHomePage clickUsername() {
		DriverManager.getDriver().findElement(link_username).click();
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		DriverManager.getDriver().findElement(link_logout).click();
		return new OrangeHRMLoginPage();
	}
}
