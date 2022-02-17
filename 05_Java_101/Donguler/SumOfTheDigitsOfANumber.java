import java.util.*;
public class SumOfTheDigitsOfANumber {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-armstrong-1

    Write a program that calculates the sum of the digits of a number.
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int temp = number;

        int sumOfDigits = 0;

        while (temp != 0){
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        //display the result
        System.out.println("Sum of the digits of " + number + " is " + sumOfDigits);
    }
}
