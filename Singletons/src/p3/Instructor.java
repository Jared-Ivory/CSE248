package p3;

/**
 * Bill Pugh Initialization
 * @author ivorj32
 *
 */
public class Instructor {
	private static Instructor instance;
	private static String name;
	
	private Instructor() {}
	
	private static class SingletonHelper{
		private static final Instructor instance = new Instructor();
		
	}
	
	public static Instructor makeTheInstructor(String name) {
		SingletonHelper.instance.setName(name);
		return SingletonHelper.instance;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Instructor.name = name;
	}
	
	
	
}
