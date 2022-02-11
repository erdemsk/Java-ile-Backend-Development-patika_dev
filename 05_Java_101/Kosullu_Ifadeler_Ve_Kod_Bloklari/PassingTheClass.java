import java.util.*;
public class PassingTheClass {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-sinif-gecme

    Write a program to calculate the average score of students.
    If the average score is above 50, student passes the class, if not, student fails the class.
    If the score input isn't between 0 and 100, do not include that in the average
     */
    public static void main(String[] args) {
        //declare a constant for the pass mark
        final int PASS_MARK = 50;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //declare score variables for courses, number of courses, total and averageScore
        int mathScore, turkishScore, physicsScore, chemistryScore, musicScore, numberOfCourses = 0;
        double totalScore = 0.0, averageScore;

        //Ask user their course scores
        System.out.print("Enter your Math score: ");
        mathScore = input.nextInt();

        if (mathScore >= 0 && mathScore <= 100){
            totalScore += mathScore;
            numberOfCourses++;
        }

        System.out.print("Enter your Turkish score: ");
        turkishScore = input.nextInt();

        if (turkishScore >= 0 && turkishScore <= 100){
            totalScore += turkishScore;
            numberOfCourses++;
        }

        System.out.print("Enter your Physics score: ");
        physicsScore = input.nextInt();

        if (physicsScore >= 0 && physicsScore <= 100){
            totalScore += physicsScore;
            numberOfCourses++;
        }

        System.out.print("Enter your Chemistry score: ");
        chemistryScore = input.nextInt();

        if (chemistryScore >= 0 && chemistryScore <= 100){
            totalScore += chemistryScore;
            numberOfCourses++;
        }

        System.out.print("Enter your Music score: ");
        musicScore = input.nextInt();

        if (musicScore >= 0 && musicScore <= 100){
            totalScore += musicScore;
            numberOfCourses++;
        }

        //calculate the average score and display it
        averageScore = totalScore / numberOfCourses;

        System.out.println("Average score is: " + averageScore);

        //display whether the student has passed or failed the class
        if(averageScore >= PASS_MARK){
            System.out.println("Congratulations, you've passed the class!");
        } else{
            System.out.println("Sorry, you've failed the class!");
        }
    }
}
