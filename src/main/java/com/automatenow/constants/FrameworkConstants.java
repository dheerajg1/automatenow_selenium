package com.automatenow.constants;

import java.time.Duration;

import com.automatenow.enums.ConfigProperties;
import com.automatenow.utils.PropertyUtils;

public final class FrameworkConstants {
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")+ "/src/test/resources/";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "executables/chromedriver.exe";
	private static final String GECKODRIVERPATH = RESOURCESPATH + "executables/geckodriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "config/config.properties";
	private static final String JSONCONFIGFILEPATH = RESOURCESPATH + "config/config.json";
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir") + "/extent-test-output/"; 
	private static final String EXCELPATH = RESOURCESPATH + "/excel/testdata.xlsx";
	private static final String RUNMANAGERSHEET = "RUNMANAGER";
	private static final String ITERATIONDATASHEET = "DATA";
	

	
	public static String getRunManagerSheet() {
		return RUNMANAGERSHEET;
	}

	public static String getIterationDataSheet() {
		return ITERATIONDATASHEET;
	}

	private static String extentReportFilePath = "";
	private static final int EXPLICITWAIT = 10;
	
	
	private FrameworkConstants() {
		
	}
	
	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	public static String getGeckoDriverPath() {
		return GECKODRIVERPATH;
	}
	
	public static String getExcelPath() {
		return EXCELPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	
	public static String getJsonconfigfilepath() {
		return JSONCONFIGFILEPATH;
	}
	
	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}
	
//	public static String getExtentReportPath() throws Exception {
//		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
//			return EXTENTREPORTPATH + System.currentTimeMillis()+"_index.html";
//		}else {
//			return EXTENTREPORTPATH +"_index.html";
//		}
//		
//	}
	
	public static String getExtentReportFilePath() throws Exception {
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath = createReportPath();
		}
		return extentReportFilePath;
	}
	
	private static String createReportPath() throws Exception {
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH + System.currentTimeMillis() + "/index.html";
		}else {
			return EXTENTREPORTFOLDERPATH + "/index.html";
		}
	}
}
