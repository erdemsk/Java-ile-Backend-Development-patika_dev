import java.util.*;
public class FindTheMinAndMaxInputs {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-min-max

    Write a program and ask users to enter numbers and determine the minimum and maximum of them
    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user how many numbers are they going to enter
        System.out.print("How many numbers are you going to enter: ");
        int numberOfInputs = input.nextInt();

        if (numberOfInputs <= 0){
            System.out.println("Please enter a positive number!");
            System.exit(1);
        }

        int i = 1;

        //ask the first number from the user and initialize the min and max variables by that
        System.out.print("Enter the " + i + ". number: ");
        int minimumNumber = input.nextInt();
        int maximumNumber = minimumNumber;

        while (i < numberOfInputs){
            i++;

            //ask user to enter new numbers
            System.out.print("Enter the " + i + ". number: ");
            int temp = input.nextInt();

            //update the min and max variables if necessary
            if(temp > maximumNumber){
                maximumNumber = temp;
            } else if (temp < minimumNumber){
                minimumNumber = temp;
            }
        }

        //display the min and max numbers
        System.out.println("The maximum number is " + maximumNumber + "\nand the minimum number is " + minimumNumber);
    }
}
