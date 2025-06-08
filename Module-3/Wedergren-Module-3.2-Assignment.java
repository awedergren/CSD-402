// Amanda Wedergren
// June 5, 2025
// Module 3.2 Assigment

public class NestedLoopPattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern


        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }

            // Print the increasing powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Print the decreasing powers of 2
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Add the symbol aligned to the right
            System.out.printf("%-2" + rows + "s", "@");
            System.out.println(); // Move to the next line

            // Move to the next line
            System.out.println();
        }
    }
}
