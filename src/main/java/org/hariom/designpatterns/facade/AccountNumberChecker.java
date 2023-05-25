package org.hariom.designpatterns.facade;

public class AccountNumberChecker {
	private int accountNumber = 1234;

	public boolean checkAccountNumber(int accountNumber) {
		return accountNumber == this.accountNumber;
	}

}
