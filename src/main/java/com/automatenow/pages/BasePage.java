package com.automatenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automatenow.driver.DriverManager;
import com.automatenow.enums.WaitStrategy;
import com.automatenow.factories.ExplicitWaitFactory;
import com.automatenow.reports.ExtentLogger;

public class BasePage {
	
	WebElement element;
	
	protected void sendKeys(By by, String value, WaitStrategy waitstrategy, String elementName) {
		element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
		try {
			ExtentLogger.pass(value + " is entered in " + elementName + " successfully.", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void click(By by, WaitStrategy waitstrategy, String elementName) {
		element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.click();
		try {
			ExtentLogger.pass(elementName + " is clicked successfully", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
}
