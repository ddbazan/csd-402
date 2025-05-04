/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author desti
 */
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class BazanModule92 {

    public static void main(String[] args) {
        String filename = "data.file";
        File file = new File(filename);

        // Generate random numbers and write to the file
        try (FileWriter writer = new FileWriter(file, true)) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); // Generate random number from 0 to 99
                writer.write(randomNumber + " ");
            }
            writer.write("\n"); // Add a newline for better formatting
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and display the contents of the file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            System.out.println("Contents of the file: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}