import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingTheNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println(number);
        while (right < 5) {
            System.out.print("Enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number from 0 to 100.");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many invalid attempts. Remaining rights: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("You'll lose your right in the next failed attempt");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, you guessed correct! The number is: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You made a wrong guess");
                if (selected > number) {
                    System.out.println(selected + " is greater than the secret number.");
                } else {
                    System.out.println(selected + " is less than the secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining rights: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
                System.out.println("The secret number is " + number);
            }
        }

    }
}
