package com.wegneto;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void length() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		Assertions.assertEquals(expectedLength, actualLength);
	}
	
	@Test
	void toUpperCase() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertEquals("ABCD", result);
	}
	
	@Test
	void contains() {
		String str = "abcdefgh";
		boolean result = str.contains("ijk");
		
		assertEquals(false, result);
	}

}
