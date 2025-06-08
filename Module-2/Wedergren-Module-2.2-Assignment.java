// Amanda Wedergren
// June 4, 2025
// Module 2.2 Assigment

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Random object for computer's selection
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1; // Randomly generates 1, 2, or 3

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors:");
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice! Please restart the game and choose 1, 2, or 3.");
            return;
        }

        // Display choices
        System.out.println("Computer chose: " + getChoiceName(computerChoice));
        System.out.println("You chose: " + getChoiceName(userChoice));

        // Determine the result
        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

    // Helper method to convert choice number to name
    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
}
