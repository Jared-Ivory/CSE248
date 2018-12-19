package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import p1.Person;
import p1.Student;
import p2.Faculty;
import p4.PersonEnum;
import p4.PersonSort;
public class PersonBag {
	private Person[] persons;
	private int nElems = 0;
	private int maxSize;
	
	public PersonBag(int maxSize) {
		this.maxSize = maxSize;
		this.persons = new Person[maxSize];
	}
	
	public void insert(PersonEnum pe, String n, double d) {
		switch(pe) {
		case Faculty:
			persons[nElems++] = new Faculty(n, d);
			break;
		case Student:
			persons[nElems++] = new Student(n, d);
			break;
		default:
			persons[nElems++] = new Person(n);
		}
	}
	
	public void add(Person p) {
		persons[nElems++] = p;
	}
	
	public void display() {
		for(int i = 0; i< nElems; i++) {
			System.out.println(persons[i]);
		}
	}
	
	public void sortThem() {
		Person[] arr = Arrays.copyOf(persons, nElems);
		List<Person> list = new ArrayList<Person>();
		for(Person p: arr) {
			list.add(p);
		}
		list = list.stream().sorted(PersonSort.sortByName()).collect(Collectors.toList());
		persons = new Person[maxSize];
		list.toArray(persons);
	}
	
	public int getSize() {
		return this.persons.length;
	}
}
