// Amanda Wedergren
// June 30, 2025
// Module 8.2 Assignment

// Create a class that receives an ArrayList populated with integers that a user inputs. Inputting 0 will end the list and also add it to the list. Then the method will return the largest value in the array list. 

import java.util.ArrayList;
import java.util.Scanner;

public class AmandaArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to stop, 0 will be included):");
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                numbers.add(value);
                if (value == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        // Test the max method
        Integer largest = max(numbers);
        System.out.println("The largest value in the ArrayList is: " + largest);
        scanner.close();
    }

    // Method signature as required
    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Integer maxVal = (Integer) list.get(0);
        for (Object obj : list) {
            Integer num = (Integer) obj;
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }
}
