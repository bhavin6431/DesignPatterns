package org.hariom.designpatterns.state;

public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Going into start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}

}
