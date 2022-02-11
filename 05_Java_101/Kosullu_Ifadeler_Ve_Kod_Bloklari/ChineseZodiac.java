import java.util.*;
public class ChineseZodiac {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-cin-zodyagi
    When calculating the Chinese Zodiac,
    it is found according to the remainder of the 12th division of the person's birth year.
    Write a program to calculate Chinese Zodiac according to the following table:
    https://i.insider.com/5c58a705eb3ce802d873daa3?width=1000&format=jpeg&auto=webp

     */
    public static void main(String[] args) {
        //declare a String variable to hold the zodiac sign value
        String chineseZodiacSign;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user their birth year
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();


        //determine the Chinese zodiac sign
        switch (year % 12){
            case 0: chineseZodiacSign = "Monkey"; break;
            case 1: chineseZodiacSign = "Rooster"; break;
            case 2: chineseZodiacSign = "Dog"; break;
            case 3: chineseZodiacSign = "Pig"; break;
            case 4: chineseZodiacSign = "Rat"; break;
            case 5: chineseZodiacSign = "Ox"; break;
            case 6: chineseZodiacSign = "Tiger"; break;
            case 7: chineseZodiacSign = "Rabbit"; break;
            case 8: chineseZodiacSign = "Dragon"; break;
            case 9: chineseZodiacSign = "Snake"; break;
            case 10: chineseZodiacSign = "Horse"; break;
            case 11: chineseZodiacSign = "Goat"; break;
            default: chineseZodiacSign = "";
        }

        //Display the Chinese Zodiac sign
        System.out.println("Your Chinese Zodiac Sign is " + chineseZodiacSign);
    }
}
