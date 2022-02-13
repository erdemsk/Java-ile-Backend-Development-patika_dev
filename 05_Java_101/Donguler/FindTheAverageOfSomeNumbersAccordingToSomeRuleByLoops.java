import java.util.*;
public class FindTheAverageOfSomeNumbersAccordingToSomeRuleByLoops {
    /*
    I know, it is a strange name, but couldn't figure out how to simplify these instructions.
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-cift-sayi-toplam

    Take an input (n) from the user and calculate the average of numbers that are divisible by 3 and 4
    without remainder from 0 to n (including n)
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Enter a number: ");
        int upperLimit = input.nextInt();

        //declare two variables to hold the sum and the numbers of multiples of 3 and 4
        int numberOfElements = 0;
        double sum = 0;

        //determine the multiples of 3 and 4 from 0 to n
        for (int i = 1; i <= upperLimit; i++){
            if ((i % 3 == 0) || (i % 4 == 0)){
                sum += i;
                numberOfElements++;
            }
        }

        //calculate the average of elements
        double average = sum / numberOfElements;

        //display the average of multiples of 3 and 4 from 0 to n
        System.out.println("The average of multiples of 3 or 4 from 0 to " + upperLimit + " is " + average);
    }
}
