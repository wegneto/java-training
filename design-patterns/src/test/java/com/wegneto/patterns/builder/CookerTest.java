package com.wegneto.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class CookerTest {
	
	@Test
	public void test1() {
		Pizza expected = new Pizza();
		expected.setDough("cross");
		expected.setSauce("mild");
		expected.setTopping("ham+pineapple");
		
		PizzaBuilder builder = new HawaiianPizzaBuilder();
		Cooker cooker = new Cooker();
		cooker.setPizzaBuilder(builder);
		cooker.cookPizza();
		Pizza actual = cooker.getPizza();
		
		Assert.assertEquals(expected.getDough(), actual.getDough());
		Assert.assertEquals(expected.getSauce(), actual.getSauce());
		Assert.assertEquals(expected.getTopping(), actual.getTopping());
	}
	
}
