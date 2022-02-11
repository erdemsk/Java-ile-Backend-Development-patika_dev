import java.util.*;
public class FlightTicketPriceCalculator {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-ucak-bileti
    Ask user the distance (km), their age, one-way or return ticket.
    Distance and age must be positive and one-way or return ticket choice must be 1 or 2. Otherwise, prompt an error
    Price per km is 0.10 TL,
    If the passenger is younger than 12, apply 50% discount on ticket price,
    If the passenger is between 12-24 years old, apply 10% discount on ticket price
    If the passenger is older than 65, apply 30% discount on ticket price
    If the ticket type is round trip ticket, apply additional 20% discount
     */
    public static void main(String[] args) {
        //declare a constant for price per km
        final double PRICE_PER_KM = 0.1;

        //declare the variables to hold the discount rates, discount amounts and ticket price
        double ageBasedDiscountRate, roundTripTicketDiscountRate, ticketPrice, ageBasedDiscountAmount, roundTripTicketDiscountAmount;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the distance that they want to fly
        System.out.print("The distance of your destination (km): ");
        double distance = input.nextDouble();

        if (distance < 0){
            System.out.println("Wrong input");
            System.exit(1);
        }

        //Ask user their age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 0 || age > 130){
            System.out.println("Wrong input!");
            System.exit(1);
        }

        System.out.print("Enter the type of your ticket \n(1) one-way ticket\n(2) round trip ticket: ");
        int ticketType = input.nextInt();

        if (ticketType != 1 && ticketType != 2){
            System.out.println("Wrong input!");
            System.exit(1);
        }

        if (ticketType == 2){
            roundTripTicketDiscountRate = 0.2;
        } else{
            roundTripTicketDiscountRate = 0;
        }

        //calculate the price per km
        ticketPrice = distance * PRICE_PER_KM;

        //determine if there will be any age-based discount, if so, what will be the discount rate
        if (age < 12){
            ageBasedDiscountRate = 0.5;
        } else if (age <= 24){
            ageBasedDiscountRate = 0.1;
        } else if (65 <= age){
            ageBasedDiscountRate = 0.3;
        } else {
            ageBasedDiscountRate = 0;
        }

        //apply the age-based discount to the ticket
        ageBasedDiscountAmount = ticketPrice * ageBasedDiscountRate;
        ticketPrice -= ageBasedDiscountAmount;

        //if the passenger bought a round-trip ticket, apply additional discount
        roundTripTicketDiscountAmount = ticketPrice * roundTripTicketDiscountRate;
        ticketPrice -= roundTripTicketDiscountAmount;

        //if the ticket is round-trip ticket, multiply the ticket price by 2 to calculate total ticket price
        if (ticketType == 2){
            ticketPrice *= 2;
        }

        //display the ticket price
        System.out.println("Total ticket price is: " + ticketPrice);
    }
}
