package com.automatenow.pages;

import org.openqa.selenium.By;

import com.automatenow.driver.DriverManager;

public class BasePage {
	
	protected void sendKeys(By by, String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	protected void click(By by) {
		DriverManager.getDriver().findElement(by).click();
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
}
