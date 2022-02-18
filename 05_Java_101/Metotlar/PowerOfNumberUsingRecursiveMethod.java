import java.util.*;
public class PowerOfNumberUsingRecursiveMethod {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-recursive-power
    Using a recursive method, calculate the exponent of a function according to the user inputs
    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the base number and the exponent
        System.out.print("For a^b, a = ");
        int baseNumber = input.nextInt();

        System.out.print("For a^b, b = ");
        int powerOfNumber = input.nextInt();

        System.out.println(baseNumber + " ^ " + powerOfNumber + " = " + power(baseNumber, powerOfNumber));
    }

    public static double power(double base, int pow){
        double result = 1.0;

        //if both the base and exponential part are 0
        if (base == 0 && pow == 0){
            System.out.println((int) base + " ^ " + pow + " is an uncertainty");
            System.exit(1);
        }

        //return the base, if the exponent is 1
        if (pow == 1){
            return base;
        }

        //if the exponent is a negative number
        if (pow < 0){
            base = 1 / base;
            pow *= -1;
        }

        //call the same method, when the exponent is greater than 0
        if (pow > 0){
            return base * power(base, pow - 1);
        }

        return result;
    }
}
