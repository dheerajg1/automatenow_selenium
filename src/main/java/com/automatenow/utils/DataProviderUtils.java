package com.automatenow.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public final class DataProviderUtils {
	
	private static List<Map<String, String>> list = new ArrayList<Map<String,String>>();
	
	@DataProvider
	public static Object[] getData(Method m) {
		
		String testname = m.getName();
		System.out.println("Test Name : " + testname);
		
		if(list.isEmpty()) {
			list = ExcelUtils.getTestDetails("DATA");
		}

		List<Map<String, String>> executableList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).get("testname").equalsIgnoreCase(testname)) {
				if(list.get(i).get("execute").equalsIgnoreCase("yes")) {
					executableList.add(list.get(i));
				}
			}
		}
		System.out.println("No. of Test cases to be executed : " + executableList.size());
		
		list.removeAll(executableList); //to filter master list by removing already executed test cases
		return executableList.toArray();
	}
}
