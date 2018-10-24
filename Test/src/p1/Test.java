package p1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons = new ArrayList<>();
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<Faculty> faculty = new ArrayList<>();
		
		students.add(new Student("0", "Jared Ivory"));
		faculty.add(new Faculty("1", "Ben Chen"));
		
		persons.addAll(students);
		persons.addAll(faculty);
		
		System.out.println(persons.toString());
	}

}
