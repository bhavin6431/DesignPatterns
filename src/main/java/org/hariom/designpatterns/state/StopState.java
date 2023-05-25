package org.hariom.designpatterns.state;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Going into stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}

}
