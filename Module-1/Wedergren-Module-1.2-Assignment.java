// Amanda Wedergren
// May 31, 2025
// Module 1.2 Assigment

import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt the user to enter the initial temperature
        System.out.print("Enter the initial temperature of the water (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        // Prompt the user to enter the final temperature
        System.out.print("Enter the final temperature of the water (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy needed using the formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.printf("The energy needed to heat the water is %.2f joules.%n", energy);

        // Close the scanner
        scanner.close();
    }
}
