package com.automatenow.misc;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="getData3", dataProviderClass = Employee.class)
	public void test1(Employee emp) {
		System.out.println("Usernanme : " + emp.getName());
		System.out.println("Emp ID : " + emp.getId());		
	}
	
	@Test(dataProvider="getData1")
	public void test2(Employee emp) {
		System.out.println("Usernanme : " + emp.getName());
		System.out.println("Emp ID : " + emp.getId());		
	}
	
	@Test(dataProvider="getData1")
	public void test3(String username) {
		System.out.println("Usernanme : " + username);		
	}

	
	@DataProvider
	public static Object[] getData1(Method m) {
		
		if(m.getName().equalsIgnoreCase("test2")) {
			return 	new Employee[] {
					new Employee("dhee", 123),
					new Employee("raj", 234)
			};
		}else if (m.getName().equalsIgnoreCase("test3")) {
			return new Object[] {
					"dhee",
					"automate",
					"now"
				};
		}
		return null;
		
		
	}
	
}
