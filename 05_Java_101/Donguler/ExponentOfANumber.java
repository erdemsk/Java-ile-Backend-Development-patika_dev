import java.util.*;
public class ExponentOfANumber {
     /*
   Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-uslu-sayi

   Write a program that asks user to enter two numbers and use the first one as base number,
   and the second one (equal to or greater than 0) as the exponent of that number.

      */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter the base and exponent
        System.out.print("For x^y, enter x: ");
        int baseNumber = input.nextInt();
        System.out.print("Enter y (y >= 0): ");
        int exponent = input.nextInt();

        if(exponent < 0){
            System.out.println("Please enter an exponent value that is equal to or greater than 0");
            System.exit(1);
        }

        int exponentOfNumber = 1;

        for (int i = 0; i < exponent; i++){
            exponentOfNumber *= baseNumber;
        }

        //display the result
        System.out.println(baseNumber + "^" + exponent + " = " + exponentOfNumber);
    }
}
