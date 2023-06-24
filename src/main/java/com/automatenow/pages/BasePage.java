package com.automatenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automatenow.driver.DriverManager;
import com.automatenow.enums.WaitStrategy;
import com.automatenow.factories.ExplicitWaitFactory;

public class BasePage {
	
	WebElement element;
	
	protected void sendKeys(By by, String value, WaitStrategy waitstrategy) {
		element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
	}
	
	protected void click(By by, WaitStrategy waitstrategy) {
		element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.click();
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
}
