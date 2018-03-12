package com.wegneto.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramsTest {

	@Test
	public void test() {
		Assert.assertTrue(Anagrams.isAnagram("anagram", "margana"));
	}

	@Test
	public void test2() {
		Assert.assertFalse(Anagrams.isAnagram("anagramm", "marganaa"));
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(Anagrams.isAnagram("Hello", "hello"));
	}
}
