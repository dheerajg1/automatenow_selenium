package com.automatenow.misc;

import org.testng.annotations.DataProvider;

public class Employee {
	
	private String name;
	private int id;
	
	public Employee(String name, int empId) {
		this.name = name;
		this.id = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	@DataProvider
	public static Employee[] getData3() {
		
		return 	new Employee[] {
				new Employee("dhee", 123),
				new Employee("raj", 234)
		};
	}
	
	
}
