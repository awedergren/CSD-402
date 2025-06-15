// Amanda Wedergren
// June 13, 2025
// Module 4.2 Assigment

// Test program that invokes each of these methods: public static short average (short [ ] array), public static int average (int [ ] array), public static long average (long [ ] array), public static double average (double [ ] array), and then displays the average value returned along with a display of the original array elements. The display is easy to read and understand. Each array sent into the methods will be of different sizes to ensure the method code is correctly written.

import java.util.Arrays;

public class AverageCalculator {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test arrays of different sizes
        short[] shortArray = {10, 20, 30};
        int[] intArray = {100, 200, 300, 400};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display results for short array
        System.out.println("Short Array: " + Arrays.toString(shortArray));
        System.out.println("Average (short): " + average(shortArray));
        System.out.println();

        // Display results for int array
        System.out.println("Int Array: " + Arrays.toString(intArray));
        System.out.println("Average (int): " + average(intArray));
        System.out.println();

        // Display results for long array
        System.out.println("Long Array: " + Arrays.toString(longArray));
        System.out.println("Average (long): " + average(longArray));
        System.out.println();

        // Display results for double array
        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Average (double): " + average(doubleArray));
    }
}
