package com.automatenow.pages;

import org.openqa.selenium.By;

import com.automatenow.driver.DriverManager;

public final class OrangeHRMLoginPage {
	
	public final By textbox_username = By.xpath("//*[@name='username']");
	public final By textbox_password = By.xpath("//*[@name='password' and @type='password']");
	public final By button_login = By.xpath("//*[@type='submit']");
	
	public OrangeHRMLoginPage enterUsername(String username) {
		DriverManager.getDriver().findElement(textbox_username).sendKeys(username);
		return this;
		
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		DriverManager.getDriver().findElement(textbox_password).sendKeys(password);
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() {
		DriverManager.getDriver().findElement(button_login).click();
		return new OrangeHRMHomePage();
	}

}
