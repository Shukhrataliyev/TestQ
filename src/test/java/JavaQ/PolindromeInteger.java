package JavaQ;

import java.util.Scanner;

public class PolindromeInteger {

    public static void main(String args[]){
        
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
        
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }       
        
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            System.out.println("remainder - "+remainder);
            reverse = reverse * 10 + remainder;
            System.out.println("reverse - "+reverse);
            palindrome = palindrome / 10;
            System.out.println("palindrome - "+palindrome);
            
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}

