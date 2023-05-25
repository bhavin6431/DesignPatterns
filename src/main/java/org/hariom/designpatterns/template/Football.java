package org.hariom.designpatterns.template;

public class Football extends Game {

	@Override
	void initialise() {
		System.out.println("Initialise Football");

	}

	@Override
	void startPlay() {
		System.out.println("Start Playing Football");

	}

	@Override
	void endPlay() {
		System.out.println("End Playing Football");

	}

}
