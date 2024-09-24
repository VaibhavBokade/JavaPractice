package com.bank;

import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount>{
	private Integer accNo;
	private String name;
	private AccountType type;
	private LocalDate openingDate;
	private double balance;
	
	
	public BankAccount(Integer accNo, String name, AccountType type, LocalDate openingDate, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.type = type;
		this.openingDate = openingDate;
		this.balance = balance;
	}
	
	
	
	public BankAccount(Integer accNo) {
		super();
		this.accNo = accNo;
	}
	
	public boolean equals(Object o) {
		if(o instanceof BankAccount) 
			return this.accNo == ((BankAccount)o).accNo;
		return false;
		
	}



	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount)throws MinimumBalException {
		balance -= amount;
	}
	
	public void transfer(BankAccount dest, double amount)throws InvalidAccountException, MinimumBalException {
		this.withdraw(amount);
		dest.deposit(amount);
		
		
	}
	
	public void applyIntrest(double rate, double noOfYears) {
		double simpleIntrest = (balance * rate * noOfYears) / 100;
	}


	public Integer getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public AccountType getType() {
		return type;
	}


	public void setType(AccountType type) {
		this.type = type;
	}


	public LocalDate getOpeningDate() {
		return openingDate;
	}


	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", type=" + type + ", openingDate=" + openingDate
				+ ", balance=" + balance + "]";
	}
	
	@Override
	public int compareTo(BankAccount o) {
		return this.getAccNo().compareTo(o.getAccNo());
	}
	
	
	

}
