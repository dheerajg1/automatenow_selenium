package com.automatenow.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.automatenow.constants.FrameworkConstants;

public final class ReadPropertyFile {

	private ReadPropertyFile() {

	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<String, String>();

	static {

		try {
			FileInputStream file = new FileInputStream(
					FrameworkConstants.getConfigFilePath());

			property.load(file);

			/*
			 * USING KEYSET IN FOR LOOP
			 * 
			 * for(Object key : property.keySet()) {
			 * CONFIGMAP.put(String.valueOf(key), String.valueOf(property.get(key))); }
			 */

			// USING ENTRYSET AS SONAL LINT SUGGESTED
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()); 
				//trim to remove trialing spaces
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// USING HASHMAP INSTEAD OF DIRECT PROPERIES FILE
	// ADVISABLE IF WE NEED TO READ PROPERTIES FILE AGAIN AND AGAIN, ELSE USE
	// getValue FUNCTION
	public static String get(String key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
			throw new Exception("Property value is not found. Please check config.properties file");
		}
		return CONFIGMAP.get(key);

	}

	public static String getValue(String key) throws Exception {

		if (Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {
			throw new Exception("Property value is not found. Please check config.properties file");
		}
		return property.getProperty(key);
	}
}
