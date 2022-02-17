import java.util.*;
public class PerfectNumbers {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-min-max

    A perfect number is a number that the sum of its positive integer factors (excluding the number itself) is equal to itself.
    Write a program and ask users to enter numbers and determine if they are perfect numbers or not.
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sumOfFactors = 0;

        //calculate the sum of factors of the number, excluding itself
        for (int i = (number - 1); i > 0; i--){
            if (number % i == 0){
                sumOfFactors += i;
            }
        }

        //display the result
        if (number == sumOfFactors){
            System.out.println(number + " is a perfect number");
        } else{
            System.out.println(number + " is not a perfect number");
        }
    }
}
