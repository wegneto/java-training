package com.wegneto.hackerrank.java.intro;

import java.util.Scanner;

public class JavaIfElse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "Weird";
		if (n % 2 == 0 && ((n >= 2 && n <= 5) || (n > 20))) {
			ans = "Not Weird";
		}
		System.out.println(ans);
	}
}
