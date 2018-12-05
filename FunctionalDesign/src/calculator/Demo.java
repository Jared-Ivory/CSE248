package calculator;

public class Demo {
	
	public static void main (String[] args) {
		Calculator c1 = (a, b) -> a + b;	
		System.out.println(c1.compute(5, 10));
	}

}
