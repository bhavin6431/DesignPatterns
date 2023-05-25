package org.hariom.designpatterns.facade;

public class Client {
	public static void main(String args[]) {
		BankAccountFacade bankAccountFacade = new BankAccountFacade(1234, 5678);

		bankAccountFacade.withdrawAmount(10001.00);

		bankAccountFacade.creditAmount(100.00);
	}
}
