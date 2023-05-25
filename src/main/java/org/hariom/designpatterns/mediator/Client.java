package org.hariom.designpatterns.mediator;

public class Client {
	public static void main(String args[]) {
		User user1 = new User("John");
		User user2 = new User("Jack");

		user1.sendMessage("Hi Jack !");
		user2.sendMessage("Hi John!");

	}
}
