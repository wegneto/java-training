package com.wegneto.hackerrank.core.math.numbertheory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int m = p - 1;
		int primeRoot = 0;
		Map<Integer, Integer> primeFactor = getPrimeFactor(m);
		BigDecimal totalNumberOfPrimitiveRoots = BigDecimal.valueOf(m);
		for (Map.Entry<Integer, Integer> map : primeFactor.entrySet()) {
			totalNumberOfPrimitiveRoots = totalNumberOfPrimitiveRoots.multiply(BigDecimal.ONE
					.subtract(BigDecimal.ONE.divide(BigDecimal.valueOf(map.getKey()), 2, RoundingMode.HALF_UP)));
			primeFactor.put(map.getKey(), m / map.getKey());
		}
		for (int i = 2; i <= m; i++) {
			boolean notPrimeRoot = false;
			Set<Integer> reminder = new HashSet<>();
			for (Map.Entry<Integer, Integer> map : primeFactor.entrySet()) {
				if (BigInteger.valueOf(i).modPow(BigInteger.valueOf(map.getValue()), BigInteger.valueOf(p))
						.equals(BigInteger.ONE))
					notPrimeRoot = true;
			}
			if (!notPrimeRoot) {
				primeRoot = i;
				break;
			}
		}
		System.out.println(primeRoot + " " + totalNumberOfPrimitiveRoots.intValue());
	}

	private static Map<Integer, Integer> getPrimeFactor(int p) {
		Map<Integer, Integer> map = new HashMap<>();
		while (p % 2 == 0) {
			insertToMap(2, map);
			p /= 2;
		}

		for (int i = 3; i <= Math.sqrt(p); i += 2) {
			while (p % i == 0) {
				insertToMap(i, map);
				p /= i;
			}
		}

		if (p > 2)
			insertToMap(p, map);
		return map;
	}

	private static void insertToMap(int i, Map<Integer, Integer> map) {
		if (map.get(i) != null) {
			map.put(i, map.get(i) + 1);
		} else {
			map.put(i, 1);
		}
	}

}
