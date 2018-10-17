package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator add = (x, y) -> x + y;
		Calculator sub = (x, y) -> x - y;
		Calculator mul = (x, y) -> x * y;
		Calculator div = (x, y) -> x / y;	
		
		System.out.println("Adding: \t"+ add.calculate(3,2));
		System.out.println("Subtracting: \t"+ sub.calculate(3,2));
		System.out.println("Multiplying: \t"+ mul.calculate(3,2));
		System.out.println("Divinding: \t"+ div.calculate(3,2));
		
		
		//default methods
		System.out.println("Squaring: \t"+ add.squareIt(3));
		System.out.println("Doubling: \t"+ sub.doubleIt(3));
		
	}

}
