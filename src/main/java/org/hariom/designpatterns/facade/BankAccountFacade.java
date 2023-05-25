package org.hariom.designpatterns.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	private AccountNumberChecker accountNumberChecker;
	private SecurityCodeChecker securityCodeChecker;
	private FundsChecker fundsChecker;

	public BankAccountFacade(int accountNumber, int securityCode) {
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		this.accountNumberChecker = new AccountNumberChecker();
		this.securityCodeChecker = new SecurityCodeChecker();
		this.fundsChecker = new FundsChecker();
	}

	public void withdrawAmount(double amount) {
		if (accountNumberChecker.checkAccountNumber(this.accountNumber)
				&& securityCodeChecker.checkSecurityCode(this.securityCode) && fundsChecker.checkFunds(amount)) {
			fundsChecker.decreaseAmount(amount);
			System.out.println("Transaction Completed");
		} else {
			System.out.println("Transaction failed");
		}
	}

	public void creditAmount(double amount) {
		if (accountNumberChecker.checkAccountNumber(this.accountNumber)
				&& securityCodeChecker.checkSecurityCode(this.securityCode)) {
			fundsChecker.increaseAmount(amount);
			System.out.println("Transaction Completed");
		} else {
			System.out.println("Transaction failed");
		}
	}

}
