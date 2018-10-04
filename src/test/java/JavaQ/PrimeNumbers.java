package JavaQ;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		int number = 9;
		System.out.print(number+" is "+isPrime(number));
	}
	
	
	public static boolean isPrime(int numberToCheck) { 
		int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and 
            //break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
	}
}

