/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author desti
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BazanModule9 {
    
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Fig");
        stringList.add("Grape");
        stringList.add("Honeydew");
        stringList.add("Kiwi");
        stringList.add("Lemon");

        // Print the ArrayList using a for-each loop
        for (String item : stringList) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-9) of the element you would like to see again: ");
        
        try {
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Element at index " + index + ": " + stringList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric index.");
        }

        scanner.close();
    }
}