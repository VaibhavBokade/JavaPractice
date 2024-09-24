package com.bank;

public class Validation {
	public static final double MIN_BAL = 2000;
	public static double validateBal(double balance) throws MinimumBalException {
		if(balance < MIN_BAL)
			throw new MinimumBalException("Minimum Balance in your account");
		return balance;
		
	}

}
