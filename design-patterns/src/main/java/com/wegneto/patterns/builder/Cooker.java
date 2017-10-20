package com.wegneto.patterns.builder;

import lombok.Setter;

public class Cooker {
	
	@Setter private PizzaBuilder pizzaBuilder;
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
	
	public void cookPizza() {
		pizzaBuilder.createNewPizza();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}

}
