import java.util.*;
public class FibonacciSeries {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-fibo

    Write a program that prints the Fibonacci numbers as much as the user wants
     */
    public static void main(String[] args) {
        final int NUMBER_OF_EXCEPTIONAL_ELEMENTS = 2;
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user how many Fibonacci numbers they want to see
        System.out.print("How many Fibonacci numbers would you like to see: ");
        int numberOfElements = input.nextInt();

        int i = 1, j = 1, temp, currentFibonacciNumber;

        //hardcode the first two exceptional elements
        System.out.print(i + ", ");
        System.out.print(j + ", ");

        for (int k = 0; k < (numberOfElements - NUMBER_OF_EXCEPTIONAL_ELEMENTS); k++){
            //calculate the current Fibonacci number and display it.
            currentFibonacciNumber = i + j;
            //if this element is the last, don't print ',' after that
            if (k == ((numberOfElements - NUMBER_OF_EXCEPTIONAL_ELEMENTS) - 1)){
                System.out.print(currentFibonacciNumber);
            } else {
                System.out.print(currentFibonacciNumber + ", ");
            }
            //update the elements
            temp = j;
            j = currentFibonacciNumber;
            i = temp;
        }
    }
}