package p4;

import java.util.Comparator;
import p1.Person;

public class PersonSort {
	public static Comparator<Person> sortByName(){
		return new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getName().compareTo(arg1.getName());
			}
			
		};
	}
}
