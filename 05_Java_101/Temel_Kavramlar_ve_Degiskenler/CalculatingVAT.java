import java.util.*;
public class CalculatingVAT {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-kdv-hesaplama

    Write a program to calculate the value-added tax amount.
    Ask the user to enter the price without VAT
    Print the VAT amount, and the final price including VAT

    If the price of the product is less than or equal to 1000 TL, the VAT rate is 18%
    if the price is greater than 1000 TL, the VAT rate is 8%

    Note that usage of if-else is forbidden!
    */
    public static void main(String[] args) {
        //declare the VAT_RATE_THRESHOLD constant and VAT Rates below and above of it
        final int VAT_RATE_THRESHOLD = 1000;
        final double VAT_RATE_BELOW_THRESHOLD = 0.18;
        final double VAT_RATE_ABOVE_THRESHOLD = 0.08;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the price without VAT
        System.out.print("Enter the price without VAT (TL): ");
        double priceBeforeVAT = input.nextDouble();

        //determine if the price of the product is greater than 1000 TL or not.
        boolean isGreaterThanThreshold = priceBeforeVAT > VAT_RATE_THRESHOLD;

        //determine the amount of VAT and the price with VAT
        double amountOfVAT = isGreaterThanThreshold ? (priceBeforeVAT * VAT_RATE_ABOVE_THRESHOLD) : (priceBeforeVAT * VAT_RATE_BELOW_THRESHOLD);
        double priceWithVAT = priceBeforeVAT + amountOfVAT;

        //print the VAT Rate, VAT amount and the total amount
        System.out.println("VAT Rate: " + (isGreaterThanThreshold ? VAT_RATE_ABOVE_THRESHOLD : VAT_RATE_BELOW_THRESHOLD));
        System.out.println("Amount of VAT: " + amountOfVAT + " TL");
        System.out.println("Price with VAT " + priceWithVAT + " TL");
    }
}
