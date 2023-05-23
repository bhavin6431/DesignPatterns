package org.hariom.designpatterns.prototype;

public class Client {
	public static void main(String args[]) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		clonedShape.draw();
	}
}
