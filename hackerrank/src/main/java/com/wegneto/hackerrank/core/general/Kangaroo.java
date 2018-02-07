package com.wegneto.hackerrank.core.general;

public class Kangaroo {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if (v1 <= v2) {
			return "NO";
		}
		
		if ((x2 - x1) % (v1 - v2) == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static String bruteForce(int x1, int v1, int x2, int v2) {
		if (v1 <= v2) {
			return "NO";
		}
		
		while (x1 <= x2) {
			x1 = x1 + v1;
			x2 = x2 + v2;
			
			if (x1 == x2) {
				return "YES";
			}
		}
		
		return "NO";
	}

}
