package org.hariom.designpatterns.builder;

public class MargaritaPizzaBuilder implements PizzaBuilder {

	Pizza pizza = new Pizza();

	public PizzaBuilder withCrust(String crust) {
		pizza.setCrust(crust);
		return this;
	}

	public PizzaBuilder withSauce(String sauce) {
		pizza.setSauce(sauce);
		return null;
	}

	public PizzaBuilder ofSize(String size) {
		pizza.setSize(size);
		return this;
	}

	public Pizza build() {
		return pizza;
	}

	public PizzaBuilder addExtraCheese() {
		pizza.setExtraCheese(true);
		return this;
	}

	public PizzaBuilder addPinaple() {
		pizza.setHasPinaple(true);
		return this;
	}

}
