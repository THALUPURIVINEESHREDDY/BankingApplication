
package com.banking.exception;

public class IncorrectPasswordException extends Exception {
	public IncorrectPasswordException() {
		super("Incorrect Password");
	}
}