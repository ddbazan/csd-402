import java.util.Random;
import java.util.Scanner;

public class module2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object for generating computer's choice
        Random random = new Random();
        
        // Define the options
        String[] options = {"Rock", "Paper", "Scissors"};
        
        // Generate computer's choice (1-3)
        int computerChoiceIndex = random.nextInt(3); // 0 to 2
        String computerChoice = options[computerChoiceIndex];
        
        // Prompt user for their choice
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors.");

        int userChoiceIndex = 0;
        boolean validInput = false;
        
        // Validate user input
        while (!validInput) {
            System.out.print("Your choice (1, 2, or 3): ");
            try {
                userChoiceIndex = Integer.parseInt(scanner.nextLine()) - 1; // To match index (0 to 2)
                if (userChoiceIndex >= 0 && userChoiceIndex < options.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
            }
        }
        
        // Determine the result
        System.out.println("\nComputer chose: " + computerChoice);
        System.out.println("You chose: " + options[userChoiceIndex]);

        if (userChoiceIndex == computerChoiceIndex) {
            System.out.println("It's a tie!");
        } else if ((userChoiceIndex == 0 && computerChoiceIndex == 2) || // Rock beats Scissors
                   (userChoiceIndex == 1 && computerChoiceIndex == 0) || // Paper beats Rock
                   (userChoiceIndex == 2 && computerChoiceIndex == 1)) { // Scissors beats Paper
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        // Close the scanner
        scanner.close();
    }
}