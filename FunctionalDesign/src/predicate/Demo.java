package predicate;

import java.util.Arrays;

public class Demo {
	/**
	 * Returns a stream consisting of the elements of this stream that match
	 * the given predicate.
	 *
	 * @param predicate a non-interfering stateless predicate to apply to each element to determine if it
	 * should be included in the new returned stream.
	 * @return the new stream
	 */
	
	
	public static void main(String[] args) {
		
		StudentBag sb = new StudentBag(10);
		sb.insert(new Student("Jared", 4.0));
		sb.insert(new Student("Jim", 3.0));
		sb.insert(new Student("Sally", 2.0));
		
		Student[] arr = sb.search(p -> (p.getGpa() >= 2.5));
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	
}
