package com.wegneto.hackerrank.java.intro;

import java.util.Scanner;

public class StaticInitializerBlock {

	private static boolean flag = false;
	private static int B;
	private static int H;

	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
