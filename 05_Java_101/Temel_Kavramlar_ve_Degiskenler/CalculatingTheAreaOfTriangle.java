import java.util.*;
public class CalculatingTheAreaOfTriangle {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-hipotenus-bulma

    Write a program to ask the user the length of the sides of a triangle and calculate its area

    The perimeter of the triangle is 2u, where the length of the sides of this triangle is a, b, c
    u = (a+b+c) / 2
    area * area = u * (u-a) * (u-b) * (u-c)
    */
    public static void main(String[] args) {
        double lengthOfFirstSide, lengthOfSecondSide, lengthOfThirdSide;
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the lengths of the sides
        System.out.print("Enter the length of the first side (cm): ");
        lengthOfFirstSide = input.nextDouble();

        System.out.print("Enter the length of the second side (cm): ");
        lengthOfSecondSide = input.nextDouble();

        System.out.print("Enter the length of the third side (cm): ");
        lengthOfThirdSide = input.nextDouble();

        //calculate the perimeter and the area of triangle
        double perimeterOfTriangle = lengthOfFirstSide + lengthOfSecondSide + lengthOfThirdSide;
        double u = perimeterOfTriangle / 2;
        double areaOfTriangle = Math.sqrt(u * (u-lengthOfFirstSide) * (u - lengthOfSecondSide) * (u - lengthOfThirdSide));

        //display the area of triangle
        System.out.println("The area of this triangle is " + areaOfTriangle + " cm^2");
    }
}
