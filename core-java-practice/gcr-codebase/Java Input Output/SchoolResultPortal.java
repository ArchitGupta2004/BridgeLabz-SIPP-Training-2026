import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "reportcards.txt";
        try (
            Scanner sc = new Scanner(new File(inputFile));
            FileWriter fw = new FileWriter(outputFile, true); // Append mode
            PrintWriter out = new PrintWriter(fw);
        ) {
            out.println("\n===== REPORT CARD =====");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("Reading: " + line);
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] data = line.split("\\s+");
                String name = data[0];
                int total = 0;
                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }
                double average = (double) total / (data.length - 1);
                out.printf("Name: %-10s Average Marks: %.2f%n",
                           name, average);
            }
            out.println("=======================");
            out.flush();

            System.out.println("Report cards generated successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt file not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks in file.");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}