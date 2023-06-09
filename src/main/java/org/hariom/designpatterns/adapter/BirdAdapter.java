package org.hariom.designpatterns.adapter;

public class BirdAdapter implements ToyDuck {

	private Bird bird;

	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}

	public void squeak() {
		this.bird.makeSound();
	}
}
