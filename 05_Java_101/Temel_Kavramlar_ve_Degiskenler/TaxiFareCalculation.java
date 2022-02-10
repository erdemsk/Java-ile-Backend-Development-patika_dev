import java.util.*;
public class TaxiFareCalculation {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-taksimetre

    Write a program to calculate the taxi fare by following rules:
    The switch on price is 10 TL
    The per kilometer price is 2.20 TL
    Minimum taxi fare will be 20 TL, no matter if the taximeter shows a value that is less than 20 TL

    Note that usage of if-else is forbidden
     */
    public static void main(String[] args) {
        //declare the constants for switch on price, per kilometer price and minimum fare
        final int SWITCH_ON_PRICE = 10;
        final int MINIMUM_FARE = 20;
        final double PER_KILOMETER_PRICE = 2.20;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Enter the length of the road
        System.out.print("Enter the length of your destination (km): ");
        double lengthOfTheRoad = input.nextDouble();

        //Calculate the taxi fare and determine if it is greater than or equal to the minimum fare
        double taxiFare = SWITCH_ON_PRICE + PER_KILOMETER_PRICE * lengthOfTheRoad;
        boolean isGreaterThanMinimumFare = taxiFare >= MINIMUM_FARE;

        //Display the taxi fare
        System.out.println("The Taxi fare is: " + (isGreaterThanMinimumFare ? taxiFare : MINIMUM_FARE + " TL"));
    }
}
