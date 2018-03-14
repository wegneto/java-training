package com.wegneto.hackerrank.java.strings;

import java.util.Scanner;

public class StringTokens {

	public static String[] split(String str) {
		str = str.trim();
		String[] tokens = str.split("[^\\p{Alpha}]+");
		return tokens;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		scan.close();

		String[] tokens = split(s);
		int size = s.isEmpty() ? 0 : tokens.length;
		System.out.println(size);
		for (String string : tokens) {
			System.out.println(string);
		}

	}

}
