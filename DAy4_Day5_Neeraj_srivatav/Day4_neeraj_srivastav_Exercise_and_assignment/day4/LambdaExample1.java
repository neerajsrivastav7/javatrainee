interface Arithmetic {
	int operation(int a, int b);
}

public class LambdaExample1 {
	public static void main(String[] args) {

	
		Arithmetic addition = (int a, int b) -> (a + b);
	

		System.out.println("Addition = " + addition.operation(5, 6));

	
		Arithmetic subtraction = (int a, int b) -> (a - b);
	

		System.out.println("Subtraction = " + subtraction.operation(5, 3));
		Arithmetic multiplication = (int a, int b) -> (a * b);

		System.out.println("Multiplication = " + multiplication.operation(4, 6));
		Arithmetic division = (int a, int b) -> (a / b);

		System.out.println("Division = " + division.operation(12, 6));
		
	}
}

