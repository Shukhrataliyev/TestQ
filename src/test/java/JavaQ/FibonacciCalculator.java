package JavaQ;

import java.util.Scanner;

/**
 * * Java program to calculate and print Fibonacci number using both recursion *
 * and Iteration. * Fibonacci number is sum of previous two Fibonacci numbers
 * fn= fn-1+ fn-2 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34,
 * 55 * * @author Javin
 */

public class FibonacciCalculator {
	public static void main(String args[]) {
		System.out.println("Enter number upto which Fibonacci series to print: ");

		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series upto " + number + " numbers : ");
		
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	/*
	 * * Java program for Fibonacci number using recursion. * This program uses tail
	 * recursion to calculate Fibonacci number for a given number * @return
	 * Fibonacci number
	 */

	public static int fibonacci(int number){
		if(number == 1 || number == 2){
			return 1; 
		}
		return fibonacci(number-1) + fibonacci(number -2);
		
	} 
}
