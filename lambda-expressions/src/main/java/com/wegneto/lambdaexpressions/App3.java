package com.wegneto.lambdaexpressions;

import java.util.List;

public class App3 {
	
	public static void main(String[] args) {
		PayRoll payRoll = new PayRoll();
		
		List<Employee> employees = payRoll.getEmployees(
				e -> e.getSalary() > 600);
		
		employees.forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));
	}
}