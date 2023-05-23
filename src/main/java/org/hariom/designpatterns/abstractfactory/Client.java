package org.hariom.designpatterns.abstractfactory;

import org.hariom.designpatterns.factory.Shape;

public class Client {
	public static void main(String args[]) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		shape3.draw();
	}
}
