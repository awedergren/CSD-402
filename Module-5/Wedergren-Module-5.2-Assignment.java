// Amanda Wedergren
// June 18, 2025
// Module 5.2 Assigment

// Write methods using the provided headers that returns the location of the largest element in the array passed to the method returning a one-dimensional array that contains two location elements. Then, write methods using the next provided headers that returns the location of the smallest element in the array passed to the method returning a one-dimensional array that contains two location elements.

public class ArrayLocator {

    // Method to locate the largest element in a 2D array of doubles
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2]; // To store row and column indices
        double max = Double.NEGATIVE_INFINITY; // Initialize with the smallest possible value

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i; // Row index
                    location[1] = j; // Column index
                }
            }
        }
        return location;
    }

    // Method to locate the largest element in a 2D array of integers
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2]; // To store row and column indices
        int max = Integer.MIN_VALUE; // Initialize with the smallest possible value

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i; // Row index
                    location[1] = j; // Column index
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D array of doubles
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2]; // To store row and column indices
        double min = Double.POSITIVE_INFINITY; // Initialize with the largest possible value

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i; // Row index
                    location[1] = j; // Column index
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D array of integers
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2]; // To store row and column indices
        int min = Integer.MAX_VALUE; // Initialize with the largest possible value

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i; // Row index
                    location[1] = j; // Column index
                }
            }
        }
        return location;
    }

    // Main method for testing
    public static void main(String[] args) {
        double[][] doubleArray = {
            {1.5, 2.3, 3.7},
            {4.1, 5.6, 0.9},
            {7.2, 8.8, 6.4}
        };

        int[][] intArray = {
            {1, 2, 3},
            {4, 5, 0},
            {7, 8, 6}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest in double array: Row " + largestDouble[0] + ", Column " + largestDouble[1]);
        System.out.println("Largest in int array: Row " + largestInt[0] + ", Column " + largestInt[1]);
        System.out.println("Smallest in double array: Row " + smallestDouble[0] + ", Column " + smallestDouble[1]);
        System.out.println("Smallest in int array: Row " + smallestInt[0] + ", Column " + smallestInt[1]);
    }
}
