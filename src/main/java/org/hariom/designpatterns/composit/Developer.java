package org.hariom.designpatterns.composit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Developer implements Employee {

	private String name;
	private String position;

	public void showEmployeeDetails() {
		System.out.println(name + " - " + position);
	}

}
