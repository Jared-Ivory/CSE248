package p5;

import p3.PersonBag;
import p4.PersonEnum;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBag bag = new PersonBag(10);
		bag.insert(PersonEnum.Faculty, "Professor John", 100000.00);
		bag.insert(PersonEnum.Student, "Jared", 3.0);
		bag.insert(PersonEnum.Faculty, "Professor Tim", 100000.00);
		bag.insert(PersonEnum.Student, "Eric", 3.0);
		
		
		bag.display();
		bag.sortThem();
		System.out.println("=============SORTED=============");
		bag.display();
	}

}
