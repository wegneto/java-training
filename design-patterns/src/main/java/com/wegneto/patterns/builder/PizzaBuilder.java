package com.wegneto.patterns.builder;

import lombok.Getter;

public abstract class PizzaBuilder {
	@Getter protected Pizza pizza;
	
	public void createNewPizza() {
		pizza = new Pizza();
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
}
