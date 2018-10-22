package comparator;

import java.util.Comparator;

import comparable.BankAccount;

public class BankAccountSort {
	
	public static Comparator<BankAccount> sortByBalanceIncreasing(){
		return new Comparator<BankAccount>() {
			@Override
			public int compare(BankAccount arg0, BankAccount arg1) {
				if(arg0.getBalance() > arg1.getBalance()) {
					return -1;
				} else if( arg0.getBalance() < arg1.getBalance()) {
					return 1;
				}
				 return 0;
			}
		};
	}
	
	public static Comparator<BankAccount> sortByBalanceDecreasing(){
		return new Comparator<BankAccount>() {
			@Override
			public int compare(BankAccount arg0, BankAccount arg1) {
				if(arg0.getBalance() > arg1.getBalance()) {
					return 1;
				} else if( arg0.getBalance() < arg1.getBalance()) {
					return -1;
				}
				 return 0;
			}
		};
	}
	
	public static Comparator<BankAccount> sortByAccoutNumberIncreasing(){
		return new Comparator<BankAccount>() {
			@Override
			public int compare(BankAccount arg0, BankAccount arg1) {
				if(arg0.getAccountNumber() > arg1.getAccountNumber()) {
					return 1;
				} else if( arg0.getAccountNumber() < arg1.getAccountNumber()) {
					return -1;
				}
				 return 0;
			}
		};
	}
	
	public static Comparator<BankAccount> sortByAccountNumberDecreasing(){
		return new Comparator<BankAccount>() {
			@Override
			public int compare(BankAccount arg0, BankAccount arg1) {
				if(arg0.getAccountNumber() > arg1.getAccountNumber()) {
					return -1;
				} else if( arg0.getAccountNumber() < arg1.getAccountNumber()) {
					return 1;
				}
				 return 0;
			}
		};
	}

}