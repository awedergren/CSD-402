// Amanda Wedergren
// June 30, 2025
// Module 9.2 Assignment

// Create 2 programs. The first will be an ArrayList with 10+ strings. The second program will create a new file that will append 10 randomly generated numbers to the previous list. This is program 2.

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class DataFile {
    public static void main(String[] args) {
        String filename = "data.file";
        File file = new File(filename);
        Random rand = new Random();

        // Create the file if it does not exist
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + filename);
            } else {
                System.out.println("File already exists: " + filename);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
            return;
        }

        // Write 10 random numbers to the file, appending to existing content
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // random number between 0-99
                writer.write(num + " ");
            }
            writer.write("\n"); // Newline after 10 numbers
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
            return;
        }

        // Read and display the data from the file
        System.out.println("Contents of " + filename + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}