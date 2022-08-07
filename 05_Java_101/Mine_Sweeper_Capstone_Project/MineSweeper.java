import java.util.Objects;
import java.util.Scanner;
public class MineSweeper {
    int numberOfRows;
    int numberOfColumns;

    public MineSweeper(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    public void layMines (String [][][] mineArray) {
        final int RATIO_OF_MINES = 4;

        int numberOfMines = numberOfRows * numberOfColumns / RATIO_OF_MINES;

        while (numberOfMines > 0){
            int locationOfMine = (int) (Math.random() * numberOfRows * numberOfColumns);
            int rowNumberOfMine = locationOfMine / numberOfColumns;
            int columnNumberOfMine = locationOfMine % numberOfColumns;
            if ((rowNumberOfMine < numberOfRows) && (columnNumberOfMine < numberOfColumns)){
                mineArray[rowNumberOfMine][columnNumberOfMine][0] = "*";
                mineArray[rowNumberOfMine][columnNumberOfMine][1] = "0";
                numberOfMines--;
            }
        }
    }

    public int checkMine(int x, int y, String[][][] _arr) {
        int numberOfNeighbourMines = 0;

        for(int i = -1; i < 2; i++) {
            for(int j = -1; j < 2; j++){
                //skip the empty indices
                if ((x + i < 0) || (y + j < 0)) continue;
                if ((x + i >= numberOfRows) || (y + j >= numberOfColumns)) continue;
                if ((i == 0) && (j == 0)) continue;
                //if one of the neighbour cells contains mine, increase the variable
                if (Objects.equals(_arr[x + i][y + j][0],"*")) numberOfNeighbourMines++;
            }
        }
        return numberOfNeighbourMines;
    }

    public void placeNumber(String[][][] mineArray) {
        for(int i = 0; i < numberOfRows; i++){
            for(int j = 0; j < numberOfColumns; j++){
                if( mineArray[i][j][0] == null) {
                    mineArray[i][j][0] = String.valueOf(checkMine(i, j, mineArray));
                    mineArray[i][j][1] = "0";
                }
            }
        }
    }

    public void printField(String[][][] mineArray) {
        for(int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (Objects.equals(mineArray[i][j][1], "0")) {
                    System.out.print("- ");
                } else {
                    System.out.print(mineArray[i][j][0] + " ");
                }
            }
            System.out.println();
        }
    }

    public void makeMinesVisible(String[][][] mineArray) {
        for(int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(mineArray[i][j][0] + " ");
            }
            System.out.println();
        }
    }

    public void dataEntry(int row, int column , String[][][] mineArray) {
        mineArray[row][column][1]="1";
    }

    public void run() {
        final int RATIO_OF_MINES = 4;
        int numberOfMines = numberOfRows * numberOfColumns / RATIO_OF_MINES;

        String[][][] arr = new String[numberOfRows][numberOfColumns][2];

        Scanner input = new Scanner(System.in);

        layMines(arr);
        placeNumber(arr);

        /*System.out.println("Here is the mined field:");
        System.out.println("___________________________________________");
        makeMinesVisible(arr);
        System.out.println("___________________________________________");*/
        int entry = 0;
        int selectedRow;
        int selectedColumn;

        while((numberOfRows * numberOfColumns - entry) > (numberOfMines)){
            System.out.println("Number of mines: " + numberOfMines);
            printField(arr);

            System.out.print("Enter the row number: ");
            selectedRow = input.nextInt() - 1;
            System.out.print("Enter the column number: ");
            selectedColumn = input.nextInt() - 1;

            if (arr[selectedRow][selectedColumn][0].equals("*")) {
                dataEntry(selectedRow, selectedColumn, arr);
                printField(arr);
                System.out.println("-----Game Over!-----");
                makeMinesVisible(arr);
                break;
            } else {
                dataEntry(selectedRow, selectedColumn, arr);
            }

            System.out.println("-----------------------------------------------------------");
            entry++;
        }

        if((numberOfRows * numberOfColumns - entry) == (numberOfMines)){
            System.out.println("Congratulations, you won!");
            makeMinesVisible(arr);
        }
    }
}
