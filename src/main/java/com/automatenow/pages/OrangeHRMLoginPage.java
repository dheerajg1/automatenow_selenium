package com.automatenow.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automatenow.constants.FrameworkConstants;
import com.automatenow.driver.DriverManager;
import com.automatenow.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage{
	
	public final By textboxUsername = By.xpath("//*[@name='username']");
	public final By textboxPassword = By.xpath("//*[@name='password' and @type='password']");
	public final By btnLogin = By.xpath("//*[@type='submit']");
	
	public OrangeHRMLoginPage enterUsername(String username) {
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE);
		return this;
		
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() {
		click(btnLogin, WaitStrategy.NONE);
		return new OrangeHRMHomePage();
	}
	
	public String getTitle() {
		return getPageTitle();
	}

}
