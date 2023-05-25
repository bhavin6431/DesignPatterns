package org.hariom.designpatterns.flyweight;

import java.util.HashMap;

public class LineFactory {
	private static final HashMap lineMap = new HashMap();

	public static Line getLine(String color) {
		Line line = (Line) lineMap.get(color);

		if (line == null) {
			line = new Line(color);
			lineMap.put(color, line);
			System.out.println("Creating circle of color : " + color);
		}
		return line;
	}
}
