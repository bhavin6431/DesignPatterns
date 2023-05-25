package org.hariom.designpatterns.visitor;

public class Computer implements ComputerPart {

	ComputerPart parts[];

	public Computer() {
		parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (ComputerPart computerPart : parts) {
			computerPart.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
