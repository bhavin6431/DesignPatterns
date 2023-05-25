package org.hariom.designpatterns.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Originator {

	private String state;

	public Memento saveStateToMemento() {
		return new Memento(this.state);
	}

	public String getStatefromMemento(Memento memento) {
		return memento.getState();
	}

}
