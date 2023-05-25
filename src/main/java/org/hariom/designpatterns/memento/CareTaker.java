package org.hariom.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento saveStateToMemento) {
		mementoList.add(saveStateToMemento);
	}

	public Memento get(int i) {
		return mementoList.get(i);
	}

}
