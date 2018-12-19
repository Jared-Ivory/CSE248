package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import comparable.BankAccount;
import comparator.BankAccountSort;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount(1, 300);
		BankAccount ba2 = new BankAccount(3, 200);
		BankAccount ba3 = new BankAccount(2, 100);
		BankAccount ba4 = new BankAccount(5, 000);


		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(ba1);
		list.add(ba2);
		list.add(ba3);
		list.add(ba4);

		Collections.sort(list,BankAccountSort.sortByBalanceIncreasing());
		System.out.println(list);
		List<BankAccount> sortedByBalanceIncreasing = list.stream().sorted(BankAccountSort.sortByBalanceIncreasing()).collect(Collectors.toList());
		System.out.println(sortedByBalanceIncreasing);
		Collections.sort(list,BankAccountSort.sortByBalanceDecreasing());
		System.out.println(list);
		Collections.sort(list,BankAccountSort.sortByAccoutNumberIncreasing());
		System.out.println(list);
		Collections.sort(list,BankAccountSort.sortByAccountNumberDecreasing());
		System.out.println(list);

		/** ArrayList has a default size of 10. when .add() is called it creates a larger array and copys elements 
		 *  This is a very slow process. Big O(n). When deletion of elements the array also doesn't get smaller. Which
		 *  is a waste of memory. Linked List 
		 * 
		 * **/
	}
}
