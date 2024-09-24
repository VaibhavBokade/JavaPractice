package com.bank;

import java.util.Comparator;

public class SortByOpeningDate implements Comparator<BankAccount>{
	public int compare(BankAccount o1, BankAccount o2) {
		return o1.getOpeningDate().compareTo(o2.getOpeningDate());
	}

}
