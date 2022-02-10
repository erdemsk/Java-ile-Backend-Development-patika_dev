import java.util.*;
public class SimpleCalculatorUsingSwitch {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-hesap-mak-1

    Write a simple calculator that has 4 fundamental arithmetical functions using switch-case
    */

    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two numbers:
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        //Ask user the arithmetic operation that they want to execute
        System.out.print("Please type,\n1 for addition (+)\n2 for subtraction (-)\n3 for multiplication (*)" +
                "\n4 for division (/)\n>> ");
        int arithmeticOperation = input.nextInt();
        double result;

        //create the switch-case
        switch (arithmeticOperation){
            case 1:
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);break;
            case 4:
                switch ((int) secondNumber){
                    case 0:
                        System.out.println("Invalid operation! A number cannot divided by 0");break;
                    default:
                        result = firstNumber / secondNumber;
                        System.out.println(firstNumber + " / " + secondNumber + " = " + result);break;
                }break;
            default:
                System.out.println("Invalid input");
        }
    }
}
