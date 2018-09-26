package JavaQ;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		int number = Integer.MAX_VALUE;
		System.out.println("Enter number to check if prime or not ");
		while (number != 0) {
			number = scnr.nextInt();
			System.out.print(isPrime(number));
		}
	}
	public static boolean isPrime(int number) { 
		int sqrt = (int) Math.sqrt(number) + 1; 
		for (int i = 2; i < sqrt; i++) { 
			if (number % i == 0) { 
				return false; 
			} 
		} 
	return true;
	}
}

