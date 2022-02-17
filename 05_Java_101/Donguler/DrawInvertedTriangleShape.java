import java.util.*;
public class DrawInvertedTriangleShape {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-ters-ucgen

    Write a program and ask user the number of liens and draw an inverted triangle shape by stars.
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter the number of lines
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int i = numberOfLines; i >= 1; i--){
            for (int k = numberOfLines - i; k >= 1; k--){
                System.out.print(" ");
            }

            for(int j = (2 * i) - 1; j >= 1; j--){
                System.out.print("*");
            }
            //move to the next line
            System.out.println();
        }
    }
}
