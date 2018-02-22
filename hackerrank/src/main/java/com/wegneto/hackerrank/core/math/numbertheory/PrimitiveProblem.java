package com.wegneto.hackerrank.core.math.numbertheory;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimitiveProblem {
	
	public String solveProblem(int primeNumber) {
		final int s = primeNumber - 1;
		int primeFactor = 0;
		int totalNumberOfPrimitiveRoots = s;
		
		Set<Integer> primeDivisors = findPrimeFactors(s);
		for (Integer factor : primeDivisors) {
			Double div = (double) 1 / factor;
			Double sub = (double) 1 - div;
			totalNumberOfPrimitiveRoots *= sub;
		}
		
		for (int g = 2; g < s; g++) {
			if (g % Math.sqrt(g) != 0) {
				boolean isPrimeFactor = true;
				for (Integer factor : primeDivisors) {
					int power = s / factor;
					if (BigInteger.valueOf(g).modPow(BigInteger.valueOf(power), BigInteger.valueOf(primeNumber)).equals(BigInteger.ONE)) {
						isPrimeFactor = false;
						break;
					}
				}

				if (isPrimeFactor) {
					primeFactor = g;
					break;
				}
			}
		}
		
		return primeFactor + " " + totalNumberOfPrimitiveRoots;
	}
	
	private Set<Integer> findPrimeFactors(int number) {
		Set<Integer> set = new TreeSet<>();
		while (number % 2 == 0) {
			set.add(2);
			number /= 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				set.add(i);
				number /= i;
			}
		}

		if (number > 2) {
			set.add(number);
		}
		
		return set;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        
		PrimitiveProblem solution = new PrimitiveProblem();
		System.out.println(solution.solveProblem(p));
	}

}
