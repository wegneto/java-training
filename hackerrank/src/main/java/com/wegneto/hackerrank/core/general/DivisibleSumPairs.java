package com.wegneto.hackerrank.core.general;

public class DivisibleSumPairs {
	
	static int divisibleSumPairs(int n, int k, int[] array) {
		int count = 0;
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if ((array[i] + array[j]) % k == 0) {
					count ++;
				}
			}
		}
		
        return count;
    }

}
