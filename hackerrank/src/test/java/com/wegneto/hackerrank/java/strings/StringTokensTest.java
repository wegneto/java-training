package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class StringTokensTest {

	@Test
	public void test1() {
		String[] result = StringTokens.split("He is a very very good boy, isn't he?");
		Assert.assertEquals(10, result.length);
		Assert.assertEquals("He", result[0]);
		Assert.assertEquals("he", result[result.length-1]);	
	}
	
	@Test
	public void test2() {
		String[] result = StringTokens.split("Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!");
		Assert.assertEquals(21, result.length);
		Assert.assertEquals("Hello", result[0]);
		Assert.assertEquals("day", result[result.length-1]);	
	}
	
	@Test
	public void test3() {
		String[] result = StringTokens.split("                        ");
		Assert.assertEquals(1, result.length);
	}
	
	@Test
	public void test4() {
		String[] result = StringTokens.split("           YES      leading spaces        are valid,    problemsetters are         evillllll");
		Assert.assertEquals(8, result.length);
		Assert.assertEquals("YES", result[0]);
		Assert.assertEquals("evillllll", result[result.length-1]);	
	}
}
