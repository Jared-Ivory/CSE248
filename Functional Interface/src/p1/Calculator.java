package p1;

public interface Calculator {
	double calculate(double number1, double number2);
	default double squareIt(double number) {
		return number*number;
	}
	default double doubleIt(double number) {
		return number*2;
	}
}
