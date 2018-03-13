package com.wegneto.hackerrank.java.strings;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] splited = s.trim().split("[ !,?._'@]+");
        System.out.println(s.trim().isEmpty() ? 0 : splited.length);
        for (String string : splited) {
			System.out.println(string);
		}
        scan.close();
    }
	
}
