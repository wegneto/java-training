package com.wegneto.hackerrank.java.strings;

import java.util.Scanner;

public class StringReverse {
	
	public static String reverse(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(reverse) ? "Yes" : "No";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(reverse(A));
	}

}
