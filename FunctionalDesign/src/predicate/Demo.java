package predicate;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

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
		
		Scanner scan = new Scanner(System.in);
//		while(true) {
//			String search = scan.next();
//			Student[] arr = sb.search(p -> (p.getName().contains(search)));
//			System.out.println(Arrays.toString(arr));
//		}
		
		Predicate<Student> gpa = p -> p.getGpa()>=3.0;
		Predicate<Student> name = p -> p.getName().contains("l");
		Student[] arr2 = sb.search(gpa.or(name));
		System.out.println(Arrays.toString(arr2));
		
	}
	
	
}
