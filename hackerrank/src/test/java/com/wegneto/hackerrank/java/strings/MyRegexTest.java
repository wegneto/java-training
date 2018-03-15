package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class MyRegexTest {

	@Test
	public void test1() {
		boolean result = "000.12.12.034".matches(MyRegex.pattern);
		Assert.assertTrue(result);
	}

	@Test
	public void test2() {
		boolean result = "121.234.12.12".matches(MyRegex.pattern);
		Assert.assertTrue(result);
	}
	
	@Test
	public void test3() {
		boolean result = "23.45.12.56".matches(MyRegex.pattern);
		Assert.assertTrue(result);
	}
	
	@Test
	public void test4() {
		boolean result = "00.12.123.123123.123".matches(MyRegex.pattern);
		Assert.assertFalse(result);
	}
	
	@Test
	public void test5() {
		boolean result = "122.23".matches(MyRegex.pattern);
		Assert.assertFalse(result);
	}
	
	@Test
	public void test6() {
		boolean result = "Hello.IP".matches(MyRegex.pattern);
		Assert.assertFalse(result);
	}
	
	@Test
	public void test7() {
		boolean result = "666.666.23.23".matches(MyRegex.pattern);
		Assert.assertFalse(result);
	}

}
