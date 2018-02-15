package com.wegneto.hackerrank.core.math.numbertheory;

public class SmithNumbers {
	
	private int sumDigits(int number) {
		String numberAsString = Integer.toString(number);
		int digitsSum = 0;
		for (int i = 0; i < numberAsString.length(); i++) {
			digitsSum += Integer.parseInt(Character.toString(numberAsString.charAt(i)));
		}
		return digitsSum;
	}

	public boolean isSmithNumber(int number) {
		int digitsSum = sumDigits(number);
		
		int primeFactorsSum = 0;
		for (int i = 2;i <= number; i++) {
		    while (number % i == 0) {
		    		primeFactorsSum += sumDigits(i);
		    		number /= i;
		    }
		}
		
		return (digitsSum == primeFactorsSum);
	}

}
