package org.hariom.designpatterns.facade;

public class FundsChecker {

	private double accountBalance = 1000.00;

	public boolean checkFunds(double amount) {
		return amount <= this.accountBalance;
	}

	public void decreaseAmount(double amount) {
		this.accountBalance -= amount;
		printBalance();
	}

	public void increaseAmount(double amount) {
		this.accountBalance += amount;
		printBalance();
	}

	private void printBalance() {
		System.out.println("Account Balance is : " + this.accountBalance);
	}

}
