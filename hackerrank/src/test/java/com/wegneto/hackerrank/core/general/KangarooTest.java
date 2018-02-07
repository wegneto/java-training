package com.wegneto.hackerrank.core.general;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KangarooTest {

	@Test
	public void case1() {
		String actual = Kangaroo.kangaroo(0, 3, 4, 2);
		String expected = "YES";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void case2() {
		String actual = Kangaroo.kangaroo(0, 2, 5, 3);
		String expected = "NO";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void case3() {
		String actual = Kangaroo.kangaroo(1, 3, 4, 2);
		String expected = "YES";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void case4() {
		String actual = Kangaroo.kangaroo(1, 5, 3, 4);
		String expected = "YES";
		
		assertEquals(expected, actual);
	}
}
