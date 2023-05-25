package org.hariom.designpatterns.strategy;

public class OperationSubtract implements Operation {

	public int executeOperation(int a, int b) {
		return a - b;
	}

}
