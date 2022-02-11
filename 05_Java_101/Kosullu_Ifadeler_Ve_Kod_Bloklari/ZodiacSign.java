import java.util.*;
public class ZodiacSign {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-burclar

    Ask user the day and month that they were born. Print their zodiac sign according to the following table
    without using switch-case

    Aries: 21 March - 20 April
    Taurus: 21 April - 21 May
    Gemini: 22 May - 22 June
    Cancer: 23 June - 22 July
    Leo: 23 July - 22 August
    Virgo: 23 August - 22 September
    Libra: 23 September - 22 October
    Scorpio: 23 October - 21 November
    Sagittarius: 22 November - 21 December
    Capricorn: 22 December - 21 January
    Aquarius: 22 January - 19 February
    Pisces: 20 February - 20 March
     */
    public static void main(String[] args) {
        //declare a String to keep the zodiac sign value
        String zodiacSign;
        int dayUpperLimit;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the month that they were born
        System.out.print("Enter the month you were born (1-12): ");
        int birthMonth = input.nextInt();

        if (birthMonth < 1 || birthMonth > 12){
            System.out.println("Wrong input!");
            System.exit(1);
        }

        System.out.print("Enter the day you were born: ");
        int birthDay = input.nextInt();

        if (birthMonth == 2){
            dayUpperLimit = 28;
        } else if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8
        || birthMonth == 10 || birthMonth == 12){
            dayUpperLimit = 31;
        } else {
            dayUpperLimit = 30;
        }

        if (birthDay > dayUpperLimit){
            System.out.println("Wrong input!");
            System.exit(1);
        }

        if (birthMonth == 1){
            if (birthDay < 22){
                zodiacSign = "Capricorn";
            } else{
                zodiacSign = "Aquarius";
            }
        } else if (birthMonth == 2){
            if (birthDay < 19){
                zodiacSign = "Aquarius";
            } else{
                zodiacSign = "Pisces";
            }
        } else if (birthMonth == 3){
            if (birthDay < 21){
                zodiacSign = "Pisces";
            } else{
                zodiacSign = "Aries";
            }
        } else if (birthMonth == 4){
            if (birthDay < 20){
                zodiacSign = "Aries";
            } else{
                zodiacSign = "Taurus";
            }
        } else if (birthMonth == 5){
            if (birthDay < 21){
                zodiacSign = "Taurus";
            } else{
                zodiacSign = "Gemini";
            }
        } else if (birthMonth == 6){
            if (birthDay < 22){
                zodiacSign = "Gemini";
            } else{
                zodiacSign = "Cancer";
            }
        } else if (birthMonth == 7){
            if (birthDay < 22){
                zodiacSign = "Cancer";
            } else{
                zodiacSign = "Leo";
            }
        } else if (birthMonth == 8){
            if (birthDay < 22){
                zodiacSign = "Leo";
            } else{
                zodiacSign = "Virgo";
            }
        } else if (birthMonth == 9){
            if (birthDay < 22){
                zodiacSign = "Virgo";
            } else{
                zodiacSign = "Libra";
            }
        } else if (birthMonth == 10){
            if (birthDay < 22){
                zodiacSign = "Libra";
            } else{
                zodiacSign = "Scorpio";
            }
        } else if (birthMonth == 11){
            if (birthDay < 21){
                zodiacSign = "Scorpio";
            } else{
                zodiacSign = "Sagittarius";
            }
        } else{
            if (birthDay < 21){
                zodiacSign = "Sagittarius";
            } else{
                zodiacSign = "Capricorn";
            }
        }

        System.out.println("Your zodiac sign is " + zodiacSign);
    }
}
