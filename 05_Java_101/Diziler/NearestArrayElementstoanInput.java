import java.util.Scanner;
import java.util.Arrays;

public class NearestArrayElementstoanInput {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/courses/java101/pratik-min-max
    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        int indexOfSmallerNumber = 0, indexOfGreaterNumber = 0;

        //sort the numbers in increasing order
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
        if (num < list[0]){
            System.out.println(num + " is less than every element in the list. Closest element is " + list[0]);
            System.exit(1);
        } else if (num > list[list.length - 1]){
            System.out.println(num + " is greater than every element in the list. Closest element is " + list[list.length-1]);
            System.exit(1);
        }

        for (int i = 0; i < list.length; i++){
            if (num > list[i]){
                indexOfSmallerNumber = i;
                indexOfGreaterNumber = i+1;
            }
        }

        System.out.println(num + " is less than " + list[indexOfSmallerNumber] + " and greater than " + list[indexOfGreaterNumber]);
    }
}
