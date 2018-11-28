package p1;

public class StudentObserver implements Observer {
	private static int observerIDTracker = 0;
	private int observerID;
	
	public StudentObserver(Observable s) {
		this.observerID = ++ observerIDTracker;
		System.out.println("New Observer: " + observerID);
		s.register(this);
	}
	
	
	@Override
	public void update(String name, double gpa) {
		// TODO Auto-generated method stub
		System.out.println("Observer: " + observerID + "\n|-Name: " + name +" , GPA: " + gpa);
		System.out.println("----------------------------------------------------------------");
	}
	
}
