package org.hariom.designpatterns.builder;

public class Client {
	public static void main(String args[]) {
		Pizza pizza = new MargaritaPizzaBuilder().ofSize("Large").addExtraCheese().build();
		System.out.println(pizza);
	}
}
