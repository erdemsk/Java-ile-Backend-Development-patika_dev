import java.util.*;
public class SortThreeNumbersInAscendingOrder {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-sayi-siralama

    Ask user to enter three numbers and sort them in ascending order using if-else statements
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter three numbers
        System.out.print("Enter a number, a = ");
        int firstNumber = input.nextInt();

        System.out.print("Enter a number, b = ");
        int secondNumber = input.nextInt();

        System.out.print("Enter a number, c = ");
        int thirdNumber = input.nextInt();

        //check different possibilities
        if (firstNumber == secondNumber && firstNumber == thirdNumber){ // a = b = c
            System.out.println(firstNumber + " = " + secondNumber + " = " + thirdNumber);
        } else if (firstNumber == secondNumber){ // a = b
            if (firstNumber > thirdNumber){ // c < a = b
                System.out.println(thirdNumber + " < " + firstNumber + " = " + secondNumber);
            } else { // a = b < c
                System.out.println(secondNumber + " = " + firstNumber + " < " + thirdNumber);
            }
        } else if (firstNumber == thirdNumber){ // a = c
            if (firstNumber < secondNumber){ // a = c < b
                System.out.println(firstNumber + " = " + thirdNumber + " < " + secondNumber);
            } else{ // b < a = c
                System.out.println(secondNumber + " < " + firstNumber + " = " + thirdNumber);
            }
        } else if (secondNumber == thirdNumber){ // b = c
            if (firstNumber < secondNumber){ // a < b = c
                System.out.println(firstNumber + " < " + thirdNumber + " = " + secondNumber);
            } else{ // b = c < a
                System.out.println(secondNumber + " = " + thirdNumber + " < " + firstNumber);
            }
        } else if (firstNumber < secondNumber && firstNumber < thirdNumber){ // a < b && a < c
            if (secondNumber < thirdNumber){ // a < b < c
                System.out.println(firstNumber + " < " + secondNumber + " < " + thirdNumber);
            } else { // a < c < b
                System.out.println(firstNumber + " < " + thirdNumber + " < " + secondNumber);
            }
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber){ // b < a && b < c
            if (firstNumber < thirdNumber){ // b < a < c
                System.out.println(secondNumber + " < " + firstNumber + " < " + thirdNumber);
            } else { // b < c < a
                System.out.println(secondNumber + " < " + thirdNumber + " < " + firstNumber);
            }
        } else { // c < a && c < b
            if (firstNumber < secondNumber){ // c < a < b
                System.out.println(thirdNumber + " < " + firstNumber + " < " + secondNumber);
            } else { // c < b < a
                System.out.println(thirdNumber + " < " + secondNumber + " < " + firstNumber);
            }
        }
    }
}
