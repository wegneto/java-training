package com.wegneto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data for: " + info.getDisplayName());
	}
	
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("Clean up Test Data for: " + info.getDisplayName());
	}

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
	
	@Test
	void split() {
		String str = "abc def ghi";
		String[] actualResult = str.split(" ");
		String[] expectedResult = new String[] {"abc", "def", "ghi"};
		
		assertArrayEquals(expectedResult, actualResult);
	}

}
