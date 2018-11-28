package p2;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Student extends Observable {
	
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
		//notify a change
		setChanged();
		notifyObservers();
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getGPA() {
		return this.gpa;
	}

}
