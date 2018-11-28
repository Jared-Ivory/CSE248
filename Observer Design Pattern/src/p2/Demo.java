package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Jared", 2.0);
		StudentObserver o1 = new StudentObserver(s1);
		StudentObserver o2 = new StudentObserver(s1);
		s1.setGPA(2.0);
		
		
	}

}
