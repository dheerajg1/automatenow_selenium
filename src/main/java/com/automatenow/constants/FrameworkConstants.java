package com.automatenow.constants;

public final class FrameworkConstants {
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")+ "/src/test/resources/";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "config/config.properties";
	
	private FrameworkConstants() {
		
	}
	
	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
}
