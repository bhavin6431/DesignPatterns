package org.hariom.designpatterns.factory;

public class Client {
	public static void main(String args[]) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.createShape(Shapes.CIRCLE);
		shape.draw();
		shape = shapeFactory.createShape(Shapes.RECTANGLE);
		shape.draw();
		shape = shapeFactory.createShape(Shapes.SQUARE);
		shape.draw();
	}
}
