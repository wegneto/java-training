package com.wegneto.hackerrank.core.math.numbertheory;

import org.junit.Assert;
import org.junit.Test;

public class PrimitiveProblemTest {

	//@Test
	public void test() {
		PrimitiveProblem primitiveProblem = new PrimitiveProblem();
		String result = primitiveProblem.solution(7);
		Assert.assertEquals("3 2", result);
	}
	
	//@Test
	public void test2() {
		PrimitiveProblem primitiveProblem = new PrimitiveProblem();
		String result = primitiveProblem.solution(2729);
		Assert.assertEquals("3 1200", result);
	}
	
	@Test
	public void test3() {
		PrimitiveProblem primitiveProblem = new PrimitiveProblem();
		String result = primitiveProblem.solution(761);
		Assert.assertEquals("6 288", result);
	}

}
