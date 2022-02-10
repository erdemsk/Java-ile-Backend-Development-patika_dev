import java.util.*;
public class GroceryBill {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-manav-kasa

    Ask the user different how many kilograms they bought the different kind of fruits.
    Calculate the total bill by following prices:
    Pear = 2.14 TL, Apple = 3.67 TL, Tomato = 1.11 TL, Banana = 0.95 TL, Eggplant = 5.00 TL
    */
    public static void main(String[] args) {
        //create constants that holds the kg price of products
        double PEAR_KG_PRICE = 2.14, APPLE_KG_PRICE = 3.67, TOMATO_KG_PRICE = 1.11, BANANA_KG_PRICE = 0.95,
               EGGPLANT_KG_PRICE = 5.00;

        //declare the variable to calculate the price of every single product
        double pearPrice, applePrice, tomatoPrice, bananaPrice, eggplantPrice;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user how many kilogram they bought the different kind of products
        System.out.print("How many kilograms pear have you bought?: ");
        double pearAmount = input.nextDouble();
        pearPrice = pearAmount * PEAR_KG_PRICE;

        System.out.print("How many kilograms apple have you bought?: ");
        double appleAmount = input.nextDouble();
        applePrice = appleAmount * APPLE_KG_PRICE;

        System.out.print("How many kilograms tomato have you bought?: ");
        double tomatoAmount = input.nextDouble();
        tomatoPrice = tomatoAmount * TOMATO_KG_PRICE;

        System.out.print("How many kilograms banana have you bought?: ");
        double bananaAmount = input.nextDouble();
        bananaPrice = bananaAmount * BANANA_KG_PRICE;

        System.out.print("How many kilograms eggplant have you bought?: ");
        double eggplantAmount = input.nextDouble();
        eggplantPrice = eggplantAmount * EGGPLANT_KG_PRICE;

        //calculate the sum
        double sum = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;

        //display the total bill
        System.out.println("Total bill is: " + sum + " TL");
    }
}
