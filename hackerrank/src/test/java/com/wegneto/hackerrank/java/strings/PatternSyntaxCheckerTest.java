package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class PatternSyntaxCheckerTest {

	@Test
	public void test1() {
		boolean result = PatternSyntaxChecker.checkPattern("([A-Z])(.+)");
		Assert.assertTrue(result);
	}
	
	@Test
	public void test2() {
		boolean result = PatternSyntaxChecker.checkPattern("[AZ[a-z](a-z)");
		Assert.assertFalse(result);
	}
	
	@Test
	public void test3() {
		boolean result = PatternSyntaxChecker.checkPattern("batcatpat(nat");
		Assert.assertFalse(result);
	}

}
