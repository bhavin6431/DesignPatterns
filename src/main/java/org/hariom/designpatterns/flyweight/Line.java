package org.hariom.designpatterns.flyweight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Line {
	private int x;
	private int y;
	private int angle;
	private String color;

	public void draw() {
		System.out.println("draw  : " + angle + " AT X : " + x + " Y : " + y + " Color : " + color);

	}

	public Line(int x, int y, int angle) {
		super();
		this.x = x;
		this.y = y;
		this.angle = angle;
	}

	public Line(String color) {
		this.color = color;
	}

}
