package com.automatenow.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.automatenow.driver.DriverManager;

public final class LoginPageTests extends BaseTest{

	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("power star", Keys.ENTER);
		
	}

	@Test
	public void test2() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("pawan kalyan", Keys.ENTER);
		
	}
	
	
	
}
