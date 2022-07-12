public class PrintPWithMultiDimentionalArrays {
    /*
    Homework of Java101 Module by https://app.patika.dev/courses/java101/pratik-array-letter
    */
    public static void main(String[] args) {
        String[][] letterP = new String[6][4];

        for (int i = 0; i < letterP.length; i++){
            for (int j = 0; j < letterP[i].length; j++){
                if (i == 0 || i == 2){
                    letterP[i][j] = " * ";
                } else if (j == 0 || (j == 3 && i < 3)){
                    letterP[i][j] = " * ";
                } else{
                    letterP[i][j] = "   ";
                }
            }
        }

        for(String[] row : letterP){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}