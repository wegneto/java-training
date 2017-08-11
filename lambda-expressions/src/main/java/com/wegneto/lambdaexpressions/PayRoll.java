package com.wegneto.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class PayRoll {
	
	public List<Employee> getEmployees(Condition<Employee> condition) {
		Faker faker = new Faker();
		
		List<Employee> employees = new ArrayList<Employee>() {{
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
			add(new Employee(faker.name().fullName(), faker.number().randomDouble(2, 500, 1000)));
		}};
		
		List<Employee> filtered = new ArrayList<>();
		
		employees.forEach(e -> {
			if (condition.test(e) ) {
				filtered.add(e);
			}
		});
		
		return filtered;
	}

}
