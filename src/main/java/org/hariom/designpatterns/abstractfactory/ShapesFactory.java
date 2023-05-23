package org.hariom.designpatterns.abstractfactory;

import org.hariom.designpatterns.factory.Rectangle;
import org.hariom.designpatterns.factory.Shape;
import org.hariom.designpatterns.factory.Square;

public class ShapesFactory extends AbstractFactory {
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
