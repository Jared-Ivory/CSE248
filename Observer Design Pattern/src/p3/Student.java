package p3;

public class Student implements Observer{
	private String name;
	private String id;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Student: [" + name + ":" + id + "]" + " has been notified");
	}

}
