package org.hariom.designpatterns.abstractfactory;

import org.hariom.designpatterns.factory.Shape;

public class Client {
	public static void main(String args[]) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();

		shapeFactory = FactoryProducer.getFactory(true);

		shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();

		shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();

	}
}
