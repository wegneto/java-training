package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest {

	@Test
	public void test1() {
		Assert.assertEquals("Yes", StringReverse.reverse("madam"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals("No", StringReverse.reverse("teste"));
	}
}
