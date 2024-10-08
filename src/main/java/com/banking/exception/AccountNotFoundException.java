
package com.banking.exception;

public class AccountNotFoundException extends Exception {
	public AccountNotFoundException() {
		super("Account Not Found");
	}
}
