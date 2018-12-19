package p7;

import java.util.Arrays;
import java.util.Scanner;

import p1.Person;
import p4.PersonEnum;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBag bag = new PersonBag(10);
		bag.insert(PersonEnum.Faculty, "John", 100000.00);
		bag.insert(PersonEnum.Student, "Jared", 3.0);
		bag.insert(PersonEnum.Faculty, "Tim", 100000.00);
		bag.insert(PersonEnum.Student, "Eric", 3.0);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter partial name");
			String search = scan.next().toLowerCase();
			Person[] arr = bag.search(p -> (p.getName().toLowerCase().contains(search)));
			System.out.println(Arrays.toString(arr));
		}
	}

}
