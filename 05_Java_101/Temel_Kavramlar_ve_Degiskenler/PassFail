import java.util.*;
public class PassFail {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-not-ortalamasi

    Write a program to ask the user their Math, Physics, Chemistry, Turkish, History and Music scores
    then calculate the average of them.
    Finally, print "You've passed the class" if the student's average score is above 60,
    and print "You've failed the class" if the student's average score is below 60.
    Note that usage of if-else is forbidden. */

    public static void main(String[] args) {
        //Declare and assign the value of 6 to the NUMBER_OF_COURSES constant
        final int NUMBER_OF_COURSES = 6;
        final int PASS_MARK = 60;

        //declare the course variables
        int mathScore, physicsScore, chemistryScore, turkishScore, historyScore, musicScore;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the Math score
        System.out.print("Enter your Math score: ");
        mathScore = input.nextInt();

        //Ask the user to enter the Physics score
        System.out.print("Enter your Physics score: ");
        physicsScore = input.nextInt();

        //Ask the user to enter the Chemistry score
        System.out.print("Enter your Chemistry score: ");
        chemistryScore = input.nextInt();

        //Ask the user to enter the Turkish score
        System.out.print("Enter your Turkish score: ");
        turkishScore = input.nextInt();

        //Ask the user to enter the History score
        System.out.print("Enter your History score: ");
        historyScore = input.nextInt();

        //Ask the user to enter the Music score
        System.out.print("Enter your Music score: ");
        musicScore = input.nextInt();

        //calculate the average score and print
        int totalScore = mathScore + physicsScore + chemistryScore + turkishScore + historyScore + musicScore;
        int averageScore = totalScore / NUMBER_OF_COURSES;

        System.out.println("The average score is: " + averageScore);

        //determine if the average score of the user is greater than or equal to the pass mark.
        boolean isGreaterThanPassMark = averageScore >= PASS_MARK;

        //determine if the student passed or failed the class
        String result = isGreaterThanPassMark ? "You've passed the class" : "You've failed the class";

        //display the result
        System.out.println(result);
    }
}
