package decorator;

public class StudentDecorator extends Student {

	private double gpa;
	private Student student;
	
	public StudentDecorator(String name, String id) {
		super(name, id);
		this.student = new Student(name, id);
	}
	
	
	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

}
