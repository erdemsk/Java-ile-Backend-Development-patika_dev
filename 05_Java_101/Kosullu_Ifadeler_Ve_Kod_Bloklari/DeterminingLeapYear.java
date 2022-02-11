import java.util.*;
public class DeterminingLeapYear {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-artik-yil

    February has 29 days in leap years. A year is a leap year if,
    it can be divided by 4 without remainder but not by 100 without remainder, or it can be divided by 400

    Write a program and ask user to enter a year and determine if it is a leap year or not.
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        if (isLeap){
            System.out.println(year + " is a leap year.");
        } else{
            System.out.println(year + " is not a leap year.");
        }

    }
}
