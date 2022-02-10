import java.util.*;
public class BMICalculator {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-vucut-kitle-hesaplama

    Ask the user to enter the weight and height values and calculate their BMI by the following formula:
    BMI = Weight / Height^2 (where height in m, and weight in kg)
    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the weight
        System.out.print("Enter your weight (kg): ");
        double weightOfUser = input.nextDouble();

        System.out.print("Enter your height (m): ");
        double heightOfUser = input.nextDouble();

        //Calculate the BMI
        double bodyMassIndex = weightOfUser / (heightOfUser * heightOfUser);

        //Display the BMI result
        System.out.println("Your body mass index is: " + bodyMassIndex);
    }
}
