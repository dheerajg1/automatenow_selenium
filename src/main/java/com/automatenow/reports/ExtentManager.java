package com.automatenow.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
	
	private ExtentManager() {
		
	}
	
	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<ExtentTest>();

	public static ExtentTest getExtTest() {
		return extTest.get();
	}

	public static void setExtTest(ExtentTest test) {
		extTest.set(test);
	}

	public static void unload() {
		extTest.remove();
	}

}
