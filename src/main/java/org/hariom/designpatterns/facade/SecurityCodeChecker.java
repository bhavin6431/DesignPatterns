package org.hariom.designpatterns.facade;

public class SecurityCodeChecker {

	private int securityCode = 5678;

	public boolean checkSecurityCode(int securityCode) {
		return securityCode == this.securityCode;
	}

}
