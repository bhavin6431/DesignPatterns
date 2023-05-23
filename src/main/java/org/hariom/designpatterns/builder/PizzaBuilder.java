package org.hariom.designpatterns.builder;

public interface PizzaBuilder {
	PizzaBuilder withCrust(String crust);

	PizzaBuilder withSauce(String sauce);

	PizzaBuilder ofSize(String size);

	PizzaBuilder addExtraCheese();

	PizzaBuilder addPinaple();

	Pizza build();
}
