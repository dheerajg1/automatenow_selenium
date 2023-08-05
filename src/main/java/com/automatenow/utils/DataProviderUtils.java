package com.automatenow.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.automatenow.constants.FrameworkConstants;

public final class DataProviderUtils {
	
	private static List<Map<String, String>> list = new ArrayList<Map<String,String>>();
	
	@DataProvider(parallel = true)
	public static Object[] getData(Method m) {
		
		String testname = m.getName();
		System.out.println("Test Name : " + testname);
		
		if(list.isEmpty()) {
			list = ExcelUtils.getTestDetails(FrameworkConstants.getIterationDataSheet());
		}

		List<Map<String, String>> executableList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).get("testname").equalsIgnoreCase(testname) && list.get(i).get("execute").equalsIgnoreCase("yes")) {
					executableList.add(list.get(i));
				}
		}
		return executableList.toArray();
	}
}
