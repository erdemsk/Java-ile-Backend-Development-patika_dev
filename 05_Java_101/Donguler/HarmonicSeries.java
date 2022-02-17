import java.util.*;
public class HarmonicSeries {
    /*
    Homework of Java101 Module by patika.dev https://app.patika.dev/moduller/java101/pratik-harmonic

    Calculate the sum of a harmonic series by the following formula:
    https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/pratik-harmonic/figures/harmonic_series.gif
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter the n value
        System.out.print("Enter n value for the harmonic series: ");
        int n = input.nextInt();
        int temp = n;

        double sum = 0;

        while (temp > 0){
            sum += (1.0 / temp);
            temp--;
        }

        //only keep the two digits after the comma
        sum = ((int) (sum * 100)) / 100.0;

        //display the result
        System.out.println("The sum of the harmonic series with n = " + n + " is " + sum);
    }
}
