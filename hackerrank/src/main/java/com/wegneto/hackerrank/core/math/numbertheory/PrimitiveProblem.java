package com.wegneto.hackerrank.core.math.numbertheory;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveProblem {

	public String solution(int p) {
		int min = 0;
		final int S = (p - 1);
		int totalNumberOfPrimitiveRoots = S;
		List<Integer> primeDivisors = new ArrayList<>();

		int number = S;
		for (int i = 2; i <= number; i++) {
			boolean isFactor = false;
			while (number % i == 0) {
				number /= i;
				isFactor = true;
			}
			if (isFactor) {
				Double div = (double) 1 / i;
				Double sub = (double) 1 - div;
				totalNumberOfPrimitiveRoots *= sub;
				primeDivisors.add(i);
			}
		}

		for (int g = 2; g < S; g++) {
			if (g % Math.sqrt(g) != 0) {
				boolean found = true;
				for (Integer factor : primeDivisors) {
					int power = S / factor;
					int e = 1;
					for (int i = 0; i < power; i++) {
						e = ((e * g) % p);
					}
					if (e == 1) {
						found = false;
						break;
					}
				}

				if (found) {
					min = g;
					break;
				}
			}
		}

		System.out.println(min + " " + totalNumberOfPrimitiveRoots);
		return min + " " + totalNumberOfPrimitiveRoots;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Math.pow(3, i) % 7);
		}
	}

}
