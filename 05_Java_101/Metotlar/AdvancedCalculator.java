import java.util.*;
public class AdvancedCalculator {
    /*
   Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-hesap-mak-2

   Add modulo operation and calculating the area and perimeter of a rectangle functions to the instructor's calculator
   */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        String functions = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential Number\n"
                + "6- Factorial\n"
                + "7- Modulo Operation\n"
                + "8- Perimeter and Area of a Rectangle\n"
                + "0- Exit";

        while (true){
            //Ask user which type of function they want to do
            System.out.println(functions);
            System.out.print("Choose your operation: ");
            int selection = input.nextInt();

            if(selection == 0){
                break;
            } else if (selection < 0 || selection > 8){
                System.out.println("Wrong input!");
                break;
            }

            int firstNumber, secondNumber;

            System.out.print("a = ");
            firstNumber = input.nextInt();
            if (selection != 6){
                System.out.print("b = ");
                secondNumber = input.nextInt();
            } else {
                secondNumber = 1;
            }


            switch (selection){
                case 1:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + sum(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + subtract(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + " * " + secondNumber + " = " + multiply(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println(firstNumber + " / " + secondNumber + " = " + divide(firstNumber, secondNumber));
                    break;
                case 5:
                    System.out.println(firstNumber + " ^ " + secondNumber + " = " + exponent(firstNumber, secondNumber));
                    break;
                case 6:
                    System.out.println(firstNumber + "! = " + factorial(firstNumber));
                    break;
                case 7:
                    System.out.println(firstNumber + " % " + secondNumber + " = " + modulo(firstNumber, secondNumber));
                    break;
                case 8:
                    rectanglePeriArea(firstNumber, secondNumber);
                    break;
            }
        }
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static int subtract(int a, int b){
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b){
        int result = a * b;
        return result;
    }

    public static double divide(double a, double b){
        double result  = (a / b);
        return result;
    }

    public static double exponent(double a, int b){
        double result = 1.0;

        //for negative exponents
        if (b < 0){
            a = (1 / a);
            b *= -1;
        }

        for(int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    public static int factorial(int a){
        int result = 1;
        for (int i = a; i > 0; i--){
            result *= i;
        }
        return result;
    }

    public static int modulo(int a, int b){
        int result = a % b;
        return result;
    }

    public static void rectanglePeriArea(int a, int b) {
        int perimeter = 2 * (a + b);
        int area = a * b;
        System.out.println("Perimeter of the rectangle is " + perimeter + "\nArea of the rectangle is " + area);
    }
}
