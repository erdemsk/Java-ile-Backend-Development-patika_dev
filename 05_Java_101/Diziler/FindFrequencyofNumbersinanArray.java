import java.util.Arrays;

public class FindFrequencyofNumbersinanArray {
    /*
    Homework of Java101 Module by https://app.patika.dev/courses/java101/odev-array-count
    */
    public static void main(String[] args) {
        int[] myArray = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequencyArray = new int[8];
        int frequencyOfANumber = 0;

        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray.length; j++){
                if ((myArray[i] == myArray[j])){
                    frequencyOfANumber++;
                }
            }
            //display the frequency of the element if it hasn't been displayed yet
            if(!isFound(frequencyArray, myArray[i])){
                System.out.println("The frequency of " + myArray[i] + " is " + frequencyOfANumber);
            }
            //add the element to frequency array, if it hasn't been initiated yet
            if(!isFound(frequencyArray, myArray[i])){
                frequencyArray[i] = myArray[i];
            }
            //set the frequency of a number to 0 for next item.
            frequencyOfANumber = 0;
        }
    }

    static boolean isFound(int arr[], int val){
        for (int i : arr){
            if (i == val){
                return true;
            }
        }
        return false;
    }
}
