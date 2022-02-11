import java.util.*;
public class ActivityRecommendation {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-etkinlik-onerme

    Recommend an activity to the user according to the air temperature,
    if the temperature is,
    below 5°C, then recommend skiing
    between 5°-15°C, then recommend cinema
    between 10°-25°C, then recommend picnic
    more than 25°C, then recommend swimming

    construct the if-else statements differently from the instructor
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the air temperature
        System.out.print("Enter the air temperature (°C): ");
        double airTemperature = input.nextDouble();

        if (airTemperature >= 25){
            System.out.println("You can go swimming");
        } else if (airTemperature >= 5){
            if (airTemperature >= 10){
                System.out.println("You can go on a picnic");
            }
            if (airTemperature <= 15){
                System.out.println("You can go to the cinema");
            }
        } else {
            System.out.println("You can go skiing");
        }
    }
}
