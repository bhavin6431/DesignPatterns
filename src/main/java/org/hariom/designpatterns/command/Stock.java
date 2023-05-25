package org.hariom.designpatterns.command;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Stock {
	private String name = "Test";
	private int quantity = 10;

	public void buy() {
		System.out.println("Buying stock : " + name + " Quantity : " + quantity);
	}

	public void sell() {
		System.out.println("Selling stock : " + name + " Quantity : " + quantity);
	}

}
