package com.wegneto.hackerrank.java.strings;

import java.util.Scanner;

public class SubstringComparisons {

	public static String[] getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] result = new String[2];
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - (k-1); i++) {
        		String temp = s.substring(i, i + k);
        		if (smallest.isEmpty() && largest.isEmpty()) {
        			smallest = temp;
        			largest = temp;
        		} else if (temp.compareTo(smallest) < 0) {
        			smallest = temp;
        		} else if (temp.compareTo(largest) > 0) {
        			largest = temp;
        		}
        		
        }
        
        result[0] = smallest;
        result[1] = largest;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        String[] result = getSmallestAndLargest(s, k);
        
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
