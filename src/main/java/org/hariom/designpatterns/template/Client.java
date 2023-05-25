package org.hariom.designpatterns.template;

public class Client {
	public static void main(String args[]) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
