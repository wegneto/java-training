package com.wegneto.hackerrank.core.math.numbertheory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmithNumbersTest {

	@Test
	public void test() {
		SmithNumbers smithNumbers = new SmithNumbers();
		boolean actual = smithNumbers.isSmithNumber(378);
		assertEquals(true, actual);
	}

}
