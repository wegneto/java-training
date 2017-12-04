package com.wegneto.lambdaexpressions;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

public class UserGenerator {
	
	public static void main(String[] args) {
		Faker faker = new Faker();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i = 0; i < 100; i++) {
			System.out.println(faker.internet().emailAddress() + " - " + formatter.format(faker.date().past(5000, TimeUnit.DAYS)));
		}

	}

}
