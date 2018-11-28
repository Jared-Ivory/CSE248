package p2;

import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer {
	private static int observerIDTracker = 0;
	private int observerID;
	
	public StudentObserver(Student s) {
		this.observerID = ++ observerIDTracker;
		System.out.println("New Observer: " + observerID);
		s.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("Observer: " + observerID + "\n|-Name: " + ((Student)arg0).getName() +" , GPA: " + ((Student)arg0).getGPA());
		System.out.println("----------------------------------------------------------------");
	}

}
