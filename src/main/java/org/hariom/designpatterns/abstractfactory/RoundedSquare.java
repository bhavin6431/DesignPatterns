package org.hariom.designpatterns.abstractfactory;

import org.hariom.designpatterns.factory.Shape;

public class RoundedSquare implements Shape {

	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}

}