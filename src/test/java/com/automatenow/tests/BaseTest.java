package com.automatenow.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automatenow.driver.Driver;
import com.automatenow.reports.ExtentReport;

public class BaseTest {
	
	protected BaseTest() {
		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@AfterSuite
	public void afterSuite() throws IOException {
		
	}

	@BeforeMethod
	protected void setUp() throws Exception {
		Driver.initDriver();
		
	}
	
	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}
}
