import java.util.*; // Import the utility package for Scanner and other utilities

public class practice { // Define the main class

    // Method to take input for the array
    public static void input(int arr[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) { // Loop through each index
            arr[i] = sc.nextInt(); // Read an integer and store in array
        }
    }

    // Method to display the array elements
    public static void display(int arr[], int n) {
        for (int i = 0; i < n; i++) { // Loop through each index
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a newline after displaying all elements
    }

    // Method to find and print the majority element using Boyer-Moore algorithm
    public static void prat(int arr[], int n) {
        int count = 0; // Initialize count for majority candidate
        int cad = 0; // Variable to store current candidate

        for (int i = 0; i < n; i++) { // Loop through each element
            int num = arr[i]; // Get current element

            if (count == 0) { // If count is zero, set new candidate
                cad = num; // Assign current element as candidate
            }

            if (num == cad) { // If current element matches candidate
                count++; // Increment count
            } else {
                count--; // Decrement count if not matching
            }
        }
        // After loop, cad holds the majority element
        System.out.println(cad); // Print the majority element
    }

    // Main method: entry point of the program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.print("Enter a number: "); // Prompt user for array size
        int n = sc.nextInt(); // Read array size
        int arr[] = new int[n]; // Declare array of size n
        input(arr, n, sc); // Call input method to fill array
        display(arr, n); // Call display method to show array
        prat(arr, n); // Call prat method to find majority element
        sc.close(); // Close the Scanner object

    }
}