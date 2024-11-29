package lab1;
import java.io.*;
import java.util.*;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Lab1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(System.out, true, UTF_8);
        out.println("Введіть розмір квадратної матриці: ");
        Scanner in = new Scanner(System.in);
        int nRows = in.nextInt();
        out.println("Введіть символ-заповнювач: ");
        in.nextLine();
        String filler = in.nextLine();
        if (filler.length() != 1) {
            out.print("\nСимвол-заповнювач введено невірно.");
            System.exit(0);
        }

        // Print the pattern as specified
        for (int i = 0; i < nRows / 2; i++) {
            for (int j = 0; j < nRows; j++) {
                if (j < nRows / 2) {
                    out.print(filler + "\t");
                } else {
                    out.print("\t");
                }
            }
            out.println();
        }
        
        for (int i = 0; i < nRows / 2; i++) {
            for (int j = 0; j < nRows; j++) {
                if (j >= nRows / 2) {
                    out.print(filler + "\t");
                } else {
                    out.print("\t");
                }
            }
            out.println();
        }

        in.close();
        out.close();
    }
}
  
