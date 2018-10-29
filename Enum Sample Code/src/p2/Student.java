package p2;

public class Student {
	private String name;
	private String id; //instance variable
	
	private static int idNumber = 0;
	
	public Student(String name) {
		this.name = name;
		this.id = Integer.toString(idNumber++);
	}
	
	public int getIdNumber() {
		return idNumber;
	}
}
