public class Module3 {
    public static void main(String[] args) {
        int rows = 7; // The number of rows to display

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  "); 
            }

            // Print the increasing part of the sequence
            int value = 1; // Initial value
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " "); // Print the current value
                value *= 2; // Double the value for the next position
            }

            // Print the decreasing part of the sequence
            value /= 2; // back to last printed value for decreasing sequence
            for (int j = 0; j < i; j++) {
                value /= 2; // Halve the value for the decreasing part
                System.out.print(value + " "); // Print the current value
            }

            // Print the "@" symbol at the end of each row
            System.out.print("@");

            // Move to the next line after finishing the current row
            System.out.println();
        }
    }
}