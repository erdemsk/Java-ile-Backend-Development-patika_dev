import java.util.*;
public class LCMandHCF {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-ebob-ekok
    Write a program to calculate the LCM (least common multiple) and HCF (highest common factor) of two numbers
    using while loop
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter two numbers
        System.out.print("Enter a = ");
        int numberOne = input.nextInt();

        System.out.print("Enter b = ");
        int numberTwo = input.nextInt();

        int greaterNumber, smallerNumber, leastCommonMultiple, highestCommonFactor = 1;

        if (numberOne >= numberTwo){
            greaterNumber = numberOne;
            smallerNumber = numberTwo;
        } else{
            greaterNumber = numberTwo;
            smallerNumber = numberOne;
        }

        //find the highest common factor
        int counter = 1;
        while (counter < greaterNumber){
            if ((numberOne % counter == 0) && (numberTwo % counter == 0)){
                highestCommonFactor = counter;
            }
            counter++;
        }

        //find the least common multiple
        counter = smallerNumber;
        while (!((counter % numberOne == 0) && (counter % numberTwo == 0))){
            counter++;
        }
        leastCommonMultiple = counter;

        //display the result
        System.out.println("The highest common factor, HCF(" + numberOne + "," + numberTwo + ") = " + highestCommonFactor
                + "\nand the least common multiple, LCM(" + numberOne + "," + numberTwo + ") = " + leastCommonMultiple);
    }
}
