package org.hariom.designpatterns.abstractfactory;

import org.hariom.designpatterns.factory.Shape;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
}
