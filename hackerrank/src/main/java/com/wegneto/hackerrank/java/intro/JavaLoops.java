package com.wegneto.hackerrank.java.intro;

import java.util.Scanner;

public class JavaLoops {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 1; i < 11; i++) {
        		System.out.printf("%d x %d = %d\n", n, i, (n*i));
        }
	}

}
