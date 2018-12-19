package p3;

public class Demo {
	public static void main(String[] args) {
		School school = new School("Suffolk", "1");
		Student s1 = new Student("Jared", "2");
		Student s2 = new Student("Charles", "3");
		
		school.addObserver(s1);
		school.addObserver(s1);
		school.addObserver(s2);
		school.notifyObservers();
	}
}
