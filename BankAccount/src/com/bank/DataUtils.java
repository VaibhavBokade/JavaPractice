package com.bank;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataUtils {
	public static ArrayList<BankAccount> populateAccount() {
		ArrayList<BankAccount> acct = new ArrayList<>();
		//double accNo, String name, AccountType type, LocalDate openingDate, double balance
		acct.add(new BankAccount(1234, "vaibhav", AccountType.valueOf("FD"), LocalDate.parse("2020-05-28"), 15000));
		acct.add(new BankAccount(4321, "Harshal", AccountType.valueOf("SAVING"), LocalDate.parse("2022-06-04"), 20000));

		acct.add(new BankAccount(5678, "Ram", AccountType.valueOf("LOAN"), LocalDate.parse("2020-12-12"), 25000));
		acct.add(new BankAccount(8765, "varsha", AccountType.valueOf("MARKETING"), LocalDate.parse("2011-05-16"), 50000));
		acct.add(new BankAccount(9874, "Om", AccountType.valueOf("FD"), LocalDate.parse("2020-05-30"), 30000));
		 
		return acct;
	}

}
