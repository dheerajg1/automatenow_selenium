package com.automatenow.misc;

import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithJson {
	
	@Test(dataProvider = "getData")
	public void testDPWithJson(Map<String, Object> map) {
		map.forEach((k, v)-> System.out.println(k + " : " + v));
	}
	
	@DataProvider
	public void getData(){
		
//		HashMap<String, Object> map1 = new ObjectMapper()
//				.readValue(new File(System.getProperty("user.dir") + "/src/test/resources/jsons/config.json"),
//						new TypeReference<HashMap<String, Object>>(){});
	}
}
