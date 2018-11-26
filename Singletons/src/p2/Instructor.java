package p2;

/**
 * Lazy Initialization
 * @author ivorj32
 *
 */
public class Instructor {
	private static String name;
	private static Instructor instance;
	
	private Instructor(String name) {
		Instructor.name = name;
	}
	
	public static Instructor makeTheInstructor(String name) {
		if(instance == null) {
			instance = new Instructor(name);
		} 
		Instructor.name = name;
		return instance;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Instructor.name = name;
	}
	
}
