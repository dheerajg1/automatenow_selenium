package com.automatenow.tests;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automatenow.driver.Driver;

public class BaseTest {
	
	protected BaseTest() {
		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@AfterSuite
	public void afterSuite() throws IOException {
		
	}

	@SuppressWarnings("unchecked")
	@BeforeMethod
	protected void setUp(Object[] data) throws Exception {
		
		Map<String, String> map = (Map<String, String>)data[0];
		Driver.initDriver(map.get("browser"));
		
	}
	
	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}
}
