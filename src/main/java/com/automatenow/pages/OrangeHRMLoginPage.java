package com.automatenow.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automatenow.driver.DriverManager;

public final class OrangeHRMLoginPage extends BasePage{
	
	public final By textboxUsername = By.xpath("//*[@name='username']");
	public final By textboxPassword = By.xpath("//*[@name='password' and @type='password']");
	public final By btnLogin = By.xpath("//*[@type='submit']");
	private WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
	
	public OrangeHRMLoginPage enterUsername(String username) {
		wait.until(ExpectedConditions.presenceOfElementLocated(textboxUsername));
		sendKeys(textboxUsername, username);
		return this;
		
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password);
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() {
		click(btnLogin);
		return new OrangeHRMHomePage();
	}
	
	public String getTitle() {
		return getPageTitle();
	}

}
