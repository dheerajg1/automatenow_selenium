package com.automatenow.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automatenow.constants.FrameworkConstants;
import com.automatenow.enums.ConfigProperties;
import com.automatenow.utils.PropertyUtils;

public final class Driver {

	private Driver() {

	}

	public static void initDriver(String browser) throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
				DriverManager.setDriver(new ChromeDriver());
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", FrameworkConstants.getGeckoDriverPath());
				DriverManager.setDriver(new FirefoxDriver());
			}
			
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
		}

	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}
}
