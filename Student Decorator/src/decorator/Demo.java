package decorator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("John", "111");
		System.out.println(s1.getName());
		
		Student s2 = new StudentDecorator("Billy", "222");
		((StudentDecorator) (s2)).setStudent(new Student("Hailey", "333"));
		
		System.out.println(((StudentDecorator) (s2)).getName());
	}

}
