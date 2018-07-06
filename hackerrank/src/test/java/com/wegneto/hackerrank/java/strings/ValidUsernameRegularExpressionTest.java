package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class ValidUsernameRegularExpressionTest {

	@Test
	public void test1() {
		String userName = "Julia";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void test2() {
		String userName = "Samantha";
		Assert.assertTrue(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void test3() {
		String userName = "Samantha_21";
		Assert.assertTrue(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void test4() {
		String userName = "1Samantha";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void test5() {
		String userName = "Samantha?1'_2A";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	

}
