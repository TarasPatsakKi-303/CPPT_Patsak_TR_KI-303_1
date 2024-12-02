package Lab5;

import java.io.*;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        String textFilePath = "input.txt";
        String binaryFilePath = "output.bin";
        String resultsTextFile = "results.txt";

        try {
   
            double x = readFromTextFile(textFilePath);


            double y = calculateFunction(x);

 
            writeToTextFile(resultsTextFile, x, y);

   
            writeToBinaryFile(binaryFilePath, x, y);

            double[] results = readFromBinaryFile(binaryFilePath);
            System.out.println("Прочитано з двійкового файлу:");
            System.out.printf("x = %.5f, y = %.5f%n", results[0], results[1]);
        } catch (IOException e) {
            System.err.println("Помилка введення/виведення: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка в обчисленнях: " + e.getMessage());
        }
    }

    public static double readFromTextFile(String filePath) throws IOException {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                throw new IllegalArgumentException("Файл не містить коректного значення x.");
            }
        }
    }

    public static void writeToTextFile(String filePath, double x, double y) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.format("x = %.5f, y = %.5f%n", x, y));
            System.out.println("Результат записано у текстовий файл.");
        }
    }

    public static void writeToBinaryFile(String filePath, double x, double y) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeDouble(x);
            dos.writeDouble(y);
            System.out.println("Результат записано у двійковий файл.");
        }
    }

    public static double[] readFromBinaryFile(String filePath) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            double x = dis.readDouble();
            double y = dis.readDouble();
            return new double[]{x, y};
        }
    }

    public static double calculateFunction(double x) {
        double denominator = Math.tan(4 * x);
        if (denominator == 0) {
            throw new IllegalArgumentException("Ділення на нуль: tan(4x) = 0.");
        }
        return Math.sin(x) / denominator;
    }
}