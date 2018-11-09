package com.wegneto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		Assertions.assertEquals(expectedLength, actualLength);
	}

}
