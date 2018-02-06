package com.wegneto.hackerrank.core.general;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisibleSumPairsTest {

	@Test
	public void case1() {
		int actual = DivisibleSumPairs.divisibleSumPairs(6, 3, new int[] { 1, 3, 2, 6, 1, 2 });
		int expected = 5;

		assertEquals(expected, actual);
	}
	
	@Test
	public void case2() {
		int actual = DivisibleSumPairs.divisibleSumPairs(6, 1, new int[] { 1, 3, 2, 6, 1, 2 });
		int expected = 15;

		assertEquals(expected, actual);
	}

}
