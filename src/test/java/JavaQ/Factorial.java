package JavaQ;

public class Factorial {

	public static void main(String args[]) {

		// finding factorial of a number in Java using Iteration - Example
		System.out.println("factorial of 6 using iteration in Java is: " + fact(5));
	}

	public static int fact(int number) {
		int result = 1;
		while (number != 0) {
			result = result * number;
			number--;
		}

		return result;
	}
}
