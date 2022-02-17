import java.util.*;
public class ATM {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-atm

    Write an ATM simulation which asks users their username and password to
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Let's say user has 3 chances to enter correct username and password and has 1500 TL balance
        int remainingTrial = 3, balance = 1500;
        int transaction;

        while (remainingTrial > 0){
            //Ask user to enter their username and password
            System.out.print("Enter your username: ");
            String username = input.nextLine();

            System.out.print("Enter your password: ");
            String password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to the bank of Patika!");

                do {
                    System.out.print("(0) Cash withdrawal\n(1) Cash deposit\n(2) Balance check\n(3) Exit" +
                            "\nPlease enter which type of transaction you want to do: ");
                    transaction = input.nextInt();

                    switch (transaction) {
                        case 0:
                            System.out.print("Enter the amount you want to withdraw: ");
                            int withdrawalAmount = input.nextInt();
                            if (balance >= withdrawalAmount) {
                                balance -= withdrawalAmount;
                            } else {
                                System.out.println("Insufficient balance!");
                            }
                            break;
                        case 1:
                            System.out.print("\nEnter the amount you want to deposit: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.println("The balance is: " + balance);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Please type a number between 0-3");
                            break;
                    }
                } while (transaction != 3);
                System.out.println("Have a nice day!");
                break;
            } else{
                System.out.println("Wrong username or password");
                remainingTrial--;

                if(remainingTrial == 0){
                    System.out.println("You've submitted incorrect username and/ or password for three times. " +
                            "\nYour account has been blocked, please contact the bank. ");
                } else {
                    System.out.println("Remaining trials: " + remainingTrial);
                }
            }
        }
    }
}
