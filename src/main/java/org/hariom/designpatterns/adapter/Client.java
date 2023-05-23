package org.hariom.designpatterns.adapter;

public class Client {
	public static void main(String args[]) {
		Sparrow sparrow = new Sparrow();
		ToyDuck toyDuck = new PlasticToyDuck();

		ToyDuck birdAdapter = new BirdAdapter(sparrow);

		sparrow.makeSound();
		toyDuck.squeak();
		birdAdapter.squeak();

	}
}
