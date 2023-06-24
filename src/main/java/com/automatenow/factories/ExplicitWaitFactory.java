package com.automatenow.factories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automatenow.constants.FrameworkConstants;
import com.automatenow.driver.DriverManager;
import com.automatenow.enums.WaitStrategy;

public class ExplicitWaitFactory {
	
	public static WebElement performExplicitWait(WaitStrategy wait, By by) {
		
		WebElement element = null;
		
		//ExpectedConditions.elementToBeClicable and other methods return WebElement
		
		if(wait == WaitStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitwait()))
			.until(ExpectedConditions.elementToBeClickable(by));
		}else if(wait == WaitStrategy.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitwait()))
			.until(ExpectedConditions.presenceOfElementLocated(by));
		}else if(wait == WaitStrategy.VISIBLE) {
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitwait()))
			.until(ExpectedConditions.visibilityOfElementLocated(by));
		}else {
			element = DriverManager.getDriver().findElement(by);
		}
		return element;
		
	}
}
