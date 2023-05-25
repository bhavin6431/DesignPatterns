package org.hariom.designpatterns.template;

public abstract class Game {
	abstract void initialise();

	abstract void startPlay();

	abstract void endPlay();

	public final void play() {
		initialise();

		startPlay();

		endPlay();
	}
}
