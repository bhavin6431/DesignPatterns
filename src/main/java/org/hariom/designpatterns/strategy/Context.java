package org.hariom.designpatterns.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Context {
	private Operation operation;

	public int executeStategy(int a, int b) {
		return operation.executeOperation(a, b);
	}

}
