public class PrimeNumbersBetween1And100 {
     /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/odev-asal-sayi

    Write a program that prints the prime numbers between 1 and 100
     */
    public static void main(String[] args) {
        //define constants for number of primes and number of primes per line
        final int UPPER_LIMIT = 100;

        int number = 2;

        System.out.print("The prime numbers from 1 to 100 are: ");
        //repeatedly find prime numbers
        while (number < UPPER_LIMIT){
            //assume the number is prime
            boolean isPrime = true;

            //test whether the number is prime or not
            for (int divisor = 2; divisor <= (number / 2); divisor++){
                if (number % divisor == 0) { //if true, the number is not prime.
                    isPrime = false; //set isPrime to false
                    break;
                }
            }
            //display the prime number and a space
            if (isPrime){
                System.out.print(number + " ");
            }
            //check if the next number is prime or not
            number++;
        }
    }
}
