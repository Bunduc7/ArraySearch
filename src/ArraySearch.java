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

        // Placeholder for further implementation
    }
}
