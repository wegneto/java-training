package com.wegneto.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class App {
	
	public static void main(String[] args) {
		Faker faker = new Faker();
		
		List<Employee> employees = new ArrayList<Employee>() {{
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
		}};
		
		employees.forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));
		
		System.out.println("=============");
		
		List<Employee> filtered = new ArrayList<>();

		for (Employee e : employees) {
			if (e.getSalary() > 600F) {
				filtered.add(e);
			}
		} 
		
		for (Employee e : filtered) {
			System.out.println(e.getName());
		} 
		
	}
	
	@AllArgsConstructor
	static class Employee {
		@Getter @Setter private String name;
		@Getter @Setter private Double salary;
	}
}