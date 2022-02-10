import java.util.*;
public class CalculatingTheAreaOfCircle {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-daire-alan-cevre

    Write a program and ask the user to enter the radius and the central angle (𝛼) of a circle,
    then calculate the area of the circle by following formula:
    Area = (PI * r * r) * (𝛼 / 360)
    PI = 3.14
    */
    public static void main(String[] args) {
        //Declare a constant to hold the value of PI number
        final double PI_NUMBER = 3.14;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the radius
        System.out.print("Enter the radius of the circle (cm): ");
        double radius = input.nextDouble();

        //Ask the user to enter the central angle (𝛼)
        System.out.print("Enter the central angle(°): ");
        double centralAngle = input.nextDouble();

        //calculate the area of circle
        double areaOfCircle = PI_NUMBER * radius * radius * centralAngle / 360;

        //display the area of circle
        System.out.println("The area of the circle is: " + areaOfCircle + " cm^2");
    }
}
