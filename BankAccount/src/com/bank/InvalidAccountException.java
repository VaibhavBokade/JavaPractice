package com.bank;

public class InvalidAccountException extends Exception{
	public InvalidAccountException(String message) {
		super(message);
	}

}