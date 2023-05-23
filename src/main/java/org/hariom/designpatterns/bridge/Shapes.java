package org.hariom.designpatterns.bridge;

public abstract class Shapes {
	protected Color color;

	public Shapes(Color color) {
		this.color = color;
	}

	abstract public void applyColor();
}
