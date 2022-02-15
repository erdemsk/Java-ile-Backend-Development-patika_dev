import java.util.*;
public class IsThisAPalindromicNumber {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-palindrom

    Write a program that checks if the user input is a palindromic number or not.

     */
    public static void main(String[] args) {
    //Create a Scanner object
    Scanner input = new Scanner(System.in);

    //Ask the user to enter a number
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    //display the number, the reverse order of that number and determine if it is a palindromic number or not
    System.out.println("Reversal of " + number + " is " + reverse(number) + ", so " + isPalindrome(number));
    }

    //return true if number is a palindrome
    public static boolean isPalindrome(int number){
    return number == reverse(number);
    }

    //return the reversal of an integer
    public static int reverse(int number){
    String numberString = "" + number;
    int reversalNumber = 0;

    for (int i = 1; i <= numberString.length(); i++){
        //swap the last digit with the first digit and remove it from the number, then continue to swapping numbers between
        reversalNumber += (number % 10) * Math.pow(10, numberString.length() - i);
        number /= 10;
    }
    
    return reversalNumber;
    }
}
