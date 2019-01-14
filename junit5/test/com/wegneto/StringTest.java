package com.wegneto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Doing some generic initialization..");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("Doing some generic clean up..");
	}

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
		String[] expectedResult = new String[] { "abc", "def", "ghi" };

		assertArrayEquals(expectedResult, actualResult);
	}

	@Test
	@DisplayName("When length is null, throw an exception")
	void lengthException() {
		String str = null;
		assertThrows(NullPointerException.class, () -> {
			str.length();
		});
	}

	@ParameterizedTest
	@ValueSource(strings = { "ABCD", "ABC", "A", "DEF" })
	void lengthGreaterThanZero(String str) {
		assertTrue(str.length() > 0);
	}

	@ParameterizedTest(name = "{0} toUpperCase is {1}")
	@CsvSource(value = { "abcd, ABCD", "abc, ABC", "'',''", "def, DEF" })
	void uppercase(String word, String capitalizedWord) {
		assertEquals(capitalizedWord, word.toUpperCase());
	}
	
	@ParameterizedTest(name = "{0} length is {1}")
	@CsvSource(value = { "abcd, 4", "abc, 3", "'',0", "def, 3" })
	void length(String word, int expectedLenght) {
		assertEquals(expectedLenght, word.length());
	}

}
