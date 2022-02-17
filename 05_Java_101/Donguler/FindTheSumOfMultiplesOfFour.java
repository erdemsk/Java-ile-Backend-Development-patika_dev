import java.util.*;
public class FindTheSumOfMultiplesOfFour {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-tek-sayi-toplam

    Write a program that runs until user gives an odd number, and calculate the sum of
    numbers that are divisible by 4
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        int number, sum = 0;

        //Ask user to enter numbers and add them to the sum if they are divisible by 4
        do{
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number % 4 == 0){
                sum += number;
            }
        }
        while (number % 2 == 0);

        //display the sum of multiples of 4
        System.out.println("The sum of multiples of 4: " + sum);
    }
}
