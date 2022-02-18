import java.util.*;
public class IsPrimeUsingRecursive {
     /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-recursive-prime
    Using a recursive method, determine if the user input is a prime number or not
    */

    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int divisor = 2;

        if(isPrime(number, divisor)){
            System.out.println(number + " is a prime number");
        } else{
            System.out.println(number + " is NOT a prime number");
        }
    }

    public static boolean isPrime(int num, int divisor){
        //if divisor is greater than the half of the number, there won't be any division without remainder, so the number is prime
        if (divisor > (num / 2)){
            return true;
        }

        //if number has a factor, the number is not prime
        if (num % divisor == 0){
            return false;
        }

        //if the current divisor don't divide the number without remainder, check if the (divisor + 1) is a factor of the number or not
        return isPrime(num, divisor + 1);
    }
}
