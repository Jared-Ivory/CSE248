package p1;
/**
 * Eager Initialization
 * @author ivorj32
 *
 */
public class Instructor {
	private static String name;
	private static Instructor instance = new Instructor();
	
	private Instructor() {}
	
	public static Instructor getInstance(String name) {
		Instructor.name = name;
		return instance;
	}
	
	public static void setName(String name) {
		Instructor.name = name; 
	}
}
