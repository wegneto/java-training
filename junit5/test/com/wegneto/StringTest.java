package com.wegneto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void length() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	void toUpperCase() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertEquals("ABCD", result);
	}
	
	@Test
	void contains() {
		assertFalse("abcdefgh".contains("ijk"));
	}

}
