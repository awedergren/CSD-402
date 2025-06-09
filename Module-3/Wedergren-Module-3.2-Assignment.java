// Amanda Wedergren
// June 5, 2025
// Module 3.2 Assigment

// Write a program that uses nested for loops to output the provided example in triangle pattern with trailing @ symbol.

public class TrianglePattern {
    public static void main(String[] args) {
        int n = 7;

        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            
            // Inner loop for beginning spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   ");
            }

            // Inner loop for left side of the triangle
            for (int j = 1; j <= Math.pow(2, i); j *= 2) {
                System.out.printf("%-3d", j);
            }

            // Inner loop for right side of the triangle
            for (int j = (int) Math.pow(2, i - 1); j >= 1; j /= 2) {
                System.out.printf("%-3d", j);
            }

            // Inner loop for trailing spaces
            for (int j = 0; j <= 3 * n - i * 3; j++) {
                System.out.print(" ");
            }
	    // Print the symbol at the end of each row
	    System.out.println("@");

            // Move to the next line after completing each row
            System.out.println(); 
        }
    }
}
