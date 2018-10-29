package p1;

public class Demo {

	public static void main(String[] args) {
		GPACalculator gpa = new GPACalculator(Course.CSE110);
		
		System.out.println(gpa.getCourse());
	}

}
