import java.util.*;
public class DrawDiamondShape {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-yildiz-ucgen

    Draw diamond shape with stars using loops.
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Enter an odd number for the number of lines: ");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("Your input is not an odd number, it is converted to " + (number - 1));
        }

        int middleLine = (number + 1) / 2;

        //draw the upper side of the diamond
        for (int i = 1; i <= middleLine; i++){
            for (int k = 1; k <= middleLine - i; k++){
                System.out.print(" ");
            }

            for(int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            //move to the next line
            System.out.println();
        }

        //draw the bottom side of the diamond
        for (int i = middleLine - 1; i >= 1; i--){
            for (int k = middleLine - i; k >= 1; k--){
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
