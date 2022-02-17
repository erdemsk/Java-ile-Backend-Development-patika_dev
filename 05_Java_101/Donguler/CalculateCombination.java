import java.util.*;
public class CalculateCombination {
    /*
   Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-two-power

   Write a program that asks user to enter two numbers (n, r), and
   calculate the combination of these numbers by the following formula:
   C (n, r) = n! / [r! * (n-r)!]

    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter two numbers
        System.out.print("For C(n,r) please enter n: ");
        int n = input.nextInt();
        System.out.print("Enter r: ");
        int r = input.nextInt();

        //calculate the result of the combination
        int resultOfCombination = factorial(n) / (factorial(r) * factorial(n-r));

        //display the result
        System.out.println("C(" + n + "," + r +") = " + resultOfCombination);
    }

    public static int factorial(int n){
        int factorial = 1;
        for (int i = n; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
}
