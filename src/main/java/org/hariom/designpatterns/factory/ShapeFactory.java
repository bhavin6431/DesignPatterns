package org.hariom.designpatterns.factory;

public class ShapeFactory {
	public Shape createShape(Shapes shape) {
		switch (shape) {
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		default:
			break;
		}
		return null;
	}
}
