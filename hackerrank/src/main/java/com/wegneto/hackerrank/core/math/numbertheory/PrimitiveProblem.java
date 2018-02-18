package com.wegneto.hackerrank.core.math.numbertheory;

import java.util.Set;
import java.util.TreeSet;

public class PrimitiveProblem {

	public String solution(int p) {
		Set<Integer> factors = new TreeSet<>();
		final int S = (p-1);
		int s = S;
		for (int i = 2;i <= s; i++) {
		    while (s % i == 0) {
		    		factors.add(i);
		    		s /= i;
		    }
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int g = 2; g < (p-1); g++) {
			boolean found = true;
			for (Integer factor : factors) {
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
				if (min > g) {
					min = g;
				}
			}
		}
		
		double count = p-1;
		
		for (Integer factor : factors) {
			Double div = (double) 1/factor;
			Double sub = (double) 1 - div;
			//System.out.println(sub);
			count *= sub;
		}
		
		return min + " " + (int)count;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Math.pow(3, i) % 7);
		}
	}

}
