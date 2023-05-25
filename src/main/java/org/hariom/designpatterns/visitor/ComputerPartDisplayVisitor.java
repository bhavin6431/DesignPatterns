package org.hariom.designpatterns.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public void visit(Monitor monitor) {
		System.out.println("Display Monitor");

	}

	public void visit(Computer computer) {
		System.out.println("Display Computer");

	}

	public void visit(Mouse mouse) {
		System.out.println("Display Mouse");

	}

	public void visit(Keyboard keyboard) {
		System.out.println("Display Keyboard");

	}

}
