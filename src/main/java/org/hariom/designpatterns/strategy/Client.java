package org.hariom.designpatterns.strategy;

public class Client {
	public static void main(String args[]) {
		Context context = new Context(new OperationAdd());
		System.out.println("Add Strategy : " + context.executeStategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("Add Strategy : " + context.executeStategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("Add Strategy : " + context.executeStategy(10, 5));

	}
}
