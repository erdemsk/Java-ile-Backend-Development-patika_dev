import java.util.*;
public class PatternWithARecursiveMethod {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-recursive-pattern

    -Ask the user to enter a number
    -Print the current value then subtract 5 from the input until it becomes less than or equal to 0,
    -When the number became less than or equal to 0, print the current value then add 5 until it turns to the original input.
    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        //if the number is greater than or equal to 0, subtract 5 from it. For this situation, name the direction as -1
        if (number > 0){
            pattern(number, number, -1);
        } else {
            System.out.println("You should have entered a positive number!");
            System.exit(1);
        }
    }

    public static int pattern(int n, int startingPoint, int direction){
        //print the current n value
        System.out.print(n + " ");

        //declare a variable for the addition/ subtraction operations
        int addOrSubtract = 5;

        //if the direction is 1, add, if not(-1), subtract
        if (direction == 1){
            n += addOrSubtract;
        } else {
            n -= addOrSubtract;
            if (n <= 0){ // if you finally reach the below 0, then change the direction and start adding
                direction *= -1;
            }
        }

        //if you're back to the point you started, print the number and terminate the function
        if (n == startingPoint){
            System.out.println(n);
            return n;
        }

        //call the method itself by the next n value
        return pattern(n, startingPoint, direction);
    }
}
