/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
Destiny Bazan
* Module 8
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BazanModule8 {
    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (0 to end): ");
        while (true) {
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }
        Integer largestValue = max(numbers);
        System.out.println("The largest value in the list is: " + largestValue);
        scanner.close();
    }
}