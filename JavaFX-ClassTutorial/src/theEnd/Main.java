package theEnd;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changeTheFunction(
						/** Function ***/(x -> -x), /** Data **/ 5)
				);
		System.out.println(changeTheFunction((x -> 2 * x), 5));
	}
	
	
	/** Creating a function that takes in two parameters. **/
	/** First parameter is a function i.e. myFunction**/
	/** Second parameter is a integer**/
	
	private static Integer changeTheFunction(Function<Integer, Integer> myFunction, Integer value) {
		/** By providing your own function and data, the integer**/
		/** Your own defined function and data is used to complete the method**/
		return myFunction.apply(value);
	}

}
