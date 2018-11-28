package p1;

/***
 *  Student implements --> Observable Interface 
 *  	|--> Once the GPA is altered Student Observer notifies the observers.
 * 
 *  Student Observer implements *.. --> 1 Observer Interface
 *  
 *
 * @author ivorj32
 *
 */


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Jared", 4.0);
		
		//Create new student observers for student{s}
		StudentObserver o1 = new StudentObserver(s);
		StudentObserver o2 = new StudentObserver(s);
		
		//Will notify both observers
		s.setGPA(2.0);
		s.setGPA(2.3);
		
		s.unregister(o1);
		s.setGPA(2.5);
		
		s.unregister(o2);
		// Nothing would be notified as student no longer has any observers
		s.setGPA(4.0);
	}

}
