package com.automatenow.tests;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automatenow.driver.DriverManager;

public final class HomePageTests extends BaseTest{
	private HomePageTests() {
		
	}
	
	@Test
	public void test3() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube", Keys.ENTER);
		
		String title = DriverManager.getDriver().getTitle();
		
		assertThat(title)
		.as("Title is actually null").isNotNull()
		.as("Title does not contain expected text").containsIgnoringCase("google search")
		.matches("\\w.*" + "Google Search")
		.hasSizeBetween(15, 50);
		
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));
		
		assertThat(elements)
		.hasSize(9)
		.extracting(e->e.getText().toLowerCase())
		.contains("testing mini bytes");
		
	}

}
