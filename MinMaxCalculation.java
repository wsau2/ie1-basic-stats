import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare an array to hold the numbers
        int[] numbers = new int[n];

        // Get the numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the numbers to find min and max
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        // Close the scanner
        scanner.close();
    }
}
