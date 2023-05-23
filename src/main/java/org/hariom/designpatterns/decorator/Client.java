package org.hariom.designpatterns.decorator;

public class Client {
	public static void main(String args[]) {
		Notification notifyStack = new Notifier();
		notifyStack = new SMSDecorator(notifyStack);
		notifyStack = new TelegramDecorator(notifyStack);
		notifyStack.sendMessage("Hello Medium");
	}
}
