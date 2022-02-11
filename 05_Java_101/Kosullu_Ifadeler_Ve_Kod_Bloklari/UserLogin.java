import java.util.*;
public class UserLogin {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-login-1

    Write a program to ask the user their username and password. Check if they are matching,
    take just 'patika' as username and 'java123' as the password for now.
    If the password is wrong, ask the user if they want to reset their password or not,
    Be careful that new password and old password aren't matching, if so, prompt
    "Couldn't reset password, try another one". If not, prompt "Password changed successfully"
     */
    public static void main(String[] args) {
        //Declare the valid username and password variables
        String validUsername = "patika";
        String validPassword = "java123";
        String newPassword;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user their username
        System.out.print("Enter your username: ");
        String username = input.nextLine();

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        //check if the username and password are correct
        if (username.equals(validUsername)){
            if (password.equals(validPassword)){
                System.out.println("You're logged in!");
            } else {
                System.out.println("Password failed! Do you want to reset your password?\n" +
                        "Press \"1\" for \"Yes!\", or \"0\" for \"No!\": ");
                int passwordResetChoice = input.nextInt();
                //if the user wants to reset their password
                if (passwordResetChoice == 1){
                    Scanner passwordInput = new Scanner(System.in);
                    System.out.print("Enter your new password: ");
                    newPassword = passwordInput.nextLine();

                    //if the user enters the same password as the new password, prompt an error. If not, change the password
                    if (newPassword.equals(validPassword)){
                        System.out.println("Password change failed! Please try another password.");
                    } else {
                        password = newPassword;
                        System.out.println("Password changed successfully!");
                    }
                } else if (passwordResetChoice == 0){
                    System.out.println("Password change refused!");
                } else {
                    System.out.println("Invalid input!");
                }
            }
        } else {
            System.out.println("No such user found!");
        }
    }
}
