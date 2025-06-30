// Amanda Wedergren
// June 30, 2025
// Module 9.2 Assignment

// Create 2 programs. The first will be an ArrayList with 10+ strings. The second program will create a new file that will append 10 randomly generated numbers to the previous list. This is program 1.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Fig");
        stringList.add("Grape");
        stringList.add("Honeydew");
        stringList.add("Kiwi");
        stringList.add("Lemon");

        System.out.println("Here are the elements in the ArrayList:");
        for (String item : stringList) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the index of the element you'd like to see again (0-9):");
        try {
            // Autoboxing: Convert user input (String) to Integer object
            Integer indexObj = Integer.valueOf(scanner.nextLine());
            // Auto-unboxing: Use Integer object as int
            String selectedElement = stringList.get(indexObj); // indexObj auto-unboxed to int
            System.out.println("You selected: " + selectedElement);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds. Please enter a valid index between 0 and 9.");
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid input. Please enter a numeric index.");
        } finally {
            scanner.close();
        }
    }
}
