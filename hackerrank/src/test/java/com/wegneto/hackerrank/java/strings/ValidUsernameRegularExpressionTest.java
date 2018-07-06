package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class ValidUsernameRegularExpressionTest {

	@Test
	public void shouldNotAllowUsernameWithLessThan8Chars() {
		String userName = "Julia";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldNotAllowUsernameWithMoreThan30Chars() {
		String userName = "Julia12345678901234567890Julia1";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldAllowUsernameWithExactly8Chars() {
		String userName = "Samantha";
		Assert.assertTrue(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldAllowUnderscoresAndNumbers() {
		String userName = "Samantha_21";
		Assert.assertTrue(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldNotAllowUsernameBeginningWithNonAlphaChar() {
		String userName = "1Samantha";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldNotAllowChars1() {
		String userName = "Samantha?1'_2A";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldAllowNumbers() {
		String userName = "JuliaZ007";
		Assert.assertTrue(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldNotAllowChars2() {
		String userName = "Julia@007";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	
	@Test
	public void shouldNotAllowUsernameBeginningWithCharOtherThanLetters() {
		String userName = "_Julia007";
		Assert.assertFalse(userName.matches(ValidUsernameRegularExpression.regularExpression));
	}
	

}
