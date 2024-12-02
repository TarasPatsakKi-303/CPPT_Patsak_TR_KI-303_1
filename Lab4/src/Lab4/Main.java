package Lab4;

import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculator = new Calc();

        System.out.print("Enter x (in radians): ");
        double x = scanner.nextDouble();

        try {
            double result = calculator.calculate(x);
            System.out.println("Calculated result: " + result);

            // Save result to a file
            String filename = "result.txt";
            calculator.writeResultToFile(filename, result);
            System.out.println("Result saved to file: " + filename);
        } catch (ArithmeticException e) {
            System.err.println("Error in calculation: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
