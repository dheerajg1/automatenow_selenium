package com.automatenow.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {
	
	@Test
	public void test1() throws IOException {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		extent.attachReporter(spark);
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Automate Now");
		
		ExtentTest test = extent.createTest("First test");
		test.pass("Checking the logs!");
		
		ExtentTest test1 = extent.createTest("First test");
		test1.pass("Checking the logs in second test!");
		
		extent.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());;
		
	}
}
