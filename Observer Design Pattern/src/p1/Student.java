package p1;

import java.util.ArrayList;

/**
 * Goal is to allow an Object {Observers} to watch students GPA
 * and to be automatically notified.
 * @author ivorj32
 *
 */

public class Student implements Observable{
	private String name;
	private double gpa;
	private ArrayList<Observer> observerList;
	
	public Student(String name, double gpa) {
		observerList = new ArrayList<>();
		this.name = name;
		this.gpa = gpa;
	}
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
		
	}
	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		int index = observerList.indexOf(o);
		observerList.remove(index);
		System.out.println("Observer " + (index + 1) + " was removed.");
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observerList) {
			o.update(name, gpa);
		}
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
		notifyObservers();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
