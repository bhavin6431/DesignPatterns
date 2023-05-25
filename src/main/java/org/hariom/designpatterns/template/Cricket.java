package org.hariom.designpatterns.template;

public class Cricket extends Game {

	@Override
	void initialise() {
		System.out.println("Initialising cricket");
	}

	@Override
	void startPlay() {
		System.out.println("Start playing cricket");

	}

	@Override
	void endPlay() {
		System.out.println("End playing cricket");

	}

}
