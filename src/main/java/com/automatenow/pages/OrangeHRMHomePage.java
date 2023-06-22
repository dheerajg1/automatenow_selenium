package com.automatenow.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automatenow.driver.DriverManager;

public final class OrangeHRMHomePage extends BasePage{

	private final By linkUsername = By.xpath("//*[contains(@class, 'oxd-userdropdown-name')]");
	private final By linkLogout = By.xpath("//*[text()='Logout']");
	private WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
	
	
	
	public OrangeHRMHomePage clickUsername() {
		wait.until(ExpectedConditions.presenceOfElementLocated(linkUsername));
		click(linkUsername);
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		wait.until(ExpectedConditions.elementToBeClickable(linkLogout));
		click(linkLogout);
		return new OrangeHRMLoginPage();
	}
}
