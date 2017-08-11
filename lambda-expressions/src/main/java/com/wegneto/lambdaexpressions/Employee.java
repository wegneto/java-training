package com.wegneto.lambdaexpressions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Employee {
	@Getter @Setter private String name;
	@Getter @Setter private Double salary;
}
