package org.hariom.designpatterns.composit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Manager implements Employee {

	private String name;
	private String position;

	public void showEmployeeDetails() {
		System.out.println(name + " - " + position);
	}

}
