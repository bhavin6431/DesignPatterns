package org.hariom.designpatterns.decorator;

public class Notifier implements Notification {

	public void sendMessage(String msg) {
		System.out.println("Send message using email");
	}
}
