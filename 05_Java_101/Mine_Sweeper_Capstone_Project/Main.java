import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows , numberOfColumns ;

        System.out.print("Welcome to the Mine Sweeper!\n"+
                "Please enter the size of the field,\nNumber of rows: ");
        numberOfRows = scanner.nextInt();
        System.out.print("Number of columns: ");
        numberOfColumns = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(numberOfRows, numberOfColumns);

        mineSweeper.run();
    }
}