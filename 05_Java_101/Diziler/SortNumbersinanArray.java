import java.util.Arrays;
import java.util.Scanner;
public class SortNumbersinanArray {
     /*
    Homework of Java101 Module by https://app.patika.dev/courses/java101/odev-array-order
    */
     public static void main(String[] args) {
         //Create a Scanner object
         Scanner input = new Scanner(System.in);

         //Ask user the size of the array
         System.out.print("Enter the size of the array: ");
         int sizeOfArray = input.nextInt();

         int[] myArray = new int[sizeOfArray];

         //Ask user the elements of the array
         System.out.println("Enter the elements of the array: ");
         for(int i = 0; i < sizeOfArray; i++){
             System.out.print("Enter the " + (i+1) + ". Element: ");
             int num = input.nextInt();
             myArray[i] = num;
         }

         //sort numbers in increasing order
         Arrays.sort(myArray);

         //display the numbers
         System.out.println(Arrays.toString(myArray));
     }
}
