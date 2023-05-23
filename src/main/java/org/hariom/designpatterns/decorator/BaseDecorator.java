package org.hariom.designpatterns.decorator;

public abstract class BaseDecorator implements Notification {

	public Notification wrappe;

	public BaseDecorator(Notification notification) {
		this.wrappe = notification;
	}

	public void sendMessage(String msg) {
		wrappe.sendMessage(msg);
	}

}
