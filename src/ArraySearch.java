// GitHub Repository: https://github.com/Bunduc7/ArraySearch.git

import java.util.HashSet;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Validate the size of the array
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return; // Exit the program if the size is invalid
        }

        // Create an array to hold the input values
        int[] array = new int[size];

        // Get the elements of the array from the user
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the first repeated element in the array
        int repeatedElement = findFirstRepeatedElement(array);

        // Print the result
        if (repeatedElement != -1) {
            System.out.println("The first repeated element is: " + repeatedElement);
        } else {
            System.out.println("No repeated elements found.");
        }
    }

    /**
     * This method checks for the first repeated element in the given array.
     * @param array The input array of integers.
     * @return The first repeated element, or -1 if there are no repeated elements.
     */
    private static int findFirstRepeatedElement(int[] array) {
        // Use a HashSet to keep track of elements we've seen so far
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : array) {
            // If the number is already in the set, it's the first repeated element
            if (seen.contains(num)) {
                return num;
            }
            // Add the number to the set if it's not already there
            seen.add(num);
        }

        // If no repeated element is found, return -1
        return -1;
    }
}
