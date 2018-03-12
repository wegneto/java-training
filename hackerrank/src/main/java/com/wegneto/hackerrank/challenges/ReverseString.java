package com.wegneto.hackerrank.challenges;

/*
Write a function that reverses the word order in a given string.

e.g.
I am in the correct order
-> order correct the in am I
*/
public class ReverseString {

	public static void reverse(String str) {
		String[] reverse = str.split(" ");
		for (int i = reverse.length - 1; i >= 0; i--) {
			System.out.print(reverse[i]);
			if (i != 0) {
				System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		reverse("I am in the correct order");
	}
	
}
