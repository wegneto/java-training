package com.wegneto.hackerrank.java.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TagContentExtractorTest {

	@Test
	public void test1() {
		String input = "<h1>Nayeem loves counseling</h1>";
		String result = TagContentExtractor.parse(input);
		String expected = "Nayeem loves counseling";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void test2() {
		String input = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		String result = TagContentExtractor.parse(input);
		String expected = "Sanjay has no watch\n" + "So wait for a while";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void test3() {
		String input = "<Amee>safat codes like a ninja</amee>";
		String result = TagContentExtractor.parse(input);
		String expected = "None";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void test4() {
		String input = "<SA premium>Imtiaz has a secret crush</SA premium>";
		String result = TagContentExtractor.parse(input);
		String expected = "Imtiaz has a secret crush";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void test5() {
		String input = "<h1>Hello World</h2>";
		String result = TagContentExtractor.parse(input);
		String expected = "None";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void test6() {
		String input = "<h1><a>contents</a>invalid</h1>";
		String result = TagContentExtractor.parse(input);
		String expected = "contents";
		Assert.assertEquals(expected, result);
	}

}
