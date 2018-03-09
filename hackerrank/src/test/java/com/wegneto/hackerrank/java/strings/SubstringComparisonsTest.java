package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class SubstringComparisonsTest {

	@Test
	public void test1() {
		String[] result = SubstringComparisons.getSmallestAndLargest("welcometojava", 3);
		Assert.assertEquals("ava", result[0]);
		Assert.assertEquals("wel", result[1]);
	}

}
