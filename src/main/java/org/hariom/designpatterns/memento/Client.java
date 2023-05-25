package org.hariom.designpatterns.memento;

public class Client {
	public static void main(String args[]) {
		Originator orginitator = new Originator();
		CareTaker careTaker = new CareTaker();

		orginitator.setState("State 1");
		orginitator.setState("State 2");
		careTaker.add(orginitator.saveStateToMemento());

		orginitator.setState("State 3");
		careTaker.add(orginitator.saveStateToMemento());

		orginitator.setState("State 4");
		System.out.println("Current state : " + orginitator.getState());

		System.out.println("First save state : " + orginitator.getStatefromMemento(careTaker.get(0)));

		System.out.println("Second save state : " + orginitator.getStatefromMemento(careTaker.get(1)));

	}
}
