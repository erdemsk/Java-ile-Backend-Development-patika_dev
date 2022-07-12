import java.util.Arrays;
public class FindRepeatedEvenNumbersinanArray {
    /*
    Homework of Java101 Module by https://app.patika.dev/courses/java101/pratik-duplicate
    */
    public static void main(String[] args) {
        int[] list = {3, 7, 4, 3, 3, 2, 4, 9, 10, 2, 21, 1, 33, 10, 9, 1};
        int[] repeated = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if((i != j) && (list[i] % 2 == 0) && (list[i] == list[j])){
                    if(!isFound(repeated, list[i])){
                        repeated[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        Arrays.sort(repeated);
        for(int value : repeated){
            if (value != 0){
                System.out.print(value + ", ");
            }
        }
    }

    static boolean isFound(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
}
