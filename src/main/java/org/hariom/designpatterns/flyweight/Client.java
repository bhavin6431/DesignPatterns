package org.hariom.designpatterns.flyweight;

public class Client {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String args[]) {

		for (int i = 0; i < 20; ++i) {
			Line line = (Line) LineFactory.getLine(getRandomColor());
			line.setX(getRandomX());
			line.setY(getRandomY());
			line.setAngle(100);
			line.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

}
