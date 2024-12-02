package Lab4;

import java.io.FileWriter;
import java.io.IOException;

public class Calc {

    public double calculate(double x) throws ArithmeticException {
        double denominator = Math.tan(4 * x);
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero: tan(4x) is zero.");
        }
        return Math.sin(x) / denominator;
    }

    public void writeResultToFile(String filename, double result) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Result: " + result);
        }
    }
}

