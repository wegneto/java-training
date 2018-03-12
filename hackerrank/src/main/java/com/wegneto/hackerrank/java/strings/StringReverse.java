package com.wegneto.hackerrank.java.strings;

import java.util.Scanner;

public class StringReverse {
	
	public static String reverse(String str) {
		int last = str.length() - 1;
		int limit = last / 2;
		
		for(int i = 0; i < limit; i++) {
			if (str.charAt(i) != str.charAt(last - i)) {
				return "No";
			}
		}
		
		return "Yes";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(reverse(A));
	}

}
