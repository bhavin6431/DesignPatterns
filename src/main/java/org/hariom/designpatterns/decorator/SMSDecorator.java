package org.hariom.designpatterns.decorator;

public class SMSDecorator extends BaseDecorator {

	public SMSDecorator(Notification notification) {
		super(notification);
	}

	@Override
	public void sendMessage(String msg) {
		super.sendMessage(msg);
		sendSMS(msg);
	}

	private void sendSMS(String msg) {
		System.out.println(msg + ", message sent in SMS");
	}

}
