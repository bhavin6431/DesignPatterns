package org.hariom.designpatterns.abstractfactory;

import org.hariom.designpatterns.factory.Shape;

public class RoundedShapeFactory extends AbstractFactory {
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}
}