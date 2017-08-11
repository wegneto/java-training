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
		
		employees.forEach(e -> {
			if (e.getSalary() > 600F) {
				filtered.add(e);
			}
		});

		filtered.forEach(f-> System.out.println(f.getName() + ": " + f.getSalary()));
	}
}