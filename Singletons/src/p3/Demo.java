package p3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instructor i1 = Instructor.makeTheInstructor("Alan");
		System.out.println(i1.getName());
		
		Instructor i2 = Instructor.makeTheInstructor("Bill");
		System.out.println(i2.getName());
	
		System.out.println(i1 == i2);
	}

}
