import java.util.*;
public class PowersOfFourAndFiveUpToACertainNumber {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-two-power

    Write a program that asks user to enter a number, and finds the powers of 4 and 5 until that number

     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1, j = 1; i <= number || j <= number; i *= 4, j *= 5){
            //powers of 5 exceed the upper limit before the powers of 4, so we only check 5's condition
            if (j <= number){
                System.out.println(i + " " + j);
            } else { //If powers of 5 exceed the upper limit, but powers of 4 haven't yet, then just print the powers of 4
                System.out.println(i);
            }
        }
    }
}
