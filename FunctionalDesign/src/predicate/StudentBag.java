package predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] array;
	private int nElems;
	private int maxSize;
	
	
	public StudentBag(int maxSize) {
		array = new Student[maxSize];
		nElems = 0;
		this.maxSize = maxSize;
	}
	
	
	public void insert(Student s) {
		array[nElems++] = s;
	}
	
	/** 
	 * Predicate is an interface.
	 * Has one method test
	 * @param tester
	 * @return
	 */
	public Student[] search(Predicate<Student> tester) {
		Student[] arr = new Student[this.maxSize];
		//Holds the amount of elements that pass the "test condition"
		int n = 0;
		
		//Iterates through original array
		for(int i = 0; i < nElems; i++) {
			//Checks to see if object matches the "test condition"
			if(tester.test(array[i]))
				//Add to new array if matches known condition
				arr[n++] = array[i];
		}
		return Arrays.copyOf(arr, n);
	}
}
