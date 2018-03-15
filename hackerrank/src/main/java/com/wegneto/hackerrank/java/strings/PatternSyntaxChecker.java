package com.wegneto.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			System.out.println(checkPattern(pattern) ? "Valid" : "Invalid");
			testCases--;
		}
		in.close();
	}

	public static boolean checkPattern(String regex) {
		try {
			Pattern.compile(regex);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
