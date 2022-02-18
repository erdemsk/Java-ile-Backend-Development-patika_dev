import java.util.*;
public class FibonacciSeriesWithRecursiveMethods {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-fibo-recursive

    Write a program using recursive methods that prints the nth Fibonacci number, which is decided by the user.
    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Which element of the Fibonacci series do you want to learn? ");
        int elementPosition = input.nextInt();

        //display the element using a recursive method
        System.out.println(fibonacci(elementPosition));
    }

    public static int fibonacci(int n){
        //first and second elements of Fibonacci Series
        if (n == 1 || n == 2){
            return 1;
        }

        //other elements can be determined by the following rule.
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
