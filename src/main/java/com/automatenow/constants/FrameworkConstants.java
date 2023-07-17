package com.automatenow.constants;

import java.time.Duration;

public final class FrameworkConstants {
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")+ "/src/test/resources/";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "config/config.properties";
	private static final String JSONCONFIGFILEPATH = RESOURCESPATH + "config/config.json";

	private static final int EXPLICITWAIT = 10;
	
	
	private FrameworkConstants() {
		
	}
	
	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
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
	

}
