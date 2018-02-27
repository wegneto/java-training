package com.wegneto.hackerrank.java.intro;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (sc.hasNext()) {
			System.out.println(++n + " " + sc.nextLine());
		}
		sc.close();
	}
	
}
