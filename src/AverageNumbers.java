import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Program for calculating the average value
of a list of numbers entered by the user
 */
public class AverageNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));

        String userString;
        int n;
        double sum = 0.0;
        double average, t;

        System.out.println("How many numbers will you enter?");
        userString = bufferedReader.readLine();
        try {
            n = Integer.parseInt(userString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            n = 0;
        }

        System.out.println("Enter " + n + " numbers now.");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            userString = bufferedReader.readLine();
            try {
                t = Double.parseDouble(userString);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                t = 0.0;
            }
            sum += t;
        }
        average = sum / n;
        System.out.println("The average value is " + average);
    }
}